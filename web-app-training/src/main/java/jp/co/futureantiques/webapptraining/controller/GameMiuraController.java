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
import jp.co.futureantiques.webapptraining.model.form.gameMiura.GameMiuraDeleteForm;
import jp.co.futureantiques.webapptraining.model.form.gameMiura.GameMiuraInputForm;
import jp.co.futureantiques.webapptraining.model.form.gameMiura.GameMiuraSearchForm;
import jp.co.futureantiques.webapptraining.model.gameMiura.GameGenreMiura;
import jp.co.futureantiques.webapptraining.model.gameMiura.GameHardMiura;
import jp.co.futureantiques.webapptraining.model.gameMiura.GameMainMiura;
import jp.co.futureantiques.webapptraining.service.GameMiuraService;

/**
 * Gameのコントロールクラス
 *
 * @author Miura
 */
@Controller
@RequestMapping(value = "/gameMiura")
public class GameMiuraController {

	/** ゲームのサービス*/
	private final GameMiuraService gameMiuraService;

	/**
	 * コンストラクタ
	 *
	 * @param GameMiuraService gameMiuraService
	 */
	@Autowired
	public GameMiuraController(final GameMiuraService gameMiuraService) {
		this.gameMiuraService = gameMiuraService;
	}

	/**
	 * ジャンルのエンティティリストを取得する
	 *
	 * @return GameGenreMiuraEntityのリスト
	 */
	@ModelAttribute
	public List<GameGenreMiura> getListGameGenreMiura() {
		return gameMiuraService.getListGameGenreMiura();
	}

	/**
	 *  ハードのエンティティリストを取得する
	 *
	 * @return GameHardMiuraEntityのリスト
	 */
	@ModelAttribute
	public List<GameHardMiura> getListGameHardMiura() {
		return gameMiuraService.getListGameHardMiura();
	}

	/**
	 * 検索画面に遷移する
	 *
	 * @param GameMiuraSearchForm gameMiuraSearchForm
	 * @return 検索画面のパス
	 */
	@RequestMapping(value = "", method = RequestMethod.GET)
	public String showSearchGameMiura(@ModelAttribute final GameMiuraSearchForm gameMiuraSearchForm) {
		return "gameMiura/search";
	}

	/**
	 * 検索結果を取得して検索画面に遷移する
	 *
	 * @param GameMiuraSearchFrom from
	 * @param Model model
	 * @param Pageable pageable
	 * @param BindingResult bindingResult
	 * @return 検索画面のパス
	 */
	@RequestMapping(value = "search", method = RequestMethod.POST)
	public String searchGame(@Validated final GameMiuraSearchForm form,
			BindingResult bindingResult, final Model model, final Pageable pageable) {

		// 文字数がオーバーした時
		if (bindingResult.hasFieldErrors()) {
			return "gameMiura/search";
		}

		//入力された検索条件をもとにレコードを取得する
		final Page<GameMainMiura> gameMiuraList = gameMiuraService.getPageGameMain(form,
				pageable);
		if (gameMiuraList.getTotalElements() != 0) {

			//検索結果があればModelに結果をセットする
			model.addAttribute("page", gameMiuraList);
			model.addAttribute("gameMiuraList", gameMiuraList.getContent());
			model.addAttribute("url", "search");
		}
		return "gameMiura/search";
	}

	/**
	 * 新規画面に遷移する
	 *
	 * @param GameMiuraInputForm gameMiuraInputForm
	 * @return 新規画面のパス
	 */

	@RequestMapping(value = "insert", method = RequestMethod.GET)
	public String showInsertGame(@ModelAttribute final GameMiuraInputForm gameMiuraInputForm) {
		return "gameMiura/insert";
	}

	/**
	 * GameMainMiuraテーブルにデータを登録して検索画面に遷移する
	 *
	 * @param GameMiuraInputForm form
	 * @param BindingResult bindingResult
	 * @return 入力エラーがある場合追加画面 ない場合検索画面のパス
	 */
	@RequestMapping(value = "insert", method = RequestMethod.POST)
	public String insertGame(@ModelAttribute @Validated final GameMiuraInputForm form,
			final BindingResult bindingResult, Model model) {
		if (bindingResult.hasFieldErrors()) {

			//エラーがある場合自画面に戻る
			return "gameMiura/insert";
		}

		//データを登録する
		final GameMainMiura gameMainMiura = gameMiuraService.insertGame(form);
		return "redirect:/gameMiura?result=insert&id=" + gameMainMiura.getId();
	}

