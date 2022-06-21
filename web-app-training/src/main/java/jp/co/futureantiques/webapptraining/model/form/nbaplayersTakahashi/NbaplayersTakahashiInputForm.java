package jp.co.futureantiques.webapptraining.model.form.nbaplayersTakahashi;

import java.sql.Timestamp;
import java.util.Date;

import javax.validation.constraints.Pattern;
import javax.validation.constraints.Size;

import org.hibernate.validator.constraints.NotBlank;

import jp.co.futureantiques.webapptraining.constant.CommonConst;
import jp.co.futureantiques.webapptraining.model.nbaplayersTakahashi.NbaplayersMainTakahashi;
import lombok.Data;

/**
 * NBA選手登録・更新画面用のFormクラス
 *
 * @author Takumi Takahashi
 */
@Data

public class NbaplayersTakahashiInputForm {

	/** NBA選手ID */
	private int id;

	/** 選手名 */
	@NotBlank(message = "common.text.error.require")
	@Size(max = 256)
	private String playerName;

	/** ポジションID */
	private Integer positionId;

	/** 所属チームID */
	private Integer teamId;

	/** 身長 */
	@NotBlank(message = "common.text.error.require")
	@Size(min = 1, max = 3, message = "nbaplayers.text.error.size.max.three")
	@Pattern(regexp = "^([+-]?0|[+-]?[1-9][0-9]*)?$", message = "common.text.error.numeric")
	private String heightStr;

	/** 体重 */
	@NotBlank(message = "common.text.error.require")
	@Size(min = 1, max = 3, message = "nbaplayers.text.error.size.max.three")
	@Pattern(regexp = "^([+-]?0|[+-]?[1-9][0-9]*)?$", message = "common.text.error.numeric")
	private String weightStr;

	/** コメント */
	@Size(max = 256)
	private String comment;

	/** 更新日時（排他制御用) */
	private String updateDate;

	/**
	 * フィールドにエンティティの中身を入れる
	 *
	 * @param nbaplayersMainTakahashi
	 */
	public void initWithNbaplayersMainTakahashi(NbaplayersMainTakahashi nbaplayersMainTakahashi) {
		this.setId((int) nbaplayersMainTakahashi.getId());
		this.setPlayerName(nbaplayersMainTakahashi.getPlayerName());
		this.setPositionId(nbaplayersMainTakahashi.getPositionId());
		this.setTeamId(nbaplayersMainTakahashi.getTeamId());
		this.setHeightStr(String.valueOf(nbaplayersMainTakahashi.getHeight()));
		this.setWeightStr(String.valueOf(nbaplayersMainTakahashi.getWeight()));
		this.setComment(nbaplayersMainTakahashi.getComment());
		this.setUpdateDate(String.valueOf(nbaplayersMainTakahashi.getUpdateDate()));
	}

	/**
	 * NbaplayersMainTakahashiエンティティに登録値を入れる
	 *
	 * @return NbaplayersMainTakahashi
	 */
	public NbaplayersMainTakahashi convertToNbaplayersMainTakahashiForInsert() {
		NbaplayersMainTakahashi nbaplayersMainTakahashi = new NbaplayersMainTakahashi();
		nbaplayersMainTakahashi = convertToNbaplayersMainTakahashiForUpdate(nbaplayersMainTakahashi);
		nbaplayersMainTakahashi.setCreateDate(new Timestamp(new Date().getTime()));
		nbaplayersMainTakahashi.setUpdateDate(nbaplayersMainTakahashi.getCreateDate());
		return nbaplayersMainTakahashi;
	}

	/**
	 * NbaplayersMainTakahashiエンティティに更新値を入れる
	 *
	 * @param NbaplayersMainTakahashi nbaplayersMainTakahashi
	 * @return NbaplayersMainTakahashi
	 */
	public NbaplayersMainTakahashi convertToNbaplayersMainTakahashiForUpdate(
			NbaplayersMainTakahashi nbaplayersMainTakahashi) {
		nbaplayersMainTakahashi = convertToNbaplayersMainTakahashi(nbaplayersMainTakahashi);
		nbaplayersMainTakahashi.setUpdateDate(new Timestamp(new Date().getTime()));
		return nbaplayersMainTakahashi;
	}

	/**
	 * NbaplayersMainTakahashiエンティティに入力値を入れる
	 *
	 * @param NbaplayersMainTakahashi nbaplayersMainTakahashi
	 * @return NbaplayersMainTakahashi
	 */
	private NbaplayersMainTakahashi convertToNbaplayersMainTakahashi(NbaplayersMainTakahashi nbaplayersMainTakahashi) {
		nbaplayersMainTakahashi.setPlayerName(this.playerName);
		if (this.positionId == CommonConst.NOT_ENTERD) {

			// ポジションが入力されていなかった場合
			nbaplayersMainTakahashi.setPositionId(null);
		} else {

			// ポジションが入力されていた場合
			nbaplayersMainTakahashi.setPositionId(this.positionId);
		}
		if (this.teamId == CommonConst.NOT_ENTERD) {

			// 所属チームが入力されていなかった場合
			nbaplayersMainTakahashi.setTeamId(null);
		} else {

			// 所属チームが入力されていた場合
			nbaplayersMainTakahashi.setTeamId(this.teamId);
		}

		// 身長が入力されていた場合
		nbaplayersMainTakahashi.setHeight(Integer.parseInt(this.heightStr));

		// 体重が入力されていた場合
		nbaplayersMainTakahashi.setWeight(Integer.parseInt(this.weightStr));
		nbaplayersMainTakahashi.setComment(this.comment);
		nbaplayersMainTakahashi.setDelFlg("0");
		return nbaplayersMainTakahashi;
	}

}
