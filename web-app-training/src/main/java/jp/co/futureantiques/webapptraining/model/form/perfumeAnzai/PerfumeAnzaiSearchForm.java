package jp.co.futureantiques.webapptraining.model.form.perfumeAnzai;

import jp.co.futureantiques.webapptraining.model.perfumeAnzai.PerfumeMainAnzai;
import lombok.Data;

/**
 * Perfume検索画面のFormクラス
 * @author  anzai
 */
@Data
public class PerfumeAnzaiSearchForm {

	/**ID**/
	private Integer id;

	/**曲名**/
	private String songName;

	/**アルバムID**/
	private Integer albumId;

	/**タイアップID**/
	private Integer tieupId;

	/**削除フラグON用**/
	private int isDelete;

	/**
	 * 各フィールドに値を設定する
	 *
	 * @param perfumeMainAnzai
	 */
	public void setValues(PerfumeMainAnzai perfumeMainAnzai) {
		this.setId((int) perfumeMainAnzai.getId());
		this.setSongName(perfumeMainAnzai.getSongName());
		this.setAlbumId(perfumeMainAnzai.getAlbumId());
		this.setTieupId(perfumeMainAnzai.getTieupId());
	}

}
