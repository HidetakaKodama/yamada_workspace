package jp.co.futureantiques.webapptraining.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import jp.co.futureantiques.webapptraining.model.drinkYoshimoto.DrinkCategoryYoshimoto;
import jp.co.futureantiques.webapptraining.model.drinkYoshimoto.DrinkMainYoshimoto;
import jp.co.futureantiques.webapptraining.model.drinkYoshimoto.DrinkMakerYoshimoto;
import jp.co.futureantiques.webapptraining.model.form.drinkYoshimoto.DrinkYoshimotoInputForm;
import jp.co.futureantiques.webapptraining.model.form.drinkYoshimoto.DrinkYoshimotoSearchForm;

/**
 * DrinkYoshimotoのサービスインターフェース
 *
 * @author Yoshimoto
 *
 */
public interface DrinkYoshimotoService {

	/**
	 * カテゴリーのエンティティリストを取得する
	 *
	 * @return CategoryEntityリスト
	 */
	List<DrinkCategoryYoshimoto> getListDrinkCategoryYoshimoto();

	/**
	 * メーカーのエンティティリストを取得する
	 *
	 * @return MakerEntityリスト
	 */
	List<DrinkMakerYoshimoto> getListDrinkMakerYoshimoto();

	/**
	 *検索条件をもとにDrinkMainYoshimotoのレコードリストを取得する
	 *
	 *@param DrinkYoshimotoSearchForm form
	 *@return DrinkMainYoshimotoのリスト
	 *
	 */
	List<DrinkMainYoshimoto> getListDrinkMainYoshimoto(final DrinkYoshimotoSearchForm form);

	/**
	 * 検索結果をもとにDrinkMainYoshimotoのレコードリストを取得する(paging)
	 *
	 * @param DrinkYoshimotoSearchForm
	 * @param Pageable pageable
	 * @return DrinkMainYoshimotoのリスト
	 */
	Page<DrinkMainYoshimoto> getPageDrinkMain(final DrinkYoshimotoSearchForm form, final Pageable pageable);

	/**
	 * IDをキーにDrinkMainYoshimotoのレコードを取得する
	 *
	 * @param long id
	 * @return DrinkMainYoshimotoのレコード
	 *
	 */
	DrinkMainYoshimoto getDrink(final long id);

	/**
	 * DrinkMainYoshimotoにレコードを新規登録する
	 *
	 * @param DrinkYoshimotoInputForm form
	 * @return DrinkMainYoshimoto
	 */
	DrinkMainYoshimoto insertDrink(final DrinkYoshimotoInputForm form);

	/**
	 * DrinkMainYoshimotoのレコードを更新する
	 *
	 * @param DrinkYoshimotoInputForm
	 * @return DrinkMainYoshimoto
	 */
	DrinkMainYoshimoto updateDrink(final DrinkYoshimotoInputForm form);

	/**
	 * DrinkMainYoshimotoのレコードを論理削除する
	 *
	 * @param long id
	 */
	void deleteDrinkById(final long id);

	/**
	 * DrinkMainYoshimotoのレコードを物理削除する
	 *
	 * @param ArrayList<Long> ids
	 */
	void deleteDrinkComp(final ArrayList<Long> ids);
}
