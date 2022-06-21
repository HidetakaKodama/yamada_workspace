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

import jp.co.futureantiques.webapptraining.model.form.penguinKawamura.PenguinDeleteForm;
import jp.co.futureantiques.webapptraining.model.form.penguinKawamura.PenguinInputForm;
import jp.co.futureantiques.webapptraining.model.form.penguinKawamura.PenguinSearchForm;
import jp.co.futureantiques.webapptraining.model.penguinKawamura.AttributeKawamura;
import jp.co.futureantiques.webapptraining.model.penguinKawamura.PenguinMainKawamura;
import jp.co.futureantiques.webapptraining.service.PenguinKawamuraService;

/** PenguinKawamuraコントローラークラス
 * @author Mariko Kawamura
 */
@Controller
@RequestMapping(value = "/penguinKawamura")
public class PenguinKawamuraController {

	/** PenguinKawamura サービスクラス */
	private final PenguinKawamuraService penguinKawamuraService;

	/**
	 * コンストラクタ
	 * @param PenguinKawamuraService penguinKawamuraService
	 */
	@Autowired
	public PenguinKawamuraController(final PenguinKawamuraService penguinKawamuraService) {
		this.penguinKawamuraService = penguinKawamuraService;
	}

	/**
	 * AttributeKawamuraエンティティのリストを取得する
	 * @return AttributeKawamuraエンティティのリスト
	 */
	@ModelAttribute
	public List<AttributeKawamura> getListAttributeKawamura(){
		return penguinKawamuraService.getListAttributeKawamura();
	}

	/**
	 * 検索画面に遷移する
	 * @param PenguinSearchForm form
	 * @return 検索画面のパス
	 */
	@RequestMapping(value = "", method = RequestMethod.GET)
	public String showSearchPenguin(@ModelAttribute final PenguinSearchForm penguinSearchForm) {
		return "penguinKawamura/search";
	}

	/**
	 * 検索結果を取得して検索画面に遷移する
	 * @param PenguinSearchForm form
	 * @param Model model
	 * @param Pageble pageble
	 */
	@RequestMapping(value = "search", method = RequestMethod.POST)
	public String searhPenguin(
			final PenguinSearchForm form, final Model model, final Pageable pageable) {

		//入力された検索条件を基にレコードを取得する
		final Page<PenguinMainKawamura> penguinList = penguinKawamuraService.getPagePenguin(form, pageable);
		if(penguinList.getTotalElements() != 0) {

			//検索結果がある場合、Modelに結果をセットする
			model.addAttribute("page", penguinList);
			model.addAttribute("penguinList", penguinList.getContent());
			model.addAttribute("url", "search");
		}
		return "penguinKawamura/search";
	}

	/**
	 * 追加画面に遷移する
	 * @param PenguinInputFm penguinInputForm
	 * @return 追加画面のパス
	 */
	@RequestMapping(value = "insert", method = RequestMethod.GET)
	public String showInsertPenguin(@ModelAttribute final PenguinInputForm penguinInputForm) {
		return "penguinKawamura/insert";
	}

	//これらはわざわざDIしないといけない
	@Autowired
	ResourceLoader resourceLoader;
	@Autowired
	ServletContext context;
	@Autowired
	WebApplicationContext wac;

	/**
	 * penguin_main_kawamuraテーブルにデータを登録して検索画面に遷移する
	 * @param PenguinInputForm form
	 * @param BindingResult bindingResult
	 * @param Model model
	 * @return 入力エラーがある場合追加画面のパス、ない場合検索画面のパス
	 */
	@RequestMapping(value = "insert", method = RequestMethod.POST)
	public String insetPenguin(
			@ModelAttribute @Validated final PenguinInputForm form,
			final BindingResult bindingResult, Model model) {

		if(bindingResult.hasErrors()) {

			//入力エラーがある場合、戻る
			return "penguinKawamura/insert";
		}

		//データを登録する
		final PenguinMainKawamura penguinMainKawamura = penguinKawamuraService.insertPenguin(form);
		return "redirect:/penguinKawamura?result=insert&id=" + penguinMainKawamura.getId();
	}

