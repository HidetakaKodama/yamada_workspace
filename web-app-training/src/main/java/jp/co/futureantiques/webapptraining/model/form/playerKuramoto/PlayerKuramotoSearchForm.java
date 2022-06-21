package jp.co.futureantiques.webapptraining.model.form.playerKuramoto;

import jp.co.futureantiques.webapptraining.model.playerKuramoto.PlayerMainKuramoto;
import lombok.Data;

/**
 * 選手検索画面のFormクラス
 *
 * @author future
 */
@Data
public class PlayerKuramotoSearchForm {

	/** ID */
	private Integer id;

	/** 選手名 */
	private String playerName;

	/** ポジションID */
	private Integer positionId;

	/** 投打ID */
	private Integer btId;

	/** 削除フラグON用 */
	private int isDelete;

	/**
	 * 各フィールドに値を設定する
	 *
	 * @param playerMainKuramoto
	 */
	public void setValues(PlayerMainKuramoto playerMainKuramoto) {
		this.setId((int) playerMainKuramoto.getId());
		this.setPlayerName(playerMainKuramoto.getPlayerName());
		this.setPositionId(playerMainKuramoto.getPositionId());
		this.setBtId(playerMainKuramoto.getBtId());
	}
}
