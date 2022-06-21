package jp.co.futureantiques.webapptraining.service.impl;

import java.io.File;
import java.io.IOException;
import java.io.OutputStream;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

import jp.co.futureantiques.webapptraining.constant.CommonConst;
import jp.co.futureantiques.webapptraining.model.dogKanno.DogCountryKanno;
import jp.co.futureantiques.webapptraining.model.dogKanno.DogMainKanno;
import jp.co.futureantiques.webapptraining.model.dogKanno.DogSizeKanno;
import jp.co.futureantiques.webapptraining.model.form.dogKanno.DogInputForm;
import jp.co.futureantiques.webapptraining.model.form.dogKanno.DogSearchForm;
import jp.co.futureantiques.webapptraining.repository.dogKanno.DogCountryKannoRepository;
import jp.co.futureantiques.webapptraining.repository.dogKanno.DogMainKannoRepository;
import jp.co.futureantiques.webapptraining.repository.dogKanno.DogSizeKannoRepository;
import jp.co.futureantiques.webapptraining.repository.specification.DogKannoSpecification;
import jp.co.futureantiques.webapptraining.service.DogKannoService;

/**
 * DogKannoのサービス実装クラス
 *
 * @author future
 */
@Service
public class DogKannoServiceImpl implements DogKannoService {

	/** DogMainKannoリポジトリ */
	private final DogMainKannoRepository dogMainKannoRepository;

	/** DogCountryKannoリポジトリ */
	private final DogCountryKannoRepository dogCountryKannoRepository;

	/** DogSizeKannoリポジトリ */
	private final DogSizeKannoRepository dogSizeKannoRepository;

	/**
	 * コンストラクタ
	 *
	 * @param DogMainKannoRepository dogMainKannoRepository
	 * @param DogCountryKannoRepository dogCountryKannoRepository
	 * @param DogSizeKannoRepository
	 */
	@Autowired
	public DogKannoServiceImpl(DogMainKannoRepository dogMainKannoRepoository,
			DogCountryKannoRepository dogCountryKannoRepository,
			DogSizeKannoRepository dogSizeKannoRepository) {
		this.dogMainKannoRepository = dogMainKannoRepoository;
		this.dogCountryKannoRepository = dogCountryKannoRepository;
		this.dogSizeKannoRepository = dogSizeKannoRepository;
	}

	@Override
	public List<DogCountryKanno> getListDogCountryKanno() {

		// DogCountryKannoテーブルのレコードをID順に取得する
		return dogCountryKannoRepository.findAll(new Sort(Sort.Direction.ASC, "id"));
	}

	@Override
	public List<DogSizeKanno> getListDogSizeKanno() {

		// DogSizeKannoテーブルのレコードをID順に取得する
		return dogSizeKannoRepository.findAll(new Sort(Sort.Direction.ASC, "id"));
	}

	@Override
	public Page<DogMainKanno> getPageDog(final DogSearchForm form, final Pageable pageable) {

		// 検索条件を生成しDogMainKannoテーブルのレコードを取得する。
		return dogMainKannoRepository.findAll(DogKannoSpecification.generateDogSpecification(form), pageable);

	}

	@Override
	public List<DogMainKanno> getListDog(final DogSearchForm form) {

		// 検索条件を生成しDogMainKannoテーブルのレコードを取得する。
		return dogMainKannoRepository.findAll(DogKannoSpecification.generateDogSpecification(form));
	}

	@Override
	public DogMainKanno getDog(final long dogId) {

		// DogMainKannoテーブルを主キー検索する
		return dogMainKannoRepository.findOne(dogId);
	}

	@Override
	public DogMainKanno insertDog(final DogInputForm form) {

		// DogMainKannoテーブルに新規でデータを登録する
		final DogMainKanno dogMainKanno = form.convertToDogMainKannoforInsert();

		// ファイルをアップロードする
		uploadFile(dogMainKanno, form.getImage());

		return dogMainKannoRepository.save(dogMainKanno);
	}

	@Override
	public DogMainKanno updateDog(final DogInputForm form) {

		// 更新対象のレコードを取得する
		DogMainKanno dogMainKanno = dogMainKannoRepository.findOne((long) form.getDogId());
		if (dogMainKanno != null) {

			// 更新対象のレコードが存在する場合排他チェック
			if (form.getUpdateDate().equals(String.valueOf(dogMainKanno.getUpdateDate()))) {

				// チェックOKの場合、更新
				dogMainKanno = form.convertToDogMainKannoForUpdate(dogMainKanno);


				//ファイルをアップロードする
				uploadFile(dogMainKanno, form.getImage());
				return dogMainKannoRepository.saveAndFlush(dogMainKanno);
			}

		}
		return null;
	}

	@Override
	public void deleteDogById(final long dogId) {

		// 更新対象のレコードを取得する
		DogMainKanno dogMainKanno = dogMainKannoRepository.findOne(dogId);
		if (dogMainKanno != null) {

			// 更新対象のレコードが存在する場合削除フラグを1にする
			dogMainKannoRepository.delete(dogId);
		}
	}

	@Override
	public void deleteDogComp(ArrayList<Long> ids) {
		// 対象のレコードの画像を削除する
		for (long dogId : ids) {
			File f = new File(CommonConst.STATIC_PATH + dogMainKannoRepository.findOne(dogId).getImage());
			if (f.exists()) {

				// ファイルが存在する場合削除
				f.delete();
			}
		}

		// 対象のレコードを削除する
		dogMainKannoRepository.deleteComp(ids);
	}
	/**
	 * 選択したファイルを指定のパスにアップロードする
	 * @param dogmainkanno
	 * @param Image
	 */
	private void uploadFile(DogMainKanno dogMainKanno, MultipartFile image) {

		// 画像を挿入していた場合の処理(挿入していなければNULLになる）
		if (!image.isEmpty()) {

			// 追加する画像のファイルパス
			Path path = Paths.get(CommonConst.STATIC_PATH + "/dogKanno");

			// ファイル名をつけるため拡張子や現在日時を取得
			int dot = image.getOriginalFilename().lastIndexOf(".");
			String extention = "";
			if (dot > 0) {
				extention = image.getOriginalFilename().substring(dot).toLowerCase();
			}
			String filename = DateTimeFormatter.ofPattern("yyyyMMddHHmmssSSS").format(LocalDateTime.now());

			// エンティティに画像の値を入れる
			dogMainKanno.setImage("/dogKanno/" + filename + extention);

			// 指定した場所にファイルを書き込む
			path = path.resolve(filename + extention);
			try (OutputStream os = Files.newOutputStream(path, StandardOpenOption.CREATE)) {
				byte[] bytes = image.getBytes();
				os.write(bytes);
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}
}
