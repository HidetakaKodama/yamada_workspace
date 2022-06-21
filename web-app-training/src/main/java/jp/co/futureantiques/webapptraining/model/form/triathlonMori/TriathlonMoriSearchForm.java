package jp.co.futureantiques.webapptraining.model.form.triathlonMori;

import jp.co.futureantiques.webapptraining.model.triathlonMori.TriathlonMainMori;
import lombok.Data;

/**
 * 自転車検索画面のFormクラス
 *
 * @author future
 */
@Data
public class TriathlonMoriSearchForm {

	/** ID */
	private Integer id;

	/** 自転車名 */
	private String name;

	/** タイプID */
	private Integer typeId;

	/** メーカーID */
	private Integer makerId;

	/** 削除フラグON用 */
	private int isDelete;

	/**
	 * 各フィールドに値を設定する
	 *
	 * @param movieMain
	 */
	public void setValues(TriathlonMainMori triathlonMainMori) {
		this.setId((int) triathlonMainMori.getId());
		this.setName(triathlonMainMori.getName());
		this.setTypeId(triathlonMainMori.getTypeId());
		this.setMakerId(triathlonMainMori.getMakerId());
	}
}
