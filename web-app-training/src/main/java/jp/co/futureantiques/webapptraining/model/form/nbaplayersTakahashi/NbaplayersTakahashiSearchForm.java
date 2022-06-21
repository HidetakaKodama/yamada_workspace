package jp.co.futureantiques.webapptraining.model.form.nbaplayersTakahashi;

import jp.co.futureantiques.webapptraining.model.nbaplayersTakahashi.NbaplayersMainTakahashi;
import lombok.Data;

/**
 * NBA選手検索画面のFormクラス
 *
 * @author Takumi Takahashi
 */
@Data
public class NbaplayersTakahashiSearchForm {

	/** NBA選手ID */
	private Integer id;

	/** 選手名 */
	private String playerName;

	/** ポジションID */
	private Integer positionId;

	/** 所属チームID */
	private Integer teamId;

	/** 削除フラグON用 */
	private int isDelete;

	/**
	 * 各フィールドに値を設定する
	 *
	 * @param nbaplayersMainTakahashi
	 */
	public void setValues(NbaplayersMainTakahashi nbaplayersMainTakahashi) {
		this.setId((int) nbaplayersMainTakahashi.getId());
		this.setPlayerName(nbaplayersMainTakahashi.getPlayerName());
		this.setPositionId(nbaplayersMainTakahashi.getPositionId());
		this.setTeamId(nbaplayersMainTakahashi.getTeamId());
	}

}
