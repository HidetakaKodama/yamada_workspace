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
import jp.co.futureantiques.webapptraining.model.form.vtuberUmehara.VtuberUmeharaDeleteForm;
import jp.co.futureantiques.webapptraining.model.form.vtuberUmehara.VtuberUmeharaInputForm;
import jp.co.futureantiques.webapptraining.model.form.vtuberUmehara.VtuberUmeharaSearchForm;
import jp.co.futureantiques.webapptraining.model.vtuberUmehara.CompanyUmehara;
import jp.co.futureantiques.webapptraining.model.vtuberUmehara.ContentsUmehara;
import jp.co.futureantiques.webapptraining.model.vtuberUmehara.FormsUmehara;
import jp.co.futureantiques.webapptraining.model.vtuberUmehara.VtuberMainUmehara;
import jp.co.futureantiques.webapptraining.service.VtuberUmeharaService;

/**
 * VtuberUmeharaのコントローラークラス
 *
 * @author future
 */
@Controller
@RequestMapping(value = "/vtuberUmehara")
public class VtuberUmeharaController {

	/** Vtuberのサービス */
	private final VtuberUmeharaService vtuberUmeharaService;

	/**
	 * コンストラクタ
	 *
	 * @param VtuberUmeharaService vtuberUmeharaService
	 */
	@Autowired
	public VtuberUmeharaController(final VtuberUmeharaService vtuberUmeharaService) {
		this.vtuberUmeharaService = vtuberUmeharaService;
	}

	/**
	 * 会社エンティティのリストを取得する
	 *
	 * @return CompanyEntityのリスト
	 */
	@ModelAttribute
	public List<CompanyUmehara> getListCompanyUmehara() {
		return vtuberUmeharaService.getListCompanyUmehara();
	}

	/**
	 * 動画形態エンティティのリストを取得する
	 *
	 * @return FormsEntityのリスト
	 */
	@ModelAttribute
	public List<FormsUmehara> getListFormsUmehara() {
		return vtuberUmeharaService.getListFormsUmehara();
	}

	/**
	 * 動画内容エンティティのリストを取得する
	 *
	 * @return ContentsEntityのリスト
	 */
	@ModelAttribute
	public List<ContentsUmehara> getListContentsUmehara() {
		return vtuberUmeharaService.getListContentsUmehara();
	}

	/**
	 * 検索画面に遷移する
	 *
	 * @param VtuberUmeharaSearchForm
	 * @return 検索画面のパス
	 */
	@RequestMapping(value = "", method = RequestMethod.GET)
	public String showSearchVtuber(@ModelAttribute final VtuberUmeharaSearchForm VtuberUmeharaSearchForm) {
		return "vtuberUmehara/search";
	}

	/**
	 * 検索結果を取得して検索画面に遷移する
	 *
	 * @param VtuberUmeharaSearchForm form
	 * @param Model model
	 * @param Pageable pageable
	 * @return 検索画面のパス
	 */
	@RequestMapping(value = "search", method = RequestMethod.POST)
	public String searchVtuber(final VtuberUmeharaSearchForm form, final Model model, final Pageable pageable) {

		// 入力された検索条件を元にレコードを取得する
		final Page<VtuberMainUmehara> vtuberUmeharaList = vtuberUmeharaService.getPageVtuberUmehara(form, pageable);
		if (vtuberUmeharaList.getTotalElements() != 0) {

			// 検索結果がある場合、Modelに結果をセットする
			model.addAttribute("page", vtuberUmeharaList);
			model.addAttribute("vtuberUmeharaList", vtuberUmeharaList.getContent());
			model.addAttribute("url", "search");

		}
		return "vtuberUmehara/search";
	}

	/**
	 * 追加画面に遷移する
	 *
	 * @param VtuberUmeharaInputForm vtuberUmeharaInputForm
	 * @return 追加画面のパス
	 */
	@RequestMapping(value = "insert", method = RequestMethod.GET)
	public String showInsertVtuberUmehara(@ModelAttribute final VtuberUmeharaInputForm vtuberUmeharaInputForm) {
		return "vtuberUmehara/insert";
	}

	//これらはわざわざDIしないといけない
	@Autowired
	ResourceLoader resourceLoader;
	@Autowired
	ServletContext context;
	@Autowired
	WebApplicationContext wac;

	/**
	 * VtuberUmeharaMainテーブルにデータを登録して検索画面に遷移する
	 *
	 * @param VtuberUmeharaInputForm form
	 * @param BindingResult bindingResult
	 * @return 入力エラーがある場合追加画面、ない場合検索画面のパス
	 */
	@RequestMapping(value = "insert", method = RequestMethod.POST)
	public String insertVtuberUmehara(@ModelAttribute @Validated final VtuberUmeharaInputForm form,
			final BindingResult bindingResult,Model model) {
		if (bindingResult.hasFieldErrors()) {

			// 入力エラーがある場合自画面に戻る
			return "vtuberUmehara/insert";
		}

		// データを登録する
		final VtuberMainUmehara vtuberMainUmehara = vtuberUmeharaService.insertVtuberUmehara(form);
		return "redirect:/vtuberUmehara?result=insert&id=" + vtuberMainUmehara.getId();
	}

