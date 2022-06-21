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
import jp.co.futureantiques.webapptraining.model.dogKanno.DogCountryKanno;
import jp.co.futureantiques.webapptraining.model.dogKanno.DogMainKanno;
import jp.co.futureantiques.webapptraining.model.dogKanno.DogSizeKanno;
import jp.co.futureantiques.webapptraining.model.form.dogKanno.DogDeleteForm;
import jp.co.futureantiques.webapptraining.model.form.dogKanno.DogInputForm;
import jp.co.futureantiques.webapptraining.model.form.dogKanno.DogSearchForm;
import jp.co.futureantiques.webapptraining.service.DogKannoService;

/**
 * DogKannoのコントローラークラス
 *
 * @author future
 */
@Controller
@RequestMapping(value = "/dogKanno")
public class DogKannoController {

	/** 犬のサービス */
	private final DogKannoService dogKannoService;

	/**
	 *  コンストラクタ
	 *
	 * @param DogKannoService dogKannoService
	 */
	@Autowired
	public DogKannoController(final DogKannoService dogKannoService) {
		this.dogKannoService = dogKannoService;
	}

	/**
	 * 原産国エンティティのリストを取得する
	 *
	 * @return DogCountryKannoEntityのリスト
	 */
	@ModelAttribute
	public List<DogCountryKanno> getListDogCountryKanno() {
		return dogKannoService.getListDogCountryKanno();
	}

	/**
	 * サイズエンティティリストを取得する
	 *
	 * @return DogSizeKannoEntityのリスト
	 */
	@ModelAttribute
	public List<DogSizeKanno> getListDogSizeKanno() {
		return dogKannoService.getListDogSizeKanno();
	}

	/**
	 * 検索画面に遷移する
	 *
	 * @param DogSearchForm dogSearchForm
	 * @return 検索画面のパス
	 */
	@RequestMapping(value = "", method = RequestMethod.GET)
	public String showSearchDog(@ModelAttribute final DogSearchForm dogSearchForm) {
		return "dogKanno/search";
	}

	/** 検索結果を取得して検索画面に遷移する
	 *
	 * @param DogSearchForm form
	 * @param Model model
	 * @param Pageable pageable
	 * @return 検索画面のパス
	 */
	@RequestMapping(value = "search", method = RequestMethod.POST)
	public String searchDog(@Validated final DogSearchForm form, BindingResult bindingResult, final Model model, final Pageable pageable) {

		// 文字数
		if (bindingResult.hasFieldErrors()) {
			return "dogKanno/search";

		}

		// 入力された検索画面を元にレコードを取得する
		final Page<DogMainKanno> dogList = dogKannoService.getPageDog(form, pageable);
		if (dogList.getTotalElements() != 0) {

			// 検索結果がある場合、Modelに結果をセットする
			model.addAttribute("page", dogList);
			model.addAttribute("dogList", dogList.getContent());
			model.addAttribute("url", "search");
		}
		return "dogKanno/search";
	}

	/**
	 * 追加画面に遷移する
	 *
	 * @param DogInputForm dogInputform
	 * @return 追加画面のパス
	 */
	@RequestMapping(value = "insert", method = RequestMethod.GET)
	public String showInsertDog(@ModelAttribute final DogInputForm dogInputForm) {
		return "dogKanno/insert";
	}

	/**
	 * DogMainKannoテーブルにデータを登録して検索画面に遷移する
	 *
	 * @param DogInputForm form
	 * @param BindingResult bindingResult
	 * @return 入力エラーがある場合追加画面、ない場合検索画面のパス
	 */

	@RequestMapping(value = "insert", method = RequestMethod.POST)
	public String insertDog(@ModelAttribute @Validated final DogInputForm form,
			final BindingResult bindingResult) {
		if (bindingResult.hasFieldErrors()) {

			// 入力エラーがある場合自画面に戻る
			return "dogKanno/insert";

		} else if (form.getImage().getSize() == 0) {

			// 画像登録されていない場合エラー画面へ移動
			return "dogKanno/error";
		}

		// データを登録する
		final DogMainKanno dogMainKanno = dogKannoService.insertDog(form);
		return "redirect:/dogKanno?result=insert&dogId=" + dogMainKanno.getDogId();
	}

