package jp.co.futureantiques.webapptraining.model.form.moviesample;

import jp.co.futureantiques.webapptraining.model.moviesample.MovieMain;
import lombok.Data;

/**
 * 映画検索画面のFormクラス
 *
 * @author future
 */
@Data
public class MovieSampleSearchForm {

	/** ID */
	private Integer id;

	/** 映画名 */
	private String movieTitle;

	/** ジャンルID */
	private Integer genreId;

	/** 俳優ID */
	private Integer actorId;

	/** 削除フラグON用 */
	private int isDelete;

	/**
	 * 各フィールドに値を設定する
	 *
	 * @param movieMain
	 */
	public void setValues(MovieMain movieMain) {
		this.setId((int) movieMain.getId());
		this.setMovieTitle(movieMain.getMovieTitle());
		this.setGenreId(movieMain.getGenreId());
		this.setActorId(movieMain.getActorId());
	}
}
