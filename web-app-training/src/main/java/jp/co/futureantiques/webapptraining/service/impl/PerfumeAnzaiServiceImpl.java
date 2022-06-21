package jp.co.futureantiques.webapptraining.service.impl;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import jp.co.futureantiques.webapptraining.model.form.perfumeAnzai.PerfumeAnzaiInputForm;
import jp.co.futureantiques.webapptraining.model.form.perfumeAnzai.PerfumeAnzaiSearchForm;
import jp.co.futureantiques.webapptraining.model.perfumeAnzai.AlbumAnzai;
import jp.co.futureantiques.webapptraining.model.perfumeAnzai.PerfumeMainAnzai;
import jp.co.futureantiques.webapptraining.model.perfumeAnzai.TieupAnzai;
import jp.co.futureantiques.webapptraining.repository.perfumeAnzai.AlbumAnzaiRepository;
import jp.co.futureantiques.webapptraining.repository.perfumeAnzai.PerfumeMainAnzaiRepository;
import jp.co.futureantiques.webapptraining.repository.perfumeAnzai.TieupAnzaiRepository;
import jp.co.futureantiques.webapptraining.repository.specification.PerfumeAnzaiSpecification;
import jp.co.futureantiques.webapptraining.service.PerfumeAnzaiService;

/**
 * PerfumeAnzaiのサービス実装クラス
 * @author anzai
 *
 */
@Service
public class PerfumeAnzaiServiceImpl implements PerfumeAnzaiService {

	/**PerfumeMainリポジトリ**/
	private final PerfumeMainAnzaiRepository perfumeMainAnzaiRepository;

	/**Albumリポジトリ**/
	private final AlbumAnzaiRepository albumAnzaiRepository;

	/**Tieupリポジトリ**/
	private final TieupAnzaiRepository tieupAnzaiRepository;

	/**
	 * コンストラクタ
	 *
	 * @param PerfumeMainAnzaiRepository perfumeMainAnzaiRepository
	 * @param AlbumAnzaiRepository albumAnzaiRepository
	 * @param TieupAnzaiRepository tieupAnzaiRepository
	 *
	 */
	@Autowired
	public PerfumeAnzaiServiceImpl(PerfumeMainAnzaiRepository perfumeMainAnzaiRepository,
			AlbumAnzaiRepository albumAnzaiRepository, TieupAnzaiRepository tieupAnzaiRepository) {
		this.perfumeMainAnzaiRepository = perfumeMainAnzaiRepository;
		this.albumAnzaiRepository = albumAnzaiRepository;
		this.tieupAnzaiRepository = tieupAnzaiRepository;

	}

	@Override
	public List<AlbumAnzai> getListAlbumAnzai() {

		//AlbumテーブルのレコードをID順に取得する
		return albumAnzaiRepository.findAll(new Sort(Sort.Direction.ASC, "id"));
	}

	@Override
	public List<TieupAnzai> getListTieupAnzai() {

		//TiupテーブルのレコードをID順に取得する
		return tieupAnzaiRepository.findAll(new Sort(Sort.Direction.ASC, "id"));
	}

	@Override
	public Page<PerfumeMainAnzai> getPagePerfumeAnzai(final PerfumeAnzaiSearchForm form, final Pageable pageable) {

		//検索条件を生成しPerfumeMainテーブルのレコードを取得する
		return perfumeMainAnzaiRepository.findAll(PerfumeAnzaiSpecification.generatePerfumeAnzaiSpecification(form),
				pageable);
	}

	@Override
	public List<PerfumeMainAnzai> getListPerfumeAnzai(final PerfumeAnzaiSearchForm form) {

		//検索条件を生成しPerfumeMainテーブルのレコードを取得する
		return perfumeMainAnzaiRepository.findAll(PerfumeAnzaiSpecification.generatePerfumeAnzaiSpecification(form));
	}

	@Override
	public PerfumeMainAnzai getPerfumeAnzai(final long id) {

		//PefumeMainテーブルを主キー検索する
		return perfumeMainAnzaiRepository.findOne(id);
	}

	@Override
	public PerfumeMainAnzai insertPerfumeAnzai(final PerfumeAnzaiInputForm form) {

		//PerfumeMainテーブルに新規でデータを登録する
		final PerfumeMainAnzai perfumeMainAnzai = form.convertToPerfumeMainForInsert();
		return perfumeMainAnzaiRepository.save(perfumeMainAnzai);
	}

	@Override
	public PerfumeMainAnzai updatePerfumeAnzai(final PerfumeAnzaiInputForm form) {

		//更新対象のレコードを取得する
		PerfumeMainAnzai perfumeMainAnzai = perfumeMainAnzaiRepository.findOne((long) form.getId());
		if (perfumeMainAnzai != null) {

			//更新対象のレコードが存在する場合排他チェック
			if (form.getUpdateDate().equals(String.valueOf(perfumeMainAnzai.getUpdateDate()))) {

				//チェックOKの場合、更新
				perfumeMainAnzai = form.convertToPerfumeMainForUpdate(perfumeMainAnzai);
				return perfumeMainAnzaiRepository.saveAndFlush(perfumeMainAnzai);
			}
		}
		return null;
	}

	@Override
	public void deletePerfumeAnzaiById(final long id ) {

		//更新対象レコードを取得する
		PerfumeMainAnzai perfumeMainAnzai = perfumeMainAnzaiRepository.findOne(id);
		if (perfumeMainAnzai != null) {

			//更新対象のレコードが存在する場所、削除フラグを1にする。
			perfumeMainAnzaiRepository.delete(id);
		}
	}

	@Override
	public void deletePerfumeAnzaiComp(final ArrayList<Long> ids) {

		//対象のレコードを削除
		perfumeMainAnzaiRepository.deleteComp(ids);
	}
}
