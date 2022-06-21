package jp.co.futureantiques.webapptraining.repository.specification;

import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Predicate;
import javax.persistence.criteria.Root;
import javax.validation.constraints.NotNull;

import org.springframework.data.jpa.domain.Specification;
import org.springframework.util.StringUtils;

import jp.co.futureantiques.webapptraining.constant.CommonConst;
import jp.co.futureantiques.webapptraining.model.dogKanno.DogMainKanno;
import jp.co.futureantiques.webapptraining.model.form.dogKanno.DogSearchForm;

/**
 * DogMainKannoの検索条件を生成するクラス
 *
 * @author future
 */
public class DogKannoSpecification {

	/**
	 * 検索条件生成の実装
	 *
	 * @param DogSearchForm form
	 * @return DogMainKannoのSpecification
	 */
	public static Specification<DogMainKanno>generateDogSpecification(final DogSearchForm form){
		return new Specification<DogMainKanno>() {
			@Override
			public Predicate toPredicate(Root<DogMainKanno> root, CriteriaQuery<?> query, CriteriaBuilder cb) {

				// 検索条件
				Predicate condition = null;

				// 削除フラグON用が1かどうか判定
				if (form.getIsDelete() == 1) {

					// 削除フラグ＝1を検索条件にする
					return cb.equal(root.get("delFlg"), CommonConst.DELETE_FLG_ON);
				}

				// 条件が入力されている場合条件追加
				if (form.getDogId() != null) {

					// IDを条件に追加
					Predicate newCondition = cb.equal(root.get("dogId"),form.getDogId() );
					condition = getPredicate(cb,condition,newCondition);
				}
				if (!StringUtils.isEmpty(form.getDogName())) {

					// 犬種を条件に追加
					form.setDogName(form.getDogName().trim());
					Predicate newCondition = cb.like(root.get("dogName"), "%" + form.getDogName() + "%");
					condition = getPredicate(cb,condition,newCondition);
				}
				if (form.getCountryId() != null && form.getCountryId() != 0) {

					//原産国を条件に追加
					Predicate newCondition = cb.equal(root.get("countryId"), form.getCountryId());
					condition = getPredicate(cb,condition,newCondition);
				}
				if (form.getSizeId() != null && form.getSizeId() != 0) {

					// サイズを条件に追加
					Predicate newCondition = cb.equal(root.get("sizeId"), form.getSizeId());
					condition = getPredicate(cb,condition,newCondition);
					return condition;
				}

				// 削除フラグを条件に追加
				Predicate newCondition = cb.equal(root.get("delFlg"), CommonConst.DELETE_FLG_OFF);
				condition = getPredicate(cb, condition, newCondition);
				return condition;
			}

				/** 検索条件を結合する
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

						// 条件がまだない場合先頭の条件になる
						condition = newCondition;
					}
					return condition;
				}
			};
		}
	}
