package jp.co.futureantiques.webapptraining.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import jp.co.futureantiques.webapptraining.model.form.tokyoTakehara.TokyoTakeharaInputForm;
import jp.co.futureantiques.webapptraining.model.form.tokyoTakehara.TokyoTakeharaSearchForm;
import jp.co.futureantiques.webapptraining.model.tokyoTakehara.LocationTakehara;
import jp.co.futureantiques.webapptraining.model.tokyoTakehara.TokyoMainTakehara;

/**
 * TokyoTakeharaのサービスインターフェース
 *
 */
public interface TokyoTakeharaService {

	/**
	 * 所在地域エンティティのリストを取得する
	 *
	 * @return LocationEntityのリスト
	 */
	List<LocationTakehara> getListLocation();

	/**
	 * 検索条件を元にTokyoMainTakeharaのレコードのリストを取得する(Paging)
	 *
	 * @param TokyomainTakeharaSearchForm form
	 * @param Pageable pageable
	 * @return TokyoMainTakeharaのリスト
	 */
	Page<TokyoMainTakehara> getPageWards(final TokyoTakeharaSearchForm form, final Pageable pageable);

	/**
	 * 検索条件を元にTokyoMainTakeharaのレコードのリストを取得する
	 *
	 * @param TokyoTakeharaSearchForm form
	 * @return TokyoMainTakeharaのリスト
	 */
	List<TokyoMainTakehara> getListWards(final TokyoTakeharaSearchForm form);

	/**
	 * IDをキーにTokyoMainTakeharaのレコードを取得する
	 * @param int id
	 * @return TokyoMainTakeharaのレコード
	 */
	TokyoMainTakehara getWardData(final int id);

	/**
	 * TokyoMainTakeharaのレコードを新規登録する
	 *
	 * @param TokyoTakeharaInputForm form
	 * @return TokyoMainTakehara
	 */
	TokyoMainTakehara insertWardData(final TokyoTakeharaInputForm form);

	/**
	 * TokyoMainTakeharaのレコードを更新する
	 *
	 * @param TokyoTakeharaInputForm form
	 * @return TokyoMainTakehara
	 */
	TokyoMainTakehara updateWardData(final TokyoTakeharaInputForm form);

	/**
	 * TokyoMainTakeharaのレコードを論理削除する
	 *
	 * @param int id
	 */
	void deleteWardById(final int id);

	/**
	 * TokyoMainTakeharaから論理削除したレコードを戻す
	 *
	 * @param int id
	 */
	void restoreWardData(final ArrayList<Integer> ids);

	/**
	 * TokyoMainTakeharaのレコードを物理削除する
	 *
	 * @param ArrayList<Integer> ids
	 */
	void deleteWardDataComp(final ArrayList<Integer> ids);
}
