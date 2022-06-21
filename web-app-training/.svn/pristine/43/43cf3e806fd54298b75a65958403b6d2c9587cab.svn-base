package jp.co.futureantiques.webapptraining.model.form.dramaIge;

import java.sql.Timestamp;
import java.util.Date;

import javax.validation.constraints.Pattern;
import javax.validation.constraints.Size;

import org.hibernate.validator.constraints.NotBlank;

import jp.co.futureantiques.webapptraining.constant.CommonConst;
import jp.co.futureantiques.webapptraining.model.dramaIge.DramaMainIge;
import lombok.Data;

/**
 * ドラマ登録・更新画面用のFormクラス
 *
 * @author Ige
 *
 */
@Data
public class DramaIgeInputForm {

	/** ID */
	private int id;

	/** ドラマ名 */
	@NotBlank(message = "common.text.error.require")
	@Size(max = 255, message = "drama.text.error.countover")
	private String dramaTitle;

	/** ジャンルID */
	private Integer genreId;

	/** 放送局ID */
	private Integer broadcastStationId;

	/** 放送年 */
	@NotBlank(message = "common.text.error.require")
	@Size(max = 4, message = "common.text.error.size.max.four")
	@Pattern(regexp = "^([+-]?0|[+-]?[1-9][0-9]*)?$", message = "common.text.error.numeric")
	private String startYearStr;

	/** 放送季節 */
	@NotBlank(message = "common.text.error.require")
	private String selectStartSeason;

	/** 放送曜日 */
	private String dayOfWeek;

	/** コメント */
	@Size(max = 255)
	private String comment;

	/** 更新日時（排他制御用） */
	private String updateDate;

	/**
	 * フィールドにエンティティの中身を入れる
	 *
	 * @param dramaMainIge
	 */
	public void initWithDramaMain(DramaMainIge dramaMainIge) {
		this.setId((int) dramaMainIge.getId());
		this.setDramaTitle(dramaMainIge.getDramaTitle());
		this.setGenreId(dramaMainIge.getGenreId());
		this.setBroadcastStationId(dramaMainIge.getBroadcastStationId());
		String season = dramaMainIge.getStartSeason();

		this.setStartYearStr(season.substring(0, 4));
		this.setSelectStartSeason(season.substring(season.length() - 1));
		this.setDayOfWeek(dramaMainIge.getDayOfWeek());
		this.setComment(dramaMainIge.getComment());
		this.setUpdateDate(String.valueOf(dramaMainIge.getUpdateDate()));
	}

	/**
	 * DramaMainエンティティに登録値を入れる
	 *
	 * @return DramaMainIge
	 */
	public DramaMainIge convertToDramaMainIgeForInsert() {
		DramaMainIge dramaMainIge = new DramaMainIge();
		dramaMainIge = convertToDramaMainIge(dramaMainIge);
		dramaMainIge.setCreateDate(new Timestamp(new Date().getTime()));
		dramaMainIge.setUpdateDate(dramaMainIge.getCreateDate());
		return dramaMainIge;
	}

	/**
	 * DramaMainIgeエンティティに更新値を入れる
	 *
	 * @parama DramaMainIge
	 * @return dramaMainIge
	 */
	public DramaMainIge convertToDramaMainIgeForUpdate(DramaMainIge dramaMainIge) {
		dramaMainIge = convertToDramaMainIge(dramaMainIge);
		dramaMainIge.setUpdateDate(new Timestamp(new Date().getTime()));
		return dramaMainIge;
	}

	/**
	 * DramaMainIgeエンティティに入力値を入れる
	 *
	 * @param DramaMainIge DramaMainIge
	 * @return DramaMainIge
	 */
	private DramaMainIge convertToDramaMainIge(DramaMainIge dramaMainIge) {
		dramaMainIge.setDramaTitle(this.dramaTitle);

		if (this.genreId == CommonConst.NOT_ENTERD) {

			//ジャンルが入力されなかった場合
			dramaMainIge.setGenreId(null);
		} else {

			// ジャンルが入力された場合
			dramaMainIge.setGenreId(this.genreId);
		}
		if (this.broadcastStationId == CommonConst.NOT_ENTERD) {

			//放送局が入力されなかった場合
			dramaMainIge.setBroadcastStationId(null);
		} else {

			//放送局が入力されていた場合
			dramaMainIge.setBroadcastStationId(this.broadcastStationId);
		}
		dramaMainIge.setStartSeason(this.startYearStr + this.selectStartSeason);
		if (this.dayOfWeek.isEmpty()) {

			// 放送曜日が入力されなかった場合
			dramaMainIge.setDayOfWeek(null);
		} else {

			// 放送曜日が入力された場合
			dramaMainIge.setDayOfWeek(this.dayOfWeek);
		}
		dramaMainIge.setComment(this.comment);
		dramaMainIge.setDelFlg("0");
		return dramaMainIge;
	}
}
