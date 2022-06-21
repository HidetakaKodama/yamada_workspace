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
import jp.co.futureantiques.webapptraining.model.form.moviesample.MovieSampleDeleteForm;
import jp.co.futureantiques.webapptraining.model.form.moviesample.MovieSampleInputForm;
import jp.co.futureantiques.webapptraining.model.form.moviesample.MovieSampleSearchForm;
import jp.co.futureantiques.webapptraining.model.moviesample.Genre;
import jp.co.futureantiques.webapptraining.model.moviesample.MovieActor;
import jp.co.futureantiques.webapptraining.model.moviesample.MovieMain;
import jp.co.futureantiques.webapptraining.service.MovieSampleService;

/**
 * MovieSampleのコントローラークラス
 *
 * @author future
 */
@Controller
@RequestMapping(value = "/moviesample")
public class MovieSampleController {

	/** 映画のサービス */
	private final MovieSampleService movieSampleService;

	/**
	 * コンストラクタ
	 *
	 * @param MovieSampleService movieSampleService
	 */
	@Autowired
	public MovieSampleController(final MovieSampleService movieSampleService) {
		this.movieSampleService = movieSampleService;
	}

	/**
	 * ジャンルエンティティのリストを取得する
	 *
	 * @return GenreEntityのリスト
	 */
	@ModelAttribute
	public List<Genre> getListGenre() {
		return movieSampleService.getListGenre();
	}

	/**
	 * 俳優エンティティのリストを取得する
	 *
	 * @return MovieActorEntityのリスト
	 */
	@ModelAttribute
	public List<MovieActor> getListMovieActor() {
		return movieSampleService.getListMovieActor();
	}

	/**
	 * 検索画面に遷移する
	 *
	 * @param MovieSampleSearchForm movieSampleSearchForm
	 * @return 検索画面のパス
	 */
	@RequestMapping(value = "", method = RequestMethod.GET)
	public String showSearchMovie(@ModelAttribute final MovieSampleSearchForm movieSampleSearchForm) {
		return "moviesample/search";
	}

	/**
	 * 検索結果を取得して検索画面に遷移する
	 *
	 * @param MovieSampleSearchForm form
	 * @param Model model
	 * @param Pageable pageable
	 * @return 検索画面のパス
	 */
	@RequestMapping(value = "search", method = RequestMethod.POST)
	public String searchMovie(final MovieSampleSearchForm form, final Model model, final Pageable pageable) {

		// 入力された検索条件を元にレコードを取得する
		final Page<MovieMain> movieList = movieSampleService.getPageMovie(form, pageable);
		if (movieList.getTotalElements() != 0) {

			// 検索結果がある場合、Modelに結果をセットする
			model.addAttribute("page", movieList);
			model.addAttribute("movieList", movieList.getContent());
			model.addAttribute("url", "search");
		}
		return "moviesample/search";
	}

	/**
	 * 追加画面に遷移する
	 *
	 * @param MovieSampleInputForm movieSampleInputForm
	 * @return 追加画面のパス
	 */
	@RequestMapping(value = "insert", method = RequestMethod.GET)
	public String showInsertMovie(@ModelAttribute final MovieSampleInputForm movieSampleInputForm) {
		return "moviesample/insert";
	}

	/**
	 * MovieMainテーブルにデータを登録して検索画面に遷移する
	 *
	 * @param MovieSampleInputForm form
	 * @param BindingResult bindingResult
	 * @return 入力エラーがある場合追加画面、ない場合検索画面のパス
	 */
	@RequestMapping(value = "insert", method = RequestMethod.POST)
	public String insertMovie(@ModelAttribute @Validated final MovieSampleInputForm form,
			final BindingResult bindingResult) {
		if (bindingResult.hasFieldErrors()) {

			// 入力エラーがある場合自画面に戻る
			return "moviesample/insert";
		}

		// データを登録する
		final MovieMain movieMain = movieSampleService.insertMovie(form);
		return "redirect:/moviesample?result=insert&id=" + movieMain.getId();
	}

