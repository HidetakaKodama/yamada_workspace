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
import jp.co.futureantiques.webapptraining.model.form.playerKuramoto.PlayerKuramotoDeleteForm;
import jp.co.futureantiques.webapptraining.model.form.playerKuramoto.PlayerKuramotoInputForm;
import jp.co.futureantiques.webapptraining.model.form.playerKuramoto.PlayerKuramotoSearchForm;
import jp.co.futureantiques.webapptraining.model.playerKuramoto.PlayerBtKuramoto;
import jp.co.futureantiques.webapptraining.model.playerKuramoto.PlayerMainKuramoto;
import jp.co.futureantiques.webapptraining.model.playerKuramoto.PlayerPositionKuramoto;
import jp.co.futureantiques.webapptraining.service.PlayerKuramotoService;

/**
 * PlayerKuramotoのコントローラークラス
 *
 * @author future
 */
@Controller
@RequestMapping(value = "/playerKuramoto")
public class PlayerKuramotoController {

	/** 選手のサービス */
	private final PlayerKuramotoService playerKuramotoService;

	/**
	 * コンストラクタ
	 *
	 * @param PlayerKuramotoService playerKuramotoService
	 */
	@Autowired
	public PlayerKuramotoController(final PlayerKuramotoService playerKuramotoService) {
		this.playerKuramotoService = playerKuramotoService;
	}

	/**
	 * ポジションエンティティのリストを取得する
	 *
	 * @return PositionEntityのリスト
	 */
	@ModelAttribute
	public List<PlayerPositionKuramoto> getListPosition() {
		return playerKuramotoService.getListPosition();
	}

	/**
	 * 投打エンティティのリストを取得する
	 *
	 * @return BtEntityのリスト
	 */
	@ModelAttribute
	public List<PlayerBtKuramoto> getListBt() {
		return playerKuramotoService.getListBt();
	}

	/**
	 * 検索画面に遷移する
	 *
	 * @param PlayerKuramotoSearchForm playerKuramotoSearchForm
	 * @return 検索画面のパス
	 */
	@RequestMapping(value = "", method = RequestMethod.GET)
	public String showSearchPlayer(@ModelAttribute final PlayerKuramotoSearchForm playerKuramotoSearchForm) {
		return "playerKuramoto/search";
	}

	/**
	 * 検索結果を取得して検索画面に遷移する
	 *
	 * @param PlayerKuramotoSearchForm form
	 * @param Model model
	 * @param Pageable pageable
	 * @return 検索画面のパス
	 */
	/**
	 * @param form
	 * @param model
	 * @param pageable
	 * @return 
	 */
	@RequestMapping(value = "search", method = RequestMethod.POST)
	public String searchPlayer(final PlayerKuramotoSearchForm form, final Model model, final Pageable pageable) {

		// 入力された検索条件を元にレコードを取得する
		final Page<PlayerMainKuramoto> playerKuramotoList = playerKuramotoService.getPagePlayer(form, pageable);
		if (playerKuramotoList.getTotalElements() != 0) {

			// 検索結果がある場合、Modelに結果をセットする
			model.addAttribute("page", playerKuramotoList);
			model.addAttribute("playerKuramotoList", playerKuramotoList.getContent());
			model.addAttribute("url", "search");
		}
		return "playerKuramoto/search";
	}

	/**
	 * 追加画面に遷移する
	 *
	 * @param PlayerKuramotoInputForm PlayerKuramotoInputForm
	 * @return 追加画面のパス
	 */
	@RequestMapping(value = "insert", method = RequestMethod.GET)
	public String showInsertPlayer(@ModelAttribute final PlayerKuramotoInputForm playerKuramotoInputForm) {
		return "playerKuramoto/insert";
	}

	/**
	 * PlayerMainKuramotoテーブルにデータを登録して検索画面に遷移する
	 *
	 * @param PlayerKuramotoInputForm form
	 * @param BindingResult bindingResult
	 * @return 入力エラーがある場合追加画面、ない場合検索画面のパス
	 */
	@RequestMapping(value = "insert", method = RequestMethod.POST)
	public String insertPlayer(@ModelAttribute @Validated final PlayerKuramotoInputForm form,
			final BindingResult bindingResult) {
		if (bindingResult.hasFieldErrors()) {

			// 入力エラーがある場合自画面に戻る
			return "playerKuramoto/insert";
		}

		// データを登録する
		final PlayerMainKuramoto playerMainKuramoto = playerKuramotoService.insertPlayer(form);
		return "redirect:/playerKuramoto?result=insert&id=" + playerMainKuramoto.getId();
	}

