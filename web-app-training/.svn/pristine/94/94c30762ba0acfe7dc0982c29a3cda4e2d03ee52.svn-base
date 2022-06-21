package jp.co.futureantiques.webapptraining.service.impl;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import jp.co.futureantiques.webapptraining.model.form.playerKuramoto.PlayerKuramotoInputForm;
import jp.co.futureantiques.webapptraining.model.form.playerKuramoto.PlayerKuramotoSearchForm;
import jp.co.futureantiques.webapptraining.model.playerKuramoto.PlayerBtKuramoto;
import jp.co.futureantiques.webapptraining.model.playerKuramoto.PlayerMainKuramoto;
import jp.co.futureantiques.webapptraining.model.playerKuramoto.PlayerPositionKuramoto;
import jp.co.futureantiques.webapptraining.repository.playerKuramoto.BtKuramotoRepository;
import jp.co.futureantiques.webapptraining.repository.playerKuramoto.PlayerMainKuramotoRepository;
import jp.co.futureantiques.webapptraining.repository.playerKuramoto.PositionKuramotoRepository;
import jp.co.futureantiques.webapptraining.repository.specification.PlayerKuramotoSpecification;
import jp.co.futureantiques.webapptraining.service.PlayerKuramotoService;

/**
 * PlayerKuramotoのサービス実装クラス
 *
 * @author future
 */
@Service
public class PlayerKuramotoServiceImpl implements PlayerKuramotoService {

	/** PlayerMainKuramotoリポジトリ */
	private final PlayerMainKuramotoRepository playerMainKuramotoRepository;

	/** PositionKuramotoリポジトリ */
	private final PositionKuramotoRepository positionKuramotoRepository;

	/** BtKuramotoリポジトリ */
	private final BtKuramotoRepository btKuramotoRepository;

	/**
	 * コンストラクタ
	 *
	 * @param PlayerMainKuramotoRepository playerMainKuramotoRepository
	 * @param PositionKuramotoRepository positionKuramotoRepository
	 * @param BtKuramotoRepository btKuramotoRepository
	 */
	@Autowired
	public PlayerKuramotoServiceImpl(PlayerMainKuramotoRepository playerMainKuramotoRepository,PositionKuramotoRepository positionKuramotoRepository,
			BtKuramotoRepository btKuramotoRepository) {
		this.playerMainKuramotoRepository = playerMainKuramotoRepository;
		this.positionKuramotoRepository = positionKuramotoRepository;
		this.btKuramotoRepository = btKuramotoRepository;
	}

	@Override
	public List<PlayerPositionKuramoto> getListPosition() {

		// PlayerPositionKuramotoテーブルのレコードをID順に取得する
		return positionKuramotoRepository.findAll(new Sort(Sort.Direction.ASC, "id"));
	}

	@Override
	public List<PlayerBtKuramoto> getListBt() {

		// PlayerBtKuramotoテーブルのレコードをID順に取得する
		return btKuramotoRepository.findAll(new Sort(Sort.Direction.ASC, "id"));
	}

	@Override
	public Page<PlayerMainKuramoto> getPagePlayer(final PlayerKuramotoSearchForm form, final Pageable pageable) {

		// 検索条件を生成しPlayerMainKuramotoテーブルのレコードを取得する
		return playerMainKuramotoRepository.findAll(PlayerKuramotoSpecification.generatePlayerSpecification(form), pageable);
	}

	@Override
	public List<PlayerMainKuramoto> getListPlayer(final PlayerKuramotoSearchForm form) {

		// 検索条件を生成しPlayerMainKuramotoテーブルのレコードを取得する
		return playerMainKuramotoRepository.findAll(PlayerKuramotoSpecification.generatePlayerSpecification(form));
	}

	@Override
	public PlayerMainKuramoto getPlayer(final long id) {

		// PlayerMainKuramotoテーブルを主キー検索する
		return playerMainKuramotoRepository.findOne(id);
	}

	@Override
	public PlayerMainKuramoto insertPlayer(final PlayerKuramotoInputForm form) {

		// PlayerMainKuramotoテーブルに新規でデータを登録する
		final PlayerMainKuramoto playerMainKuramoto = form.convertToPlayerMainKuramotoForInsert();
		return playerMainKuramotoRepository.save(playerMainKuramoto);
	}

	@Override
	public PlayerMainKuramoto updatePlayer(final PlayerKuramotoInputForm form) {

		// 更新対象のレコードを取得する
		PlayerMainKuramoto playerMainKuramoto = playerMainKuramotoRepository.findOne((long) form.getId());
		if (playerMainKuramoto != null) {

			// 更新対象のレコードが存在する場合排他チェック
			if (form.getUpdateDate().equals(String.valueOf(playerMainKuramoto.getUpdateDate()))) {

				// チェックOKの場合、更新
				playerMainKuramoto = form.convertToPlayerMainKuramotoForUpdate(playerMainKuramoto);
				return playerMainKuramotoRepository.saveAndFlush(playerMainKuramoto);
			}
		}
		return null;
	}

	@Override
	public void deletePlayerById(final long id) {

		// 更新対象のレコードを取得する
		PlayerMainKuramoto playerMainKuramoto = playerMainKuramotoRepository.findOne(id);
		if (playerMainKuramoto != null) {

			// 更新対象のレコードが存在する場合、削除フラグを1にする
			playerMainKuramotoRepository.delete(id);
		}
	}

	@Override
	public void deletePlayerComp(final ArrayList<Long> ids) {

		// 対象のレコードを削除する
		playerMainKuramotoRepository.deleteComp(ids);
	}
}