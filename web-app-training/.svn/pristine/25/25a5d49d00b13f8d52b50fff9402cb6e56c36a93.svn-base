package jp.co.futureantiques.webapptraining.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import jp.co.futureantiques.webapptraining.model.form.perfumeAnzai.PerfumeAnzaiInputForm;
import jp.co.futureantiques.webapptraining.model.form.perfumeAnzai.PerfumeAnzaiSearchForm;
import jp.co.futureantiques.webapptraining.model.perfumeAnzai.AlbumAnzai;
import jp.co.futureantiques.webapptraining.model.perfumeAnzai.PerfumeMainAnzai;
import jp.co.futureantiques.webapptraining.model.perfumeAnzai.TieupAnzai;

/**
 * PerfumeAnzaiのサービスインターフェイス
 * @author anzai
 *
 */
public interface PerfumeAnzaiService {

	/**
	 * アルバムエンティティのリストを取得する
	 *
	 * @return AlbumAnzaiEntityのリスト
	 */
	List<AlbumAnzai> getListAlbumAnzai();

	/**
	 * タイアップエンティティのリストを取得する
	 *
	 *@return TieupAnzaiEntityのリスト
	 */
	List<TieupAnzai> getListTieupAnzai();

	/**
	 * 検索条件を元にPerfumeMainAnzaiのレコードのリストを取得する
	 *
	 * @param PerfumeSerchForm form
	 * @param Pageble pageble
	 * @return PerfumeMainAnzaiのリスト
	 */
	Page<PerfumeMainAnzai> getPagePerfumeAnzai(final PerfumeAnzaiSearchForm form, final Pageable pageable);

	/**
	 * 検索条件を元にPerfumeMainAnzaiのレコードを取得する
	 *
	 * @param PerfumeAnzaiSearchForm form
	 * @return  PerfumeMainAnzaiのリスト
	 */
	List<PerfumeMainAnzai> getListPerfumeAnzai(final PerfumeAnzaiSearchForm form);

	/**
	 * IDをキーにPerfumeMainAnzaiのレコードを取得する
	 *
	 * @param ling id
	 * @return PerfumeMainAnzai
	 */
	PerfumeMainAnzai getPerfumeAnzai(final long id);

	/**
	 * PerfumeMainAnzaiにレコードを新規作成する
	 *
	 * @param PerfumeAnzaiInputForm form
	 * @return PerfumeMainAnzai
	 */
	PerfumeMainAnzai insertPerfumeAnzai(final PerfumeAnzaiInputForm form);

	/**
	 * PerfumeMainAnzaiのレコードを更新する
	 * @param PerfumeAnzaiInputForm form
	 * @return PerfumeAnzai
	 */
	PerfumeMainAnzai updatePerfumeAnzai(final PerfumeAnzaiInputForm form);

	/**
	 * PerfumeMainのレコードを論理削除する
	 *
	 * @param long
	 */
	void deletePerfumeAnzaiById(final long id);

	/**
	 * PefumeMainAnzaiのレコードを物理削除する
	 * @param ArrayList<Long> ids
	 */
	void deletePerfumeAnzaiComp(final ArrayList<Long> ids);

}
