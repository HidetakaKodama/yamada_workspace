package jp.co.futureantiques.webapptraining.service.impl;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import jp.co.futureantiques.webapptraining.model.form.nbaplayersTakahashi.NbaplayersTakahashiInputForm;
import jp.co.futureantiques.webapptraining.model.form.nbaplayersTakahashi.NbaplayersTakahashiSearchForm;
import jp.co.futureantiques.webapptraining.model.nbaplayersTakahashi.NbaplayersMainTakahashi;
import jp.co.futureantiques.webapptraining.model.nbaplayersTakahashi.PositionTakahashi;
import jp.co.futureantiques.webapptraining.model.nbaplayersTakahashi.TeamTakahashi;
import jp.co.futureantiques.webapptraining.repository.nbaplayersTakahashi.NbaplayersMainTakahashiRepository;
import jp.co.futureantiques.webapptraining.repository.nbaplayersTakahashi.PositionTakahashiRepository;
import jp.co.futureantiques.webapptraining.repository.nbaplayersTakahashi.TeamTakahashiRepository;
import jp.co.futureantiques.webapptraining.repository.specification.NbaplayersTakahashiSpecification;
import jp.co.futureantiques.webapptraining.service.NbaplayersTakahashiService;

/**
 * Nbaplayersのサービス実装クラス
 *
 * @author Takumi Takahashi
 */
@Service
public class NbaplayersTakahashiServiceImpl implements NbaplayersTakahashiService {

	/** NbaplayersMainTakahashiリポジトリ */
	private final NbaplayersMainTakahashiRepository nbaplayersMainTakahashiRepository;

	/** PositionTakahashiリポジトリ */
	private final PositionTakahashiRepository positionTakahashiRepository;

	/** TeamTakahashiリポジトリ */
	private final TeamTakahashiRepository teamTakahashiRepository;

	/**
	 * コンストラクタ
	 *
	 * @param NbaplayersMainTakahashiRepository nbaplayersMainTakahashiRepository
	 * @param PositionTakahashiRepository positionTakahashiRepository
	 * @param TeamTakahashiRepository teamTakahashiRepository
	 */
	@Autowired
	public NbaplayersTakahashiServiceImpl(NbaplayersMainTakahashiRepository nbaplayersMainTakahashiRepository,
			PositionTakahashiRepository positionTakahashiRepository,
			TeamTakahashiRepository teamTakahashiRepository) {
		this.nbaplayersMainTakahashiRepository = nbaplayersMainTakahashiRepository;
		this.positionTakahashiRepository = positionTakahashiRepository;
		this.teamTakahashiRepository = teamTakahashiRepository;
	}

	@Override
	public List<PositionTakahashi> getListPositionTakahashi() {

		// PositionTakahashiテーブルのレコードをID順に取得する
		return positionTakahashiRepository.findAll(new Sort(Sort.Direction.ASC, "id"));
	}

	@Override
	public List<TeamTakahashi> getListTeamTakahashi() {

		// TeamTakahashiテーブルのレコードをID順に取得する
		return teamTakahashiRepository.findAll(new Sort(Sort.Direction.ASC, "id"));
	}

	@Override
	public Page<NbaplayersMainTakahashi> getPageNbaplayersTakahashi(final NbaplayersTakahashiSearchForm form,
			final Pageable pageable) {

		// 検索条件を生成しNbaplayersMainTakahashiテーブルのレコードを取得する
		return nbaplayersMainTakahashiRepository
				.findAll(NbaplayersTakahashiSpecification.generateNbaplayersTakahashiSpecification(form), pageable);
	}

	@Override
	public List<NbaplayersMainTakahashi> getListNbaplayersTakahashi(final NbaplayersTakahashiSearchForm form) {

		// 検索条件を生成しNbaplayersMainTakahashiテーブルのレコードを取得する
		return nbaplayersMainTakahashiRepository
				.findAll(NbaplayersTakahashiSpecification.generateNbaplayersTakahashiSpecification(form));
	}

	@Override
	public NbaplayersMainTakahashi getNbaplayersTakahashi(final long id) {

		// NbaplayersMainTakahashiテーブルを主キー検索する
		return nbaplayersMainTakahashiRepository.findOne(id);
	}

	@Override
	public NbaplayersMainTakahashi insertNbaplayersTakahashi(final NbaplayersTakahashiInputForm form) {

		// NbaplayersMainTakahashiテーブルに新規でデータを登録する
		final NbaplayersMainTakahashi nbaplayersMainTakahashi = form.convertToNbaplayersMainTakahashiForInsert();
		return nbaplayersMainTakahashiRepository.save(nbaplayersMainTakahashi);
	}

	@Override
	public NbaplayersMainTakahashi updateNbaplayersTakahashi(final NbaplayersTakahashiInputForm form) {

		// 更新対象のレコードを取得する
		NbaplayersMainTakahashi nbaplayersMainTakahashi = nbaplayersMainTakahashiRepository
				.findOne((long) form.getId());
		if (nbaplayersMainTakahashi != null) {

			// 更新対象のレコードが存在する場合排他チェック
			if (form.getUpdateDate().equals(String.valueOf(nbaplayersMainTakahashi.getUpdateDate()))) {

				// チェックOKの場合、更新
				nbaplayersMainTakahashi = form.convertToNbaplayersMainTakahashiForUpdate(nbaplayersMainTakahashi);
				return nbaplayersMainTakahashiRepository.saveAndFlush(nbaplayersMainTakahashi);
			}
		}
		return null;
	}

	@Override
	public void deleteNbaplayersTakahashiById(final long id) {

		// 更新対象のレコードを取得する
		NbaplayersMainTakahashi nbaplayersMainTakahashi = nbaplayersMainTakahashiRepository.findOne(id);
		if (nbaplayersMainTakahashi != null) {

			// 更新対象のレコードが存在する場合、削除フラグを1にする
			nbaplayersMainTakahashiRepository.delete(id);
		}
	}

	@Override
	public void deleteNbaplayersTakahashiComp(final ArrayList<Long> ids) {

		// 対象のレコードを削除する
		nbaplayersMainTakahashiRepository.deleteComp(ids);
	}

}