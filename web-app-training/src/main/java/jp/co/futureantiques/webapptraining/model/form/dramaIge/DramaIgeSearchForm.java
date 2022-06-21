package jp.co.futureantiques.webapptraining.model.form.dramaIge;

import jp.co.futureantiques.webapptraining.model.dramaIge.DramaMainIge;
import lombok.Data;

/**
 * ドラマ検索画面のFormクラス
 *
 * @author future
 *
 */
@Data
public class DramaIgeSearchForm {

	/** ID */
	private Integer id;

	/** ドラマ名 */
	private String dramaTitle;

	/** ジャンルID */
	private Integer genreId;

	/** 放送局ID */
	private Integer broadcastStationId;

	/** 削除フラグON用*/
	private int isDelete;

	/**
	 * 各フィールドに値を設定する
	 *
	 * @param DramaMainIge
	 *
	 */
	public void setValues(DramaMainIge dramaMainIge) {
		this.setId((int) dramaMainIge.getId());
		this.setDramaTitle(dramaMainIge.getDramaTitle());
		this.setGenreId(dramaMainIge.getGenreId());
		this.setBroadcastStationId(dramaMainIge.getBroadcastStationId());

	}
}
