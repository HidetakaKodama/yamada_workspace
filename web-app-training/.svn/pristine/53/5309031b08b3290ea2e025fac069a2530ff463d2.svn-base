package jp.co.futureantiques.webapptraining.controller;

import java.util.List;

import javax.servlet.ServletContext;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.io.ResourceLoader;
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
import org.springframework.web.context.WebApplicationContext;

import jp.co.futureantiques.webapptraining.constant.CommonConst;
import jp.co.futureantiques.webapptraining.model.drinkYoshimoto.DrinkCategoryYoshimoto;
import jp.co.futureantiques.webapptraining.model.drinkYoshimoto.DrinkMainYoshimoto;
import jp.co.futureantiques.webapptraining.model.drinkYoshimoto.DrinkMakerYoshimoto;
import jp.co.futureantiques.webapptraining.model.form.drinkYoshimoto.DrinkYoshimotoDeleteForm;
import jp.co.futureantiques.webapptraining.model.form.drinkYoshimoto.DrinkYoshimotoInputForm;
import jp.co.futureantiques.webapptraining.model.form.drinkYoshimoto.DrinkYoshimotoSearchForm;
import jp.co.futureantiques.webapptraining.service.DrinkYoshimotoService;

/**
 * Drinkのコントロールクラス
 *
 * @author Yoshimoto
 *
 */
@Controller
@RequestMapping(value = "/drinkYoshimoto")
public class DrinkYoshimotoController {

	/** 飲み物のサービス */
	private final DrinkYoshimotoService drinkYoshimotoService;

	/**
	 * コンストラクタ
	 *
	 * @param DrinkYoshimotoService drinkYoshimotoService
	 */
	@Autowired
	public DrinkYoshimotoController(final DrinkYoshimotoService drinkYoshimotoService) {
		this.drinkYoshimotoService = drinkYoshimotoService;
	}

	/**
	 * カテゴリーのエンティティリストを取得する
	 *
	 * @return DrinkCategoryYoshimotoEntityのリスト
	 */
	@ModelAttribute
	public List<DrinkCategoryYoshimoto> getListDrinkCategoryYoshimoto() {
		return drinkYoshimotoService.getListDrinkCategoryYoshimoto();
	}

	/**
	 * メーカーのエンティティリストを取得する
	 *
	 * @return DrinkMakerYoshimotoEntityのリスト
	 */
	@ModelAttribute
	public List<DrinkMakerYoshimoto> getListDrinkMakerYoshimoto() {
		return drinkYoshimotoService.getListDrinkMakerYoshimoto();
	}

	/**
	 * 検索画面に遷移する
	 *
	 * @param DrinkYoshimotoSearchForm drinkYoshimotoSearchForm
	 * @return 検索画面のパス
	 */
	@RequestMapping(value = "", method = RequestMethod.GET)
	public String showSearchDrinkYoshimoto(@ModelAttribute final DrinkYoshimotoSearchForm drinkYoshimotoSearchForm) {
		return "drinkYoshimoto/search";
	}

	/**
	 * 検索結果を取得して検索画面に遷移する
	 *
	 * @param DrinkYoshimotoSearchFrom from
	 * @param Model model
	 * @param Pageable pageable
	 * @param BindingResult bindingResult
	 * @return 検索画面のパス
	 */
	@RequestMapping(value = "search", method = RequestMethod.POST)
	public String searchDrink(@Validated final DrinkYoshimotoSearchForm form, BindingResult bindingResult,
			final Model model, final Pageable pageable) {

		//文字数がオーバーした時
		if (bindingResult.hasFieldErrors()) {
			return "drinkYoshimoto/search";
		}

		//入力された検索条件をもとにレコードを取得する
		final Page<DrinkMainYoshimoto> drinkYoshimotoList = drinkYoshimotoService.getPageDrinkMain(form, pageable);
		if (drinkYoshimotoList.getTotalElements() != 0) {

			//検索結果があればModelに結果をセットする
			model.addAttribute("page", drinkYoshimotoList);
			model.addAttribute("drinkYoshimotoList", drinkYoshimotoList.getContent());
			model.addAttribute("url", "search");
		}
		return "drinkYoshimoto/search";
	}

	/**
	 * 新規画面に遷移する
	 *
	 * @param DrinkYoshimotoInputForm drinkYoshimotoInputForm
	 * @return 新規画面のパス
	 */
	@RequestMapping(value = "insert", method = RequestMethod.GET)
	public String showInsertDrink(@ModelAttribute final DrinkYoshimotoInputForm drinkYoshimotoInputForm) {
		return "drinkYoshimoto/insert";
	}

	//手動でDIする
	@Autowired
	ResourceLoader resourceLoader;
	@Autowired
	ServletContext context;
	@Autowired
	WebApplicationContext wac;

	/**
	 * DrinkMainYoshimotoテーブルにデータを登録して検索画面に遷移する
	 *
	 * @param DrinkYoshimotoInputForm form
	 * @param BindingResult bindingResult
	 * @param Model model
	 * @return 入力エラーがある場合追加画面、ない場合検索画面のパス
	 */
	@RequestMapping(value = "insert", method = RequestMethod.POST)
	public String insertDrink(@ModelAttribute @Validated final DrinkYoshimotoInputForm form,
			final BindingResult bindingResult, Model model) {
		if (bindingResult.hasFieldErrors()) {

			//エラーがある場合自画面に戻る
			return "drinkYoshimoto/insert";
		}

		//データを登録する
		final DrinkMainYoshimoto drinkMainYoshimoto = drinkYoshimotoService.insertDrink(form);
		return "redirect:/drinkYoshimoto?result=insert&id=" + drinkMainYoshimoto.getDrinkId();
	}

