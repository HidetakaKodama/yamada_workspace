package jp.co.futureantiques.webapptraining.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import jp.co.futureantiques.webapptraining.model.form.penguinKawamura.PenguinInputForm;
import jp.co.futureantiques.webapptraining.model.form.penguinKawamura.PenguinSearchForm;
import jp.co.futureantiques.webapptraining.model.penguinKawamura.AttributeKawamura;
import jp.co.futureantiques.webapptraining.model.penguinKawamura.PenguinMainKawamura;

/**
 * PenguinKawamuraサービスのインターフェース
 * @author Mariko Kawaura
 */
public interface PenguinKawamuraService {

	/**
	 * AttributeKawamuraエンティティのリストを取得する
	 * @return AttributeKawamuraエンティティのリスト
	 */
	List<AttributeKawamura> getListAttributeKawamura();

	/**
	 * 検索条件を基にPenguinKawamuraのレコードのリストを取得する(Paging)
	 * @param PenguinSearchForm form
	 * @return PenguinMainKawamuraのリスト
	 */
	Page<PenguinMainKawamura> getPagePenguin(final PenguinSearchForm form, final Pageable pageable);

	/**
	 * 検索条件を基にPenguinMainKawamuraのレコードのリストを取得する
	 * @param PenguinSearchForm form
	 * @return PenguinMainKawamuraのリスト
	 */
	List<PenguinMainKawamura> getListPenguin(final PenguinSearchForm form);

	/**
	 * IDをキーにPenguinMainKawamuraのレコードを取得する
	 * @param long id
	 * @return PenguinMainKawamuraのレコード
	 */
	PenguinMainKawamura getPenguin(final long id);

	/** PenguinMainKawamuraにレコードを新規登録する
	 * @param PenguinInputForm form
	 */
	PenguinMainKawamura insertPenguin(final PenguinInputForm form);

	/**
	 * PenguinMainKawamuraのレコードを更新する
	 * @param PenguinInputForm form
	 * @return PenguinMainKawamura
	 */
	PenguinMainKawamura updatePenguin(final PenguinInputForm form);

	/**
	 * PenguinMainKawamuraのレコードを論理削除する
	 * @param long id
	 * @return PenguinMainKawamura
	 */
	void deletePenguinById(final long id);

	/**
	 * PenguinMainKawamuraのレコードを物理削除する
	 * @param ArrayList<Long> ids
	 * @return PenguinMainKawamura
	 */
	void deletePenguinComp(final ArrayList<Long> ids);





}
