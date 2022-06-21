package jp.co.futureantiques.webapptraining.model.form.playerKuramoto;

import java.sql.Timestamp;
import java.util.Date;

import javax.validation.constraints.Pattern;
import javax.validation.constraints.Size;

import org.hibernate.validator.constraints.NotBlank;

import jp.co.futureantiques.webapptraining.constant.CommonConst;
import jp.co.futureantiques.webapptraining.model.playerKuramoto.PlayerMainKuramoto;
import lombok.Data;

/**
 * 選手登録・更新画面用のFormクラス
 *
 * @author future
 */
@Data
public class PlayerKuramotoInputForm {

	/** ID */
	private int id;

	/** 選手名 */
	@NotBlank(message = "common.text.error.require")
	@Size(max = 255)
	private String playerName;

	/** ポジションID */
	private Integer positionId;

	/** 投打ID */
	private Integer btId;

	/** 年齢 */
	@NotBlank(message = "common.text.error.require")
	@Size(max = 2, message = "common.text.error.size.max.two")
	@Pattern(regexp = "^([+-]?0|[+-]?[1-9][0-9]*)?$", message = "common.text.error.numeric")
	private String playerAgeStr;

	/** プロ在籍年年数 */
	@Size(min = 1, max = 2, message = "common.text.error.size.max.two")
	@Pattern(regexp = "^([+-]?0|[+-]?[1-9][0-9]*)?$", message = "common.text.error.numeric")
	private String playerYearsStr;

	/** 出身地 */
	@Size(max = 255)
	private String playerPlace;

	/** 更新日時（排他制御用） */
	private String updateDate;

	/**
	 * フィールドにエンティティの中身を入れる
	 *
	 * @param playerMainKuramoto
	 */
	public void initWithPlayerMainKuramoto(PlayerMainKuramoto playerMainKuramoto) {
		this.setId((int) playerMainKuramoto.getId());
		this.setPlayerName(playerMainKuramoto.getPlayerName());
		this.setPositionId(playerMainKuramoto.getPositionId());
		this.setBtId(playerMainKuramoto.getBtId());
		this.setPlayerAgeStr(String.valueOf(playerMainKuramoto.getPlayerAge()));
		this.setPlayerYearsStr(String.valueOf(playerMainKuramoto.getPlayerYears()));
		this.setPlayerPlace(playerMainKuramoto.getPlayerPlace());
		this.setUpdateDate(String.valueOf(playerMainKuramoto.getUpdateDate()));
	}

	/**
	 * PlayerMainKuramotoエンティティに登録値を入れる
	 *
	 * @return PlayerMainKuramoto
	 */
	public PlayerMainKuramoto convertToPlayerMainKuramotoForInsert() {
		PlayerMainKuramoto playerMainKuramoto = new PlayerMainKuramoto();
		playerMainKuramoto = convertToPlayerMainKuramoto(playerMainKuramoto);
		playerMainKuramoto.setCreateDate(new Timestamp(new Date().getTime()));
		playerMainKuramoto.setUpdateDate(playerMainKuramoto.getCreateDate());
		return playerMainKuramoto;
	}

	/**
	 * PlayerMainKuramotoエンティティに更新値を入れる
	 *
	 * @param PlayerMainKuramoto layerMainKuramoto
	 * @return PlayerMainKuramoto
	 */
	public PlayerMainKuramoto convertToPlayerMainKuramotoForUpdate(PlayerMainKuramoto playerMainKuramoto) {
		playerMainKuramoto = convertToPlayerMainKuramoto(playerMainKuramoto);
		playerMainKuramoto.setUpdateDate(new Timestamp(new Date().getTime()));
		return playerMainKuramoto;
	}

	/**
	 * PlayerMainKuramotoエンティティに入力値を入れる
	 *
	 * @param PlayerMainKuramoto playerMainKuramoto
	 * @return
	 * @return playerMainKuramoto
	 */
	private PlayerMainKuramoto convertToPlayerMainKuramoto(PlayerMainKuramoto playerMainKuramoto) {
		playerMainKuramoto.setPlayerName(this.playerName);
		if(this.positionId == CommonConst.NOT_ENTERD) {

			// ポジションが入力されていなかった場合
			playerMainKuramoto.setPositionId(null);
		}else {

			// ポジションが入力されていた場合
			playerMainKuramoto.setPositionId(this.positionId);
		}
		if(this.btId == CommonConst.NOT_ENTERD) {

			// 投打が入力されていなかった場合
			playerMainKuramoto.setBtId(null);
		}else {

			// 投打が入力されていた場合
			playerMainKuramoto.setBtId(this.btId);
		}
		playerMainKuramoto.setPlayerAge(Integer.parseInt(this.playerAgeStr));
		if (!this.playerAgeStr.isEmpty()) {

			// 年齢が入力されていた場合
			playerMainKuramoto.setPlayerAge(Integer.parseInt(this.playerYearsStr));
		} else {

			// 年齢が入力されていなかった場合
			playerMainKuramoto.setPlayerAge(null);
		}
		if (!this.playerYearsStr.isEmpty()) {

			// 年数が入力されていた場合
			playerMainKuramoto.setPlayerYears(Integer.parseInt(this.playerYearsStr));
		} else {

			// 年数が入力されていなかった場合
			playerMainKuramoto.setPlayerYears(null);
		}
		if (!this.playerPlace.isEmpty()) {

			// 出身地が入力されていた場合
			playerMainKuramoto.setPlayerPlace(this.playerPlace);
		} else {

			// 出身地が入力されていなかった場合
			playerMainKuramoto.setPlayerPlace(null);
		}
		playerMainKuramoto.setDelFlg("0");
		return playerMainKuramoto;
	}


}