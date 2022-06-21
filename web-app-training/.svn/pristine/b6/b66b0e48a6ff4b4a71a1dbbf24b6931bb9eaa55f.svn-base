package jp.co.futureantiques.webapptraining.model.form.gameMiura;

import javax.validation.constraints.Size;

import jp.co.futureantiques.webapptraining.model.gameMiura.GameMainMiura;
import lombok.Data;

/**
 * ゲーム検索画面のFormクラス
 *
 * @author Miura
 */
@Data
public class GameMiuraSearchForm {

	/** ID */
	private Integer id;

	/** ゲームタイトル */
	@Size(max = 256, message = "game.text.error.countover")
	private String gameTitle;

	/** ジャンルID */
	private Integer genreId;

	/** ハードID */
	private Integer hardId;

	/** 削除フラグON用 */
	private int isDelete;

	/**
	 * 各フィールドに値を設定する
	 *
	 *@param gameMainMiura
	 */
	public void setValues(GameMainMiura gameMainMiura) {
		this.setId((int) gameMainMiura.getId());
		this.setGameTitle(gameMainMiura.getGameTitle());
		this.setGenreId(gameMainMiura.getGenreId());
		this.setHardId(gameMainMiura.getHardId());
	}
}