	/**
	 * 更新画面に遷移する
	 *
	 * @param long id
	 * @param VtuberUmeharaInputForm vtuberUmeharaInputForm
	 * @return 更新画面のパス
	 */
	@RequestMapping(value = "update", method = RequestMethod.GET)
	public String showUpdateVtuberUmehara(final VtuberUmeharaSearchForm form, @RequestParam(name = "id") final long id,
			@ModelAttribute final VtuberUmeharaInputForm vtuberUmeharaInputForm, Model model, final Pageable pageable) {

		// IDをキーにVtuberMainUmeharaテーブルを検索する
		VtuberMainUmehara vtuberMainUmehara = vtuberUmeharaService.getVtuberUmehara(id);

		//penguin_main_kawamuraテーブルから画像パスを取得する
		String imagePass = vtuberMainUmehara.getImage();

		//Modelに画像パスをセットする
		model.addAttribute("imagePass", imagePass);

		// フォームにレコードの値をセットする
		vtuberUmeharaInputForm.initWithVtuberMainUmehara(vtuberMainUmehara);
		vtuberUmeharaInputForm.setImageDelFlg("0");
		return "vtuberUmehara/update";
	}

	/**
	 * VtuberMainUmeharaテーブルのデータを更新して検索画面に遷移する
	 *
	 * @param vtuberUmeharaInputForm form
	 * @param BindingResult bindingResult
	 * @return 入力エラーがある場合更新画面、ない場合検索画面のパス
	 */
	@RequestMapping(value = "update", method = RequestMethod.POST)
	public String updateVtuberUmehara(@Validated final VtuberUmeharaInputForm form,
			final BindingResult bindingResult) {
		if (bindingResult.hasFieldErrors()) {

			// 入力エラーがある場合自画面に戻る
			return "vtuberUmehara/update";
		}

		// データを更新する
		VtuberMainUmehara vtuberMainUmehara = vtuberUmeharaService.updateVtuberUmehara(form);
		if (vtuberMainUmehara == null) {

			// 更新が失敗した場合、検索画面にメッセージを表示する
			return "redirect:/vtuberUmehara?result=updatefailed";
		}
		return "redirect:/vtuberUmehara?result=update&id=" + vtuberMainUmehara.getId();
	}

	/**
	 * VtuberMainUmeharaテーブルのレコードを論理削除して検索画面に遷移する
	 *
	 * @param long id
	 * @return 検索画面のパス
	 */
	@RequestMapping(value = "delete", method = RequestMethod.GET)
	public String deleteVtuberUmehara(@RequestParam(name = "id") final long id) {

		// IDをキーにレコードを論理削除する
		vtuberUmeharaService.deleteVtuberUmeharaById(id);
		return "redirect:/vtuberUmehara?result=delete&id=" + id;
	}

	/**
	 * 完全削除画面に遷移する
	 *
	 * @param VtuberUmeharaSearchForm form
	 * @param VtuberUmeharaDeleteForm VtuberUmeharaDeleteForm
	 * @param Model model
	 * @return 完全削除画面のパス
	 */
	@RequestMapping(value = "deletecomp", method = RequestMethod.GET)
	public String showDeleteCompVtuberUmehara(final VtuberUmeharaSearchForm form,
			@ModelAttribute final VtuberUmeharaDeleteForm vtuberUmeharaDeleteForm, final Model model) {

		// VtuberMainUmeharaテーブルから削除フラグが1のレコードを検索する
		final List<VtuberMainUmehara> vtuberUmeharaList = vtuberUmeharaService.getListVtuberUmehara(form);

		// Modelに検索結果を格納する
		model.addAttribute(vtuberUmeharaList);
		return "vtuberUmehara/deletecomp";
	}

	/**
	 * VtuberMainUmeharaテーブルのデータを完全削除して検索画面に遷移する
	 *
	 * @param VtuberUmeharaDeleteForm form
	 * @param BindingResult bindingResult
	 * @param Model model
	 * @return 入力エラーがある場合完全削除画面、ない場合検索画面のパス
	 */
	@RequestMapping(value = "deletecomp", method = RequestMethod.POST)
	public String deleteCompVtuberUmehara(@Validated final VtuberUmeharaDeleteForm form,
			final BindingResult bindingResult, final Model model) {
		if (bindingResult.hasFieldErrors()) {

			// 入力エラーがある場合、再検索して自画面に戻る
			VtuberUmeharaSearchForm vtuberUmeharaSearchForm = new VtuberUmeharaSearchForm();
			vtuberUmeharaSearchForm.setIsDelete(CommonConst.DELETE_FLG_ON);
			final List<VtuberMainUmehara> vtuberUmeharaList = vtuberUmeharaService
					.getListVtuberUmehara(vtuberUmeharaSearchForm);

			// Modelに検索結果を格納する
			model.addAttribute(vtuberUmeharaList);
			return "vtuberUmehara/deletecomp";
		}

		// データを完全削除する
		vtuberUmeharaService.deleteVtuberUmeharaComp(form.getDeleteIds());
		return "redirect:/vtuberUmehara?result=deletecomp";
	}
}