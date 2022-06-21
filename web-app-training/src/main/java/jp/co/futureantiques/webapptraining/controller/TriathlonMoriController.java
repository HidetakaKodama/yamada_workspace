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
import jp.co.futureantiques.webapptraining.model.form.triathlonMori.TriathlonMoriDeleteForm;
import jp.co.futureantiques.webapptraining.model.form.triathlonMori.TriathlonMoriInputForm;
import jp.co.futureantiques.webapptraining.model.form.triathlonMori.TriathlonMoriSearchForm;
import jp.co.futureantiques.webapptraining.model.triathlonMori.MakerMori;
import jp.co.futureantiques.webapptraining.model.triathlonMori.TriathlonMainMori;
import jp.co.futureantiques.webapptraining.model.triathlonMori.TypeMori;
import jp.co.futureantiques.webapptraining.service.TriathlonMoriService;

/**
 * TriathlonMoriのコントローラークラス
 *
 * @author future
 */
@Controller
@RequestMapping(value = "/triathlonMori")
public class TriathlonMoriController {

	/** 自転車のサービス */
	private final TriathlonMoriService triathlonMoriService;

	/**
	 * コンストラクタ
	 *
	 * @param TriathlonMoriService triathlonMoriService
	 */
	@Autowired
	public TriathlonMoriController(final TriathlonMoriService triathlonMoriService) {
		this.triathlonMoriService = triathlonMoriService;
	}

	/**
	 * タイプエンティティのリストを取得する
	 *
	 * @return TypeMoriEntityのリスト
	 */
	@ModelAttribute
	public List<TypeMori> getListType() {
		return triathlonMoriService.getListType();
	}

	/**
	 * メーカーエンティティのリストを取得する
	 *
	 * @return MakerMoriEntityのリスト
	 */
	@ModelAttribute
	public List<MakerMori> getListMaker() {
		return triathlonMoriService.getListMaker();
	}



	/**
	 * 検索画面に遷移する
	 *
	 * @param TriathlonMoriSearchForm triathlonMoriSearchForm
	 * @return 検索画面のパス
	 */
	@RequestMapping(value = "", method = RequestMethod.GET)
	public String showSearchTriathlon(@ModelAttribute final TriathlonMoriSearchForm triathlonMoriSearchForm) {
		return "triathlonMori/search";
	}

	/**
	 * 検索結果を取得して検索画面に遷移する
	 *
	 * @param TriathlonMoriSearchForm form
	 * @param Model model
	 * @param Pageable pageable
	 * @return 検索画面のパス
	 */
	@RequestMapping(value = "search", method = RequestMethod.POST)
	public String searchTriathlon(final TriathlonMoriSearchForm form, final Model model, final Pageable pageable) {

		// 入力された検索条件を元にレコードを取得する
		final Page<TriathlonMainMori> triathlonList = triathlonMoriService.getPageTriathlon(form, pageable);
		if (triathlonList.getTotalElements() != 0) {

			// 検索結果がある場合、Modelに結果をセットする
			model.addAttribute("page", triathlonList);
			model.addAttribute("triathlonList", triathlonList.getContent());
			model.addAttribute("url", "search");
		}
		return "triathlonMori/search";
	}



	/**
	 * 追加画面に遷移する
	 *
	 * @param TriathlonMoriInputForm triathlonMoriInputForm
	 * @return 追加画面のパス
	 */
	@RequestMapping(value = "insert", method = RequestMethod.GET)
	public String showInsertTriathlon(@ModelAttribute final TriathlonMoriInputForm triathlonMoriInputForm) {
		return "triathlonMori/insert";
	}

	/**
	 * MovieMainテーブルにデータを登録して検索画面に遷移する
	 *
	 * @param TriathlonMoriInputForm form
	 * @param BindingResult bindingResult
	 * @return 入力エラーがある場合追加画面、ない場合検索画面のパス
	 */
	@RequestMapping(value = "insert", method = RequestMethod.POST)
	public String insertTriathlon(@ModelAttribute @Validated final TriathlonMoriInputForm form,
			final BindingResult bindingResult) {
		if (bindingResult.hasFieldErrors()) {

			// 入力エラーがある場合自画面に戻る
			return "triathlonMori/insert";
		}

		// データを登録する
		final TriathlonMainMori triathlonMainMori = triathlonMoriService.insertTriathlon(form);
		return "redirect:/triathlonMori?result=insert&id=" + triathlonMainMori.getId();
	}