	/**
	 *  更新画面に遷移する
	 *
	 * @param long dogId
	 * @param DogInputForm dogInputForm
	 * @return 更新画面のパス
	 */
	@RequestMapping(value = "update", method = RequestMethod.GET)
	public String showUpdateDog(@RequestParam(name = "dogId") final long dogId,
			@ModelAttribute final DogInputForm dogInputForm) {

		// IDをキーにDogMainKannoテーブルを検索する
		DogMainKanno dogMainKanno = dogKannoService.getDog(dogId);

		// フォームにレコードの値をセットする
		dogInputForm.initWithDogMainKanno(dogMainKanno);
		return "dogKanno/update";
	}

	/**
	 * DogMainKannoテーブルのデータを更新して検索画面に遷移する
	 *
	 * @param DogInputForm form
	 * @param BindingResult bindingResult
	 * @return 入力エラーがある場合更新画面、ない場合検索画面のパス
	 */
	@RequestMapping(value = "update", method = RequestMethod.POST)
	public String updateDog(@Validated final DogInputForm form,
			final BindingResult bindingResult) {
		if (bindingResult.hasFieldErrors()) {

			//入力エラーがある場合自画面にもどる
			return "dogKanno/update";

		}

		// データを更新する
		DogMainKanno dogMainKanno = dogKannoService.updateDog(form);
		if (dogMainKanno == null) {

			// 更新が失敗した場合、検索画面にメッセージを表示する
			return "redirect:/dogKanno?result=updatefailed";
		}
		return "redirect:/dogKanno?result=update&dogId=" + dogMainKanno.getDogId();
	}

	/**
	 * DogMainKannoテーブルのレコードを論理削除して検索画面に遷移する
	 *
	 * @param long dogId
	 * @return 検索画面のパス
	 */
	@RequestMapping(value = "delete", method = RequestMethod.GET)
	public String deleteDog(@RequestParam(name = "dogId") final long dogId) {

		// IDをキーにレコードを論理削除する
		dogKannoService.deleteDogById(dogId);
		return "redirect:/dogKanno?result=delete&dogId=" + dogId;
	}

	/**
	 * 完全削除画面に遷移する
	 *
	 * @param DogSearchForm form
	 * @param DogDeleteForm dogDeleteForm
	 * @param Model model
	 * @return 完全削除画面のパス
	 */
	@RequestMapping(value = "deletecomp", method = RequestMethod.GET)
	public String showDeleteCompDog(final DogSearchForm form,
			@ModelAttribute final DogDeleteForm dogDeleteForm, final Model model) {

		// DogMainKannoテーブルから削除フラグが１のレコードを検索する
		final List<DogMainKanno> dogList = dogKannoService.getListDog(form);

		// Modelに検索結果を格納する
		model.addAttribute(dogList); // これはvalue
		return "dogKanno/deletecomp";
	}

	/**
	 * DogMainKannoテーブルのデータを完全削除して検索画面に遷移する
	 *
	 * @param DogDeleteForm form
	 * @param BindingResult bindingResult
	 * @param Model model
	 * @return 入力エラーがある場合完全削除画面、ない場合検索画面のパス
	 */
	@RequestMapping(value = "deletecomp", method = RequestMethod.POST)
	public String deleteCompDog(@Validated final DogDeleteForm form,
			final BindingResult bindingResult, final Model model) {
		if (bindingResult.hasFieldErrors()) {

			// 入力エラーがある場合再検索して自画面に戻る
			DogSearchForm dogSearchForm = new DogSearchForm();
			dogSearchForm.setIsDelete(CommonConst.DELETE_FLG_ON);
			final List<DogMainKanno> dogList = dogKannoService.getListDog(dogSearchForm);

			//Modelに検索結果を格納する
			model.addAttribute(dogList);
			return "dogKanno/deletecomp";
		}

		// データを完全削除する
		dogKannoService.deleteDogComp(form.getDeleteIds());
		return "redirect:/dogKanno?result=deletecomp";
	}
}