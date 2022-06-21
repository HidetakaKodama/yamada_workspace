package jp.co.futureantiques.webapptraining.service.impl;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import jp.co.futureantiques.webapptraining.model.animeWatanabe.AnimeMainWatanabe;
import jp.co.futureantiques.webapptraining.model.animeWatanabe.CompanyWatanabe;
import jp.co.futureantiques.webapptraining.model.animeWatanabe.OriginalWatanabe;
import jp.co.futureantiques.webapptraining.model.form.animeWatanabe.AnimeInputForm;
import jp.co.futureantiques.webapptraining.model.form.animeWatanabe.AnimeSearchForm;
import jp.co.futureantiques.webapptraining.repository.animeWatanabe.AnimeMainWatanabeRepository;
import jp.co.futureantiques.webapptraining.repository.animeWatanabe.CompanyWatanabeRepository;
import jp.co.futureantiques.webapptraining.repository.animeWatanabe.OriginalWatanabeRepository;
import jp.co.futureantiques.webapptraining.repository.specification.AnimeWatanabeSpecification;
import jp.co.futureantiques.webapptraining.service.AnimeWatanabeService;

/**
 * AnimeWatanabeのサービス実装クラス
 *
 * @author Watanabe
 */
@Service
public class AnimeWatanabeServiceImpl implements AnimeWatanabeService {

	/**AnimeMainWatanabeリポジトリ**/
	private final AnimeMainWatanabeRepository animeMainWatanabeRepository;

	/**CompanyWatanabeリポジトリ**/
	private final CompanyWatanabeRepository companyWatanabeRepository;

	/**OriginalWatanabeリポジトリ**/
	private final OriginalWatanabeRepository originalWatanabeRepository;

	/**
	 * コンストラクタ
	 *
	 * @param AnimeMainWatanabeRepository animeMainWatanabeRepository
	 * @param CompanyWatanabeRepository companyWatanabeRepository
	 * @param OriginalWatanabeRepository originalWatanabeRepository
	 */
	@Autowired
	public AnimeWatanabeServiceImpl(AnimeMainWatanabeRepository animeMainWatanabeRepository,
			CompanyWatanabeRepository companyWatanabeRepository,
			OriginalWatanabeRepository originalWatanabeRepository) {
		this.animeMainWatanabeRepository = animeMainWatanabeRepository;
		this.companyWatanabeRepository = companyWatanabeRepository;
		this.originalWatanabeRepository = originalWatanabeRepository;
	}

	@Override
	public List<CompanyWatanabe> getListCompanyWatanabe() {

		//CompanyWatanabeテーブルのレコードをID順に取得する
		return companyWatanabeRepository.findAll(new Sort(Sort.Direction.ASC, "id"));
	}

	@Override
	public List<OriginalWatanabe> getListOriginalWatanabe() {

		//OriginalWatanabeテーブルのレコードをID順に取得する
		return originalWatanabeRepository.findAll(new Sort(Sort.Direction.ASC, "id"));
	}

	@Override
	public Page<AnimeMainWatanabe> getPageAnimeWatanabe(final AnimeSearchForm form, final Pageable pageable) {

		//検索条件を生成しAnimeMainWatanabeテーブルのレコードを取得する
		return animeMainWatanabeRepository.findAll(AnimeWatanabeSpecification.generateAnimeWatanabeSpecification(form),
				pageable);
	}

	@Override
	public List<AnimeMainWatanabe> getListAnimeWatanabe(final AnimeSearchForm form) {

		//検索条件を生成しAnimeMainWatanabeテーブルのレコードを取得する
		return animeMainWatanabeRepository.findAll(AnimeWatanabeSpecification.generateAnimeWatanabeSpecification(form));
	}

	@Override
	public AnimeMainWatanabe getAnimeWatanabe(final long id) {

		// AnimeMainWatanabeテーブルを主キー検索する
		return animeMainWatanabeRepository.findOne(id);
	}

	@Override
	public AnimeMainWatanabe insertAnime(final AnimeInputForm form) {

		// AnimeMainWatanabeテーブルに新規でデータを登録する
		final AnimeMainWatanabe animeMainWatanabe = form.convertToAnimeMainWatanabeForInsert();
		return animeMainWatanabeRepository.save(animeMainWatanabe);
	}

	@Override
	public AnimeMainWatanabe updateAnime(final AnimeInputForm form) {

		//更新対象のレコードを取得する
		AnimeMainWatanabe animeMainWatanabe = animeMainWatanabeRepository.findOne((long) form.getId());
		if (animeMainWatanabe != null) {

			//更新対象のレコードが存在する場合排他チェック
			if (form.getUpdateDate().equals(String.valueOf(animeMainWatanabe.getUpdateDate()))) {

				//チェックOKの場合、更新
				animeMainWatanabe = form.convertToAnimeMainWatanabeForUpdate(animeMainWatanabe);
				return animeMainWatanabeRepository.saveAndFlush(animeMainWatanabe);
			}
		}
		return null;
	}

	@Override
	public void deleteAnimeById(final long id) {

		//更新対象レコードを取得する
		AnimeMainWatanabe animeMainWatanabe = animeMainWatanabeRepository.findOne(id);
		if (animeMainWatanabe != null) {

			//更新対象のレコードが存在する場所、削除フラグを1にする。
			animeMainWatanabeRepository.delete(id);
		}
	}

	@Override
	public void deleteAnimeComp(final ArrayList<Long> ids) {

		//対象のレコードを削除
		animeMainWatanabeRepository.deleteComp(ids);
	}
}
