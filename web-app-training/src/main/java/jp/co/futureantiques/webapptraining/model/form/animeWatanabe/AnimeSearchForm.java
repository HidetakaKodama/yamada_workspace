package jp.co.futureantiques.webapptraining.model.form.animeWatanabe;

import jp.co.futureantiques.webapptraining.model.animeWatanabe.AnimeMainWatanabe;
import lombok.Data;

/**
 * アニメ検索画面のFormクラス
 * @author  Watanabe
 */

@Data
public class AnimeSearchForm {

	/** アニメID */
	private Integer id;

	/** アニメ名 */
	private String animeTitle;

	/** アニメ制作会社ID */
	private Integer companyId;

	/** 原作ID */
	private Integer originalId;

	/** 削除フラグON用 */
	private int isDelete;

	/**
	 * 各フィールドに値を設定する
	 *
	 * @param animeMainWatanabe
	 */
	public void setValues(AnimeMainWatanabe animeMainWatanabe) {
		this.setId((int) animeMainWatanabe.getId());
		this.setAnimeTitle(animeMainWatanabe.getAnimeTitle());
		this.setCompanyId(animeMainWatanabe.getCompanyId());
		this.setOriginalId(animeMainWatanabe.getOriginalId());
	}

}
