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
import jp.co.futureantiques.webapptraining.model.form.resipeishikawa.ResipeIshikawaDeleteForm;
import jp.co.futureantiques.webapptraining.model.form.resipeishikawa.ResipeIshikawaInputForm;
import jp.co.futureantiques.webapptraining.model.form.resipeishikawa.ResipeIshikawaSearchForm;
import jp.co.futureantiques.webapptraining.model.resipeishikawa.GenreIshikawa;
import jp.co.futureantiques.webapptraining.model.resipeishikawa.ResipeMainIshikawa;
import jp.co.futureantiques.webapptraining.model.resipeishikawa.VegetableIshikawa;
import jp.co.futureantiques.webapptraining.service.ResipeIshikawaService;

/**
 * Resipeのコントローラークラス
 *
 * @author t.ishikawa
 */
@Controller
@RequestMapping(value ="/resipeIshikawa")
public class ResipeIshikawaController {

	/**献立のサービス */
	private final ResipeIshikawaService resipeIshikawaService;

	/**コンストラクタ
	 *
	 * @param ResipeIshikawaService resipeIshikawaService
	 */
	@Autowired
	public ResipeIshikawaController(final ResipeIshikawaService resipeIshikawaService) {
		this.resipeIshikawaService = resipeIshikawaService;
	}

	/**
	 * 野菜エンティティのリストを取得する
	 *
	 * @return VegetableEntityのリスト
	 */
	@ModelAttribute
	public List<VegetableIshikawa> getListVegetable(){
		return resipeIshikawaService.getListVegetable();
	}

	/**
	 * ジャンルエンティティのリストを取得する
	 *
	 * @return GenreEntityのリスト
	 */
	@ModelAttribute
	public List<GenreIshikawa> getListGenre(){
		return resipeIshikawaService.getListGenre();
	}

	/**
	 * 検索画面に遷移する
	 *
	 *@param resipeIshikawaSearchForm resipeIshikawaSearchFrom
	 *@param 検索画面のパス
	 */
	@RequestMapping(value = "", method = RequestMethod.GET)
	public String showSearch(@ModelAttribute final ResipeIshikawaSearchForm resipeIshikawaSearchForm) {
		return "resipeishikawa/search";
	}

	/**
	 *検索結果を取得して検索画面に遷移する
	 *
	 *@param ResipeIshikawaSearchForm
	 *@param Model model
	 *@param Pageable pageable
	 *@param 検索画面のパス
	 */
	@RequestMapping(value = "search",method = RequestMethod.POST)
	public String searchResipe(final ResipeIshikawaSearchForm form,final Model model,final Pageable pageable) {

		//入力された検索条件を元にレコードを取得する
		final Page<ResipeMainIshikawa>resipeIshikawaList = resipeIshikawaService.getPageResipe(form, pageable);
		if(resipeIshikawaList.getTotalElements()!= 0) {

			//検索結果がある場合はModelに結果をセットする
			model.addAttribute("page",resipeIshikawaList);
			model.addAttribute("resipeIshikawaList",resipeIshikawaList.getContent());
			model.addAttribute("url","search");
		}
		return  "resipeIshikawa/search";
	}

	/**
	 *
	 * @param ResipeIshikawaInputForm resipeIshikawaInputForm
	 * @return 追加画面のパス
	 */
	@RequestMapping(value = "insert",method = RequestMethod.GET)
	public String showInsertResipe(@ModelAttribute final ResipeIshikawaInputForm resipeIshikawaInputForm) {
		return "resipeIshikawa/insert";
	}

	/**
	 *
	 * @param ResipeIshikawaInputForm form
	 * @param BindingResult bindingResult
	 * @return 入力エラーがある場合追加画面、ない場合は検索画面のパス
	 */
	@RequestMapping(value = "insert",method = RequestMethod.POST)
	public String insertResipe(@ModelAttribute @Validated final ResipeIshikawaInputForm form,
			final BindingResult bindingResult) {
		if(bindingResult.hasFieldErrors()) {

			//入力エラーがある場合自画面に戻る
			return "resipeIshikawa/insert";
		}

		//データを登録する
		final ResipeMainIshikawa resipeMainIshikawa = resipeIshikawaService.insertResipe(form);
		return "redirect:/resipeIshikawa?result=insert&id=" + resipeMainIshikawa.getId();
	}

