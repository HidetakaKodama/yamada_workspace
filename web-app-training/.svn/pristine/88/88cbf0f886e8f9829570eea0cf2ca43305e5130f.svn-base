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
import jp.co.futureantiques.webapptraining.model.form.weaponHiratsuka.WeaponHiratsukaDeleteForm;
import jp.co.futureantiques.webapptraining.model.form.weaponHiratsuka.WeaponHiratsukaInputForm;
import jp.co.futureantiques.webapptraining.model.form.weaponHiratsuka.WeaponHiratsukaSearchForm;
import jp.co.futureantiques.webapptraining.model.weaponHiratsuka.ShottypeHiratsuka;
import jp.co.futureantiques.webapptraining.model.weaponHiratsuka.WeaponMainHiratsuka;
import jp.co.futureantiques.webapptraining.model.weaponHiratsuka.WeapontypeHiratsuka;
import jp.co.futureantiques.webapptraining.service.WeaponHiratsukaService;

/**
 * Weaponのコントローラークラス
 *
 * @author hiratsuka
 */
@Controller
@RequestMapping(value = "/weaponHiratsuka")
public class WeaponHiratsukaController {

	/**
	 * weaponのサービス
	 */
	private final WeaponHiratsukaService weaponHiratsukaService;

	/**
	 * コンストラクタ
	 *
	 * @param weaponService weaponService;
	 */
	@Autowired
	public WeaponHiratsukaController(final WeaponHiratsukaService weaponHiratsukaService) {
		this.weaponHiratsukaService = weaponHiratsukaService;
	}

	/**
	 * 武器タイプエンティティのリストを取得する
	 *
	 * @return WeapontypeEntityのリスト
	 */
	@ModelAttribute
	public List<WeapontypeHiratsuka> getListWeapontype() {
		return weaponHiratsukaService.getListWeapontype();
	}

	/**
	 * 射撃方式エンティティのリストを取得する
	 *
	 * @return ShottypeEntityのリスト
	 */
	@ModelAttribute
	public List<ShottypeHiratsuka> getListShottype() {
		return weaponHiratsukaService.getListShottype();
	}

	/**
	 * 検索画面に遷移する
	 *
	 * @param WeaponHiratsukaSearchForm weaponSearchForm
	 * @return 検索画面のパス
	 */
	@RequestMapping(value = "", method = RequestMethod.GET)
	public String showSearchWeapon(@ModelAttribute final WeaponHiratsukaSearchForm weaponHiratsukaSearchForm) {
		return "weaponHiratsuka/search";
	}

	/**
	 * 検索結果を取得して検索画面に遷移する
	 *
	 * @param WeaponHiratsukaSearchForm form
	 * @param Model model
	 * @param Pageable pageable
	 * @return 検索画面のパス
	 */
	@RequestMapping(value = "search", method = RequestMethod.POST)
	public String searchWeapon(final WeaponHiratsukaSearchForm form, final Model model, final Pageable pageable) {

		// 入力された検索条件を元にレコードを取得する
		final Page<WeaponMainHiratsuka> weaponList = weaponHiratsukaService.getPageWeapon(form, pageable);
		if (weaponList.getTotalElements() != 0) {

			// 検索結果がある場合、Modelに結果をセットする
			model.addAttribute("page", weaponList);
			model.addAttribute("weaponList", weaponList.getContent());
			model.addAttribute("url", "search");
		}
		return "weaponHiratsuka/search";
	}

	/**
	 * 追加画面に遷移する
	 *
	 * @param WeaponHiratsukaInputForm weaponHiratsukaInputForm
	 * @return 追加画面のパス
	 */
	@RequestMapping(value = "insert", method = RequestMethod.GET)
	public String showInsertWeapon(@ModelAttribute final WeaponHiratsukaInputForm weaponHiratsukaInputForm) {
		return "weaponHiratsuka/insert";
	}

	/**
	 * WeaponHiratsukaMainテーブルにデータを登録して検索画面に遷移する
	 *
	 * @param WeaponHiratsukaInputForm form
	 * @param BindingResult bindingResult
	 * @return 入力エラーがある場合追加画面、ない場合検索画面のパス
	 */
	@RequestMapping(value = "insert", method = RequestMethod.POST)
	public String insertWeapon(@ModelAttribute @Validated final WeaponHiratsukaInputForm form,
			final BindingResult bindingResult) {
		if (bindingResult.hasFieldErrors()) {

			// 入力エラーがある場合追加画面に戻る
			return "weaponHiratsuka/insert";
		}

		// データを登録する
		final WeaponMainHiratsuka weaponMainHiratsuka = weaponHiratsukaService.insertWeapon(form);
		return "redirect:/weaponHiratsuka?result=insert&id=" + weaponMainHiratsuka.getId();
	}

