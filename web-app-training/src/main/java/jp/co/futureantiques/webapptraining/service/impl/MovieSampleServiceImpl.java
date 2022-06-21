package jp.co.futureantiques.webapptraining.service.impl;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import jp.co.futureantiques.webapptraining.model.form.moviesample.MovieSampleInputForm;
import jp.co.futureantiques.webapptraining.model.form.moviesample.MovieSampleSearchForm;
import jp.co.futureantiques.webapptraining.model.moviesample.Genre;
import jp.co.futureantiques.webapptraining.model.moviesample.MovieActor;
import jp.co.futureantiques.webapptraining.model.moviesample.MovieMain;
import jp.co.futureantiques.webapptraining.repository.moviesample.GenreRepository;
import jp.co.futureantiques.webapptraining.repository.moviesample.MovieActorRepository;
import jp.co.futureantiques.webapptraining.repository.moviesample.MovieMainRepository;
import jp.co.futureantiques.webapptraining.repository.specification.MovieSampleSpecification;
import jp.co.futureantiques.webapptraining.service.MovieSampleService;

/**
 * MovieSampleのサービス実装クラス
 *
 * @author future
 */
@Service
public class MovieSampleServiceImpl implements MovieSampleService {

	/** MovieMainリポジトリ */
	private final MovieMainRepository movieMainRepository;

	/** Genreリポジトリ */
	private final GenreRepository genreRepository;

	/** MovieActorリポジトリ */
	private final MovieActorRepository movieActorRepository;

	/**
	 * コンストラクタ
	 *
	 * @param MovieMainRepository movieMainRepository
	 * @param GenreRepository genreRepository
	 * @param MovieActorRepository movieActorRepository
	 */
	@Autowired
	public MovieSampleServiceImpl(MovieMainRepository movieMainRepository, GenreRepository genreRepository,
			MovieActorRepository movieActorRepository) {
		this.movieMainRepository = movieMainRepository;
		this.genreRepository = genreRepository;
		this.movieActorRepository = movieActorRepository;
	}

	@Override
	public List<Genre> getListGenre() {

		// GenreテーブルのレコードをID順に取得する
		return genreRepository.findAll(new Sort(Sort.Direction.ASC, "id"));
	}

	@Override
	public List<MovieActor> getListMovieActor() {

		// MovieActorテーブルのレコードをID順に取得する
		return movieActorRepository.findAll(new Sort(Sort.Direction.ASC, "id"));
	}

	@Override
	public Page<MovieMain> getPageMovie(final MovieSampleSearchForm form, final Pageable pageable) {

		// 検索条件を生成しMovieMainテーブルのレコードを取得する
		return movieMainRepository.findAll(MovieSampleSpecification.generateMovieSpecification(form), pageable);
	}

	@Override
	public List<MovieMain> getListMovie(final MovieSampleSearchForm form) {

		// 検索条件を生成しMovieMainテーブルのレコードを取得する
		return movieMainRepository.findAll(MovieSampleSpecification.generateMovieSpecification(form));
	}

	@Override
	public MovieMain getMovie(final long id) {

		// MovieMainテーブルを主キー検索する
		return movieMainRepository.findOne(id);
	}

	@Override
	public MovieMain insertMovie(final MovieSampleInputForm form) {

		// MovieMainテーブルに新規でデータを登録する
		final MovieMain movieMain = form.convertToMovieMainForInsert();
		return movieMainRepository.save(movieMain);
	}

	@Override
	public MovieMain updateMovie(final MovieSampleInputForm form) {

		// 更新対象のレコードを取得する
		MovieMain movieMain = movieMainRepository.findOne((long) form.getId());
		if (movieMain != null) {

			// 更新対象のレコードが存在する場合排他チェック
			if (form.getUpdateDate().equals(String.valueOf(movieMain.getUpdateDate()))) {

				// チェックOKの場合、更新
				movieMain = form.convertToMovieMainForUpdate(movieMain);
				return movieMainRepository.saveAndFlush(movieMain);
			}
		}
		return null;
	}

	@Override
	public void deleteMovieById(final long id) {

		// 更新対象のレコードを取得する
		MovieMain movieMain = movieMainRepository.findOne(id);
		if (movieMain != null) {

			// 更新対象のレコードが存在する場合、削除フラグを1にする
			movieMainRepository.delete(id);
		}
	}

	@Override
	public void deleteMovieComp(final ArrayList<Long> ids) {

		// 対象のレコードを削除する
		movieMainRepository.deleteComp(ids);
	}
}