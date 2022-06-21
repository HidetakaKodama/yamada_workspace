package jp.co.futureantiques.webapptraining.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import jp.co.futureantiques.webapptraining.model.animeWatanabe.AnimeMainWatanabe;
import jp.co.futureantiques.webapptraining.model.animeWatanabe.CompanyWatanabe;
import jp.co.futureantiques.webapptraining.model.animeWatanabe.OriginalWatanabe;
import jp.co.futureantiques.webapptraining.model.form.animeWatanabe.AnimeInputForm;
import jp.co.futureantiques.webapptraining.model.form.animeWatanabe.AnimeSearchForm;

/**
 * AnimeWatanabeのサービスインターフェイス
 *
 * @author Watanabe
 */
public interface AnimeWatanabeService {

	/**
	 * アニメ制作会社エンティティのリストを取得する
	 *
	 * @return CompanyWatanabeEntityのリスト
	 */
	List<CompanyWatanabe> getListCompanyWatanabe();

	/**
	 * 原作エンティティのリストを取得する
	 *
	 *@return OriginalWatanabeEntityのリスト
	 */
	List<OriginalWatanabe> getListOriginalWatanabe();

	/**
	 * 検索条件を元にAnimeMainWatanabeのレコードのリストを取得する(Paging)
	 *
	 * @param AnimeSerchForm form
	 * @param Pageble pageble
	 * @return AnimeMainWatanabeのリスト
	 */
	Page<AnimeMainWatanabe> getPageAnimeWatanabe(final AnimeSearchForm form, final Pageable pageable);

	/**
	 * 検索条件を元にAnimeMainWatanabeのレコードを取得する
	 *
	 * @param AnimeSearchForm form
	 * @return  AnimeMainWatanabeのリスト
	 */
	List<AnimeMainWatanabe> getListAnimeWatanabe(final AnimeSearchForm form);

	/** IDをキーにAnimeMainWatanabeのレコードを取得する
	 *
	 * @param long id
	 * @return AnimeMainWatanabeのレコード
	 */
	AnimeMainWatanabe getAnimeWatanabe(final long id);

	/**
	 * AnimeMainWatanabeにレコードを新規作成する
	 *
	 * @param AnimeInputForm form
	 * @return AnimeMainWatanabe
	 */
	AnimeMainWatanabe insertAnime(final AnimeInputForm form);

	/**
	 * AnimeMainWatanabeのレコードを更新する
	 *
	 * @param AnimeInputForm form
	 * @return AnimeWatanabe
	 */
	AnimeMainWatanabe updateAnime(final AnimeInputForm form);

	/**
	 * AnimeMainWatanabeのレコードを論理削除する
	 *
	 * @param long id
	 */
	void deleteAnimeById(final long id);

	/**
	 * AnimeMainWatanabeのレコードを物理削除する
	 *
	 * @param ArrayList<Long> ids
	 */
	void deleteAnimeComp(final ArrayList<Long> ids);
}
