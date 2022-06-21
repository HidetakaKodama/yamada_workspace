package jp.co.futureantiques.webapptraining.repository.specification;

import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Predicate;
import javax.persistence.criteria.Root;
import javax.validation.constraints.NotNull;

import org.springframework.data.jpa.domain.Specification;
import org.thymeleaf.util.StringUtils;

import jp.co.futureantiques.webapptraining.constant.CommonConst;
import jp.co.futureantiques.webapptraining.model.form.tokyoTakehara.TokyoTakeharaSearchForm;
import jp.co.futureantiques.webapptraining.model.tokyoTakehara.TokyoMainTakehara;

/**
 * TokyoMainTakeharaの検索条件を生成するクラス
 *
 */
public class TokyoTakeharaSpecification {
	public static Specification<TokyoMainTakehara> generateTokyoTakeharaSpecification(
			final TokyoTakeharaSearchForm form) {
		return new Specification<TokyoMainTakehara>() {
			@Override
			public Predicate toPredicate(Root<TokyoMainTakehara> root, CriteriaQuery<?> query, CriteriaBuilder cb) {
				// 検索条件
				Predicate condition = null;

				// 削除フラグが1かどうか判定
				if (form.getIsDelete() == 1) {

					// 削除フラグ＝1を検索条件にする
					return cb.equal(root.get("delFlg"), CommonConst.DELETE_FLG_ON);
				}

				// 条件が入力されている場合条件追加
				if (form.getId() != null) {

					// IDを条件に追加
					Predicate newCondition = cb.equal(root.get("id"), form.getId());
					condition = getPredicate(cb, condition, newCondition);
				}

				if (!StringUtils.isEmpty(form.getWardName())) {
					// 区名を条件に追加
					form.setWardName(form.getWardName().trim());
					Predicate newCondition = cb.like(root.get("wardName"), "%" + form.getWardName() + "%");
					condition = getPredicate(cb, condition, newCondition);
				}

				if (form.getLocationId() != null && form.getLocationId() != 0) {
					// 所在地名を条件に追加
					Predicate newCondition = cb.equal(root.get("locationId"), form.getLocationId());
					condition = getPredicate(cb, condition, newCondition);
				}

				if (form.getPopulation() != null && form.getPopulation() != 0) {
					// 人口を条件に追加
					Predicate newCondition = cb.greaterThanOrEqualTo(root.get("population"), form.getPopulation());
					condition = getPredicate(cb, condition, newCondition);
				}

					// 削除フラグを条件に追加
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

					// すでに条件がある場合ANDで結合する
					condition = cb.and(condition, newCondition);
				} else {

					// 条件がまだ無い場合先頭の条件になる
					condition = newCondition;
				}
				return condition;
			}
		};
	}

}