	/**
	 * 更新画面に遷移する
	 *
	 * @param long id
	 * @param MovieSampleInputForm movieSampleInputForm
	 * @return 更新画面のパス
	 */
	@RequestMapping(value = "update", method = RequestMethod.GET)
	public String showUpdateMovie(@RequestParam(name = "id") final long id,
			@ModelAttribute final MovieSampleInputForm movieSampleInputForm) {

		// IDをキーにMovieMainテーブルを検索する
		MovieMain movieMain = movieSampleService.getMovie(id);

		// フォームにレコードの値をセットする
		movieSampleInputForm.initWithMovieMain(movieMain);
		return "moviesample/update";
	}

	/**
	 * MovieMainテーブルのデータを更新して検索画面に遷移する
	 *
	 * @param MovieSampleInputForm form
	 * @param BindingResult bindingResult
	 * @return 入力エラーがある場合更新画面、ない場合検索画面のパス
	 */
	@RequestMapping(value = "update", method = RequestMethod.POST)
	public String updateMovie(@Validated final MovieSampleInputForm form,
			final BindingResult bindingResult) {
		if (bindingResult.hasFieldErrors()) {

			// 入力エラーがある場合自画面に戻る
			return "moviesample/update";
		}

		// データを更新する
		MovieMain movieMain = movieSampleService.updateMovie(form);
		if (movieMain == null) {

			// 更新が失敗した場合、検索画面にメッセージを表示する
			return "redirect:/moviesample?result=updatefailed";
		}
		return "redirect:/moviesample?result=update&id=" + movieMain.getId();
	}

	/**
	 * MovieMainテーブルのレコードを論理削除して検索画面に遷移する
	 *
	 * @param long id
	 * @return 検索画面のパス
	 */
	@RequestMapping(value = "delete", method = RequestMethod.GET)
	public String deleteMovie(@RequestParam(name = "id") final long id) {

		// IDをキーにレコードを論理削除する
		movieSampleService.deleteMovieById(id);
		return "redirect:/moviesample?result=delete&id=" + id;
	}

	/**
	 * 完全削除画面に遷移する
	 *
	 * @param MovieSampleSearchForm form
	 * @param MovieSampleDeleteForm movieSampleDeleteForm
	 * @param Model model
	 * @return 完全削除画面のパス
	 */
	@RequestMapping(value = "deletecomp", method = RequestMethod.GET)
	public String showDeleteCompMovie(final MovieSampleSearchForm form,
			@ModelAttribute final MovieSampleDeleteForm movieSampleDeleteForm, final Model model) {

		// MovieMainテーブルから削除フラグが1のレコードを検索する
		final List<MovieMain> movieList = movieSampleService.getListMovie(form);

		// Modelに検索結果を格納する
		model.addAttribute(movieList);
		return "moviesample/deletecomp";
	}

	/**
	 * MovieMainテーブルのデータを完全削除して検索画面に遷移する
	 *
	 * @param MovieSampleDeleteForm form
	 * @param BindingResult bindingResult
	 * @param Model model
	 * @return 入力エラーがある場合完全削除画面、ない場合検索画面のパス
	 */
	@RequestMapping(value = "deletecomp", method = RequestMethod.POST)
	public String deleteCompMovie(@Validated final MovieSampleDeleteForm form,
			final BindingResult bindingResult, final Model model) {
		if (bindingResult.hasFieldErrors()) {

			// 入力エラーがある場合、再検索して自画面に戻る
			MovieSampleSearchForm movieSampleSearchForm = new MovieSampleSearchForm();
			movieSampleSearchForm.setIsDelete(CommonConst.DELETE_FLG_ON);
			final List<MovieMain> movieList = movieSampleService.getListMovie(movieSampleSearchForm);

			// Modelに検索結果を格納する
			model.addAttribute(movieList);
			return "moviesample/deletecomp";
		}

		// データを完全削除する
		movieSampleService.deleteMovieComp(form.getDeleteIds());
		return "redirect:/moviesample?result=deletecomp";
	}
}
