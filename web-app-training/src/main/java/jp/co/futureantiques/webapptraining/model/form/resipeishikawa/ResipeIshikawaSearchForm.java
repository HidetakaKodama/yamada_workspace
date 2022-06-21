package jp.co.futureantiques.webapptraining.model.form.resipeishikawa;

import jp.co.futureantiques.webapptraining.model.resipeishikawa.ResipeMainIshikawa;
import lombok.Data;

/**
 *レシピ検索画面のFormクラス
 * @author t.ishikawa
 *
 */

@Data
public class ResipeIshikawaSearchForm {

	/**ID*/
	private Integer id;

	/**レシピ名*/
	private String resipeTitle;

	/**レシピ名(ひらがな)*/
	private String resipeTitle2;

	/**野菜ID1*/
	private Integer vegetableId1;

	/**野菜ID2*/
	private Integer vegetableId2;

	/**ジャンルID*/
	private Integer genreId;

	/**削除フラグ*/
	private int isDelete;

	/**
	 *
	 * 各フィールドに値を設定する
	 *
	 * @param resipeMainIshikawa
	 */
	public void setValues(ResipeMainIshikawa resipeMainIshikawa) {
		this.setId((int)resipeMainIshikawa.getId());
		this.setResipeTitle(resipeMainIshikawa.getResipeTitle());
		this.setResipeTitle2(resipeMainIshikawa.getResipeTitle2());
		this.setVegetableId1(resipeMainIshikawa.getVegetableId1());
		this.setVegetableId2(resipeMainIshikawa.getVegetableId2());
		this.setGenreId(resipeMainIshikawa.getGenreId());
	}
}