package jp.co.futureantiques.webapptraining.repository.specification;

import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Predicate;
import javax.persistence.criteria.Root;
import javax.validation.constraints.NotNull;

import org.springframework.data.jpa.domain.Specification;
import org.springframework.util.StringUtils;

import jp.co.futureantiques.webapptraining.model.form.resipeishikawa.ResipeIshikawaSearchForm;
import jp.co.futureantiques.webapptraining.model.resipeishikawa.ResipeMainIshikawa;

/**
 *  ResipeMainIshikawaの検索条件を生成するクラス
 *
 * @author t.ishikawa
 */
public class ResipeIshikawaSpecification {

	/**
	 *検索条件生成の実装
	 *
	 * @param ResipeIshikawaSearchForm form
	 * @return ResipeMainIshikawaのSpecification
	 */
	public static Specification<ResipeMainIshikawa> generateResipeIshiawaSpecification(final ResipeIshikawaSearchForm form){
		return new Specification<ResipeMainIshikawa>() {
			@Override
			public Predicate toPredicate(Root<ResipeMainIshikawa>root,CriteriaQuery<?> query,CriteriaBuilder cb) {

				//検索条件
				Predicate condition = null;

				//削除フラグON用が1かどうか判定
				if(form.getIsDelete() == 1) {

					//削除フラグ=1を検索条件にする
					return cb.equal(root.get("delFlg"),1);
				}

				//条件が入力されている場合条件追加
				if(form.getId() != null) {

					//IDを条件に追加
					Predicate newCondition = cb.equal(root.get("id"),form.getId());
					condition = getPredicate(cb,condition,newCondition);
				}
				if(!StringUtils.isEmpty(form.getResipeTitle())) {

					//レシピ名を条件に追加
					form.setResipeTitle(form.getResipeTitle().trim());
					final String space = " ";

					// 半角スペースと全角スペースの組み合わせのパターンを表す
					final String spacesPattern = "[\\s　]+";

					// 以上のパターンにマッチした部分を単一の半角スペースに変換する
					final String monoSpaceQuery = form.getResipeTitle().replaceAll(spacesPattern, space);

					// 半角スペースでクエリをsplitする
					String[] resipeTitles = monoSpaceQuery.split("\\s");
					String resipeTitle = "";
					for(int i = 0;i < resipeTitles.length;i++ ) {
						resipeTitle = resipeTitle + resipeTitles[i];
						Predicate newCondition = cb.or(cb.like(root.get("resipeTitle"),"%" + resipeTitle + "%"), cb.like(root.get("resipeTitle2"),"%" + resipeTitle + "%"));
						condition = getPredicate(cb,condition,newCondition);
					}
				}
				if(form.getVegetableId1() != null && form.getVegetableId1() != 0) {

					//野菜1を条件に追加
					Predicate newCondition =  cb.or(cb.equal(root.get("vegetableId1"),form.getVegetableId1()),cb.equal(root.get("vegetableId2"),form.getVegetableId1()));
					condition = getPredicate(cb,condition,newCondition);
				}
				if(form.getVegetableId2() != null && form.getVegetableId2() != 0) {

					//野菜2を条件に追加
					Predicate newCondition = cb.or(cb.equal(root.get("vegetableId2"),form.getVegetableId2()),cb.equal(root.get("vegetableId1"),form.getVegetableId2()));
					condition = getPredicate(cb,condition,newCondition);
				}
				if(form.getGenreId() != null && form.getGenreId() != 0) {

					//ジャンルを条件に追加
					Predicate newCondition = cb.equal(root.get("genreId"),form.getGenreId());
					condition = getPredicate(cb,condition,newCondition);
				}

				//削除フラグを条件に追加
				Predicate newCondition = cb.equal(root.get("delFlg"),0);
				condition = getPredicate(cb,condition,newCondition);
				return condition;
			}

			/**
			 *検索条件を結合する
			 *
			 *@param cd
			 *@param condition
			 *@param newCondition
			 *@returm Predicate
			 */
			private Predicate getPredicate(CriteriaBuilder cb, Predicate condition, @NotNull Predicate newCondition) {
				if (condition != null) {

					//すでに条件がある場合ANDで結合する
					condition = cb.and(condition,newCondition);
				} else {

					//条件がまだ無い場合先頭の条件になる
					condition = newCondition;
				}
				return condition;
			}
		};
	}
}