package jp.co.futureantiques.webapptraining.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import jp.co.futureantiques.webapptraining.model.dramaIge.BroadcastStationIge;
import jp.co.futureantiques.webapptraining.model.dramaIge.DayOfWeekIge;
import jp.co.futureantiques.webapptraining.model.dramaIge.DramaMainIge;
import jp.co.futureantiques.webapptraining.model.dramaIge.GenreIge;
import jp.co.futureantiques.webapptraining.model.dramaIge.SeasonIge;
import jp.co.futureantiques.webapptraining.model.form.dramaIge.DramaIgeInputForm;
import jp.co.futureantiques.webapptraining.model.form.dramaIge.DramaIgeSearchForm;

/**
 * DaramaIgeのサービスインタ―フェイス
 *
 * @author Ige
 *
 */
public interface DramaIgeService {

	/**
	 * ジャンルエンティティリストを取得する
	 *
	 * @return GenreIgeEntityのリスト
	 */
	List<GenreIge> getListGenreIge();

	/**
	 * 放送局のエンティティリストを取得する
	 *
	 * @return BroadcastStationIgeEntityリスト
	 */
	List<BroadcastStationIge> getListBroacastStationIge();

	/**
	 * 検索条件を元にDramaMainIgeのレコードリストを取得する
	 *
	 * @param DramaIgeSearchForm form
	 * @return DramaMainIgeのリスト
	 *
	 */
	List<DramaMainIge> getListDramaMainIge(final DramaIgeSearchForm form);

	/**
	 * 検索結果を元にDramaMainIgeのレコードリストを取得する(paging)
	 *
	 * @param DramaIgeSearchForm
	 * @param Pageable pageable
	 * @return DramaMainIgeのリスト
	 */
	Page<DramaMainIge> getPageDramaMain(final DramaIgeSearchForm form, final Pageable pageable);

	/**
	 * IDをキーにDramaMainIgeのレコードを取得する
	 *
	 * @param long id
	 * @return DramaMainIgeのレコード
	 *
	 */
	DramaMainIge getDrama(final long id);

	/**
	 * DramaMainIgeにレコードを新規登録する
	 *
	 * @param DramaIgeInputForm form
	 * @return DramaMainIge
	 */
	DramaMainIge insertDrama(final DramaIgeInputForm form);

	/**
	 * DramaMainのレコードを更新する
	 *
	 * @param DramaIgeInputForm form
	 * @return DramaMain
	 */
	DramaMainIge updateDrama(final DramaIgeInputForm form);

	/** select用季節のリストを作る */
	List<SeasonIge> getListSeasonIge();

	/** select用曜日のリストを作る */
	List<DayOfWeekIge> getListDayOfWeekIge();

	/**
	 * DramaMainIgeのレコードを論理削除する
	 *
	 * @param long id
	 */
	void deleteDramaById(final long id);

	/**
	 * DramaMainIgeのレコードを物理削除する
	 *
	 * @param ArrayList<Long> ids
	 */
	void deleteDramaComp(final ArrayList<Long> ids);

	// 削除画面追加機能
	/**
	 * DramaMainIgeのレコードの削除フラグを0に戻す
	 *
	 * @param long id
	 */
	void restoreById(final long id);
}