	/**
	 * 更新画面に遷移する
	 * @param long id
	 * @param PenguinInputForm penguinInputForm
	 * @return 更新画面のパス
	 */
	@RequestMapping(value = "update", method = RequestMethod.GET)
	public String showUpdatePenguin(
			final PenguinSearchForm form,
			@RequestParam(name = "id") final long id,
			@ModelAttribute final PenguinInputForm penguinInputForm, Model model, final Pageable pageable) {

		//IDをキーにpenguin_main_kawamuraテーブルを検索する
		PenguinMainKawamura penguinMainKawamura = penguinKawamuraService.getPenguin(id);

		//penguin_main_kawamuraテーブルから画像パスを取得する
		String imagePass = penguinMainKawamura.getImage();

		//Modelに画像パスをセットする
		model.addAttribute("imagePass", imagePass);

		//フォームにレコードの値をセットする
		penguinInputForm.initWithPenguinMainKawamura(penguinMainKawamura);
		penguinInputForm.setImageDelFlg("0");
		return "penguinKawamura/update";
	}

	/**
	 * penguin_main_kawamuraテーブルのデータを更新して検索画面に遷移する
	 * @param PenguinInputForm form
	 * @param BindingResult bidingResult
	 * @return 入力エラーがある場合更新画面のパス、ない場合検索画面のパス
	 */
	@RequestMapping(value = "update", method = RequestMethod.POST)
	public String updatePenguin(
			@Validated final PenguinInputForm form,
			final BindingResult bindingResult) {

		//入力エラーがある場合、自画面に戻る
		if(bindingResult.hasErrors()) {
			return "penguinKawamura/update";
		}

		//データを更新する
		PenguinMainKawamura penguinMainKawamura = penguinKawamuraService.updatePenguin(form);
		if(penguinMainKawamura == null) {

			//更新が失敗した場合、検索画面にメッセージを表示する
			return "redirect:/penguinKawamura?result=updatefailed";
		}
		return "redirect:/penguinKawamura?result=update&id=" + penguinMainKawamura.getId();
	}

	/**
	 * penguin_main_kawamuraテーブルのデータを論理削除して検索画面に遷移する
	 * @param long id
	 * @return 検索画面のパス
	 */
	@RequestMapping(value = "delete", method = RequestMethod.GET)
	public String deletePenguin(@RequestParam(name = "id") final long id) {

			//IDをキーにレコードを論理削除する
			penguinKawamuraService.deletePenguinById(id);
			return "redirect:/penguinKawamura?result=delete&id=" + id;
	}

	/**
	 * 完全削除画面に遷移する
	 * @param PenguinSearchForm form
	 * @param PenguinDeleteForm penguinDeleteForm
	 * @param Model model
	 * @return 完全削除画面のパス
	 */
	@RequestMapping(value = "deletecomp", method = RequestMethod.GET)
	public String showDeleteCompPenguin(
			final PenguinSearchForm form,
			@ModelAttribute PenguinDeleteForm penguinDeleteForm, Model model) {

		//penguin_main_kawamuraテーブルから削除フラグが１のデータを検索する
		final List<PenguinMainKawamura> penguinList = penguinKawamuraService.getListPenguin(form);

		//modelに検索結果を格納する
		model.addAttribute(penguinList);
		return "penguinKawamura/deletecomp";
	}

	/**
	 * penguin_main_kawamuraテーブルのデータを完全削除して検索画面に遷移する
	 * @param PenguinDeleteForm form
	 * @param BindingResult bindingResult
	 * @param Model model
	 * @return 入力エラーがある場合完全削除画面、ない場合検索画面のパス
	 */
	@RequestMapping(value = "deletecomp", method = RequestMethod.POST)
	public String deleteCompPenguin(
			@Validated final PenguinDeleteForm form,
			final BindingResult bindingResult, final Model model) {

		if(bindingResult.hasErrors()) {

			//入力エラーがある場合、再検索して自画面に戻る
			PenguinSearchForm penguinSearchForm = new PenguinSearchForm();
			penguinSearchForm.setIsDelete(1);
			final List<PenguinMainKawamura> penguinList = penguinKawamuraService.getListPenguin(penguinSearchForm);

			//modelに検索結果を格納する
			model.addAttribute(penguinList);
			return "penguinKawamura/deletecomp";
		}

		//データを完全削除する
		penguinKawamuraService.deletePenguinComp(form.getDeleteIds());
		return "redirect:/penguinKawamura?result=deletecomp";
	}

}
