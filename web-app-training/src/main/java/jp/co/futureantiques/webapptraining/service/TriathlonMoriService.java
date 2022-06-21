package jp.co.futureantiques.webapptraining.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import jp.co.futureantiques.webapptraining.model.form.triathlonMori.TriathlonMoriInputForm;
import jp.co.futureantiques.webapptraining.model.form.triathlonMori.TriathlonMoriSearchForm;
import jp.co.futureantiques.webapptraining.model.triathlonMori.MakerMori;
import jp.co.futureantiques.webapptraining.model.triathlonMori.TriathlonMainMori;
import jp.co.futureantiques.webapptraining.model.triathlonMori.TypeMori;

/**
 * TriathlonMoriのサービスインターフェース
 *
 * @author future
 */
public interface TriathlonMoriService {

	/**
	 * タイプエンティティのリストを取得する
	 *
	 * @return TypeMoriEntityのリスト
	 */
	List<TypeMori> getListType();

	/**
	 * メーカーエンティティのリストを取得する
	 *
	 * @return MakerMoriのリスト
	 */
	List<MakerMori> getListMaker();

	/**
	 * 検索条件を元にTriathlonMainMoriのレコードのリストを取得する(Paging)
	 *
	 * @param TriathlonMoriSearchForm form
	 * @param Pageable pageable
	 * @return TriathlonMainMoriのリスト
	 */
	Page<TriathlonMainMori> getPageTriathlon(final TriathlonMoriSearchForm form, final Pageable pageable);

	/**
	 * 検索条件を元にTriathlonMainMoriのレコードのリストを取得する
	 *
	 * @param TriathlonMoriSearchForm form
	 * @return TriathlonMainMoriのリスト
	 */
	List<TriathlonMainMori> getListTriathlon(final TriathlonMoriSearchForm form);

	/**
	 * IDをキーにTriathlonMainMoriのレコードを取得する
	 *
	 * @param long id
	 * @return TriathlonMainMoriのレコード
	 */
	TriathlonMainMori getTriathlon(final long id);

	/** TriathlonMainMoriにレコードを新規登録する
	 * @param TriathlonMoriInputForm form
	 */
	TriathlonMainMori insertTriathlon(final TriathlonMoriInputForm form);

	/**
	 * TriathlonMainMoriのレコードを更新する
	 * @param TriathlonMoriInputForm form
	 * @return TriathlonMainMori
	 */
	TriathlonMainMori updateTriathlon(final TriathlonMoriInputForm form);

	/**
	 * TriathlonMainMoriのレコードを論理削除する
	 * @param long id
	 * @return TriathlonMainMori
	 */
	void deleteTriathlonById(final long id);

	/**
	 * TriathlonMainMoriのレコードを物理削除する
	 * @param ArrayList<Long> ids
	 * @return TriathlonMainMori
	 */
	void deleteTriathlonComp(final ArrayList<Long> ids);

}
