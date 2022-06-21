package jp.co.futureantiques.webapptraining.model.form.gameMiura;

import java.sql.Timestamp;
import java.util.Date;

import javax.validation.constraints.Pattern;
import javax.validation.constraints.Size;

import org.hibernate.validator.constraints.NotBlank;

import jp.co.futureantiques.webapptraining.constant.CommonConst;
import jp.co.futureantiques.webapptraining.model.gameMiura.GameMainMiura;
import lombok.Data;

/**
 * ゲーム登録・更新画面用のFormクラス
 *
 * @author miura
 */
@Data
public class GameMiuraInputForm {

	/** ID */
	private int id;

	/** ゲームタイトル */
	@NotBlank(message = "common.text.error.require")
	@Size(max = 256, message = "game.text.error.countover")
	private String gameTitle;

	/** ジャンルID */
	private Integer genreId;

	/** ハードID */
	private Integer hardId;

	/** 発売日 */
	@NotBlank(message = "common.text.error.require")
	@Size(max = 4, message = "common.text.error.size.max.four")
	@Pattern(regexp = "^([+-]?0|[+-]?[1-9][0-9]*)?$", message = "common.text.error.numeric")
	private String releaseYearStr;

	/** コメント */
	@Size(max = 256)
	private String comment;

	/** 更新日時（排他制御用） */
	private String updateDate;

	/**
	 * フィールドにエンティティの中身を入れる
	 *
	 * @param gameMainMiura
	 */
	public void initWithGameMainMiura(GameMainMiura gameMainMiura) {
		this.setId((int) gameMainMiura.getId());
		this.setGameTitle(gameMainMiura.getGameTitle());
		this.setGenreId(gameMainMiura.getGenreId());
		this.setHardId(gameMainMiura.getHardId());
		this.setReleaseYearStr(String.valueOf(gameMainMiura.getReleaseYear()));
		this.setComment(gameMainMiura.getComment());
		this.setUpdateDate(String.valueOf(gameMainMiura.getUpdateDate()));

	}

	/**
	 * GameMainMiuraエンティティに登録値を入れる
	 *
	 * @author miura
	 */
	public GameMainMiura convertToGameMainMiuraForInsert() {
		GameMainMiura gameMainMiura = new GameMainMiura();
		gameMainMiura = convertToGameMainMiura(gameMainMiura);
		gameMainMiura.setCreateDate(new Timestamp(new Date().getTime()));
		gameMainMiura.setUpdateDate(gameMainMiura.getCreateDate());
		return gameMainMiura;
	}

	/**
	 * GameMainMiuraエンティティに更新値を入れる
	 *
	 * @param GameMainMiura gameMainMiura
	 * @return GameMainMiura
	 */
	public GameMainMiura convertToGameMainMiuraForUpdate(GameMainMiura gameMainMiura) {
		gameMainMiura = convertToGameMainMiura(gameMainMiura);
		gameMainMiura.setUpdateDate(new Timestamp(new Date().getTime()));
		return gameMainMiura;
	}

	/**
	 * GameMainMiuraエンティティに入力値を入れる
	 *
	 * @param GameMainMiura gameMainMiura
	 * @return GameMainMiura
	 */
	private GameMainMiura convertToGameMainMiura(GameMainMiura gameMainMiura) {
		gameMainMiura.setGameTitle(this.gameTitle);
		if (this.genreId == CommonConst.NOT_ENTERD) {

			//ジャンルが入力されていなかった場合
			gameMainMiura.setGenreId(null);
		} else {

			//ジャンルが入力されていた場合
			gameMainMiura.setGenreId(this.genreId);
		}
		if (this.hardId == CommonConst.NOT_ENTERD) {

			// ハードが入力されていなかった場合
			gameMainMiura.setHardId(null);
		} else {

			// ハードが入力されていた場合
			gameMainMiura.setHardId(this.hardId);
		}

		gameMainMiura.setReleaseYear(this.releaseYearStr);
		gameMainMiura.setComment(this.comment);
		gameMainMiura.setDelFlg("0");
		return gameMainMiura;
	}
}
