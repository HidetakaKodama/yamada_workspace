package jp.co.futureantiques.webapptraining.repository.specification;

import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Predicate;
import javax.persistence.criteria.Root;
import javax.validation.constraints.NotNull;

import org.springframework.data.jpa.domain.Specification;
import org.springframework.util.StringUtils;

import jp.co.futureantiques.webapptraining.constant.CommonConst;
import jp.co.futureantiques.webapptraining.model.drinkYoshimoto.DrinkMainYoshimoto;
import jp.co.futureantiques.webapptraining.model.form.drinkYoshimoto.DrinkYoshimotoSearchForm;

/**
 * DrinkMainYoshimotoの検索条件を生成するクラス
 *
 * @author Yoshimoto
 *
 */
public class DrinkYoshimotoSpecification {

	/**
	 * 検索条件生成の実装
	 *
	 * @param DrinkMainYoshimotoSearchForm
	 * @return DrinkMainYohimotoのSpecification
	 * */
	public static Specification<DrinkMainYoshimoto> drinkCategoryYoshimotoSpecification(
			final DrinkYoshimotoSearchForm form) {
		return new Specification<DrinkMainYoshimoto>() {
			@Override
			public Predicate toPredicate(Root<DrinkMainYoshimoto> root, CriteriaQuery<?> query, CriteriaBuilder cb) {

				//検索条件
				Predicate condition = null;

				//削除フラグON用が1かどうか判定
				if (form.getIsDelete() == 1) {

					//削除フラグ=1を検索条件にする
					return cb.equal(root.get("delFlg"), CommonConst.DELETE_FLG_ON);
				}

				//条件が入力されている場合追加
				if (form.getDrinkId() != null) {

					//IDを条件に追加
					Predicate newCondition = cb.equal(root.get("drinkId"), form.getDrinkId());
					condition = getPredicate(cb, condition, newCondition);
				}
				if (!StringUtils.isEmpty(form.getDrinkName())) {

					//商品名を条件に追加
					form.setDrinkName(form.getDrinkName().trim());
					Predicate newCondition = cb.like(root.get("drinkName"), "%" + form.getDrinkName() + "%");
					condition = getPredicate(cb, condition, newCondition);
				}
				if (form.getMakerId() != null && form.getMakerId() != 0) {

					//メーカーを条件に追加
					Predicate newCondition = cb.equal(root.get("makerId"), form.getMakerId());
					condition = getPredicate(cb, condition, newCondition);
				}
				if (form.getCategoryId() != null && form.getCategoryId() != 0) {

					//カテゴリーを条件に追加
					Predicate newCondition = cb.equal(root.get("categoryId"), form.getCategoryId());
					condition = getPredicate(cb, condition, newCondition);
				}

				//削除フラグを条件に追加
				Predicate newCondition = cb.equal(root.get("delFlg"), CommonConst.DELETE_FLG_OFF);
				condition = getPredicate(cb, condition, newCondition);
				return condition;

			}

			/**
			 * 検索条件を結合する
			 *
			 * @param cb
			 * @param condition
			 * @param newCondition
			 * @return Predicate
			 */
			private Predicate getPredicate(CriteriaBuilder cb, Predicate condition, @NotNull Predicate newCondition) {
				if (condition != null) {

					//すでに条件がある場合ANDで結合
					condition = cb.and(condition, newCondition);
				} else {

					//条件がまだない場合先頭の条件になる
					condition = newCondition;
				}
				return condition;
			}
		};
	}
}
