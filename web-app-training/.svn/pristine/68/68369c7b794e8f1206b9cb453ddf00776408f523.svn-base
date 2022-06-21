package jp.co.futureantiques.webapptraining.model.form.perfumeAnzai;

import java.sql.Timestamp;
import java.util.Date;

import javax.validation.constraints.NotNull;
import javax.validation.constraints.Pattern;
import javax.validation.constraints.Size;

import org.hibernate.validator.constraints.NotBlank;

import jp.co.futureantiques.webapptraining.constant.CommonConst;
import jp.co.futureantiques.webapptraining.model.perfumeAnzai.PerfumeMainAnzai;
import lombok.Data;

/**
 * Perfume追加画面のFormクラス
* @author  anzai
*/
@Data
public class PerfumeAnzaiInputForm {

	/**ID**/
	private int id;

	/**曲名**/
	@NotNull(message = "common.text.error.require")
	@NotBlank(message = "common.text.error.require")
	@Size(max = 255, message="perfume.text.error.size.max")
	private String songName;

	/**発売年**/
	@NotNull(message = "common.text.error.require")
	@NotBlank(message = "common.text.error.require")
	@Size(min=1, max = 4, message = "common.text.error.size.max.four")
	@Pattern(regexp="^([+-]?0|[+-]?[1-9][0-9]*)?$", message="common.text.error.numeric")
	private String releaseYearStr;

	/** 作詞者**/
	@Size(max = 255, message="perfume.text.error.size.max")
	private String lyricistName;

	/**アルバムID**/
	private Integer albumId;

	/**タイアップID**/
	private Integer tieupId;

	/** コメント**/
	@Size(max = 255, message="perfume.text.error.size.max")
	private String comment;

	/**更新日時**/
	private String updateDate;

	/**
	 * フィールドにエンティティの中身を入れる
	 * @param perfumeMainAnzai
	 * **/
	public void iniWithperfumeManinAnzia(PerfumeMainAnzai perfumeMainAnzai) {
		this.setId((int) perfumeMainAnzai.getId());
		this.setSongName(perfumeMainAnzai.getSongName());
		this.setReleaseYearStr(String.valueOf(perfumeMainAnzai.getReleaseYear()));
		this.setLyricistName(perfumeMainAnzai.getLyricistName());
		this.setAlbumId(perfumeMainAnzai.getAlbumId());
		this.setTieupId(perfumeMainAnzai.getTieupId());
		this.setComment(perfumeMainAnzai.getComment());

		this.setUpdateDate(String.valueOf(perfumeMainAnzai.getUpdateDate()));
	}

	/**
	 * PerfumeMainエンティティに登録値を入れる
	 *
	 * @return PerfumeMainAnzai
	 */
	public PerfumeMainAnzai convertToPerfumeMainForInsert() {
		PerfumeMainAnzai perfumeMainAnzai = new PerfumeMainAnzai();
		perfumeMainAnzai = convertToPerfumeMain(perfumeMainAnzai);
		perfumeMainAnzai.setCreateDate(new Timestamp(new Date().getTime()));
		perfumeMainAnzai.setUpdateDate(perfumeMainAnzai.getCreateDate());
		return perfumeMainAnzai;
	}

	/**
	 * PerfumeMainエンティティに更新値を入れる
	 * @param PerfumeMainAnzai perfumeMainAnzai
	 * @return PerfumeMainAnzai
	 */
	public PerfumeMainAnzai convertToPerfumeMainForUpdate(PerfumeMainAnzai perfumeMainAnzai) {
		perfumeMainAnzai = convertToPerfumeMain(perfumeMainAnzai);
		perfumeMainAnzai.setUpdateDate(new Timestamp(new Date().getTime()));
		return perfumeMainAnzai;
	}

	/**
	 * PerfumeMainエンティティに入力値を入れる
	 * @param PerfumeMainAnzai perfumeMainAnzai
	 * @return PerfumeMainAnzai
	 */
	private PerfumeMainAnzai convertToPerfumeMain(PerfumeMainAnzai perfumeMainAnzai) {
		perfumeMainAnzai.setSongName(this.songName);
		perfumeMainAnzai.setReleaseYear(Integer.parseInt(this.releaseYearStr));
		perfumeMainAnzai.setLyricistName(this.lyricistName);

		if (this.albumId == CommonConst.NOT_ENTERD) {
			perfumeMainAnzai.setAlbumId(null);
		} else {
			perfumeMainAnzai.setAlbumId(albumId);
		}
		if (this.tieupId == CommonConst.NOT_ENTERD) {
			perfumeMainAnzai.setTieupId(null);
		} else {
			perfumeMainAnzai.setTieupId(this.tieupId);
		}

		perfumeMainAnzai.setComment(this.comment);
		perfumeMainAnzai.setDelFlg("0");

		return perfumeMainAnzai;
	}

}
