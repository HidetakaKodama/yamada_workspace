package jp.co.futureantiques.webapptraining.model.form.dogKanno;

import javax.validation.constraints.Size;

import jp.co.futureantiques.webapptraining.model.dogKanno.DogMainKanno;
import lombok.Data;

/**
 * 犬検索画面のFormクラス
 *
 * @author future
 */
@Data
public class DogSearchForm {

	/** 犬ID */
	private Integer dogId;

	/** 犬種 */
	@Size(max = 256 , message = "dog.text.error.invalid.name")
	private String dogName;

	/** 原産国ID */
	private Integer countryId;

	/** サイズID */
	private Integer sizeId;

	/** 削除フラグON用 */
	private int isDelete;

	/**
	 * 各フィールドに値を設定する
	 *
	 * @param dogMainKanno
	 */
	public void setValues(DogMainKanno dogMainKanno) {
		this.setDogId((int) dogMainKanno.getDogId());
		this.setDogName(dogMainKanno.getDogName());
		this.setCountryId(dogMainKanno.getCountryId());
		this.setSizeId(dogMainKanno.getSizeId());
	}

}
