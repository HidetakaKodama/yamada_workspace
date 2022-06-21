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
import jp.co.futureantiques.webapptraining.model.dramaIge.BroadcastStationIge;
import jp.co.futureantiques.webapptraining.model.dramaIge.DayOfWeekIge;
import jp.co.futureantiques.webapptraining.model.dramaIge.DramaMainIge;
import jp.co.futureantiques.webapptraining.model.dramaIge.GenreIge;
import jp.co.futureantiques.webapptraining.model.dramaIge.SeasonIge;
import jp.co.futureantiques.webapptraining.model.form.dramaIge.DramaIgeDeleteForm;
import jp.co.futureantiques.webapptraining.model.form.dramaIge.DramaIgeInputForm;
import jp.co.futureantiques.webapptraining.model.form.dramaIge.DramaIgeSearchForm;
import jp.co.futureantiques.webapptraining.service.DramaIgeService;

/**
 * DramaIgeのコントローラークラス
 *
 * @author Ige
 *
 */
@Controller
@RequestMapping(value = "/dramaIge")
public class DramaIgeController {

	/** ドラマのサービス */
	private final DramaIgeService dramaIgeService;

	/**
	 * コンストラクタ
	 *
	 * @param DramaIgeService dramaIgeService
	 */
	@Autowired
	public DramaIgeController(final DramaIgeService dramaIgeService) {
		this.dramaIgeService = dramaIgeService;
	}

	/**
	 * ジャンルエンティティのリストを取得する
	 *
	 * @return GenreIgeEntityのリスト
	 */
	@ModelAttribute
	public List<GenreIge> getListGenreIge() {
		return dramaIgeService.getListGenreIge();
	}

	/**
	 * 放送局エンティティのリストを取得する
	 *
	 * @return BroadcastStationIgeEntityのリスト
	 */
	@ModelAttribute
	public List<BroadcastStationIge> getListBroadcastStationIge() {
		return dramaIgeService.getListBroacastStationIge();
	}

	/**
	 * 季節のリストを取得する
	 *
	 * @return SeasonIgeのリスト
	 */
	@ModelAttribute
	public List<SeasonIge> getListSeasonIge() {
		return dramaIgeService.getListSeasonIge();
	}

	/**
	 * 曜日のリストを取得する
	 *
	 * @return DayOfWeekIgeのリスト
	 */
	@ModelAttribute
	public List<DayOfWeekIge> getListDayOfWeekIge() {
		return dramaIgeService.getListDayOfWeekIge();
	}

	/**
	 * 検索画面に遷移する
	 *
	 * @param DramaIgeSearchForm dramaIgeSearchForm
	 * @return 検索画面のパス
	 */
	@RequestMapping(value = "", method = RequestMethod.GET)
	public String showSearchDrama(@ModelAttribute final DramaIgeSearchForm dramaIgeSearchform) {
		return "dramaIge/search";
	}

	/**
	 * 検索結果を取得して検索画面に遷移する
	 *
	 * @param DramaIgeSearchForm form
	 * @param Model model
	 * @param Pageable pageable
	 * @return 検索画面のパス
	 */
	@RequestMapping(value = "search", method = RequestMethod.POST)
	public String searchDrama(@Validated DramaIgeSearchForm form, BindingResult bindingResult,
			final Model model, final Pageable pageable) {

		// 文字数オーバーの時
		if (bindingResult.hasFieldErrors()) {
			return "dramaIge/search";
		}

		// 入力された検索条件を元にレコードを取得する
		final Page<DramaMainIge> dramaList = dramaIgeService.getPageDramaMain(form, pageable);
		if (dramaList.getTotalElements() != 0) {

			// 検索結果がある場合、Modelに結果をセットする
			model.addAttribute("page", dramaList);
			model.addAttribute("dramaList", dramaList.getContent());
			model.addAttribute("url", "search");
		}
		return "dramaIge/search";
	}

	/**
	 * 追加画面に遷移する
	 *
	 * @parama DramaIgeInputForm dramaIgeInputForm
	 * @return 追加画面のパス
	 */
	@RequestMapping(value = "insert", method = RequestMethod.GET)
	public String showInsertDrama(@ModelAttribute final DramaIgeInputForm dramaIgeIputForm) {
		return "dramaIge/insert";
	}

	/**
	 * DramaMainIgeテーブルにデータを登録して検索画面に遷移する
	 *
	 * @param DramaIgeInputForm form
	 * @param BindingResult bingingResult
	 * @return 入力エラーがある場合追加画面、ない場合検索画面のパス
	 */
	@RequestMapping(value = "insert", method = RequestMethod.POST)
	public String insertDrama(@ModelAttribute @Validated final DramaIgeInputForm form,
			final BindingResult bindingResult) {
		if (bindingResult.hasFieldErrors()) {
			//入力エラーがある場合、次画面に戻る
			return "dramaIge/insert";
		}

		//データを登録する
		final DramaMainIge dramaMainIge = dramaIgeService.insertDrama(form);
		return "redirect:/dramaIge?result=insert&id=" + dramaMainIge.getId();
	}

