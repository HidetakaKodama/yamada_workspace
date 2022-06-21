package jp.co.futureantiques.webapptraining.service.impl;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import jp.co.futureantiques.webapptraining.model.form.tokyoTakehara.TokyoTakeharaInputForm;
import jp.co.futureantiques.webapptraining.model.form.tokyoTakehara.TokyoTakeharaSearchForm;
import jp.co.futureantiques.webapptraining.model.tokyoTakehara.LocationTakehara;
import jp.co.futureantiques.webapptraining.model.tokyoTakehara.TokyoMainTakehara;
import jp.co.futureantiques.webapptraining.repository.specification.TokyoTakeharaSpecification;
import jp.co.futureantiques.webapptraining.repository.tokyoTakehara.LocationTakeharaRepository;
import jp.co.futureantiques.webapptraining.repository.tokyoTakehara.TokyoMainTakeharaRepository;
import jp.co.futureantiques.webapptraining.service.TokyoTakeharaService;

/**
 * TokyoTakeharaのサービス実装クラス
 *
 */
@Service
public class TokyoTakeharaServiceImpl implements TokyoTakeharaService {

	/** TokyoMainTakeharaリポジトリ */
	private final TokyoMainTakeharaRepository tokyoMainTakeharaRepository;

	/** locationTakeharaリポジトリ */
	private final LocationTakeharaRepository locationTakeharaRepository;

	/**
	 * コンストラクタ
	 *
	 * @param TokyoMainTakeharaRepository tokyoMainTakeharaRepository
	 * @param LocationTakeharaRepository locationTakeharaRepository
	 */
	@Autowired
	public TokyoTakeharaServiceImpl(TokyoMainTakeharaRepository tokyoMainTakeharaRepository,
			LocationTakeharaRepository locationTakeharaRepository) {
		this.tokyoMainTakeharaRepository = tokyoMainTakeharaRepository;
		this.locationTakeharaRepository = locationTakeharaRepository;
	}

	@Override
	public List<LocationTakehara> getListLocation() {

		// location_takeharaテーブルのレコードをID順に取得する
		return locationTakeharaRepository.findAll(new Sort(Sort.Direction.ASC, "locationId"));
	}

	@Override
	public Page<TokyoMainTakehara> getPageWards(TokyoTakeharaSearchForm form, Pageable pageable) {
		return tokyoMainTakeharaRepository.findAll(TokyoTakeharaSpecification.generateTokyoTakeharaSpecification(form),
				pageable);
	}

	@Override
	public List<TokyoMainTakehara> getListWards(final TokyoTakeharaSearchForm form) {
		return tokyoMainTakeharaRepository.findAll(TokyoTakeharaSpecification.generateTokyoTakeharaSpecification(form));
	}

	@Override
	public TokyoMainTakehara getWardData(final int id) {
		return tokyoMainTakeharaRepository.findOne(id);
	}

	@Override
	public TokyoMainTakehara insertWardData(final TokyoTakeharaInputForm form) {

		//TokyoMainTakeharaテーブルに新規データを登録する
		final TokyoMainTakehara tokyoMainTakehara = form.convertToTokyoMainTakeharaForInsert();
		return tokyoMainTakeharaRepository.save(tokyoMainTakehara);
	}

	@Override
	public TokyoMainTakehara updateWardData(TokyoTakeharaInputForm form) {

		// 更新対象のレコードを取得する
		TokyoMainTakehara tokyoMainTakehara = tokyoMainTakeharaRepository.findOne((int) form.getId());
		if (tokyoMainTakehara != null) {

			//更新対象のレコードが存在する場合排他チェック
			if (form.getUpdateDate().equals(String.valueOf(tokyoMainTakehara.getUpdateDate()))) {

				//OKの場合、更新を実行
				tokyoMainTakehara = form.convertToTokyoMainTakeharaForUpdate(tokyoMainTakehara);
				return tokyoMainTakeharaRepository.saveAndFlush(tokyoMainTakehara);
			}
		}
		return null;
	}

	@Override
	public void deleteWardById(final int id) {

		// 更新対象のレコードを取得する
		TokyoMainTakehara tokyoMainTakehara = tokyoMainTakeharaRepository.findOne(id);
		if (tokyoMainTakehara != null) {

			// 更新対象のレコードが存在する場合、削除フラグを1にする
			tokyoMainTakeharaRepository.delete(id);
		}
	}

	@Override
	public void restoreWardData(ArrayList<Integer> ids) {

		// 対象レコードの削除フラグを0に戻す
		tokyoMainTakeharaRepository.restore(ids);
	}

	@Override
	public void deleteWardDataComp(ArrayList<Integer> ids) {

		// 対象のレコードを削除する
		tokyoMainTakeharaRepository.deleteComp(ids);
	}
}