	/**
	 * 更新画面に遷移する
	 *
	 * @param long id
	 * @param WeaponHiratsukaInputForm weaponHiratsukaInputForm
	 * @return 更新画面のパス
	 */
	@RequestMapping(value = "update", method = RequestMethod.GET)
	public String showUpdateWeapon(@RequestParam(name = "id") final long id,
			@ModelAttribute final WeaponHiratsukaInputForm weaponHiratsukaInputForm) {

		// IDをキーにWeaponMainテーブルを検索する
		WeaponMainHiratsuka weaponMainHiratsuka = weaponHiratsukaService.getWeapon(id);

		// フォームにレコードの値をセットする
		weaponHiratsukaInputForm.initWithWeaponMainHiratsuka(weaponMainHiratsuka);
		return "weaponHiratsuka/update";
	}

	/**
	 * WeaponMainテーブルのデータを更新して検索画面に遷移する
	 *
	 * @param WeaponHiratsukaInputForm form
	 * @param BindingResult bindingResult
	 * @return 入力エラーがある場合更新画面、ない場合検索画面のパス
	 */
	@RequestMapping(value = "update", method = RequestMethod.POST)
	public String updateWeapon(@Validated final WeaponHiratsukaInputForm form,
			final BindingResult bindingResult) {
		if (bindingResult.hasFieldErrors()) {

			// 入力エラーがある場合更新画面に戻る
			return "weaponHiratsuka/update";
		}

		// データを更新する
		WeaponMainHiratsuka weaponMainHiratsuka = weaponHiratsukaService.updateWeapon(form);
		if (weaponMainHiratsuka == null) {

			// 更新が失敗した場合、検索画面にメッセージを表示する
			return "redirect:/weaponHiratsuka?result=updatefailed";
		}
		return "redirect:/weaponHiratsuka?result=update&id=" + weaponMainHiratsuka.getId();
	}

	/**
	 * WeaponMainテーブルのレコードを論理削除して検索画面に遷移する
	 *
	 * @param long id
	 * @return 検索画面のパス
	 */
	@RequestMapping(value = "delete", method = RequestMethod.GET)
	public String deleteWeapon(@RequestParam(name = "id") final long id) {

		// IDをキーにレコードを論理削除する
		weaponHiratsukaService.deleteWeaponById(id);
		return "redirect:/weaponHiratsuka?result=delete&id=" + id;
	}

	/**
	 * 完全削除画面に遷移する
	 *
	 * @param WeaponHiratsukaSearchForm form
	 * @param WeaponHiratsukaDeleteForm weaponHiratsukaDeleteForm
	 * @param Model model
	 * @return 完全削除画面のパス
	 */
	@RequestMapping(value = "deletecomp", method = RequestMethod.GET)
	public String showDeleteCompWeapon(final WeaponHiratsukaSearchForm form,
			@ModelAttribute final WeaponHiratsukaDeleteForm weaponHiratsukaDeleteForm, final Model model) {

		// WeaponHiratsukaMainテーブルから削除フラグが1のレコードを検索する
		final List<WeaponMainHiratsuka> weaponList = weaponHiratsukaService.getListWeapon(form);

		// Modelに検索結果を格納する
		model.addAttribute(weaponList);
		return "weaponHiratsuka/deletecomp";
	}

	/**
	 * WeaponHiratsukaテーブルのデータを完全削除して検索画面に遷移する
	 *
	 * @param WeaponHiratsukaDeleteForm form
	 * @param BindingResult bindingResult
	 * @param Model model
	 * @return 入力エラーがある場合完全削除画面、ない場合検索画面のパス
	 */
	@RequestMapping(value = "deletecomp", method = RequestMethod.POST)
	public String deleteCompWeapon(@Validated final WeaponHiratsukaDeleteForm form,
			final BindingResult bindingResult, final Model model) {
		if (bindingResult.hasFieldErrors()) {

			// 入力エラーがある場合、再検索して削除画面に戻る
			WeaponHiratsukaSearchForm weaponHiratsukaSearchForm = new WeaponHiratsukaSearchForm();
			weaponHiratsukaSearchForm.setIsDelete(CommonConst.DELETE_FLG_ON);
			final List<WeaponMainHiratsuka> weaponList = weaponHiratsukaService
					.getListWeapon(weaponHiratsukaSearchForm);

			// Modelに検索結果を格納する
			model.addAttribute(weaponList);
			return "weaponHiratsuka/deletecomp";
		}

		// データを完全削除する
		weaponHiratsukaService.deleteWeaponComp(form.getDeleteIds());
		return "redirect:/weaponHiratsuka?result=deletecomp";
	}
}
