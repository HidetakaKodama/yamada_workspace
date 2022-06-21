package jp.co.futureantiques.webapptraining.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import jp.co.futureantiques.webapptraining.model.form.playerKuramoto.PlayerKuramotoInputForm;
import jp.co.futureantiques.webapptraining.model.form.playerKuramoto.PlayerKuramotoSearchForm;
import jp.co.futureantiques.webapptraining.model.playerKuramoto.PlayerBtKuramoto;
import jp.co.futureantiques.webapptraining.model.playerKuramoto.PlayerMainKuramoto;
import jp.co.futureantiques.webapptraining.model.playerKuramoto.PlayerPositionKuramoto;

/**
 * PlayerKuramotoのサービスインターフェース
 *
 * @author future
 */
public interface PlayerKuramotoService {

	/**
	 * ポジションエンティティのリストを取得する
	 *
	 * @return PositionEntityのリスト
	 */
	List<PlayerPositionKuramoto> getListPosition();

	/**
	 * 投打エンティティのリストを取得する
	 *
	 * @return BtEntityのリスト
	 */
	List<PlayerBtKuramoto> getListBt();

	/**
	 * 検索条件を元にPlayerMainKuramotoのレコードのリストを取得する(Paging)
	 *
	 * @param PlayerKuramotoSearchForm form
	 * @param Pageable pageable
	 * @return PlayerMainのリスト
	 */
	Page<PlayerMainKuramoto> getPagePlayer(final PlayerKuramotoSearchForm form, final Pageable pageable);

	/**
	 * 検索条件を元にPlayerMainKuramotoのレコードのリストを取得する
	 *
	 * @param PlayerKuramotoSearchForm form
	 * @return PlayerMainのリスト
	 */
	List<PlayerMainKuramoto> getListPlayer(final PlayerKuramotoSearchForm form);

	/**
	 * IDをキーにPlayerMainKuramotoのレコードを取得する
	 *
	 * @param long id
	 * @return PlayerMainのレコード
	 */
	PlayerMainKuramoto getPlayer(final long id);

	/**
	 * PlayerMainKuramotoにレコードを新規登録する
	 *
	 * @param PlayerKuramotoInputForm form
	 * @return PlayerMain
	 */
	PlayerMainKuramoto insertPlayer(final PlayerKuramotoInputForm form);

	/**
	 * PlayerMainKuramotoのレコードを更新する
	 *
	 * @param PlayerInputForm form
	 * @return PlayerMain
	 */
	PlayerMainKuramoto updatePlayer(final PlayerKuramotoInputForm form);

	/**
	 * PlayerMainKuramotoのレコードを論理削除する
	 *
	 * @param long id
	 */
	void deletePlayerById(final long id);

	/**
	 * PlayerMainKuramotoのレコードを物理削除する
	 *
	 * @param ArrayList<Long> ids
	 */
	void deletePlayerComp(final ArrayList<Long> ids);
}