package jp.co.futureantiques.webapptraining.repository.specification;

import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Predicate;
import javax.persistence.criteria.Root;
import javax.validation.constraints.NotNull;

import org.springframework.data.jpa.domain.Specification;
import org.thymeleaf.util.StringUtils;

import jp.co.futureantiques.webapptraining.constant.CommonConst;
import jp.co.futureantiques.webapptraining.model.form.vtuberUmehara.VtuberUmeharaSearchForm;
import jp.co.futureantiques.webapptraining.model.vtuberUmehara.VtuberMainUmehara;

/**
 * VtuberMainUmeharaの検索条件を生成するクラス
 *
 * @author future
 */
public class VtuberUmeharaSpecification {

	/**
	 * 検索条件生成の実装
	 *
	 * @param VtuberUmeharaSearchForm form
	 * @return VtuberMainUmeharaのSpecification
	 */
	public static Specification<VtuberMainUmehara> generateVtuberUmeharaSpecification(
			final VtuberUmeharaSearchForm form) {
		return new Specification<VtuberMainUmehara>() {
			@Override
			public Predicate toPredicate(Root<VtuberMainUmehara> root, CriteriaQuery<?> query, CriteriaBuilder cb) {

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
				if (!StringUtils.isEmpty(form.getVtuberName())) {

					// Vtuber名を条件に追加
					form.setVtuberName(form.getVtuberName().trim());
					Predicate newCondition = cb.like(root.get("vtuberName"), "%" + form.getVtuberName() + "%");
					condition = getPredicate(cb, condition, newCondition);
				}
				if (form.getCompanyId() != null && form.getCompanyId() != 0) {

					// 会社を条件に追加
					Predicate newCondition = cb.equal(root.get("companyId"), form.getCompanyId());
					condition = getPredicate(cb, condition, newCondition);
				}
				if (form.getFormsId() != null && form.getFormsId() != 0) {
					// 動画形態を条件に追加
					Predicate newCondition=null;

					// 動画形態を条件に追加
					if (form.getFormsId()==1) {
						newCondition = cb.equal(root.get("formsId"), 1);
						Predicate newCondition1=cb.equal(root.get("formsId"), 4);
						Predicate newCondition2=cb.equal(root.get("formsId"), 5);
						Predicate newCondition3=cb.equal(root.get("formsId"), 7);
						condition = getPredicateOr(cb,condition, newCondition);
						condition = getPredicateOr(cb,condition, newCondition1);
						condition = getPredicateOr(cb,condition, newCondition2);
						condition = getPredicateOr(cb,condition, newCondition3);
					}else if (form.getFormsId()==2) {
						newCondition = cb.equal(root.get("formsId"), 2);
						Predicate newCondition1=cb.equal(root.get("formsId"), 4);
						Predicate newCondition2=cb.equal(root.get("formsId"), 6);
						Predicate newCondition3=cb.equal(root.get("formsId"), 7);
						condition = getPredicateOr(cb,condition, newCondition);
						condition = getPredicateOr(cb,condition, newCondition1);
						condition = getPredicateOr(cb,condition, newCondition2);
						condition = getPredicateOr(cb,condition, newCondition3);
					}else if (form.getFormsId()==3) {
						newCondition = cb.equal(root.get("formsId"), 3);
						Predicate newCondition1=cb.equal(root.get("formsId"), 5);
						Predicate newCondition2=cb.equal(root.get("formsId"), 6);
						Predicate newCondition3=cb.equal(root.get("formsId"), 7);
						condition = getPredicateOr(cb,condition, newCondition);
						condition = getPredicateOr(cb,condition, newCondition1);
						condition = getPredicateOr(cb,condition, newCondition2);
						condition = getPredicateOr(cb,condition, newCondition3);
					}else if (form.getFormsId()==4) {
						newCondition = cb.equal(root.get("formsId"), 4);
						Predicate newCondition1=cb.equal(root.get("formsId"), 7);
						condition = getPredicateOr(cb,condition, newCondition);
						condition = getPredicateOr(cb,condition, newCondition1);
					}else if (form.getFormsId()==5) {
						newCondition = cb.equal(root.get("formsId"), 5);
						Predicate newCondition1=cb.equal(root.get("formsId"), 7);
						condition = getPredicateOr(cb,condition, newCondition);
						condition = getPredicateOr(cb,condition, newCondition1);
					}else if (form.getFormsId()==6) {
						newCondition = cb.equal(root.get("formsId"), 6);
						Predicate newCondition1=cb.equal(root.get("formsId"), 7);
						condition = getPredicateOr(cb,condition, newCondition);
						condition = getPredicateOr(cb,condition, newCondition1);
					}else {
						newCondition = cb.equal(root.get("formsId"), form.getFormsId());
						condition = getPredicate(cb, condition, newCondition);
					}

				}

				if (form.getContentsId() != null && form.getContentsId() != 0) {

					// 動画内容を条件に追加
					if (form.getContentsId()==1) {
						Predicate newCondition = cb.equal(root.get("contentsId"), 1);
						Predicate newCondition1=cb.equal(root.get("contentsId"), 5);
						Predicate newCondition2=cb.equal(root.get("contentsId"), 6);
						Predicate newCondition3=cb.equal(root.get("contentsId"), 7);
						Predicate newCondition4=cb.equal(root.get("contentsId"), 11);
						Predicate newCondition5=cb.equal(root.get("contentsId"), 12);
						Predicate newCondition6=cb.equal(root.get("contentsId"), 14);
						condition = getPredicateOr(cb,condition, newCondition);
						condition = getPredicateOr(cb,condition, newCondition1);
						condition = getPredicateOr(cb,condition, newCondition2);
						condition = getPredicateOr(cb,condition, newCondition3);
						condition = getPredicateOr(cb,condition, newCondition4);
						condition = getPredicateOr(cb,condition, newCondition5);
						condition = getPredicateOr(cb,condition, newCondition6);
					}else if (form.getContentsId()==2) {
						Predicate newCondition = cb.equal(root.get("contentsId"), 2);
						Predicate newCondition1=cb.equal(root.get("contentsId"), 5);
						Predicate newCondition2=cb.equal(root.get("contentsId"), 8);
						Predicate newCondition3=cb.equal(root.get("contentsId"), 9);
						Predicate newCondition4=cb.equal(root.get("contentsId"), 11);
						Predicate newCondition5=cb.equal(root.get("contentsId"), 12);
						Predicate newCondition6=cb.equal(root.get("contentsId"), 13);
						Predicate newCondition7=cb.equal(root.get("contentsId"), 14);
						condition = getPredicateOr(cb,condition, newCondition);
						condition = getPredicateOr(cb,condition, newCondition1);
						condition = getPredicateOr(cb,condition, newCondition2);
						condition = getPredicateOr(cb,condition, newCondition3);
						condition = getPredicateOr(cb,condition, newCondition4);
						condition = getPredicateOr(cb,condition, newCondition5);
						condition = getPredicateOr(cb,condition, newCondition6);
						condition = getPredicateOr(cb,condition, newCondition7);
					}else if (form.getContentsId()==3) {
						Predicate newCondition = cb.equal(root.get("contentsId"), 3);
						Predicate newCondition1=cb.equal(root.get("contentsId"), 6);
						Predicate newCondition2=cb.equal(root.get("contentsId"), 8);
						Predicate newCondition3=cb.equal(root.get("contentsId"), 10);
						Predicate newCondition4=cb.equal(root.get("contentsId"), 11);
						Predicate newCondition5=cb.equal(root.get("contentsId"), 13);
						Predicate newCondition6=cb.equal(root.get("contentsId"), 14);
						condition = getPredicateOr(cb,condition, newCondition);
						condition = getPredicateOr(cb,condition, newCondition1);
						condition = getPredicateOr(cb,condition, newCondition2);
						condition = getPredicateOr(cb,condition, newCondition3);
						condition = getPredicateOr(cb,condition, newCondition4);
						condition = getPredicateOr(cb,condition, newCondition5);
						condition = getPredicateOr(cb,condition, newCondition6);
					}else if (form.getContentsId()==4) {
						Predicate newCondition = cb.equal(root.get("contentsId"), 4);
						Predicate newCondition1=cb.equal(root.get("contentsId"), 7);
						Predicate newCondition2=cb.equal(root.get("contentsId"), 9);
						Predicate newCondition3=cb.equal(root.get("contentsId"), 10);
						Predicate newCondition4=cb.equal(root.get("contentsId"), 12);
						Predicate newCondition5=cb.equal(root.get("contentsId"), 13);
						Predicate newCondition6=cb.equal(root.get("contentsId"), 14);
						condition = getPredicateOr(cb,condition, newCondition);
						condition = getPredicateOr(cb,condition, newCondition1);
						condition = getPredicateOr(cb,condition, newCondition2);
						condition = getPredicateOr(cb,condition, newCondition3);
						condition = getPredicateOr(cb,condition, newCondition4);
						condition = getPredicateOr(cb,condition, newCondition5);
						condition = getPredicateOr(cb,condition, newCondition6);
					}else if (form.getContentsId()==5) {
						Predicate newCondition = cb.equal(root.get("contentsId"), 5);
						Predicate newCondition1=cb.equal(root.get("contentsId"), 11);
						Predicate newCondition2=cb.equal(root.get("contentsId"), 12);
						Predicate newCondition3=cb.equal(root.get("contentsId"), 14);
						condition = getPredicateOr(cb,condition, newCondition);
						condition = getPredicateOr(cb,condition, newCondition1);
						condition = getPredicateOr(cb,condition, newCondition2);
						condition = getPredicateOr(cb,condition, newCondition3);
					}else if (form.getContentsId()==6) {
						Predicate newCondition = cb.equal(root.get("contentsId"), 6);
						Predicate newCondition1=cb.equal(root.get("contentsId"), 11);
						Predicate newCondition2=cb.equal(root.get("contentsId"), 14);
						condition = getPredicateOr(cb,condition, newCondition);
						condition = getPredicateOr(cb,condition, newCondition1);
						condition = getPredicateOr(cb,condition, newCondition2);
					}else if (form.getContentsId()==7) {
						Predicate newCondition = cb.equal(root.get("contentsId"), 7);
						Predicate newCondition1=cb.equal(root.get("contentsId"), 12);
						Predicate newCondition2=cb.equal(root.get("contentsId"), 14);
						condition = getPredicateOr(cb,condition, newCondition);
						condition = getPredicateOr(cb,condition, newCondition1);
						condition = getPredicateOr(cb,condition, newCondition2);
					}else if (form.getContentsId()==8) {
						Predicate newCondition = cb.equal(root.get("contentsId"), 8);
						Predicate newCondition1=cb.equal(root.get("contentsId"), 11);
						Predicate newCondition2=cb.equal(root.get("contentsId"), 13);
						Predicate newCondition3=cb.equal(root.get("contentsId"), 14);
						condition = getPredicateOr(cb,condition, newCondition);
						condition = getPredicateOr(cb,condition, newCondition1);
						condition = getPredicateOr(cb,condition, newCondition2);
						condition = getPredicateOr(cb,condition, newCondition3);
					}else if (form.getContentsId()==9) {
						Predicate newCondition = cb.equal(root.get("contentsId"), 9);
						Predicate newCondition1=cb.equal(root.get("contentsId"), 12);
						Predicate newCondition2=cb.equal(root.get("contentsId"), 13);
						Predicate newCondition3=cb.equal(root.get("contentsId"), 14);
						condition = getPredicateOr(cb,condition, newCondition);
						condition = getPredicateOr(cb,condition, newCondition1);
						condition = getPredicateOr(cb,condition, newCondition2);
						condition = getPredicateOr(cb,condition, newCondition3);
					}else if (form.getContentsId()==10) {
						Predicate newCondition = cb.equal(root.get("contentsId"), 10);
						Predicate newCondition1=cb.equal(root.get("contentsId"), 13);
						Predicate newCondition2=cb.equal(root.get("contentsId"), 14);
						condition = getPredicateOr(cb,condition, newCondition);
						condition = getPredicateOr(cb,condition, newCondition1);
						condition = getPredicateOr(cb,condition, newCondition2);
					}else if (form.getContentsId()==11) {
						Predicate newCondition = cb.equal(root.get("contentsId"), 11);
						Predicate newCondition1=cb.equal(root.get("contentsId"), 14);
						condition = getPredicateOr(cb,condition, newCondition);
						condition = getPredicateOr(cb,condition, newCondition1);
					}else if (form.getContentsId()==12) {
						Predicate newCondition = cb.equal(root.get("contentsId"), 12);
						Predicate newCondition1=cb.equal(root.get("contentsId"), 14);
						condition = getPredicateOr(cb,condition, newCondition);
						condition = getPredicateOr(cb,condition, newCondition1);
					}else if (form.getContentsId()==13) {
						Predicate newCondition = cb.equal(root.get("contentsId"), 13);
						Predicate newCondition1=cb.equal(root.get("contentsId"), 14);
						condition = getPredicateOr(cb,condition, newCondition);
						condition = getPredicateOr(cb,condition, newCondition1);
					}else {
					Predicate newCondition = cb.equal(root.get("contentsId"), form.getContentsId());
					condition = getPredicate(cb, condition, newCondition);
					}
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

			/**
			 * 検索条件をOR結合する
			 *
			 * @param cb
			 * @param condition
			 * @param newCondition
			 * @return Predicate
			 */
			private Predicate getPredicateOr(CriteriaBuilder cb, Predicate condition, @NotNull Predicate newCondition) {
				if (condition != null) {

					// すでに条件がある場合ANDで結合する
					condition = cb.or(condition, newCondition);
				} else {

					// 条件がまだ無い場合先頭の条件になる
					condition = newCondition;
				}
				return condition;
			}

		};
	}
}