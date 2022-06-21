package jp.co.futureantiques.webapptraining.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.web.PageableDefault;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import jp.co.futureantiques.webapptraining.constant.CommonConst;
import jp.co.futureantiques.webapptraining.model.animeWatanabe.AnimeMainWatanabe;
import jp.co.futureantiques.webapptraining.model.animeWatanabe.CompanyWatanabe;
import jp.co.futureantiques.webapptraining.model.animeWatanabe.OriginalWatanabe;
import jp.co.futureantiques.webapptraining.model.form.animeWatanabe.AnimeDeleteForm;
import jp.co.futureantiques.webapptraining.model.form.animeWatanabe.AnimeInputForm;
import jp.co.futureantiques.webapptraining.model.form.animeWatanabe.AnimeSearchForm;
import jp.co.futureantiques.webapptraining.service.AnimeWatanabeService;

/**
 * AnimeWatanabeのコントローラークラス
 *
 * @author Watanabe
 */
@Controller
@RequestMapping(value = "/animeWatanabe")
public class AnimeWatanabeController {

	/** アニメのサービス**/
	private final AnimeWatanabeService animeWatanabeService;

	/**
	 * コンストラクタ
	 *
	 * @param AnimeWatanabeService animeWatanabeService
	 */
	@Autowired
	public AnimeWatanabeController(final AnimeWatanabeService animeWatanabeService) {
		this.animeWatanabeService = animeWatanabeService;
	}

	/**
	 * アニメ制作会社エンティティのリストを取得する
	 *
	 * @return CompanyWatanabeのリスト
	 */
	@ModelAttribute
	public List<CompanyWatanabe> getListCompanyWatanabe() {
		return animeWatanabeService.getListCompanyWatanabe();
	}

	/**
	 * 原作エンティティのリストを取得する
	 *
	 * @return OriginalEntitiyのリスト
	 */
	@ModelAttribute
	public List<OriginalWatanabe> getListOriginalWatanabe() {
		return animeWatanabeService.getListOriginalWatanabe();
	}

	/**
	 * 検索画面に遷移する
	 *
	 * @param AnimeSearchForm animeSearchForm
	 * @return 検索画面のパス
	 */
	@RequestMapping(value = "", method = RequestMethod.GET)
	public String showSearchAnime(@ModelAttribute final AnimeSearchForm animeSearchFrom) {
		return "animeWatanabe/search";
	}

	/**
	 * 検索結果を取得して検索画面に遷移する
	 *
	 * @param AnimeSearchFrom form
	 * @param Model model
	 * @param Pageable Pageable
	 * @return 検索画面のパス
	 */
	@RequestMapping(value = "search", method = RequestMethod.POST)
	public String searchAnime(final AnimeSearchForm form, final Model model,
			final @PageableDefault(page = 0, value = 10) Pageable pageable) {

		//入力された検索条件を元にレコードを取得する
		final Page<AnimeMainWatanabe> animeList = animeWatanabeService.getPageAnimeWatanabe(form, pageable);
		if (animeList.getTotalElements() != 0) {

			//検索結果がある場合、Modelに結果をセットする
			model.addAttribute("page", animeList);
			model.addAttribute("animeList", animeList.getContent());
			model.addAttribute("url", "search");
		}
		return "animeWatanabe/search";
	}

	/**
	 * 追加画面に遷移する
	 *
	 * @param AnimeInputForm animeInputform
	 * @return 追加画面のパス
	 */
	@RequestMapping(value = "insert", method = RequestMethod.GET)
	public String showInsertAnime(@ModelAttribute final AnimeInputForm animeInputForm) {
		return "animeWatanabe/insert";
	}

	/**
	 * AnimeMainWatanabeテーブルにデータを登録して検索画面に遷移する
	 *
	 * @param AnimeInputForm form
	 * @param BindingResult bindingResult
	 * @return 入力エラーがある場合追加画面、ない場合検索画面のパス
	 */
	@RequestMapping(value = "insert", method = RequestMethod.POST)
	public String insertAnime(@ModelAttribute @Validated final AnimeInputForm form,
			final BindingResult bindingResult) {
		if (bindingResult.hasFieldErrors()) {

			// 入力エラーがある場合自画面に戻る
			return "animeWatanabe/insert";
			}

		// データを登録する
		final AnimeMainWatanabe animeMainWatanabe = animeWatanabeService.insertAnime(form);
		return "redirect:/animeWatanabe?result=insert&id=" + animeMainWatanabe.getId();
	}

