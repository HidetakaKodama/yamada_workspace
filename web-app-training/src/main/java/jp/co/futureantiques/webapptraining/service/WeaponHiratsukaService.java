package jp.co.futureantiques.webapptraining.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import jp.co.futureantiques.webapptraining.model.form.weaponHiratsuka.WeaponHiratsukaInputForm;
//import jp.co.futureantiques.webapptraining.model.form.weaponHiratsuka.WeaponHiratsukaInputForm;
import jp.co.futureantiques.webapptraining.model.form.weaponHiratsuka.WeaponHiratsukaSearchForm;
import jp.co.futureantiques.webapptraining.model.weaponHiratsuka.ShottypeHiratsuka;
import jp.co.futureantiques.webapptraining.model.weaponHiratsuka.WeaponMainHiratsuka;
import jp.co.futureantiques.webapptraining.model.weaponHiratsuka.WeapontypeHiratsuka;

/**
 * コントローラーの呼び出し先
 *
 * @author hiratsuka
 */
public interface WeaponHiratsukaService {

	/**
	 * 武器タイプエンティティのリストを取得する
	 *
	 * @return WeapontypeEntityのリスト
	 */
	List<WeapontypeHiratsuka> getListWeapontype();

	/**
	 * 射撃方式エンティティのリストを取得する
	 *
	 * @return ShottypeEntityのリスト
	 */
	List<ShottypeHiratsuka> getListShottype();

	/**
	 * 検索条件を元にWeaponMainのレコードのリストを取得する(Paging)
	 *
	 * @param WeaponHiratsukaSearchForm form
	 * @param Pageable pageable
	 * @return weaponMainのリスト
	 */
	Page<WeaponMainHiratsuka> getPageWeapon(WeaponHiratsukaSearchForm form, final Pageable pageable);

	/**
	 * 検索条件を元にWeaponMainのレコードのリストを取得する
	 *
	 * @param WeaponHiratsukaSearchForm form
	 * @return WeaponMainのリスト
	 */
	List<WeaponMainHiratsuka> getListWeapon(final WeaponHiratsukaSearchForm form);

	/**
	 * IDをキーにWeaponMainのレコードを取得する
	 *
	 * @param long id
	 * @return WeaponMainのレコード
	 */
	WeaponMainHiratsuka getWeapon(final long id);

	/**
	 * WeaponMainにレコードを新規登録する
	 *
	 * @param WeaponHiratsukaInputForm form
	 * @return WeaponMain
	 */
	WeaponMainHiratsuka insertWeapon(final WeaponHiratsukaInputForm form);

	/**
	 * WeaponMainのレコードを更新する
	 *
	 * @param WeaponHiratsukaInputForm form
	 * @return WeaponMain
	 */
	WeaponMainHiratsuka updateWeapon(final WeaponHiratsukaInputForm form);

	/**
	 * WeaponMainのレコードを論理削除する
	 *
	 * @param long id
	 */
	void deleteWeaponById(final long id);

	/**
	 * WeaponMainのレコードを物理削除する
	 *
	 * @param ArrayList<Long> ids
	 */
	void deleteWeaponComp(final ArrayList<Long> ids);

}
