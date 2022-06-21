package jp.co.futureantiques.webapptraining.service.impl;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import jp.co.futureantiques.webapptraining.model.form.gameMiura.GameMiuraInputForm;
import jp.co.futureantiques.webapptraining.model.form.gameMiura.GameMiuraSearchForm;
import jp.co.futureantiques.webapptraining.model.gameMiura.GameGenreMiura;
import jp.co.futureantiques.webapptraining.model.gameMiura.GameHardMiura;
import jp.co.futureantiques.webapptraining.model.gameMiura.GameMainMiura;
import jp.co.futureantiques.webapptraining.repository.gameMiura.GameGenreMiuraRepository;
import jp.co.futureantiques.webapptraining.repository.gameMiura.GameHardMiuraRepository;
import jp.co.futureantiques.webapptraining.repository.gameMiura.GameMainMiuraRepository;
import jp.co.futureantiques.webapptraining.repository.specification.GameMiuraSpecification;
import jp.co.futureantiques.webapptraining.service.GameMiuraService;

/**
 * GameMiuraのサービスインターフェース
 *
 */
@Service
public class GameMiuraServiceImpl implements GameMiuraService {

	/** GameMainMiuraリポジトリ */
	private final GameMainMiuraRepository gameMainMiuraRepository;

	/** GameGenreMiuraリポジトリ */
	private final GameGenreMiuraRepository gameGenreMiuraRepository;

	/** GameHardMiuraリポジトリ */
	private final GameHardMiuraRepository gameHardMiuraRepository;

	/**
	 * コンストラクタ
	 *
	 * @param GameMainMiuraRepository
	 * @param GameGenreMiuraRepository
	 * @param GameHardMiuraRepository
	 */
	@Autowired
	public GameMiuraServiceImpl(GameMainMiuraRepository gameMainMiuraRepository,
			GameGenreMiuraRepository gameGenreMiuraRepository,
			GameHardMiuraRepository gameHardMiuraRepository) {
		this.gameMainMiuraRepository = gameMainMiuraRepository;
		this.gameGenreMiuraRepository = gameGenreMiuraRepository;
		this.gameHardMiuraRepository = gameHardMiuraRepository;
	}

	@Override
	public List<GameGenreMiura> getListGameGenreMiura() {

		// GenreテーブルのレコードをID順に取得する
		return gameGenreMiuraRepository.findAll(new Sort(Sort.Direction.ASC, "id"));
	}

	@Override
	public List<GameHardMiura> getListGameHardMiura() {

		// HardテーブルのレコードをID順に取得
		return gameHardMiuraRepository.findAll(new Sort(Sort.Direction.ASC, "id"));
	}

	@Override
	public Page<GameMainMiura> getPageGameMain(final GameMiuraSearchForm form,
			Pageable pageable) {

		// 検索条件を生成しGameMainMiuraテーブルのレコードを取得
		return gameMainMiuraRepository
				.findAll(GameMiuraSpecification.generateMiuraSpecification(form),
						pageable);
	}

	@Override
	public List<GameMainMiura> getListGameMainMiura(final GameMiuraSearchForm form) {

		// 検索条件を生成しGameMainMiuraテーブルのレコードを取得
		return gameMainMiuraRepository
				.findAll(GameMiuraSpecification.generateMiuraSpecification(form));
	}

	@Override
	public GameMainMiura getGame(final long id) {

		//GameMainmiuraテーブルを主キー検索する
		return gameMainMiuraRepository.findOne(id);
	}

	@Override
	public GameMainMiura insertGame(GameMiuraInputForm form) {

		//GameMainMiuraテーブルに新規でデータを登録する
		final GameMainMiura gameMainMiura = form.convertToGameMainMiuraForInsert();
		return gameMainMiuraRepository.save(gameMainMiura);
	}

	@Override
	public GameMainMiura updateGame(GameMiuraInputForm form) {

		//更新対象のレコードを取得する
		GameMainMiura gameMainMiura = gameMainMiuraRepository.findOne((long) form.getId());
		if (gameMainMiura != null) {

			//更新対象のレコードが存在する場合排他チェック
			if (form.getUpdateDate().equals(String.valueOf(gameMainMiura.getUpdateDate()))){

				//チェックOKの場合、更新
				gameMainMiura = form.convertToGameMainMiuraForUpdate(gameMainMiura);
				return gameMainMiuraRepository.saveAndFlush(gameMainMiura);
			}
		}
		return null;
	}

	@Override
	public void deleteGameById(final long id) {

		//更新対象のレコードを取得する
		GameMainMiura gameMainMiura = gameMainMiuraRepository.findOne(id);
		if (gameMainMiura != null) {

			//更新対象のレコードが存在する場合、削除フラグを1にする
			gameMainMiuraRepository.delete(id);
		}
	}

	@Override
	public void deleteGameComp(final ArrayList<Long> ids) {

		// 対象のレコードを削除する
		gameMainMiuraRepository.deleteComp(ids);
	}
}
