package jp.co.futureantiques.webapptraining.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import jp.co.futureantiques.webapptraining.model.form.nbaplayersTakahashi.NbaplayersTakahashiInputForm;
import jp.co.futureantiques.webapptraining.model.form.nbaplayersTakahashi.NbaplayersTakahashiSearchForm;
import jp.co.futureantiques.webapptraining.model.nbaplayersTakahashi.NbaplayersMainTakahashi;
import jp.co.futureantiques.webapptraining.model.nbaplayersTakahashi.PositionTakahashi;
import jp.co.futureantiques.webapptraining.model.nbaplayersTakahashi.TeamTakahashi;

/**
 * NbaplayersTakahashiのサービスインターフェース
 *
 * @author Takumi Takahashi
 */
public interface NbaplayersTakahashiService {

	/**
	 * ポジションエンティティのリストを取得する
	 *
	 * @return PositionTakahashiEntityのリスト
	 */
	List<PositionTakahashi> getListPositionTakahashi();

	/**
	 * 所属チームエンティティのリストを取得する
	 *
	 * @return TeamTakahashiEntityのリスト
	 */
	List<TeamTakahashi> getListTeamTakahashi();

	/**
	 * 検索条件を元にNbaplayersMainTakahashiのレコードのリストを取得する(Paging)
	 *
	 * @param NbaplayersTakahashiSearchForm form
	 * @param Pageable pageable
	 * @return NbaplayersMainTakahashiのリスト
	 */
	Page<NbaplayersMainTakahashi> getPageNbaplayersTakahashi(final NbaplayersTakahashiSearchForm form, final Pageable pageable);

	/**
	 * 検索条件を元にNbaplayersMainTakahashiのレコードのリストを取得する
	 *
	 * @param NbaplayersTakahashiSearchForm form
	 * @return NbaplayersMainTakahashiのリスト
	 */
	List<NbaplayersMainTakahashi> getListNbaplayersTakahashi(final NbaplayersTakahashiSearchForm form);

	/**
	 * IDをキーにNbaplayersMainTakahashiのレコードを取得する
	 *
	 * @param long id
	 * @return NbaplayersMainTakahashiのレコード
	 */
	NbaplayersMainTakahashi getNbaplayersTakahashi(final long id);

	/**
	 * NbaplayersMainTakahashiにレコードを新規登録する
	 *
	 * @param NbaplayersTakahashiInputForm form
	 * @return NbaplayersMainTakahashi
	 */
	NbaplayersMainTakahashi insertNbaplayersTakahashi(final NbaplayersTakahashiInputForm form);

	/**
	 * NbaplayersMainTakahashiのレコードを更新する
	 *
	 * @param NbaplayersTakahashiInputForm form
	 * @return NbaplayersMainTakahashi
	 */
	NbaplayersMainTakahashi updateNbaplayersTakahashi(final NbaplayersTakahashiInputForm form);

	/**
	 * NbaplayersMainTakahashiのレコードを論理削除する
	 *
	 * @param long id
	 */
	void deleteNbaplayersTakahashiById(final long id);

	/**
	 * NbaplayersMainTakahashiのレコードを物理削除する
	 *
	 * @param ArrayList<Long> ids
	 */
	void deleteNbaplayersTakahashiComp(final ArrayList<Long> ids);
}
