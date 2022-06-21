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
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import jp.co.futureantiques.webapptraining.constant.CommonConst;
import jp.co.futureantiques.webapptraining.model.form.tokyoTakehara.TokyoTakeharaDeleteForm;
import jp.co.futureantiques.webapptraining.model.form.tokyoTakehara.TokyoTakeharaInputForm;
import jp.co.futureantiques.webapptraining.model.form.tokyoTakehara.TokyoTakeharaSearchForm;
import jp.co.futureantiques.webapptraining.model.tokyoTakehara.LocationTakehara;
import jp.co.futureantiques.webapptraining.model.tokyoTakehara.TokyoMainTakehara;
import jp.co.futureantiques.webapptraining.service.TokyoTakeharaService;

/**
 * TokyoTakeharaのコントローラークラス
 *
 */
@Controller
@RequestMapping(value = "/tokyotakehara")
public class TokyoTakeharaController {

	/** TokyoTakearaのサービス */
	private final TokyoTakeharaService tokyoTakeharaService;

	/**
	 * コンストラクタ
	 *
	 * @param TokyoTakeharaService tokyoTakeharaService
	 */
	@Autowired
	public TokyoTakeharaController(final TokyoTakeharaService tokyoTakeharaService) {
		this.tokyoTakeharaService = tokyoTakeharaService;
	}

	/**
	 * 所在地域エンティティのリストを取得する
	 *
	 * @return LocationTakehara Entityのリスト
	 */
	@ModelAttribute
	public List<LocationTakehara> getListLocationTakehara() {
		return tokyoTakeharaService.getListLocation();
	}

	/**
	 * 検索画面に遷移する
	 *
	 * @param TokyoTakeharaSearchForm tokyoTakeharaSearchForm
	 * @return 検索画面のパス
	 */
	@RequestMapping(value = "", method = RequestMethod.GET)
	public String showSearchWards(@ModelAttribute final TokyoTakeharaSearchForm tokyoTakeharaSearchForm,
			@ModelAttribute("wardName")String wardName) {
		return "tokyotakehara/searchDisp";
	}

	/**
	 * 検索結果を取得して検索画面に遷移する
	 *
	 * @param TokyoTakeharaSearchForm form
	 * @param Model model
	 * @param Pageable pageable
	 * @return 検索画面のパス
	 */
	@RequestMapping(value = "search", method = RequestMethod.POST)
	public String searchWards(final TokyoTakeharaSearchForm form, final Model model, final Pageable pageable) {

		// 入力された検索条件を元にレコードを取得する
		final Page<TokyoMainTakehara> wardsList = tokyoTakeharaService.getPageWards(form, pageable);
		if (wardsList.getTotalElements() != 0) {

			// 検索結果がある場合、Modelに結果をセットする
			model.addAttribute("page", wardsList);
			model.addAttribute("wardsList", wardsList.getContent());
			model.addAttribute("url", "search");
		}
		return "tokyotakehara/searchDisp";
	}

	/**
	 * 追加画面に遷移する
	 *
	 * @param TokyoMainTakeharaInputForm tokyoMaintakeharaInputForm
	 * @return 追加画面のパス
	 */
	@RequestMapping(value = "insert", method = RequestMethod.GET)
	public String showInsertWards(@ModelAttribute final TokyoTakeharaInputForm tokyoTakeharaInputForm) {
		return "tokyotakehara/insertDisp";
	}

	/**
	 * TokyoMainTakeharaテーブルにデータを登録して検索画面に遷移する
	 *
	 * @param TokyoTakeharaInputForm form
	 * @param BindingResult bindingResult
	 * @return 入力エラーがある場合追加画面、ない場合検索画面のパス
	 */
	@RequestMapping(value = "insert", method = RequestMethod.POST)
	public String insertWards(@ModelAttribute @Validated final TokyoTakeharaInputForm form,
			final BindingResult bindingResult, RedirectAttributes ra) {
		if (bindingResult.hasFieldErrors()) {

			// 入力エラーがある場合自画面に戻る
			return "tokyotakehara/insertDisp";
		}

		// データを登録する
		final TokyoMainTakehara tokyoMainTakehara = tokyoTakeharaService.insertWardData(form);

		// idをキーにデータを検索し、レコードから区名を取り出しraにセットする
		String wardName = tokyoMainTakehara.getWardName()+"区";
		ra.addFlashAttribute("wardName", wardName);
		return "redirect:/tokyotakehara?result=insert&id=" + tokyoMainTakehara.getId();
	}

	/**
	 * 更新画面に遷移する
	 *
	 * @param int id
	 * @param TokyoTakeharaInputForm tokyoTakeharaInputForm
	 * @return 更新画面のパス
	 */
	@RequestMapping(value = "update", method = RequestMethod.GET)
	public String showUpdateWards(@RequestParam(name = "id") final int id,
			@ModelAttribute final TokyoTakeharaInputForm tokyoTakeharaInputForm) {

		// IDをキーにMovieMainテーブルを検索する
		TokyoMainTakehara tokyoMainTakehara = tokyoTakeharaService.getWardData(id);

		// フォームにレコードの値をセットする
		tokyoTakeharaInputForm.initWithTokyoMainTakehara(tokyoMainTakehara);
		return "tokyotakehara/updateDisp";
	}

