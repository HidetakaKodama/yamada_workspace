package jp.co.futureantiques.webapptraining.service.impl;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import jp.co.futureantiques.webapptraining.model.form.weaponHiratsuka.WeaponHiratsukaInputForm;
import jp.co.futureantiques.webapptraining.model.form.weaponHiratsuka.WeaponHiratsukaSearchForm;
import jp.co.futureantiques.webapptraining.model.weaponHiratsuka.ShottypeHiratsuka;
import jp.co.futureantiques.webapptraining.model.weaponHiratsuka.WeaponMainHiratsuka;
import jp.co.futureantiques.webapptraining.model.weaponHiratsuka.WeapontypeHiratsuka;
import jp.co.futureantiques.webapptraining.repository.specification.WeaponHiratsukaSpecification;
import jp.co.futureantiques.webapptraining.repository.weaponHiratsuka.ShottypeHiratsukaRepository;
import jp.co.futureantiques.webapptraining.repository.weaponHiratsuka.WeaponMainHiratsukaRepository;
import jp.co.futureantiques.webapptraining.repository.weaponHiratsuka.WeapontypeHiratsukaRepository;
import jp.co.futureantiques.webapptraining.service.WeaponHiratsukaService;


/**
 * 実装クラス
 *
 *@author hiratsuka
 */
@Service
public class WeaponHiratsukaServiceImpl implements WeaponHiratsukaService {

	/** WeaponMainリポジトリ */
	private final WeaponMainHiratsukaRepository weaponMainHiratsukaRepository;

	/** Weapontypeリポジトリ */
	private final WeapontypeHiratsukaRepository weapontypeHiratsukaRepository;

	/** Shottypeリポジトリ */
	private final ShottypeHiratsukaRepository shottypeHiratsukaRepository;

	/**
	 * コンストラクタ
	 *
	 * @param WeaponMainRepository weaponMainRepository
	 * @param WeapontypeRepository weapontypeRepository
	 * @param ShottypeRepository shottypeRepository
	 */
	@Autowired
	public WeaponHiratsukaServiceImpl(WeaponMainHiratsukaRepository weaponMainRepository,
			WeapontypeHiratsukaRepository weapontypeRepository,
			ShottypeHiratsukaRepository shottypeRepository) {
		this.weaponMainHiratsukaRepository = weaponMainRepository;
		this.weapontypeHiratsukaRepository = weapontypeRepository;
		this.shottypeHiratsukaRepository = shottypeRepository;
	}

	@Override
	public List<WeapontypeHiratsuka> getListWeapontype() {

		// WeapontypeテーブルのレコードをID順に取得する
		return weapontypeHiratsukaRepository.findAll(new Sort(Sort.Direction.ASC, "id"));
	}

	@Override
	public List<ShottypeHiratsuka> getListShottype() {

		// ShottypeテーブルのレコードをID順に取得する
		return shottypeHiratsukaRepository.findAll(new Sort(Sort.Direction.ASC, "id"));
	}

	@Override
	public Page<WeaponMainHiratsuka> getPageWeapon(final WeaponHiratsukaSearchForm form, final Pageable pageable) {

		// 検索条件を生成しWeaponMainテーブルのレコードを取得する
		return weaponMainHiratsukaRepository.findAll(
				WeaponHiratsukaSpecification.generateWeaponHiratsukaSpecification(form), pageable);
	}

	@Override
	public List<WeaponMainHiratsuka> getListWeapon(final WeaponHiratsukaSearchForm form) {

		// 検索条件を生成しWeaponMainテーブルのレコードを取得する
		return weaponMainHiratsukaRepository
				.findAll(WeaponHiratsukaSpecification.generateWeaponHiratsukaSpecification(form));
	}

	@Override
	public WeaponMainHiratsuka getWeapon(final long id) {

		// WeaponMainテーブルを主キー検索する
		return weaponMainHiratsukaRepository.findOne(id);
	}

	@Override
	public WeaponMainHiratsuka insertWeapon(final WeaponHiratsukaInputForm form) {

		// WeaponMainテーブルに新規でデータを登録する
		final WeaponMainHiratsuka weaponMainHiratsuka = form.convertToWeaponMainHiratsukaForInsert();
		return weaponMainHiratsukaRepository.save(weaponMainHiratsuka);
	}

	@Override
	public WeaponMainHiratsuka updateWeapon(final WeaponHiratsukaInputForm form) {

		// 更新対象のレコードを取得する
		WeaponMainHiratsuka weaponMainHiratsuka = weaponMainHiratsukaRepository.findOne((long) form.getId());
		if (weaponMainHiratsuka != null) {

			// 更新対象のレコードが存在する場合排他チェック
			if (form.getUpdateDate().equals(String.valueOf(weaponMainHiratsuka.getUpdateDate()))) {

				// チェックOKの場合、更新
				weaponMainHiratsuka = form.convertToWeaponmMainHiratsukaForUpdate(weaponMainHiratsuka);
				return weaponMainHiratsukaRepository.saveAndFlush(weaponMainHiratsuka);
			}
		}
		return null;
	}

	@Override
	public void deleteWeaponById(final long id) {

		// 更新対象のレコードを取得する
		WeaponMainHiratsuka weaponMainHiratsuka = weaponMainHiratsukaRepository.findOne(id);
		if (weaponMainHiratsuka != null) {

			// 更新対象のレコードが存在する場合、削除フラグを1にする
			weaponMainHiratsukaRepository.delete(id);
		}
	}

	@Override
	public void deleteWeaponComp(final ArrayList<Long> ids) {

		// 対象のレコードを削除する
		weaponMainHiratsukaRepository.deleteComp(ids);
	}
}
