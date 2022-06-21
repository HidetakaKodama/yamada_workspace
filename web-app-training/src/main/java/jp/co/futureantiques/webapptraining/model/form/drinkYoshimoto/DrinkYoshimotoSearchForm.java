package jp.co.futureantiques.webapptraining.model.form.drinkYoshimoto;

import javax.validation.constraints.Size;

import jp.co.futureantiques.webapptraining.model.drinkYoshimoto.DrinkMainYoshimoto;
import lombok.Data;

/**
 * 飲み物検索画面のFormクラス
 *
 * @author Yoshimoto
 *
 */
@Data
public class DrinkYoshimotoSearchForm {

	/** ID */
	private Integer drinkId;

	/** 商品名 */
	@Size(max = 256, message = "drink.text.error.countover")
	private String drinkName;

	/** カテゴリーID */
	private Integer categoryId;

	/** メーカーID */
	private Integer makerId;

	/** 削除フラグON用 */
	private int isDelete;

	/**
	 * 各フィールドに値を設定する
	 *
	 * @param drinkMainYoshimoto
	 */
	public void setValues(DrinkMainYoshimoto drinkMainYoshimoto) {
		this.setDrinkId((int) drinkMainYoshimoto.getDrinkId());
		this.setDrinkName(drinkMainYoshimoto.getDrinkName());
		this.setCategoryId(drinkMainYoshimoto.getCategoryId());
		this.setMakerId(drinkMainYoshimoto.getMakerId());
	}
}
