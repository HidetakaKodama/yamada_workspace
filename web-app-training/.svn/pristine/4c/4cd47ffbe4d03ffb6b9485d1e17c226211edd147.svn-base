package jp.co.futureantiques.webapptraining.model.form.penguinKawamura;

import jp.co.futureantiques.webapptraining.model.penguinKawamura.PenguinMainKawamura;
import lombok.Data;

/**
 * ペンギン検索画面のFormクラス
 * @author Mariko Kawamura
 */
@Data
public class PenguinSearchForm {

	/** ペンギンID */
	private Integer id;

	/** ペンギンの名前 */
	private String name;

	/** 属性ID */
	private Integer attributeId;

	/** 削除フラグON用 */
	private int isDelete;

	/** 画像 */
	private String image;

	/**
	 * 各フィールドに値を設定する
	 * @param PenguinMainKawamura penguinMainKawamura
	 */
	public void setValues(PenguinMainKawamura penguinMainKawamura) {
		this.setId((int)penguinMainKawamura.getId());
		this.setName(penguinMainKawamura.getName());
		this.setAttributeId(penguinMainKawamura.getAttributeId());
	}

}