	/**
	 * TokyoMainTakeharaテーブルのデータを更新して検索画面に遷移する
	 *
	 * @param TokyotakeharaInputForm form
	 * @param BindingResult bindingResult
	 * @param RedirectAttributes ra
	 * @return 入力エラーがある場合更新画面、ない場合検索画面のパス
	 */
	@RequestMapping(value = "update", method = RequestMethod.POST)
	public String updateWards(@Validated final TokyoTakeharaInputForm form,final RedirectAttributes ra,
			final BindingResult bindingResult) {
		if (bindingResult.hasFieldErrors()) {

			// 入力エラーがある場合自画面に戻る
			return "tokyotakehara/updateDisp";
		}

		// データを更新する
		TokyoMainTakehara tokyoMainTakehara = tokyoTakeharaService.updateWardData(form);
		if (tokyoMainTakehara == null) {

			// 更新が失敗した場合、検索画面にメッセージを表示する
			return "redirect:/tokyotakehara?result=updatefailed";
		}

		// idをキーにデータを検索し、レコードから区名を取り出しraにセットする
		TokyoMainTakehara updateRecord = tokyoTakeharaService.getWardData(form.getId());
		String wardName = updateRecord.getWardName()+"区";
		ra.addFlashAttribute("wardName", wardName);
		return "redirect:/tokyotakehara?result=update&id=" + tokyoMainTakehara.getId();
	}

	/**
	 * TokyoMainTakeharaテーブルのレコードを論理削除して検索画面に遷移する
	 *
	 * @param int id
	 * @return 検索画面のパス
	 */
	@RequestMapping(value = "delete", method = RequestMethod.GET)
	public String deleteWards(@RequestParam(name = "id") final int id,final RedirectAttributes ra) {

		// IDをキーにレコードを論理削除する
		tokyoTakeharaService.deleteWardById(id);

		// idをキーにデータを検索し、レコードから区名を取り出しraにセットする
			TokyoMainTakehara dumpRecord = tokyoTakeharaService.getWardData(id);
			String wardName = dumpRecord.getWardName()+"区";
			ra.addFlashAttribute("wardName", wardName);
		return "redirect:/tokyotakehara?result=delete&id=" + id;
	}

	/**
	 * 完全削除画面に遷移する
	 *
	 * @param TokyoTakeharaSearchForm form
	 * @param TokyoTakeharaDeleteForm tokyoTakeharaDeleteForm
	 * @param Model model
	 * @return 完全削除画面のパス
	 */
	@RequestMapping(value = "deletecomp", method = RequestMethod.GET)
	public String showDeleteCompWard(final TokyoTakeharaSearchForm form,
			@ModelAttribute final TokyoTakeharaDeleteForm tokyoTakeharaDeleteForm, final Model model) {

		// TokyoMainTakeharaテーブルから削除フラグが1のレコードを検索する
		final List<TokyoMainTakehara> wardsList = tokyoTakeharaService.getListWards(form);

		// Modelに検索結果を格納する
		model.addAttribute("wardsList", wardsList);
		//model.addAttribute(deleteWardsList);
		return "tokyotakehara/deleteCompDisp";
	}

	/**
	 * TokyoMainTakeharaテーブルのデータを完全削除して検索画面に遷移する
	 *
	 * @param TokyoTakeharaDeleteForm form
	 * @param BindingResult bindingResult
	 * @param Model model
	 * @return 入力エラーがある場合完全削除画面、ない場合検索画面のパス
	 */
	@RequestMapping(value = "deletecomp",params = "deleteComp", method = RequestMethod.POST)
	public String deleteCompWards(@Validated final TokyoTakeharaDeleteForm form,
			final BindingResult bindingResult, final Model model) {
		if (bindingResult.hasFieldErrors()) {

			// 入力エラーがある場合、再検索して自画面に戻る
			TokyoTakeharaSearchForm tokyoTakeharaSearchForm = new TokyoTakeharaSearchForm();
			tokyoTakeharaSearchForm.setIsDelete(1);
			final List<TokyoMainTakehara> wardsList = tokyoTakeharaService.getListWards(tokyoTakeharaSearchForm);

			// Modelに検索結果を格納する
			model.addAllAttributes(wardsList);
			return "tokyotakehara/deleteCompDisp";
		}

		// データを完全削除する
		tokyoTakeharaService.deleteWardDataComp(form.getOperateIds());
		return "redirect:/tokyotakehara?result=deletecomp";
	}

	/**
	 * del_flg=1のレコードをdel_flg=0に戻し、検索画面に遷移する
	 *
	 * @param TokyoTakeharaDeleteForm form
	 * @param BindingResult bindingResult
	 * @param Model model
	 * @return 入力エラーがある場合完全削除画面、ない場合検索画面のパス
	 */
	@RequestMapping(value = "deletecomp",params="restore", method = RequestMethod.POST)
	public String restroreWards(@Validated final TokyoTakeharaDeleteForm form,
			final BindingResult bindingResult, final Model model) {
		if (bindingResult.hasFieldErrors()) {

			// 入力エラーがある場合、再検索して自画面に戻る
			TokyoTakeharaSearchForm tokyoTakeharaSearchForm = new TokyoTakeharaSearchForm();
			tokyoTakeharaSearchForm.setIsDelete(CommonConst.DELETE_FLG_ON);
			final List<TokyoMainTakehara> wardsList = tokyoTakeharaService.getListWards(tokyoTakeharaSearchForm);

			// Modelに検索結果を格納する
			model.addAllAttributes(wardsList);
			return "tokyotakehara/deleteCompDisp";
		}

		// del_flgを0に戻す
		tokyoTakeharaService.restoreWardData(form.getOperateIds());
		return "redirect:/tokyotakehara?result=restore";
	}

}
