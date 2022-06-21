package jp.co.futureantiques.webapptraining.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import jp.co.futureantiques.webapptraining.model.form.gameMiura.GameMiuraInputForm;
import jp.co.futureantiques.webapptraining.model.form.gameMiura.GameMiuraSearchForm;
import jp.co.futureantiques.webapptraining.model.gameMiura.GameGenreMiura;
import jp.co.futureantiques.webapptraining.model.gameMiura.GameHardMiura;
import jp.co.futureantiques.webapptraining.model.gameMiura.GameMainMiura;

/**
 * GameMiuraのサービスインターフェース
 *
 */
public interface GameMiuraService {

	/**
	 * ジャンルのエンティティリストを取得する
	 *
	 * @return GenreEntityリスト
	 */
	List<GameGenreMiura> getListGameGenreMiura();

	/**
	 * ハードのエンティティリストを取得する
	 *
	 * @return HardEntityリスト
	 */
	List<GameHardMiura> getListGameHardMiura();

	/**
	 * 検索条件をもとにGameMainMiuraのレコードリストを取得する
	 *
	 *@param GameMiuraSearchForm form
	 *@return GameMainMiuraのリスト
	 */

	List<GameMainMiura> getListGameMainMiura(final GameMiuraSearchForm form);

	/**
	 * 検索結果をもとにGameMainMiuraのレコードリストを取得する(paging)
	 *
	 * @param GameMiuraSearchForm
	 * @param Pageable pageable
	 * @return GameMainMiuraのリスト
	 */
	Page<GameMainMiura> getPageGameMain(final GameMiuraSearchForm form,
			final Pageable pageable);

	/**
	 * IDをキーにGameMainMiuraのレコードを取得する
	 *
	 * @param long id
	 * @return GameMainMiuraのレコード
	 */
	GameMainMiura getGame(final long id);

	/**
	 * GameMainMiuraにレコードを新規登録する
	 *
	 * @param GameMiuraInputForm form
	 * @return
	 */
	GameMainMiura insertGame(final GameMiuraInputForm form);

	/**
	 * GameMainMiuraのレコードを更新する
	 *
	 * @param GameMiuraInputForm
	 * @return GameMainMiura
	 */
	GameMainMiura updateGame(final GameMiuraInputForm form);

	/**
	 * GameMainのレコードを論理削除する
	 *
	 * @param long id
	 */
	void deleteGameById(final long id);

	/**
	 * GameMainのレコードを物理削除する
	 *
	 * @param ArrayList<Long> ids
	 */
	void deleteGameComp(final ArrayList<Long> ids);
}