	/**
	 * 更新画面に遷移する
	 *
	 * @param long id
	 * @param AnimeInputForm animeInputForm
	 * @return 更新画面のパス
	 */
	@RequestMapping(value = "update", method = RequestMethod.GET)
	public String showUpdateAnime(@RequestParam(name = "id") final long id,
			@ModelAttribute final AnimeInputForm animeInputForm) {

		//IDをキーにAnimeMainテーブルを検索
		AnimeMainWatanabe animeMainWatanabe = animeWatanabeService.getAnimeWatanabe(id);

		//フォームにレコードの値をセットする
		animeInputForm.initWithAnimeMainWatanabe(animeMainWatanabe);
		return "animeWatanabe/update";
	}

	/**
	 * AnimeMainWatanabeテーブルのデータを更新して検索画面に遷移する
	 *
	 * @param AnimeInputForm form
	 * @param BindingResult bindingResult
	 * @return 入力エラーがある場合更新画面、ない場合は検索画面のパス
	 */
	@RequestMapping(value = "update", method = RequestMethod.POST)
	public String updateAnimeWatanabe(@Validated final AnimeInputForm form,
			final BindingResult bindingResult) {
		if (bindingResult.hasErrors()) {

			//入力エラーがある場合自画面に遷移
			return "animeWatanabe/update";
		}

		//データを更新する
		AnimeMainWatanabe animeMainWatanabe = animeWatanabeService.updateAnime(form);
		if (animeMainWatanabe == null) {

			//	更新失敗で、検索画面にてメッセージ表示
			return "redirect:/animeWatanabe?result=updatefailed";
		}
		return "redirect:/animeWatanabe?result=update&id=" + animeMainWatanabe.getId();
	}

	/**
	 * AnimeMainWatanabeテーブルのレコードを論理削除し検索画面に遷移
	 *
	 * @param long id
	 * @return 検索画面のパス
	 */
	@RequestMapping(value = "delete", method = RequestMethod.GET)
	public String deleteAnime(@RequestParam(name = "id") final long id) {
		animeWatanabeService.deleteAnimeById(id);
		return "redirect:/animeWatanabe?result=delete&id=" + id;
	}

	/**
	 * 物理削除画面に遷移
	 *
	 * @param AnimeSearchForm form
	 * @param AnimeDeleteForm animeDeleteForm
	 * @param Model model
	 * @return 物理削除画面のパス
	 */
	@RequestMapping(value = "deletecomp", method = RequestMethod.GET)
	public String showDeleteCompAnime(final AnimeSearchForm form,
			@ModelAttribute final AnimeDeleteForm animeDeleteForm, final Model model) {

		//AnimeMainWatanabeテーブルから削除フラグが1のレコードを検索する
		final List<AnimeMainWatanabe> animeList = animeWatanabeService.getListAnimeWatanabe(form);

		//Modelに検索結果を格納
		model.addAttribute(animeList);
		return "animeWatanabe/deletecomp";
	}

	/**
	 * AnimeMainWatanabeテーブルのデータを完全削除して検索画面に遷移
	 *
	 * @param AnimeDeleteForm form
	 * @param BindingResult bindingResult
	 * @param Model model
	 * @return 入力エラーがある場合、完全削除画面、ない場合、検索画面のパス
	 */
	@RequestMapping(value = "deletecomp", method = RequestMethod.POST)
	public String deleteCompAnime(@Validated final AnimeDeleteForm form,
			final BindingResult bindingResult, final Model model) {
		if (bindingResult.hasErrors()) {

			//入力値エラーの場合、再検索して自画面遷移
			AnimeSearchForm animeSearchForm = new AnimeSearchForm();
			animeSearchForm.setIsDelete(CommonConst.DELETE_FLG_ON);
			final List<AnimeMainWatanabe> animeList = animeWatanabeService.getListAnimeWatanabe(animeSearchForm);

			//Modelに検索結果を格納
			model.addAttribute(animeList);
			return "animeWatanabe/deletecomp";
		}

		//データを完全削除する
		animeWatanabeService.deleteAnimeComp(form.getDeleteIds());
		return "redirect:/animeWatanabe?result=deletecomp";
	}

}
