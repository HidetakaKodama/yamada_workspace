package jp.co.futureantiques.webapptraining.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import jp.co.futureantiques.webapptraining.model.dogKanno.DogCountryKanno;
import jp.co.futureantiques.webapptraining.model.dogKanno.DogMainKanno;
import jp.co.futureantiques.webapptraining.model.dogKanno.DogSizeKanno;
import jp.co.futureantiques.webapptraining.model.form.dogKanno.DogInputForm;
import jp.co.futureantiques.webapptraining.model.form.dogKanno.DogSearchForm;

/**
 * DogKannoサービスのインターフェース
 *
 * @author future
 */
public interface DogKannoService {

	/**
	 * 原産国エンティティのリストを取得する
	 *
	 * @return DogCountryKannoEntityのリスト
	 */
	List<DogCountryKanno> getListDogCountryKanno();

	/**
	 * サイズエンティティのリストを取得する
	 *
	 * @return DogSizeKannoEntityのリスト
	 */
	List<DogSizeKanno> getListDogSizeKanno();

	/**
	 * 検索条件を元にDogMainKannoのレコードのリストを取得する(Paging)
	 *
	 * @param DogSearchForm form
	 * @param Pageable pageable
	 * @return DogMainKannoのリスト
	 */
	Page<DogMainKanno> getPageDog(final DogSearchForm form, final Pageable pageable);

	/**
	 * 検索条件を元にDogMainKannoのレコードのリストを取得する
	 *
	 * @param DogSearchForm form
	 * @return DogMainKannoのリスト
	 */
	List<DogMainKanno> getListDog(final DogSearchForm form);

	/** IDをキーにDogMainKannoのレコードを取得する
	 *
	 * @param long id
	 * @return DogMainKannoのレコード
	 */
	DogMainKanno getDog(final long dogId);

	/**
	 * DogMainKannoにレコードを新規登録する
	 *
	 * @param DogInputForm form
	 * @return DogMainKanno
	 */
	DogMainKanno insertDog(final DogInputForm form);

	/**
	 * DogMainKannoのレコードを更新する
	 *
	 * @param DogInputForm form
	 * @return DogMainKanno
	 */
	DogMainKanno updateDog(final DogInputForm form);

	/**
	 * DogMainKannoのレコードを論理削除する
	 *
	 * @param long id
	 */
	void deleteDogById(final long dogId);

	/**
	 * DogMainKannoのレコードを物理削除する
	 *
	 * @param ArrayList<Long> ids
	 */
	void deleteDogComp(final ArrayList<Long> ids);
}