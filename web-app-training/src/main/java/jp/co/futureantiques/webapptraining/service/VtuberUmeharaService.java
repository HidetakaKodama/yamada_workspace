package jp.co.futureantiques.webapptraining.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import jp.co.futureantiques.webapptraining.model.form.vtuberUmehara.VtuberUmeharaInputForm;
import jp.co.futureantiques.webapptraining.model.form.vtuberUmehara.VtuberUmeharaSearchForm;
import jp.co.futureantiques.webapptraining.model.vtuberUmehara.CompanyUmehara;
import jp.co.futureantiques.webapptraining.model.vtuberUmehara.ContentsUmehara;
import jp.co.futureantiques.webapptraining.model.vtuberUmehara.FormsUmehara;
import jp.co.futureantiques.webapptraining.model.vtuberUmehara.VtuberMainUmehara;

/**
 * VtuberUmeharaのサービスインターフェース
 *
 * @author future
 */
public interface VtuberUmeharaService {

	/**
	 * 会社エンティティのリストを取得する
	 *
	 * @return CompanyUmeharaEntityのリスト
	 */
	List<CompanyUmehara> getListCompanyUmehara();

	/**
	 * 動画形態エンティティのリストを取得する
	 *
	 * @return FormsUmeharaEntityのリスト
	 */
	List<FormsUmehara> getListFormsUmehara();

	/**
	 * 動画内容エンティティのリストを取得する
	 *
	 * @return ContentsUmeharaEntityのリスト
	 */
	List<ContentsUmehara> getListContentsUmehara();

	/**
	 * 検索条件を元にVtuberMainUmeharaのレコードのリストを取得する(Paging)
	 *
	 * @param VtuberMainUmeharaSearchForm form
	 * @param Pageable pageable
	 * @return VtuberMainUmeharaのリスト
	 */
	Page<VtuberMainUmehara> getPageVtuberUmehara(final VtuberUmeharaSearchForm form, final Pageable pageable);

	/**
	 * 検索条件を元にVtuberMainUmeharaのレコードのリストを取得する
	 *
	 * @param VtuberUmeharaSearchForm form
	 * @return VtuberMainUmeharaのリスト
	 */
	List<VtuberMainUmehara> getListVtuberUmehara(final VtuberUmeharaSearchForm form);

	/**
	 * IDをキーにVtuberMainUmeharaのレコードを取得する
	 *
	 * @param long id
	 * @return VtuberMainUmeharaのレコード
	 */
	VtuberMainUmehara getVtuberUmehara(final long id);

	/**
	 * VtuberMainUmeharaにレコードを新規登録する
	 *
	 * @param VtuberUmeharaInputForm form
	 * @return VtuberMainUmehara
	 */
	VtuberMainUmehara insertVtuberUmehara(final VtuberUmeharaInputForm form);

	/**
	 * VtuberMainUmeharaのレコードを更新する
	 *
	 * @param VtuberUmeharaInputForm form
	 * @return VtuberMainUmehara
	 */
	VtuberMainUmehara updateVtuberUmehara(final VtuberUmeharaInputForm form);

	/**
	 * VtuberMainUmeharaのレコードを論理削除する
	 *
	 * @param long id
	 */
	void deleteVtuberUmeharaById(final long id);

	/**
	 * VtuberMainUmeharaのレコードを物理削除する
	 *
	 * @param ArrayList<Long> ids
	 */
	void deleteVtuberUmeharaComp(final ArrayList<Long> ids);

}
