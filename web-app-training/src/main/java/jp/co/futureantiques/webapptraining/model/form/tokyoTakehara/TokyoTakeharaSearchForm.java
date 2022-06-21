package jp.co.futureantiques.webapptraining.model.form.tokyoTakehara;

import jp.co.futureantiques.webapptraining.model.tokyoTakehara.TokyoMainTakehara;
import lombok.Data;

/**
 * 東京23区検索画面のFormクラス
 *
 */
@Data
public class TokyoTakeharaSearchForm {

	/** 区ID */
	private Integer id;

	/** 区名 */
	private String wardName;

	/** 所在地ID */
	private Integer locationId;

	/** 人口 */
	private Integer population;

	/** 削除フラグON用 */
	private int isDelete;

	/**
	 * 各フィールドに値を設定する
	 *
	 * @param tokyoMainTakehara
	 */
	public void setValues(TokyoMainTakehara tokyoMainTakehara) {
		this.setId((int) tokyoMainTakehara.getId());
		this.setWardName(tokyoMainTakehara.getWardName());
		this.setLocationId(tokyoMainTakehara.getLocationId());
		this.setPopulation(tokyoMainTakehara.getPopulation());
	}

}