	/**
	 * 更新画面に遷移する
	 *
	 * @param long id
	 * @param TriathlonMoriInputForm triathlonMoriInputForm
	 * @return 更新画面のパス
	 */
	@RequestMapping(value = "update", method = RequestMethod.GET)
	public String showUpdateTriathlon(@RequestParam(name = "id") final long id,
			@ModelAttribute final TriathlonMoriInputForm triathlonMoriInputForm) {

		// IDをキーにTriathlonMainMoriテーブルを検索する
		TriathlonMainMori triathlonMainMori = triathlonMoriService.getTriathlon(id);

		// フォームにレコードの値をセットする
		triathlonMoriInputForm.initWithTriathlonMainMori(triathlonMainMori);
		return "triathlonMori/update";
	}

	/**
	 * TriathlonMainMoriテーブルのデータを更新して検索画面に遷移する
	 *
	 * @param TriathlonMoriInputForm form
	 * @param BindingResult bindingResult
	 * @return 入力エラーがある場合更新画面、ない場合検索画面のパス
	 */
	@RequestMapping(value = "update", method = RequestMethod.POST)
	public String updateTriathlon(@Validated final TriathlonMoriInputForm form,
			final BindingResult bindingResult) {
		if (bindingResult.hasFieldErrors()) {

			// 入力エラーがある場合自画面に戻る
			return "triathlonMori/update";
		}

		// データを更新する
		TriathlonMainMori triathlonMainMori = triathlonMoriService.updateTriathlon(form);
		if (triathlonMainMori == null) {

			// 更新が失敗した場合、検索画面にメッセージを表示する
			return "redirect:/triathlonMori?result=updatefailed";
		}
		return "redirect:/triathlonMori?result=update&id=" + triathlonMainMori.getId();
	}

	/**
	 * MovieMainテーブルのレコードを論理削除して検索画面に遷移する
	 *
	 * @param long id
	 * @return 検索画面のパス
	 */
	@RequestMapping(value = "delete", method = RequestMethod.GET)
	public String deleteTriathlon(@RequestParam(name = "id") final long id) {

		// IDをキーにレコードを論理削除する
		triathlonMoriService.deleteTriathlonById(id);
		return "redirect:/triathlonMori?result=delete&id=" + id;
	}

	/**
	 * 完全削除画面に遷移する
	 *
	 * @param TriathlonMoriSearchForm form
	 * @param TriathlonMoriSearchForm triathlonMoriSearchForm
	 * @param Model model
	 * @return 完全削除画面のパス
	 */
	@RequestMapping(value = "deletecomp", method = RequestMethod.GET)
	public String showDeleteCompTriathlon(final TriathlonMoriSearchForm form,
			@ModelAttribute final TriathlonMoriDeleteForm triathlonMoriDeleteForm, final Model model) {

		// TriathlonMainMoriテーブルから削除フラグが1のレコードを検索する
		final List<TriathlonMainMori> triathlonList = triathlonMoriService.getListTriathlon(form);

		// Modelに検索結果を格納する
		model.addAttribute(triathlonList);
		return "triathlonMori/deletecomp";
	}


	/**
	 * TriathlonMainMoriテーブルのデータを完全削除して検索画面に遷移する
	 *
	 * @param TriathlonMoriDeleteForm form
	 * @param BindingResult bindingResult
	 * @param Model model
	 * @return 入力エラーがある場合完全削除画面、ない場合検索画面のパス
	 */
	@RequestMapping(value = "deletecomp", method = RequestMethod.POST)
	public String deleteCompTriathlon(@Validated final TriathlonMoriDeleteForm form,
			final BindingResult bindingResult, final Model model) {
		if (bindingResult.hasFieldErrors()) {

			// 入力エラーがある場合、再検索して自画面に戻る
			TriathlonMoriSearchForm triathlonMoriSearchForm = new TriathlonMoriSearchForm();
			triathlonMoriSearchForm.setIsDelete(CommonConst.DELETE_FLG_ON);
			final List<TriathlonMainMori> triathlonList = triathlonMoriService.getListTriathlon(triathlonMoriSearchForm);

			// Modelに検索結果を格納する
			model.addAttribute(triathlonList);
			return "triathlonMori/deletecomp";
		}

		// データを完全削除する
		triathlonMoriService.deleteTriathlonComp(form.getDeleteIds());
		return "redirect:/triathlonMori?result=deletecomp";
	}
}