	/**
	 * 更新画面に遷移する
	 *
	 * @param long id
	 * @param DramaIgeInputForm dramaIgeInputForm
	 * @return 更新画面のパス
	 */
	@RequestMapping(value = "update", method = RequestMethod.GET)
	public String showUpdateDrama(@RequestParam(name = "id") final long id,
			@ModelAttribute final DramaIgeInputForm dramaIgeInputForm, Model model) {

		//IDをキーにDramaMainIgeテーブルを検索する
		DramaMainIge dramaMainIge = dramaIgeService.getDrama(id);

		// フォームにレコードの値をセットする
		dramaIgeInputForm.initWithDramaMain(dramaMainIge);
		return "dramaIge/update";
	}

	/**
	 * DramaMainテーブルのデータを更新して検索画面に遷移する
	 *
	 * @param DramaIgeInputForm form
	 * @param BindingResult bindingResult
	 * @return 入力エラーがある場合更新画面、ない場合は検索画面のパス
	 */
	@RequestMapping(value = "update", method = RequestMethod.POST)
	public String updateDrama(@Validated final DramaIgeInputForm form,
			final BindingResult bindingResult) {
		if (bindingResult.hasFieldErrors()) {

			// 入力エラーがある場合自画面に戻る
			return "dramaIge/update";
		}

		// データを更新する
		DramaMainIge dramaMainIge = dramaIgeService.updateDrama(form);
		if (dramaMainIge == null) {

			// 更新が失敗した場合、検索画面にメッセージを表示する
			return "redirect:/dramaIge?result=updatefailed";
		}
		return "redirect:/dramaIge?result=update&id=" + dramaMainIge.getId();
	}

	/**
	 * DramaMainIgeテーブルのレコードを論理削除して検索画面に遷移する
	 *
	 * @param long id
	 * @return 検索画面のパス
	 */
	@RequestMapping(value = "delete", method = RequestMethod.GET)
	public String deleteDrama(@RequestParam(name = "id") final long id) {

		// Idをキーにレコードを論理削除する
		dramaIgeService.deleteDramaById(id);
		return "redirect:/dramaIge?result=delete&id=" + id;
	}

	/**
	 * 完全削除画面に遷移する
	 *
	 * @param DramaIgeSearchForm form
	 * @param DramaIgeDeleteForm dramaIgeDeleteForm
	 * @param Model model
	 * @return 完全削除画面のパス
	 */
	@RequestMapping(value = "deletecomp", method = RequestMethod.GET)
	public String showDeleteCompDrama(final DramaIgeSearchForm form,
			@ModelAttribute final DramaIgeDeleteForm dramaIgeDeleteForm, final Model model) {

		// DramaIgeテーブルから削除フラグが1のレコードを検索する
		final List<DramaMainIge> dramaList = dramaIgeService.getListDramaMainIge(form);

		// Modelに検索結果を格納する
		model.addAttribute(dramaList);
		return "dramaIge/deletecomp";
	}

	/**
	 * DramaMainIgeテーブルのデータを完全削除して検索画面に遷移する
	 *
	 * @param DramaIgeDeleteForm form
	 * @param BindingResult bindingResult
	 * @param Model model
	 * @return 入力エラーがある場合完全削除画面、ない場合検索画面のパス
	 */
	@RequestMapping(value = "deletecomp", method = RequestMethod.POST)
	public String deleteCompDrama(@Validated final DramaIgeDeleteForm form,
			final BindingResult bindingResult, final Model model) {
		if (bindingResult.hasFieldErrors()) {

			// 入力エラーがある場合、再検索して自画面に戻る
			DramaIgeSearchForm dramaIgeSearchForm = new DramaIgeSearchForm();
			dramaIgeSearchForm.setIsDelete(CommonConst.DELETE_FLG_ON);
			final List<DramaMainIge> dramaList = dramaIgeService.getListDramaMainIge(dramaIgeSearchForm);

			// Modelに検索結果を格納する
			model.addAttribute(dramaList);
			return "dramaIge/deletecomp";
		}

		// データを完全削除する
		dramaIgeService.deleteDramaComp(form.getDeleteIds());
		return "redirect:/dramaIge?result=deletecomp";
	}

	// 削除画面追加機能
	/**
	 * DramaMainIgeの論理削除されたレコードを復元して削除画面に戻る
	 *
	 * @param long id
	 * @return 検索画面のパス
	 */
	@RequestMapping(value="restore", method=RequestMethod.GET)
	public String restoreDrama(@RequestParam(name="id")final long id) {

		// idをキーに削除フラグを0にして論理削除から復元する
		dramaIgeService.restoreById(id);

		// 削除画面にリダイレクト
		return "redirect:/dramaIge?result=restore&id=" + id;
	}
}
