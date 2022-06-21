package jp.co.futureantiques.webapptraining.repository.specification;

import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Predicate;
import javax.persistence.criteria.Root;
import javax.validation.constraints.NotNull;

import org.springframework.data.jpa.domain.Specification;
import org.springframework.util.StringUtils;

import jp.co.futureantiques.webapptraining.constant.CommonConst;
import jp.co.futureantiques.webapptraining.model.animeWatanabe.AnimeMainWatanabe;
import jp.co.futureantiques.webapptraining.model.form.animeWatanabe.AnimeSearchForm;

/**
 * AnimeMainの検索条件を生成するクラス
 *
 * @author Watanabe
 */
public class AnimeWatanabeSpecification {

	/**
	 * 検索条件生成実装
	 *
	 * @param AnimeSearchForm form
	 * @return AnimeMainWatanabeのSpecification
	 */
	public static Specification<AnimeMainWatanabe> generateAnimeWatanabeSpecification(final AnimeSearchForm form) {
		return new Specification<AnimeMainWatanabe>() {
			@Override
			public Predicate toPredicate(Root<AnimeMainWatanabe> root, CriteriaQuery<?> query, CriteriaBuilder cb) {

				// 検索条件
				Predicate condition = null;

				//削除フラグON用が1かどうか判断
				if (form.getIsDelete() == 1) {

					//削除フラグ=1を検索する
					return cb.equal(root.get("delFlg"), CommonConst.DELETE_FLG_ON);
				}

				//条件が入力されている場合条件追加
				if (form.getId() != null) {

					//IDを条件に追加
					Predicate newCondition = cb.equal(root.get("id"), form.getId());
					condition = getPredicate(cb, condition, newCondition);
				}
				if (!StringUtils.isEmpty(form.getAnimeTitle())) {

					//アニメ名を条件に追加
					form.setAnimeTitle(form.getAnimeTitle().trim());
					Predicate newCondition = cb.like(root.get("animeTitle"), "%" + form.getAnimeTitle() + "%");
					condition = getPredicate(cb, condition, newCondition);
				}
				if (form.getCompanyId() != null && form.getCompanyId() != 0) {

					//アニメ制作会社を条件に追加
					Predicate newCondition = cb.equal(root.get("companyId"), form.getCompanyId());
					condition = getPredicate(cb, condition, newCondition);
				}
				if (form.getOriginalId() != null && form.getOriginalId() != 0) {

					//原作を条件に追加
					Predicate newCondition = cb.equal(root.get("originalId"), form.getOriginalId());
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

					//条件がまだない場合
					condition = newCondition;
				}
				return condition;
			}
		};
	}
}
