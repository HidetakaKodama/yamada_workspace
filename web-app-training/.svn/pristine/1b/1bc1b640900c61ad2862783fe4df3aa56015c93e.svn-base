package jp.co.futureantiques.webapptraining.controller;

import java.util.List;

import javax.servlet.http.HttpSession;

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
import jp.co.futureantiques.webapptraining.model.form.perfumeAnzai.PerfumeAnzaiDeleteForm;
import jp.co.futureantiques.webapptraining.model.form.perfumeAnzai.PerfumeAnzaiInputForm;
import jp.co.futureantiques.webapptraining.model.form.perfumeAnzai.PerfumeAnzaiSearchForm;
import jp.co.futureantiques.webapptraining.model.perfumeAnzai.AlbumAnzai;
import jp.co.futureantiques.webapptraining.model.perfumeAnzai.PerfumeMainAnzai;
import jp.co.futureantiques.webapptraining.model.perfumeAnzai.TieupAnzai;
import jp.co.futureantiques.webapptraining.service.PerfumeAnzaiService;

/**
 * PerfumeAnzaiのコントローラークラス
 * @author anzai
 *
 */
@Controller
@RequestMapping(value = "/perfumeanzai")
public class PerfumeAnzaiController {

	 @Autowired
	  HttpSession session;

	/** Perfumeのサービス**/
	private final PerfumeAnzaiService perfumeAnzaiService;

	/**
	 * コンストラクタ
	 * @param PerfumeAnzaiService perfumeAnzaiService
	 */
	@Autowired
	public PerfumeAnzaiController(final PerfumeAnzaiService perfumeAnzaiService) {
		this.perfumeAnzaiService = perfumeAnzaiService;
	}

	/**
	 * アルバムエンティティのリストを取得する
	 *
	 * @return AlbumEntitiyのリスト
	 
	 */
	@ModelAttribute
	public List<AlbumAnzai> getListAlbumAnzai() {
		return perfumeAnzaiService.getListAlbumAnzai();
	}

	/**
	 * タイアップエンティティのリストを取得する
	 *
	 * @return AlbumEntitiyのリスト
	 */
	@ModelAttribute
	public List<TieupAnzai> getListTieupAnzai() {
		return perfumeAnzaiService.getListTieupAnzai();
	}

	/**
	 * 検索画面に遷移する
	 *
	 * @param PerfumeAnzaiSearchForm perfumeAnzaiSearchForm
	 * @return 検索画面のパス
	 */
	@RequestMapping(value = "", method = RequestMethod.GET)
	public String showSeachPerfumeAnzai(@ModelAttribute final PerfumeAnzaiSearchForm perfumeAnzaiSearchFrom) {
		session.setAttribute("user","新規");
		return "perfumeanzai/search";
	}

	/**
	 * 検索結果を取得して検索画面に遷移する
	 *
	 * @param PerfumeAnzaiSearchFrom form
	 * @param Model model
	 * @param Pageable Pageable
	 * @return 検索画面のパス
	 */
	@RequestMapping(value = "search", method = RequestMethod.POST)
	public String seachPerfumeAnzai(final PerfumeAnzaiSearchForm form, final Model model,
				final  @PageableDefault(page = 0, value = 10 )Pageable pageable) {

		//入力された検索条件を元にレコードを取得する
		final Page<PerfumeMainAnzai> perfumeList = perfumeAnzaiService.getPagePerfumeAnzai(form, pageable);
		if (perfumeList.getTotalElements() != 0) {

			//検索結果がある場合、Modelに結果をセットする
			model.addAttribute("page", perfumeList);
			model.addAttribute("perfumeList", perfumeList.getContent());
			model.addAttribute("url", "search");
		}
		return "perfumeanzai/search";
	}

	/**
	 * 追加画面に遷移する
	 *
	 * @param PerfumeAnzaiInputForm perfumeAnzaiInputForm
	 * @return 追加画面のパス
	 */
	@RequestMapping(value = "insert", method = RequestMethod.GET)
	public String showInsertPerfumeAnzai(@ModelAttribute final PerfumeAnzaiInputForm perfumeAnzaiInputForm) {
		return "perfumeanzai/insert";
	}

	/**
	 * YuguohMainOkugawaテーブルにデータを登録して検索画面に遷移する
	 *
	 * @param PerfumeAnzaiInputForm form
	 * @param BindingResult bindingResult
	 * @return 入力エラーがある場合追加画面、ない場合検索画面のパス
	 */
	@RequestMapping(value = "insert", method = RequestMethod.POST)
	public String inserPerfumeAnzai(@ModelAttribute @Validated final PerfumeAnzaiInputForm form,
			final BindingResult bindingResult) {
		if (bindingResult.hasFieldErrors()) {

			//入力値エラーなら、自画面遷移
			return "perfumeanzai/insert";
		}

		//データを登録する
		final PerfumeMainAnzai perfumeMainAnzai = perfumeAnzaiService.insertPerfumeAnzai(form);
		return "redirect:/perfumeanzai?result=insert&id=" + perfumeMainAnzai.getId();
	}