	/**
	 * 更新画面に遷移する
	 *
	 * @param long id
	 * @param GameMiuraInputForm gameMiuraInputForm
	 * @param Model model
	 * @param Pageable pageable
	 * @return 更新画面のパス
	 */
	@RequestMapping(value = "update", method = RequestMethod.GET)
	public String showUpdateGame(@RequestParam(name = "id") final long id,
			@ModelAttribute final GameMiuraInputForm gameMiuraInputForm, Model model,
			final Pageable pageable) {

		//IDをキーにGameMainMiuraテーブルを検索
		GameMainMiura gameMainMiura = gameMiuraService.getGame(id);

		// フォームにレコードの値をセットする
		gameMiuraInputForm.initWithGameMainMiura(gameMainMiura);
		return "gameMiura/update";
	}

	/**
	 * GameMainMiuraテーブルのデータを更新して検索画面に遷移する
	 * @param GameMiuraInputForm form
	 * @param BindingResult bindingResult
	 * @return 入力エラーがある場合更新場面、ない場合検索画面のパス
	 */
	@RequestMapping(value = "update", method = RequestMethod.POST)
	public String updateGame(@Validated final GameMiuraInputForm form,
			final BindingResult bindingResult) {
		if (bindingResult.hasFieldErrors()) {

			//入力エラーがある場合自画面に戻る
			return "gameMiura/update";
		}

		//データを更新する
		GameMainMiura gameMainMiura = gameMiuraService.updateGame(form);
		if (gameMainMiura == null) {

			//更新が失敗した場合検索画面にメッセージを表示
			return "redirect:/gameMiura?result=updatefailed";
		}
		return "redirect:/gameMiura?result=update&id=" + gameMainMiura.getId();
	}

	/**
	 * GameMainテーブルのレコードを論理削除して検索画面に遷移する
	 *
	 * @param long id
	 * @return 検索画面のパス
	 */
	@RequestMapping(value = "delete", method = RequestMethod.GET)
	public String deleteGame(@RequestParam(name = "id") final long id) {

		//IDをキーにレコードを論理削除する
		gameMiuraService.deleteGameById(id);
		return "redirect:/gameMiura?result=delete&id=" + id;
	}

	/**
	 * 完全削除画面に遷移する
	 *
	 * @param GameMiuraSearchForm form
	 * @param GameMiuraDeleteForm gameMiuraDeleteForm
	 * @param Model model
	 * @return 完全削除画面のパス
	 */
	@RequestMapping(value = "deletecomp", method = RequestMethod.GET)
	public String showDeleteCompGame(final GameMiuraSearchForm form,
			@ModelAttribute final GameMiuraDeleteForm gameMiuraDeleteForm,
			final Model model) {

		// GameMainMiuraテーブルから削除フラグが1のレコードを検索する
		final List<GameMainMiura> gameList = gameMiuraService.getListGameMainMiura(form);

		// Modelに検索結果を格納する
		model.addAttribute(gameList);
		return "gameMiura/deletecomp";
	}

	/**
	 * GameMainMiuraテーブルのデータを完全削除して検索画面に遷移する
	 *
	 * @param GameMiuraDeleteForm form
	 * @param  BindingResult bindingResult
	 * @Model model
	 * @return 入力エラーがある場合完全削除画面、ない場合検索画面のパス
	 */

	@RequestMapping(value = "deletecomp", method = RequestMethod.POST)
	public String deleteCompGame(@Validated final GameMiuraDeleteForm form,
			final BindingResult bindingResult, final Model model) {
		if (bindingResult.hasFieldErrors()) {

			// 入力エラーがある場合、再検索して自画面に戻る
			GameMiuraSearchForm gameMiuraSearchForm = new GameMiuraSearchForm();
			gameMiuraSearchForm.setIsDelete(CommonConst.DELETE_FLG_ON);
			final List<GameMainMiura> gameList =
					gameMiuraService.getListGameMainMiura(gameMiuraSearchForm);

			// Modelに検索結果を格納する
			model.addAttribute(gameList);
			return "gameMiura/deletecomp";
		}

		// データを完全削除する
		gameMiuraService.deleteGameComp(form.getDeleteIds());
		return "redirect:/gameMiura?result=deletecomp";
	}
}
