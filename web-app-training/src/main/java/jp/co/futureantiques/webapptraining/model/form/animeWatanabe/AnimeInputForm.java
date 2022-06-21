package jp.co.futureantiques.webapptraining.model.form.animeWatanabe;

import java.sql.Timestamp;
import java.util.Date;

import javax.validation.constraints.NotNull;
import javax.validation.constraints.Pattern;
import javax.validation.constraints.Size;

import org.hibernate.validator.constraints.NotBlank;

import jp.co.futureantiques.webapptraining.constant.CommonConst;
import jp.co.futureantiques.webapptraining.model.animeWatanabe.AnimeMainWatanabe;
import lombok.Data;

/**
 * アニメ追加・更新画面用のフォームクラス
 *
 * @author Watanabe
 */

@Data
public class AnimeInputForm {

	/** アニメID */
	private int id;

	/** アニメ名 */
	@NotNull(message = "common.text.error.require")
	@NotBlank(message = "common.text.error.require")
	@Size(max = 255, message = "anime.text.error.invalid.name")
	private String animeTitle;

	/** アニメ制作会社ID */
	private Integer companyId;

	/** 原作ID */
	private Integer originalId;

	/** 公開年 */
	@NotNull(message = "common.text.error.require")
	@NotBlank(message = "common.text.error.require")
	@Size(min = 1, max = 4, message = "common.text.error.size.max.four")
	@Pattern(regexp = "^([+-]?0|[+-]?[1-9][0-9]*)?$", message = "common.text.error.numeric")
	private String releaseYearStr;

	/** 話数 */
	@NotNull(message = "common.text.error.require")
	@NotBlank(message = "common.text.error.require")
	@Size(min = 1, max = 3, message = "anime.text.error.size.max.three")
	private String episodeStr;

	/** 続編 */
	@Size(max = 255, message = "anime.text.error.invalid.name")
	private String sequel;

	/** オープニング主題歌 */
	@Size(max = 255, message = "anime.text.error.invalid.name")
	private String op;

	/** 更新日時(排他制御用) */
	private String updateDate;

	/**
	 * フィールドにエンティティの中身を入れる
	 *
	 * @param animeMainWatanabe
	 */
	public void initWithAnimeMainWatanabe(AnimeMainWatanabe animeMainWatanabe) {
		this.setId((int) animeMainWatanabe.getId());
		this.setAnimeTitle(animeMainWatanabe.getAnimeTitle());
		this.setCompanyId(animeMainWatanabe.getCompanyId());
		this.setOriginalId(animeMainWatanabe.getOriginalId());
		this.setReleaseYearStr(String.valueOf(animeMainWatanabe.getReleaseYear()));
		this.setEpisodeStr(String.valueOf(animeMainWatanabe.getEpisode()));
		this.setSequel(animeMainWatanabe.getSequel());
		this.setOp(animeMainWatanabe.getOp());

		this.setUpdateDate(String.valueOf(animeMainWatanabe.getUpdateDate()));
	}

	/**
	 * AnimeMainWatanabeエンティティに登録値を入れる
	 *
	 * @return AnimeMainWatanabe
	 */
	public AnimeMainWatanabe convertToAnimeMainWatanabeForInsert() {
		AnimeMainWatanabe animeMainWatanabe = new AnimeMainWatanabe();
		animeMainWatanabe = convertToAnimeMainWatanabe(animeMainWatanabe);
		animeMainWatanabe.setCreateDate(new Timestamp(new Date().getTime()));
		animeMainWatanabe.setUpdateDate(animeMainWatanabe.getCreateDate());
		return animeMainWatanabe;
	}

	/**
	 * AnimeMainWatanabeエンティティに更新値を入れる
	 *
	 * @param AnimeMainWatanabe
	 * @return AnimeMainWatanabe
	 */
	public AnimeMainWatanabe convertToAnimeMainWatanabeForUpdate(AnimeMainWatanabe animeMainWatanabe) {
		animeMainWatanabe = convertToAnimeMainWatanabe(animeMainWatanabe);
		animeMainWatanabe.setUpdateDate(new Timestamp(new Date().getTime()));
		return animeMainWatanabe;
	}

	/**
	 * AnimeMainWatanabeエンティティに入力値を入れる
	 *
	 * @param AnimeMainWatanabe animeMainWatanabe
	 * @return AnimeMainWatanabe
	 */
	private AnimeMainWatanabe convertToAnimeMainWatanabe(AnimeMainWatanabe animeMainWatanabe) {
		animeMainWatanabe.setAnimeTitle(this.animeTitle);

		if (this.companyId == CommonConst.NOT_ENTERD) {

			// アニメ制作会社が入力されていなかった場合
			animeMainWatanabe.setCompanyId(null);
		} else {

			// アニメ制作会社が入力されていた場合
			animeMainWatanabe.setCompanyId(this.companyId);
		}

		if (this.originalId == CommonConst.NOT_ENTERD) {

			// 原作が入力されていなかった場合
			animeMainWatanabe.setOriginalId(null);
		} else {

			// 原作が入力されていた場合
			animeMainWatanabe.setOriginalId(this.originalId);
		}

		animeMainWatanabe.setReleaseYear(Integer.parseInt(this.releaseYearStr));
		animeMainWatanabe.setEpisode(Integer.parseInt(this.episodeStr));

		if (this.sequel.isEmpty()) {

			// 続編が入力されていなかった場合
			animeMainWatanabe.setSequel(null);
		} else {

			// 続編が入力されていた場合
			animeMainWatanabe.setSequel(this.sequel);
		}

		if (this.op.isEmpty()) {

			// オープニング主題歌が入力されていなかった場合
			animeMainWatanabe.setOp(null);
		} else {

			// オープニング主題歌が入力されていた場合
			animeMainWatanabe.setOp(this.op);
		}

		animeMainWatanabe.setDelFlg("0");

		return animeMainWatanabe;

	}

}