	/**
	 * 更新画面に遷移する
	 *
	 * @param long id
	 * @param PerfumeAnzaiInputForm perfumeAnzaiInputForm
	 * @return 更新画面のパス
	 */
	@RequestMapping(value = "update", method = RequestMethod.GET)
	public String showUpdatePerfumeAnzai(@RequestParam(name = "id") final long id,
			@ModelAttribute final PerfumeAnzaiInputForm perfumeAnzaiInputForm) {

		//IDをキーにPerfumeMainテーブルを検索
		PerfumeMainAnzai perfumeMainAnzai = perfumeAnzaiService.getPerfumeAnzai(id);

		//フォームにレコードの値をセットする
		perfumeAnzaiInputForm.iniWithperfumeManinAnzia(perfumeMainAnzai);
		return "perfumeanzai/update";
	}

	/**
	 * PerfumeMainテーブルのデータを更新して検索画面に遷移する
	 *
	 * @param PerfumeAnzaiInputForm form
	 * @param BindingResult bindingResult
	 * @return 入力エラーがある場合更新画面、ない場合は検索画面のパス
	 */
	@RequestMapping(value = "update", method = RequestMethod.POST)
	public String updatePerfumeAnzai(@Validated final PerfumeAnzaiInputForm form,
			final BindingResult bindingResult) {
		if (bindingResult.hasErrors()) {

			//入力エラーがある場合自画面に遷移
			return "perfumeanzai/update";
		}

		//データを更新する
		PerfumeMainAnzai perfumeMainAnzai = perfumeAnzaiService.updatePerfumeAnzai(form);
		if (perfumeMainAnzai == null) {
			//	更新失敗で、検索画面にてメッセージ表示
			return "redirect:/perfumeanzai?result=updatefailed";
		}
		return "redirect:/perfumeanzai?result=update&id=" + perfumeMainAnzai.getId();
	}

	/**
	 * PerfumeMainAnzaiテーブルのレコードを論理削除し検索画面に遷移
	 * @param long id
	 * @return 検索画面のぱす
	 */
	@RequestMapping(value = "delete", method = RequestMethod.GET)
	public String deletePerfumeAnzai(@RequestParam(name = "id") final long id) {
		perfumeAnzaiService.deletePerfumeAnzaiById(id);
		return "redirect:/perfumeanzai?result=delete&id=" + id;
	}

	/**
	 * 物理削除画面に遷移
	 *
	 * @param PerfumeAnzaiSearchForm form
	 * @param PerfumeAnzaiDeleteForm perfumeAnzaiDeleteForm
	 * @param Model model
	 * @return 物理削除画面のパス
	 */
	@RequestMapping(value = "deletecomp", method = RequestMethod.GET)
	public String showDeleteCompPerfumeAnzai(final PerfumeAnzaiSearchForm form,
			@ModelAttribute final PerfumeAnzaiDeleteForm perfumeAnzaiDeleteForm, final Model model) {

		//PerfumeMainテーブルから削除フラグが1のレコードを検索する
		final List<PerfumeMainAnzai> perfumeList = perfumeAnzaiService.getListPerfumeAnzai(form);

		//Modelに検索結果を格納
		model.addAttribute(perfumeList);
		return "perfumeanzai/deletecomp";
	}

	/**
	 * Perfumeテーブルのデータを完全削除して検索画面に遷移
	 *
	 * @param PerfumeAnzaiDeleteForm form
	 * @param BindingResult bindingResult
	 * @param Model model
	 * @return 入力エラーがある場合、完全削除画面、ない場合、検索画面のぱす
	 */
	@RequestMapping(value = "deletecomp", method = RequestMethod.POST)
	public String deleteCompPerfumeAnzai(@Validated final PerfumeAnzaiDeleteForm form,
			final BindingResult bindingResult, final Model model) {
		if (bindingResult.hasErrors()) {

			//入力値エラーの場合、再検索して自画面遷移
			PerfumeAnzaiSearchForm perfumeAnzaiSearchForm = new PerfumeAnzaiSearchForm();
			perfumeAnzaiSearchForm.setIsDelete(CommonConst.DELETE_FLG_ON);
			final List<PerfumeMainAnzai> perfumeList = perfumeAnzaiService.getListPerfumeAnzai(perfumeAnzaiSearchForm);

			//Modelに検索結果を格納
			model.addAttribute(perfumeList);
			return "perfumeanzai/deletecomp";
		}
		//データを完全削除する
		perfumeAnzaiService.deletePerfumeAnzaiComp(form.getDeleteIds());
		return "redirect:/perfumeanzai?result=deletecomp";
	}
}
