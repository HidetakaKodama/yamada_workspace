package jp.co.futureantiques.webapptraining.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import jp.co.futureantiques.webapptraining.model.form.resipeishikawa.ResipeIshikawaInputForm;
import jp.co.futureantiques.webapptraining.model.form.resipeishikawa.ResipeIshikawaSearchForm;
import jp.co.futureantiques.webapptraining.model.resipeishikawa.GenreIshikawa;
import jp.co.futureantiques.webapptraining.model.resipeishikawa.ResipeMainIshikawa;
import jp.co.futureantiques.webapptraining.model.resipeishikawa.VegetableIshikawa;


/**
 * ResipeIshikawaのサービスインターフェース
 *
 * @author t.ishikawa
 */
public interface ResipeIshikawaService {

	/**
	 *野菜エンティティのリストを取得する
	 *
	 *@return Vegetableエンティティのリスト
	 */
	List<VegetableIshikawa> getListVegetable();

	/**
	 *ジャンルエンティティのリストを取得する
	 *
	 *@return Genreエンティティのリスト
	 */
	List<GenreIshikawa>getListGenre();

	/**
	 *検索結果を元にResipeMainIshikawaのレコードリストを取得する(paging)
	 *
	 *@param resipeIshikawaSearchForm form
	 *@param Pageable pageable
	 *@return ResipeMainIshikawaのリスト
	 */
	Page<ResipeMainIshikawa> getPageResipe(final ResipeIshikawaSearchForm form,final Pageable pageable);

	/**
	 *検索結果を元にresipeMainIshikawaのレコードリストを取得する
	 *
	 *@param resipeIshikawaSearchForm form
	 *@return ResipeMainIshikawaのリスト
	 *
	 */
	List<ResipeMainIshikawa> getListResipe(final ResipeIshikawaSearchForm form);

	/**
	 *IDをキーにresipeMainIshikawaのレコードを取得する
	 *
	 *@param long  id
	 *@return ResipeMainIshikawaのレコード
	 */
	ResipeMainIshikawa getResipe(final long id);

	/**
	 *ResipeMainIshikawaにレコードを新規登録する
	 *
	 *@param ResipeIshikawaInputForm form
	 * @return ResipeIshikawa
	 */
	ResipeMainIshikawa insertResipe(final ResipeIshikawaInputForm form);

	/**
	 *ResipeMainIshikawaのレコードを更新する
	 *
	 * @param  ResipeIshikawaInputForm form
	 * @rerurn ResipeMainIshikawa
	 */
	ResipeMainIshikawa updateResipe(final ResipeIshikawaInputForm form);

	/**
	 * ResipeMainIshikawaのレコードを論理削除する
	 *
	 * @param long id
	 */
	void deleteResipeById(final long id);

	/**
	 *ResipeMainIshikawaのレコードを物理削除する
	 *
	 * @param ArrayList<Long>ids
	 */
	void deleteResipeComp(final ArrayList<Long> ids);
}