	/**
	 * 更新画面に遷移する
	 *
	 * @param long id
	 * @param DrinkYoshimotoInputForm drinkYoshimotoInputForm
	 * @param Model model
	 * @param Pageable pageable
	 * @return 更新画面のパス
	 */
	@RequestMapping(value = "update", method = RequestMethod.GET)
	public String showUpdateDrink(@RequestParam(name = "id") final long id,
			@ModelAttribute final DrinkYoshimotoInputForm drinkYoshimotoInputForm, Model model,
			final Pageable pageable) {

		//IDをキーにDrinkMainYoshimotoテーブルを検索
		DrinkMainYoshimoto drinkMainYoshimoto = drinkYoshimotoService.getDrink(id);

		//drink_main_yoshimotoテーブルから画像のパスを取得する
		String imagePass = drinkMainYoshimoto.getImage();

		//modelに画像のパスをセットする
		model.addAttribute("imagePass", imagePass);

		//フォームにレコードの値をセットする
		drinkYoshimotoInputForm.initWithDrinkMainYoshimoto(drinkMainYoshimoto);
		drinkYoshimotoInputForm.setImageDelFlg("0");
		return "drinkYoshimoto/update";

	}

	/**
	 * DrinkMainYoshimotoテーブルのデータを更新して検索画面に遷移する
	 *
	 * @param DrinkYoshimotoInputForm form
	 * @param BindingResult bindingResult
	 * @return 入力エラーがある場合更新画面、ない場合は検索画面のパス
	 */
	@RequestMapping(value = "update", method = RequestMethod.POST)
	public String updateDrink(@Validated final DrinkYoshimotoInputForm form, final BindingResult bindingResult) {
		if (bindingResult.hasFieldErrors()) {

			//入力エラーがある場合、自画面に戻る
			return "drinkYoshimoto/update";
		}

		//データを更新する
		DrinkMainYoshimoto drinkMainYoshimoto = drinkYoshimotoService.updateDrink(form);
		if (drinkMainYoshimoto == null) {

			//更新が失敗した場合検索画面にメッセージを表示
			return "redirect:/drinkYoshimoto?result=updatefailed";
		}

		//delfg
		DrinkMainYoshimoto drinkMainYoshimotoGetDrink = drinkYoshimotoService.getDrink(form.getDrinkId());
		if (Integer.parseInt(drinkMainYoshimotoGetDrink.getDelFlg()) == 1) {
			return "redirect:/drinkYoshimoto?result=updatedel";
		}
		return "redirect:/drinkYoshimoto?result=update&id=" + drinkMainYoshimoto.getDrinkId();
	}

	/**
	 * DrinkMainYoshimotoテーブルのレコードを論理削除して検索画面に遷移する
	 *
	 * @param long id
	 * @return 検索画面のパス
	 */
	@RequestMapping(value = "delete", method = RequestMethod.GET)
	public String deleteDrink(@RequestParam(name = "id") final long id) {

		//IDをキーにレコードを論理削除する
		drinkYoshimotoService.deleteDrinkById(id);
		return "redirect:/drinkYoshimoto?result=delete&id=" + id;
	}

	/**
	 * 完全削除画面に遷移
	 *
	 * @param DrinkYoshimotoSearchForm form
	 * @param DrinkYoshimotoDeleteForm drinkYoshimotoDeleteForm
	 * @param Model model
	 * @return 完全削除画面のパス
	 */
	@RequestMapping(value = "deletecomp", method = RequestMethod.GET)
	public String showDeleteCompDrink(final DrinkYoshimotoSearchForm form,
			@ModelAttribute final DrinkYoshimotoDeleteForm drinkYoshimotoDeleteForm, final Model model) {

		//DrinkMainYoshimotoテーブルから削除フラグが1のレコードを検索する
		final List<DrinkMainYoshimoto> drinkList = drinkYoshimotoService.getListDrinkMainYoshimoto(form);

		//Modelに検索結果を格納する
		model.addAttribute(drinkList);
		return "drinkYoshimoto/deletecomp";
	}

	/**
	 * DinkMainYoshimotoテーブルのデータを完全削除して検索画面に遷移する
	 *
	 * @param DrinkYoshimotoDeleteForm form
	 * @param BindingResult bindingResult
	 * @param Model model
	 * @return 入力エラーがある場合完全削除画面、ない場合検索画面のパス
	 */
	@RequestMapping(value = "deletecomp", method = RequestMethod.POST)
	public String deleteCompDrink(@Validated final DrinkYoshimotoDeleteForm form, final BindingResult bindingResult,
			final Model model) {
		if (bindingResult.hasFieldErrors()) {

			//入力エラーがある場合、再検索して自画面に戻る
			DrinkYoshimotoSearchForm drinkYoshimotoSearchForm = new DrinkYoshimotoSearchForm();
			drinkYoshimotoSearchForm.setIsDelete(CommonConst.DELETE_FLG_ON);
			final List<DrinkMainYoshimoto> drinkMainYoshimotoList = drinkYoshimotoService
					.getListDrinkMainYoshimoto(drinkYoshimotoSearchForm);

			//Modelに検索結果を格納する
			model.addAttribute(drinkMainYoshimotoList);
			return "drinkYoshimoto/deletecomp";
		}

		//データを完全削除する
		drinkYoshimotoService.deleteDrinkComp(form.getDeleteIds());
		return "redirect:/drinkYoshimoto?result=deletecomp";
	}
}
