package jp.co.futureantiques.webapptraining.repository.specification;

import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Predicate;
import javax.persistence.criteria.Root;
import javax.validation.constraints.NotNull;

import org.springframework.data.jpa.domain.Specification;
import org.thymeleaf.util.StringUtils;

import jp.co.futureantiques.webapptraining.constant.CommonConst;
import jp.co.futureantiques.webapptraining.model.form.weaponHiratsuka.WeaponHiratsukaSearchForm;
import jp.co.futureantiques.webapptraining.model.weaponHiratsuka.WeaponMainHiratsuka;

public class WeaponHiratsukaSpecification {

	/**
	 * 検索条件生成の実装
	 *
	 * @param WeaponHiratsukaSearchForm form
	 * @return WeaponMainのSpecification
	 */
	public static Specification<WeaponMainHiratsuka> generateWeaponHiratsukaSpecification(
			final WeaponHiratsukaSearchForm form) {
		return new Specification<WeaponMainHiratsuka>() {
			@Override
			public Predicate toPredicate(Root<WeaponMainHiratsuka> root, CriteriaQuery<?> query, CriteriaBuilder cb) {

				// 検索条件
				Predicate condition = null;

				// 削除フラグON用が1かどうか判定
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
				if (!StringUtils.isEmpty(form.getWeaponname())) {

					// 武器名を条件に追加
					form.setWeaponname(form.getWeaponname().trim());
					Predicate newCondition = cb.like(root.get("weaponname"), "%" + form.getWeaponname() + "%");
					condition = getPredicate(cb, condition, newCondition);
				}

				if (form.getWeapontypeId() != null && form.getWeapontypeId() != 0) {

					// 射撃方法を条件に追加
					Predicate newCondition = cb.equal(root.get("weapontypeId"), form.getWeapontypeId());
					condition = getPredicate(cb, condition, newCondition);
				}

				if (form.getShottypeId() != null && form.getShottypeId() != 0) {
					Predicate newCondition = cb.equal(root.get("shottypeId"), form.getShottypeId());
					condition = getPredicate(cb, condition, newCondition);
				}

				if (form.getCost() != null && form.getCost() != 0) {
					// コストを条件に追加
					Predicate newCondition = cb.lessThanOrEqualTo(root.get("cost"), form.getCost());
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
			 * @return Predicate				 削除フラグを条件に追加
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
