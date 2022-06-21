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
import jp.co.futureantiques.webapptraining.model.form.penguinKawamura.PenguinInputForm;
import jp.co.futureantiques.webapptraining.model.form.penguinKawamura.PenguinSearchForm;
import jp.co.futureantiques.webapptraining.model.penguinKawamura.AttributeKawamura;
import jp.co.futureantiques.webapptraining.model.penguinKawamura.PenguinMainKawamura;
import jp.co.futureantiques.webapptraining.repository.penguinKawamura.AttributeKawamuraRepository;
import jp.co.futureantiques.webapptraining.repository.penguinKawamura.PenguinMainKawamuraRepository;
import jp.co.futureantiques.webapptraining.repository.specification.PenguinKawamuraSpecification;
import jp.co.futureantiques.webapptraining.service.PenguinKawamuraService;

/**
 * PenguinKawammuraServiceインターフェイスの実装クラス
 * @author Mariko Kawamura
 */
@Service
public class PenguinKawamuraServiceImpl implements PenguinKawamuraService {

	/** PenguinMainKawamuraリポジトリ */
	private final PenguinMainKawamuraRepository penguinMainKawamuraRepository;

	/** AttributeKawamuraリポジトリ */
	private final AttributeKawamuraRepository attributeKawamuraRepository;

	/** コンストラクタ
	 * @param PenguinMainKawamuraRepository penguinMainKawamuraRepository
	 * @param AttributeKawamuraRepository attributeKawamuraRepository
	 */
	@Autowired
	public PenguinKawamuraServiceImpl(PenguinMainKawamuraRepository penguinMainKawamuraRepository,
			AttributeKawamuraRepository attributeKawamuraRepository) {
		this.penguinMainKawamuraRepository = penguinMainKawamuraRepository;
		this.attributeKawamuraRepository = attributeKawamuraRepository;
	}

	@Override
	public List<AttributeKawamura> getListAttributeKawamura() {

		//attribute_kawamuraテーブルのリストをID順に取得する
		return attributeKawamuraRepository.findAll(new Sort(Sort.Direction.ASC, "attributeId"));

	}

	@Override
	public Page<PenguinMainKawamura> getPagePenguin(final PenguinSearchForm form, final Pageable pageable) {

		//検索条件を生成し、penguin_main_kawamura	テーブルのリストを取得する(Paging)
		return penguinMainKawamuraRepository.findAll(
				PenguinKawamuraSpecification.generatePenguinKawamuraSpecification(form), pageable);
	}

	@Override
	public List<PenguinMainKawamura> getListPenguin(final PenguinSearchForm form) {

		//検索条件を生成し、penguin_main_kawamuraテーブルのリストを取得する
		return penguinMainKawamuraRepository.findAll(
				PenguinKawamuraSpecification.generatePenguinKawamuraSpecification(form));
	}

	@Override
	public PenguinMainKawamura getPenguin(final long id) {

		//penguin_main_kawamuraテーブルを主キー検索
		return penguinMainKawamuraRepository.findOne(id);
	}

	@Override
	public PenguinMainKawamura insertPenguin(final PenguinInputForm form) {

		//penguin_main_kawamuraテーブルに新規でデータを登録する
		final PenguinMainKawamura penguinMainKawamura = form.converToPenguinMainKawamuraForInsert();

		//ファイルをアップロードする
		uploadFile(penguinMainKawamura, form.getImage());

		return penguinMainKawamuraRepository.save(penguinMainKawamura);
	}

	@Override
	public PenguinMainKawamura updatePenguin(final PenguinInputForm form) {

		//更新対象のレコードを取得
		PenguinMainKawamura penguinMainKawamura = penguinMainKawamuraRepository.findOne((long) form.getId());
		if (penguinMainKawamura != null) {

			//更新対象のレコードが存在する場合排他チェック
			if (form.getUpdateDate().equals(String.valueOf(penguinMainKawamura.getUpdateDate()))) {

				//チェックOKの場合、更新
				penguinMainKawamura = form.converToPenguinMainKawamuraForUpdate(penguinMainKawamura);

				if (form.getImage().isEmpty()) {

					//もし画像削除フラグが１だった場合
					if (form.getImageDelFlg().matches("1")) {

						//対象のレコードの画像を削除する
						File f = new File(CommonConst.STATIC_PATH + penguinMainKawamura.getImage());
						if (f.exists()) {

							//ファイルが存在する場合削除
							f.delete();
						}

						//penguinMainKawamuraのimgをNULLにする（setImg）
						penguinMainKawamura.setImage(null);

					} else {

						//今あるデータベースの画像パスを入れとく
						String imageTemp = penguinMainKawamura.getImage();

						//エンティティに画像パスを入れなおす
						penguinMainKawamura.setImage(imageTemp);
					}

					// 更新する
					return penguinMainKawamuraRepository.saveAndFlush(penguinMainKawamura);
				}

				//ファイルをアップロードする
				uploadFile(penguinMainKawamura, form.getImage());

				return penguinMainKawamuraRepository.saveAndFlush(penguinMainKawamura);
			}
		}
		return null;
	}

	@Override
	public void deletePenguinById(final long id) {

		//更新対象レコードを取得
		PenguinMainKawamura penguinMainKawamura = penguinMainKawamuraRepository.findOne(id);
		if (penguinMainKawamura != null) {

			//更新対象のレコードが存在した場合、削除フラグを１にする
			penguinMainKawamuraRepository.delete(id);
		}
	}

	@Override
	public void deletePenguinComp(final ArrayList<Long> ids) {
		//対象のレコードの画像を削除する
		for (long id : ids) {
			File f = new File(CommonConst.STATIC_PATH + penguinMainKawamuraRepository.findOne(id).getImage());
			if (f.exists()) {

				//ファイルが存在する場合削除
				f.delete();
			}
		}

		//対象のレコードを削除する
		penguinMainKawamuraRepository.deleteComp(ids);
	}

	/**
	 * 選択したファイルを指定のパスにアップロードする
	 * @param penguinMainKawamura
	 * @param Image
	 */
	private void uploadFile(PenguinMainKawamura penguinMainKawamura, MultipartFile image) {

		//画像を挿入していた場合の処理(挿入していなければNULLにするための条件式)
		if (!image.isEmpty()) {

			//追加する画像のファイルパス
			Path path = Paths.get(CommonConst.STATIC_PATH + "/PenguinKawamura");

			//ファイル名をつけるため拡張子や現在日時を取得
			int dot = image.getOriginalFilename().lastIndexOf(".");
			String extention = "";
			if (dot > 0) {
				extention = image.getOriginalFilename().substring(dot).toLowerCase();
			}
			String filename = DateTimeFormatter.ofPattern("yyyyMMddHHmmssSSS").format(LocalDateTime.now());

			//エンティティに画像の値を入れる
			penguinMainKawamura.setImage("/PenguinKawamura/" + filename + extention);

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