	/**
	 * 更新画面に遷移する
	 *
	 * @param long id
	 * @param PlayerKuramotoInputForm playerKuramotoInputForm
	 * @return 更新画面のパス
	 */
	@RequestMapping(value = "update", method = RequestMethod.GET)
	public String showUpdateMovie(@RequestParam(name = "id") final long id,
			@ModelAttribute final PlayerKuramotoInputForm playerKuramotoInputForm) {

		// IDをキーにPlayerMainKuramotoテーブルを検索する
		PlayerMainKuramoto playerMainKuramoto = playerKuramotoService.getPlayer(id);

		// フォームにレコードの値をセットする
		playerKuramotoInputForm.initWithPlayerMainKuramoto(playerMainKuramoto);
		return "playerKuramoto/update";
	}

	/**
	 * PlayerMainKuramotoテーブルのデータを更新して検索画面に遷移する
	 *
	 * @param PlayerKuramotoInputForm form
	 * @param BindingResult bindingResult
	 * @return 入力エラーがある場合更新画面、ない場合検索画面のパス
	 */
	@RequestMapping(value = "update", method = RequestMethod.POST)
	public String updatePlayer(@Validated final PlayerKuramotoInputForm form,
			final BindingResult bindingResult) {
		if (bindingResult.hasFieldErrors()) {

			// 入力エラーがある場合自画面に戻る
			return "playerKuramoto/update";
		}

		// データを更新する
		PlayerMainKuramoto playerMainKuramoto = playerKuramotoService.updatePlayer(form);
		if (playerMainKuramoto == null) {

			// 更新が失敗した場合、検索画面にメッセージを表示する
			return "redirect:/playerKuramoto?result=updatefailed";
		}
		return "redirect:/playerKuramoto?result=update&id=" + playerMainKuramoto.getId();
	}

	/**
	 * PlayerMainKurmaotoテーブルのレコードを論理削除して検索画面に遷移する
	 *
	 * @param long id
	 * @return 検索画面のパス
	 */
	@RequestMapping(value = "delete", method = RequestMethod.GET)
	public String deletePlayer(@RequestParam(name = "id") final long id) {

		// IDをキーにレコードを論理削除する
		playerKuramotoService.deletePlayerById(id);
		return "redirect:/playerKuramoto?result=delete&id=" + id;
	}

	/**
	 * 完全削除画面に遷移する
	 *
	 * @param PlayerKuramotoSearchForm form
	 * @param PlayerKuramotoDeleteForm playerKuramotoDeleteForm
	 * @param Model model
	 * @return 完全削除画面のパス
	 */
	@RequestMapping(value = "deletecomp", method = RequestMethod.GET)
	public String showDeleteCompPlayer(final PlayerKuramotoSearchForm form,
			@ModelAttribute final PlayerKuramotoDeleteForm playerKuramotoDeleteForm, final Model model) {

		// PlayerMainKuramotoテーブルから削除フラグが1のレコードを検索する
		final List<PlayerMainKuramoto> playerKuramotoList = playerKuramotoService.getListPlayer(form);

		// Modelに検索結果を格納する
		model.addAttribute(playerKuramotoList);
		return "playerKuramoto/deletecomp";
	}

	/**
	 * PlayerMainKuramotoテーブルのデータを完全削除して検索画面に遷移する
	 *
	 * @param PlayerKuramotoDeleteForm form
	 * @param BindingResult bindingResult
	 * @param Model model
	 * @return 入力エラーがある場合完全削除画面、ない場合検索画面のパス
	 */
	@RequestMapping(value = "deletecomp", method = RequestMethod.POST)
	public String deleteCompPlayer(@Validated final PlayerKuramotoDeleteForm form,
			final BindingResult bindingResult, final Model model) {
		if (bindingResult.hasFieldErrors()) {

			// 入力エラーがある場合、再検索して自画面に戻る
			PlayerKuramotoSearchForm playerKuramotoSearchForm = new PlayerKuramotoSearchForm();
			playerKuramotoSearchForm.setIsDelete(CommonConst.DELETE_FLG_ON);
			final List<PlayerMainKuramoto> playerKuramotoList = playerKuramotoService.getListPlayer(playerKuramotoSearchForm);

			// Modelに検索結果を格納する
			model.addAttribute(playerKuramotoList);
			return "playerKuramoto/deletecomp";
		}

		// データを完全削除する
		playerKuramotoService.deletePlayerComp(form.getDeleteIds());
		return "redirect:/playerKuramoto?result=deletecomp";
	}
}