	/**
	 * 更新画面に遷移する
	 *
	 * @param long id
	 * @param ResipeIshikawaInputForm resipeIshikawaInputForm
	 * @return 更新画面のパス
	 */
	@RequestMapping(value = "update",method = RequestMethod.GET)
	public String showUpdateResipe(@RequestParam(name = "id")final long id,
			@ModelAttribute final ResipeIshikawaInputForm resipeIshikawaInputForm) {

		//IDをキーにResipeMainIshikawaテーブルを検索する
		ResipeMainIshikawa resipeMainIshikawa = resipeIshikawaService.getResipe(id);

		//フォームにレコードの値をセットする
		resipeIshikawaInputForm.initWithResipeMainIshikawa(resipeMainIshikawa);
		return "resipeIshikawa/update";
	}

	/**
	 * ResipeMainIshikawaテーブルのデータを更新して検索画面に遷移する
	 *
	 * @param ResipeIshikawaInputFormform
	 * @param BindingResult bindingResult
	 * @return 入力エラーがある場合更新画面、ない場合検索画面のパス
	 */
	@RequestMapping(value = "update",method = RequestMethod.POST)
	public String updateResipe(@Validated final ResipeIshikawaInputForm form,
			final BindingResult bindingResult) {
		if(bindingResult.hasFieldErrors()) {

			//入力エラーがある場合自画面に戻る
			return "resipeIshikawa/update";
		}

		//データを更新する
		ResipeMainIshikawa resipeMainIshikawa = resipeIshikawaService.updateResipe(form);
		if(resipeMainIshikawa == null) {

			//更新が失敗した場合、検索画面にメッセージを表示をする
			return "redirect:/resipeIshikawa?result=updatefailed";
		}
		return"redirect:/resipeIshikawa?result=update&id=" + resipeMainIshikawa.getId();
	}

	/**ResipeMainIshikawaテーブルのレコードを論理削除して検索画面に遷移する
	 *
	 * @param long id
	 * @return 検索画面のパス
	 */
	@RequestMapping(value = "delete",method = RequestMethod.GET)
	public String deleteResipe(@RequestParam(name="id") final long id){

		//IDをキーにレコードを論理削除する
		resipeIshikawaService.deleteResipeById(id);
		return"redirect:/resipeIshikawa?result=delete&id=" + id;
	}

	/**
	 * 完全削除画面に遷移する
	 *
	 * @param ResipeIshikawaSearchForm form
	 * @param ResipeIshikawaDeleteForm resipeIshikawaDeleteForm
	 * @param Model model
	 * @return 完全削除画面のパス
	 */
	@RequestMapping(value = "deletecomp",method = RequestMethod.GET)
	public String showDeleteCompResipe(final ResipeIshikawaSearchForm form,
			@ModelAttribute final ResipeIshikawaDeleteForm resipeIshikawaDeleteForm,final Model model) {

		//ResipeIshikawaテーブルから削除フラグが1のレコードを検索する
		final List<ResipeMainIshikawa> resipeList = resipeIshikawaService.getListResipe(form);

		//Modelに検索結果を格納する
		model.addAttribute(resipeList);
		return "resipeIshikawa/deletecomp";
	}

	/**
	 * ResipeMainIshikawaテーブルのデータを完全削除して検索画面に遷移する
	 *
	 * @param ResipeIshikawaDeleteForm form
	 * @param BindingResult bindingResult
	 * @param Model model
	 * @return 入力エラーがある場合完全削除画面、ない場合検索画面のパス
	 */

	@RequestMapping(value = "deletecomp",method = RequestMethod.POST)
	public String deleteCompResipe(@Validated final ResipeIshikawaDeleteForm form,
			final BindingResult bindingResult,final Model model) {
		if(bindingResult.hasFieldErrors()) {

			//入力エラーがある場合、再検索して自画面に戻る
			ResipeIshikawaSearchForm resipeIshikawaSearchForm = new ResipeIshikawaSearchForm();
			resipeIshikawaSearchForm.setIsDelete(CommonConst.DELETE_FLG_ON);
			final List<ResipeMainIshikawa> resipeList = resipeIshikawaService.getListResipe(resipeIshikawaSearchForm);

			//Modelに検索結果を格納する
			model.addAttribute(resipeList);
			return "resipeIshikawa/deletecomp";
		}

		//データを完全削除する
		resipeIshikawaService.deleteResipeComp(form.getDeleteIds());
		return "redirect:/resipeIshikawa?result=deletecomp";
	}
}