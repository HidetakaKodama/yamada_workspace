package jp.co.futureantiques.webapptraining.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import jp.co.futureantiques.webapptraining.model.form.moviesample.MovieSampleInputForm;
import jp.co.futureantiques.webapptraining.model.form.moviesample.MovieSampleSearchForm;
import jp.co.futureantiques.webapptraining.model.moviesample.Genre;
import jp.co.futureantiques.webapptraining.model.moviesample.MovieActor;
import jp.co.futureantiques.webapptraining.model.moviesample.MovieMain;

/**
 * MovieSampleのサービスインターフェース
 *
 * @author future
 */
public interface MovieSampleService {

	/**
	 * ジャンルエンティティのリストを取得する
	 *
	 * @return GenreEntityのリスト
	 */
	List<Genre> getListGenre();

	/**
	 * 映画俳優エンティティのリストを取得する
	 *
	 * @return MovieActorEntityのリスト
	 */
	List<MovieActor> getListMovieActor();

	/**
	 * 検索条件を元にMovieMainのレコードのリストを取得する(Paging)
	 *
	 * @param MovieSampleSearchForm form
	 * @param Pageable pageable
	 * @return MovieMainのリスト
	 */
	Page<MovieMain> getPageMovie(final MovieSampleSearchForm form, final Pageable pageable);

	/**
	 * 検索条件を元にMovieMainのレコードのリストを取得する
	 *
	 * @param MovieSampleSearchForm form
	 * @return MovieMainのリスト
	 */
	List<MovieMain> getListMovie(final MovieSampleSearchForm form);

	/**
	 * IDをキーにMovieMainのレコードを取得する
	 *
	 * @param long id
	 * @return MovieMainのレコード
	 */
	MovieMain getMovie(final long id);

	/**
	 * MovieMainにレコードを新規登録する
	 *
	 * @param MovieSampleInputForm form
	 * @return MovieMain
	 */
	MovieMain insertMovie(final MovieSampleInputForm form);

	/**
	 * MovieMainのレコードを更新する
	 *
	 * @param MovieSampleInputForm form
	 * @return MovieMain
	 */
	MovieMain updateMovie(final MovieSampleInputForm form);

	/**
	 * MovieMainのレコードを論理削除する
	 *
	 * @param long id
	 */
	void deleteMovieById(final long id);

	/**
	 * MovieMainのレコードを物理削除する
	 *
	 * @param ArrayList<Long> ids
	 */
	void deleteMovieComp(final ArrayList<Long> ids);
}