package jp.co.futureantiques.webapptraining.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import jp.co.futureantiques.webapptraining.constant.CommonConst;
import jp.co.futureantiques.webapptraining.model.form.nbaplayersTakahashi.NbaplayersTakahashiDeleteForm;
import jp.co.futureantiques.webapptraining.model.form.nbaplayersTakahashi.NbaplayersTakahashiInputForm;
import jp.co.futureantiques.webapptraining.model.form.nbaplayersTakahashi.NbaplayersTakahashiSearchForm;
import jp.co.futureantiques.webapptraining.model.nbaplayersTakahashi.NbaplayersMainTakahashi;
import jp.co.futureantiques.webapptraining.model.nbaplayersTakahashi.PositionTakahashi;
import jp.co.futureantiques.webapptraining.model.nbaplayersTakahashi.TeamTakahashi;
import jp.co.futureantiques.webapptraining.service.NbaplayersTakahashiService;

/**
 * NbaplayersTakahashiのコントローラークラス
 *
 * @author Takumi Takahashi
 */
@Controller
@RequestMapping(value = "/nbaplayerstakahashi")
public class NbaplayersTakahashiController {

	/**
	 * NBA選手データのサービス */
	private final NbaplayersTakahashiService nbaplayersTakahashiService;

	/**
	 * コンストラクタ
	 *
	 * @param NbaplayersTakahashiService nbaplayersTakahashiService
	 */
	@Autowired
	public NbaplayersTakahashiController(final NbaplayersTakahashiService nbaplayersTakahashiService) {
		this.nbaplayersTakahashiService = nbaplayersTakahashiService;
	}

	/**
	 * ポジションエンティティのリストを取得する
	 *
	 * @return PositionTakahashiEntityのリスト
	 */
	@ModelAttribute
	public List<PositionTakahashi> getListPositionTakahashi() {
		return nbaplayersTakahashiService.getListPositionTakahashi();
	}

	/**
	 * 所属チームエンティティのリストを取得する
	 *
	 * @return TeamTakahashiのリスト
	 */
	@ModelAttribute
	public List<TeamTakahashi> getListTeamTakahashi() {
		return nbaplayersTakahashiService.getListTeamTakahashi();
	}

	/**
	 * 検索画面に遷移する
	 *
	 * @param NbaplayersTakahashiSearchForm nbaplayersTakahashiSearchForm
	 * @return 検索画面のパス
	 */
	@RequestMapping(value = "", method = RequestMethod.GET)
	public String showSearchNbaplayers(
			@ModelAttribute final NbaplayersTakahashiSearchForm nbaplayersTakahashiSearchForm) {
		return "nbaplayerstakahashi/search";
	}

	/**
	 * 検索結果を取得して検索画面に遷移する
	 *
	 * @param NbaplayersTakahashiSearchForm form
	 * @param Model model
	 * @param Pageable pageable
	 * @return 検索画面のパス
	 */
	@RequestMapping(value = "search", method = RequestMethod.POST)
	public String searchNbaplayers(final NbaplayersTakahashiSearchForm form, final Model model,
			final Pageable pageable) {

		// 入力された検索条件を元にレコードを取得する
		final Page<NbaplayersMainTakahashi> nbaplayersMainTakahashiList = nbaplayersTakahashiService
				.getPageNbaplayersTakahashi(form,
						pageable);
		if (nbaplayersMainTakahashiList.getTotalElements() != 0) {

			// 検索結果がある場合、Modelに結果をセットする
			model.addAttribute("page", nbaplayersMainTakahashiList);
			model.addAttribute("nbaplayersMainTakahashiList", nbaplayersMainTakahashiList.getContent());
			model.addAttribute("url", "search");
		}
		return "nbaplayerstakahashi/search";
	}

	/**
	 * 追加画面に遷移する
	 *
	 * @param NbaplayersTakahashiInputForm nbaplayersTakahashiInputForm
	 * @return 追加画面のパス
	 */
	@RequestMapping(value = "insert", method = RequestMethod.GET)
	public String showInsertNbaplayers(
			@ModelAttribute final NbaplayersTakahashiInputForm nbaplayersTakahashiInputForm) {
		return "nbaplayerstakahashi/insert";
	}

	/**
	 * NbaplayersMainTakahashiテーブルにデータを登録して検索画面に遷移する
	 *
	 * @param NbaplayersTakahshiInputForm form
	 * @param BindingResult bindingResult
	 * @return 入力エラーがある場合追加画面、ない場合検索画面のパス
	 */
	@RequestMapping(value = "insert", method = RequestMethod.POST)
	public String insertNbaplayers(@ModelAttribute @Validated final NbaplayersTakahashiInputForm form,
			final BindingResult bindingResult) {
		if (bindingResult.hasFieldErrors()) {

			// 入力エラーがある場合自画面に戻る
			return "nbaplayerstakahashi/insert";
		}

		// データを登録する
		final NbaplayersMainTakahashi nbaplayersMainTakahashi = nbaplayersTakahashiService
				.insertNbaplayersTakahashi(form);
		return "redirect:/nbaplayerstakahashi?result=insert&id=" + nbaplayersMainTakahashi.getId();
	}

