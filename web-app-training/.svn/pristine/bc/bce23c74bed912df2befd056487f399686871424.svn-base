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
import jp.co.futureantiques.webapptraining.model.form.triathlonMori.TriathlonMoriInputForm;
import jp.co.futureantiques.webapptraining.model.form.triathlonMori.TriathlonMoriSearchForm;
import jp.co.futureantiques.webapptraining.model.triathlonMori.MakerMori;
import jp.co.futureantiques.webapptraining.model.triathlonMori.TriathlonMainMori;
import jp.co.futureantiques.webapptraining.model.triathlonMori.TypeMori;
import jp.co.futureantiques.webapptraining.repository.specification.TriathlonMoriSpecification;
import jp.co.futureantiques.webapptraining.repository.triathlonMori.MakerMoriRepository;
import jp.co.futureantiques.webapptraining.repository.triathlonMori.TriathlonMainMoriRepository;
import jp.co.futureantiques.webapptraining.repository.triathlonMori.TypeMoriRepository;
import jp.co.futureantiques.webapptraining.service.TriathlonMoriService;

/**
 * TriathlonMoriのサービス実装クラス
 *
 * @author future
 */
@Service
public class TriathlonMoriServiceImpl implements TriathlonMoriService{
	/** TriathlonMainMoriリポジトリ */
	private final TriathlonMainMoriRepository triathlonMainMoriRepository;

	/** TypeMoriリポジトリ */
	private final TypeMoriRepository typeMoriRepository;

	/** MakerMoriリポジトリ */
	private final MakerMoriRepository makerMoriRepository;

	/**
	 * コンストラクタ
	 *
	 * @param TriathlonMainMoriRepository triathlonMainMoriRepository
	 * @param TypeMoriRepository typeMoriRepository
	 * @param MakerMoriRepository makerMoriRepository
	 */

	@Autowired
	public TriathlonMoriServiceImpl(TriathlonMainMoriRepository triathlonMainMoriRepository, TypeMoriRepository typeMoriRepository,
			MakerMoriRepository makerMoriRepository) {
		this.triathlonMainMoriRepository = triathlonMainMoriRepository;
		this.typeMoriRepository = typeMoriRepository;
		this.makerMoriRepository = makerMoriRepository;
	}

	@Override
	public List<TypeMori> getListType() {

		// TypeテーブルのレコードをID順に取得する
		return typeMoriRepository.findAll(new Sort(Sort.Direction.ASC, "id"));
	}

	@Override
	public List<MakerMori> getListMaker() {

		// MakerテーブルのレコードをID順に取得する
		return makerMoriRepository.findAll(new Sort(Sort.Direction.ASC, "id"));
	}

	@Override
	public Page<TriathlonMainMori> getPageTriathlon(final TriathlonMoriSearchForm form, final Pageable pageable) {

		// 検索条件を生成しTriathlonMainMoriテーブルのレコードを取得する
		return triathlonMainMoriRepository.findAll(TriathlonMoriSpecification.generateTriathlonSpecification(form), pageable);
	}

	@Override
	public List<TriathlonMainMori> getListTriathlon(final TriathlonMoriSearchForm form) {

		// 検索条件を生成しMovieMainテーブルのレコードを取得する
		return triathlonMainMoriRepository.findAll(TriathlonMoriSpecification.generateTriathlonSpecification(form));
	}

	@Override
	public TriathlonMainMori getTriathlon(final long id) {

		// MovieMainテーブルを主キー検索する
		return triathlonMainMoriRepository.findOne(id);
	}

	@Override
	public TriathlonMainMori insertTriathlon(final TriathlonMoriInputForm form) {

		// MovieMainテーブルに新規でデータを登録する
		final TriathlonMainMori triathlonMainMori = form.convertToTriathlonMainMoriForInsert();

		//ファイルをアップロードする
		uploadFile(triathlonMainMori, form.getImage());

		return triathlonMainMoriRepository.save(triathlonMainMori);
	}

	@Override
	public TriathlonMainMori updateTriathlon(TriathlonMoriInputForm form) {

		// 更新対象のレコードを取得する
		TriathlonMainMori triathlonMainMori = triathlonMainMoriRepository.findOne((long) form.getId());
		if (triathlonMainMori != null) {

			// 更新対象のレコードが存在する場合排他チェック
			if (form.getUpdateDate().equals(String.valueOf(triathlonMainMori.getUpdateDate()))) {

				// チェックOKの場合、更新
				triathlonMainMori = form.convertToTriathlonMainMoriForUpdate(triathlonMainMori);

				if (form.getImage().isEmpty()) {

						//今あるデータベースの画像パスを入れとく
						String imageTemp = triathlonMainMori.getImage();

						//エンティティに画像パスを入れなおす
						triathlonMainMori.setImage(imageTemp);
						return triathlonMainMoriRepository.saveAndFlush(triathlonMainMori);
					}

				//ファイルをアップロードする
				uploadFile(triathlonMainMori, form.getImage());
				return triathlonMainMoriRepository.saveAndFlush(triathlonMainMori);
			}
		}
		return null;
	}

	@Override
	public void deleteTriathlonById(long id) {

		// 更新対象のレコードを取得する
		TriathlonMainMori triathlonMainMori = triathlonMainMoriRepository.findOne(id);
		if (triathlonMainMori != null) {

			// 更新対象のレコードが存在する場合、削除フラグを1にする
			triathlonMainMoriRepository.delete(id);
		}
	}

	@Override
	public void deleteTriathlonComp(ArrayList<Long> ids) {
		//対象のレコードの画像を削除する
		for (long id : ids) {
			File f = new File(CommonConst.STATIC_PATH + triathlonMainMoriRepository.findOne(id).getImage());
			if (f.exists()) {

				//ファイルが存在する場合削除
				f.delete();
			}
		}

	// 対象のレコードを削除する
		triathlonMainMoriRepository.deleteComp(ids);
	}

	/**
	 * 選択したファイルを指定のパスにアップロードする
	 * @param triathlonMainMori
	 * @param Image
	 */
	private void uploadFile(TriathlonMainMori ｔriathlonMainMori, MultipartFile image) {

		//画像を挿入していた場合の処理(挿入していなければNULLにするための条件式)
		if (!image.isEmpty()) {

			//追加する画像のファイルパス
			Path path = Paths.get(CommonConst.STATIC_PATH + "/TriathlonMori");

			//ファイル名をつけるため拡張子や現在日時を取得
			int dot = image.getOriginalFilename().lastIndexOf(".");
			String extention = "";
			if (dot > 0) {
				extention = image.getOriginalFilename().substring(dot).toLowerCase();
			}
			String filename = DateTimeFormatter.ofPattern("yyyyMMddHHmmssSSS").format(LocalDateTime.now());

			//エンティティに画像の値を入れる
			ｔriathlonMainMori.setImage("/TriathlonMori/" + filename + extention);

			//指定した場所にファイルを書き込む
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

