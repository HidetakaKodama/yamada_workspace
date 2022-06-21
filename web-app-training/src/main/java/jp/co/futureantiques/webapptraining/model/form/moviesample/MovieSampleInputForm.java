package jp.co.futureantiques.webapptraining.model.form.moviesample;

import java.sql.Timestamp;
import java.util.Date;

import javax.validation.constraints.Pattern;
import javax.validation.constraints.Size;

import org.hibernate.validator.constraints.NotBlank;

import jp.co.futureantiques.webapptraining.constant.CommonConst;
import jp.co.futureantiques.webapptraining.model.moviesample.MovieMain;
import lombok.Data;

/**
 * 映画登録・更新画面用のFormクラス
 *
 * @author future
 */
@Data
public class MovieSampleInputForm {

	/** ID */
	private int id;

	/** 映画名 */
	@NotBlank(message = "common.text.error.require")
	@Size(max = 255)
	private String movieTitle;

	/** ジャンルID */
	private Integer genreId;

	/** 俳優ID */
	private Integer actorId;

	/** 公開年 */
	@NotBlank(message = "common.text.error.require")
	@Size(max = 4, message = "common.text.error.size.max.four")
	@Pattern(regexp = "^([+-]?0|[+-]?[1-9][0-9]*)?$", message = "common.text.error.numeric")
	private String releaseYearStr;

	/** 上映時間 */
	@Size(min = 0, max = 4, message = "common.text.error.size.max.four")
	@Pattern(regexp = "^([+-]?0|[+-]?[1-9][0-9]*)?$", message = "common.text.error.numeric")
	private String runTimeStr;

	/** コメント */
	@Size(max = 255)
	private String comment;

	/** 更新日時（排他制御用） */
	private String updateDate;

	/**
	 * フィールドにエンティティの中身を入れる
	 *
	 * @param movieMain
	 */
	public void initWithMovieMain(MovieMain movieMain) {
		this.setId((int) movieMain.getId());
		this.setMovieTitle(movieMain.getMovieTitle());
		this.setGenreId(movieMain.getGenreId());
		this.setActorId(movieMain.getActorId());
		this.setReleaseYearStr(String.valueOf(movieMain.getReleaseYear()));
		if (movieMain.getRunTime() != null) {
			this.setRunTimeStr(String.valueOf(movieMain.getRunTime()));
		}
		this.setComment(movieMain.getComment());
		this.setUpdateDate(String.valueOf(movieMain.getUpdateDate()));
	}

	/**
	 * MovieMainエンティティに登録値を入れる
	 *
	 * @return MovieMain
	 */
	public MovieMain convertToMovieMainForInsert() {
		MovieMain movieMain = new MovieMain();
		movieMain = convertToMovieMain(movieMain);
		movieMain.setCreateDate(new Timestamp(new Date().getTime()));
		movieMain.setUpdateDate(movieMain.getCreateDate());
		return movieMain;
	}

	/**
	 * MovieMainエンティティに更新値を入れる
	 *
	 * @param MovieMain movieMain
	 * @return MovieMain
	 */
	public MovieMain convertToMovieMainForUpdate(MovieMain movieMain) {
		movieMain = convertToMovieMain(movieMain);
		movieMain.setUpdateDate(new Timestamp(new Date().getTime()));
		return movieMain;
	}

	/**
	 * MovieMainエンティティに入力値を入れる
	 *
	 * @param MovieMain movieMain
	 * @return MovieMain
	 */
	private MovieMain convertToMovieMain(MovieMain movieMain) {
		movieMain.setMovieTitle(this.movieTitle);
		if(this.genreId == CommonConst.NOT_ENTERD) {

			// ジャンルが入力されていなかった場合
			movieMain.setGenreId(null);
		}else {

			// ジャンルが入力されていた場合
			movieMain.setGenreId(this.genreId);
		}
		if(this.actorId == CommonConst.NOT_ENTERD) {

			// 俳優が入力されていなかった場合
			movieMain.setActorId(null);
		}else {

			// 俳優が入力されていた場合
			movieMain.setActorId(this.actorId);
		}
		movieMain.setReleaseYear(Integer.parseInt(this.releaseYearStr));
		if (!this.runTimeStr.isEmpty()) {

			// 上映時間が入力されていた場合
			movieMain.setRunTime(Integer.parseInt(this.runTimeStr));
		} else {

			// 上映時間が入力されていなかった場合
			movieMain.setRunTime(null);
		}
		movieMain.setComment(this.comment);
		movieMain.setDelFlg("0");
		return movieMain;
	}
}