	/**
	 * 更新画面に遷移する
	 *
	 * @param long id
	 * @param NbaplayersTakahashiInputForm nbaplayersTakahashiInputForm
	 * @return 更新画面のパス
	 */
	@RequestMapping(value = "update", method = RequestMethod.GET)
	public String showUpdateNbaplayers(@RequestParam(name = "id") final long id,
			@ModelAttribute final NbaplayersTakahashiInputForm nbaplayersTakahashiInputForm) {

		// IDをキーにNbaplayersMainTakahashiテーブルを検索する
		NbaplayersMainTakahashi nbaplayersMainTakahashi = nbaplayersTakahashiService.getNbaplayersTakahashi(id);

		// フォームにレコードの値をセットする
		nbaplayersTakahashiInputForm.initWithNbaplayersMainTakahashi(nbaplayersMainTakahashi);
		return "nbaplayerstakahashi/update";
	}

	/**
	 * NbaplayersMainTakahashiテーブルのデータを更新して検索画面に遷移する
	 *
	 * @param NbaplayersTakahashiInputForm form
	 * @param BindingResult bindingResult
	 * @return 入力エラーがある場合更新画面、ない場合検索画面のパス
	 */
	@RequestMapping(value = "update", method = RequestMethod.POST)
	public String updateNbaplayersTakahashi(@Validated final NbaplayersTakahashiInputForm form,
			final BindingResult bindingResult) {
		if (bindingResult.hasFieldErrors()) {

			// 入力エラーがある場合自画面に戻る
			return "nbaplayerstakahashi/update";
		}

		// データを更新する
		NbaplayersMainTakahashi nbaplayersMainTakahashi = nbaplayersTakahashiService.updateNbaplayersTakahashi(form);
		if (nbaplayersMainTakahashi == null) {

			// 更新が失敗した場合、検索画面にメッセージを表示する
			return "redirect:/nbaplayerstakahashi?result=updatefailed";
		}
		return "redirect:/nbaplayerstakahashi?result=update&id=" + nbaplayersMainTakahashi.getId();
	}

	/**
	 * NbaplayersMainTakahashiテーブルのレコードを論理削除して検索画面に遷移する
	 *
	 * @param long id
	 * @return 検索画面のパス
	 */
	@RequestMapping(value = "delete", method = RequestMethod.GET)
	public String deleteNbaplayers(@RequestParam(name = "id") final long id) {

		// IDをキーにレコードを論理削除する
		nbaplayersTakahashiService.deleteNbaplayersTakahashiById(id);
		return "redirect:/nbaplayerstakahashi?result=delete&id=" + id;
	}

	/**
	 * 完全削除画面に遷移する
	 *
	 * @param NbaplayersTakahashiSearchForm form
	 * @param NbaplayersTakahashiDeleteForm nbaplayersTakahashiDeleteForm
	 * @param Model model
	 * @return 完全削除画面のパス
	 */
	@RequestMapping(value = "deletecomp", method = RequestMethod.GET)
	public String showDeleteCompNbaplayersTakahashi(final NbaplayersTakahashiSearchForm form,
			@ModelAttribute final NbaplayersTakahashiDeleteForm nbaplayersTakahashiDeleteForm, final Model model) {

		// NbaplayersMainTakahashiテーブルから削除フラグが1のレコードを検索する
		final List<NbaplayersMainTakahashi> nbaplayersMainTakahashiList = nbaplayersTakahashiService
				.getListNbaplayersTakahashi(form);

		// Modelに検索結果を格納する
		model.addAttribute(nbaplayersMainTakahashiList);
		return "nbaplayerstakahashi/deletecomp";
	}

	/**
	 * NbaplayersMainTakahashiテーブルのデータを完全削除して検索画面に遷移する
	 *
	 * @param NbaplayersTakahashiDeleteForm form
	 * @param BindingResult bindingResult
	 * @param Model model
	 * @return 入力エラーがある場合完全削除画面、ない場合検索画面のパス
	 */
	@RequestMapping(value = "deletecomp", method = RequestMethod.POST)
	public String deleteCompNbaplayersTakahashi(@Validated final NbaplayersTakahashiDeleteForm form,
			final BindingResult bindingResult, final Model model) {
		if (bindingResult.hasFieldErrors()) {

			// 入力エラーがある場合、再検索して自画面に戻る
			NbaplayersTakahashiSearchForm nbaplayersTakahashiSearchForm = new NbaplayersTakahashiSearchForm();
			nbaplayersTakahashiSearchForm.setIsDelete(CommonConst.DELETE_FLG_ON);
			final List<NbaplayersMainTakahashi> nbaplayersMainTakahashiList = nbaplayersTakahashiService
					.getListNbaplayersTakahashi(nbaplayersTakahashiSearchForm);

			// Modelに検索結果を格納する
			model.addAttribute(nbaplayersMainTakahashiList);
			return "nbaplayerstakahashi/deletecomp";
		}

		// データを完全削除する
		nbaplayersTakahashiService.deleteNbaplayersTakahashiComp(form.getDeleteIds());
		return "redirect:/nbaplayerstakahashi?result=deletecomp";
	}
}
