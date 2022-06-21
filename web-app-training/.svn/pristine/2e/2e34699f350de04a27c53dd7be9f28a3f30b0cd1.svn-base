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
import jp.co.futureantiques.webapptraining.model.drinkYoshimoto.DrinkCategoryYoshimoto;
import jp.co.futureantiques.webapptraining.model.drinkYoshimoto.DrinkMainYoshimoto;
import jp.co.futureantiques.webapptraining.model.drinkYoshimoto.DrinkMakerYoshimoto;
import jp.co.futureantiques.webapptraining.model.form.drinkYoshimoto.DrinkYoshimotoInputForm;
import jp.co.futureantiques.webapptraining.model.form.drinkYoshimoto.DrinkYoshimotoSearchForm;
import jp.co.futureantiques.webapptraining.repository.drinkYoshimoto.DrinkCategoryYoshimotoRepository;
import jp.co.futureantiques.webapptraining.repository.drinkYoshimoto.DrinkMainYoshimotoRepository;
import jp.co.futureantiques.webapptraining.repository.drinkYoshimoto.DrinkMakerYoshimotoRepository;
import jp.co.futureantiques.webapptraining.repository.specification.DrinkYoshimotoSpecification;
import jp.co.futureantiques.webapptraining.service.DrinkYoshimotoService;

/**
 * DrinkYoshimotoのサービス実装クラス
 *
 * @author Yoshimoto
 *
 */
@Service
public class DrinkYoshimotoServiceImpl implements DrinkYoshimotoService {

	/** DrinkMainYoshimotoリポジトリ */
	private final DrinkMainYoshimotoRepository drinkMainYoshimotoRepository;

	/** DrinkCategoryYoshimotoリポジトリ */
	private final DrinkCategoryYoshimotoRepository drinkCategoryYoshimotoRepository;

	/** DrinkMakerYoshimotoリポジトリ */
	private final DrinkMakerYoshimotoRepository drinkMakerYoshimotoRepository;

	/**
	 * コンストラクタ
	 *
	 * @param DrinkMainYoshimotoRepository
	 * @param DrinkCategoryYoshimotoRepository
	 * @param DrinkMakerYoshimotoRepository
	 */
	@Autowired
	public DrinkYoshimotoServiceImpl(DrinkMainYoshimotoRepository drinkMainYoshimotoRepository,
			DrinkCategoryYoshimotoRepository drinkCategoryYoshimotoRepository,
			DrinkMakerYoshimotoRepository drinkMakerYoshimotoRepository) {
		this.drinkMainYoshimotoRepository = drinkMainYoshimotoRepository;
		this.drinkCategoryYoshimotoRepository = drinkCategoryYoshimotoRepository;
		this.drinkMakerYoshimotoRepository = drinkMakerYoshimotoRepository;
	}

	@Override
	public List<DrinkCategoryYoshimoto> getListDrinkCategoryYoshimoto() {

		//CategoryテーブルのレコードをID順に取得する
		return drinkCategoryYoshimotoRepository.findAll(new Sort(Sort.Direction.ASC, "categoryId"));
	}

	@Override
	public List<DrinkMakerYoshimoto> getListDrinkMakerYoshimoto() {

		//MakerテーブルのレコードをID順に取得
		return drinkMakerYoshimotoRepository.findAll(new Sort(Sort.Direction.ASC, "makerId"));
	}

	@Override
	public Page<DrinkMainYoshimoto> getPageDrinkMain(final DrinkYoshimotoSearchForm form, final Pageable pageable) {

		//検索条件を生成しDrinkMainYoshimotoテーブルのレコードを取得
		return drinkMainYoshimotoRepository
				.findAll(DrinkYoshimotoSpecification.drinkCategoryYoshimotoSpecification(form), pageable);
	}

	@Override
	public List<DrinkMainYoshimoto> getListDrinkMainYoshimoto(final DrinkYoshimotoSearchForm form) {

		//検索条件を生成しDrinkMainYoshimotoテーブルのレコードを取得
		return drinkMainYoshimotoRepository
				.findAll(DrinkYoshimotoSpecification.drinkCategoryYoshimotoSpecification(form));
	}

	@Override
	public DrinkMainYoshimoto getDrink(final long id) {

		//DrinkMainYoshimotoテーブルを主キー検索する
		return drinkMainYoshimotoRepository.findOne(id);
	}

	@Override
	public DrinkMainYoshimoto insertDrink(DrinkYoshimotoInputForm form) {

		//DrinkMainYoshimotoテーブルに新規でデータを登録する
		final DrinkMainYoshimoto drinkMainYoshimoto = form.convertToDrinkMainYoshimotoForInsert();
		//ファイルをアップロードする
		uploadFile(drinkMainYoshimoto, form.getImage());
		return drinkMainYoshimotoRepository.save(drinkMainYoshimoto);
	}

	@Override
	public DrinkMainYoshimoto updateDrink(DrinkYoshimotoInputForm form) {

		//更新対象のレコードを取得する
		DrinkMainYoshimoto drinkMainYoshimoto = drinkMainYoshimotoRepository.findOne((long) form.getDrinkId());
		if (drinkMainYoshimoto != null) {

			//更新対象のレコードが存在する場合排他チェック
			if (form.getUpdateDate().equals(String.valueOf(drinkMainYoshimoto.getUpdateDate()))) {

				//削除フラグが１だったとき
				if (Integer.parseInt(drinkMainYoshimoto.getDelFlg()) == 1) {
					return null;
				}

				//チェックOkの場合
				drinkMainYoshimoto = form.convertToDrinkMainYoshimotoForUpdate(drinkMainYoshimoto);
				if (form.getImage().isEmpty()) {

					//画像削除フラグが１だった場合
					if (form.getImageDelFlg().matches("1")) {

						//対象のレコードの画像を削除する
						File f = new File(CommonConst.STATIC_PATH + drinkMainYoshimoto.getImage());
						if (f.exists()) {

							//ファイルが存在する場合削除
							f.delete();
						}

						//drinkMainYoshimotoのimgをNULLにする(setImg)
						drinkMainYoshimoto.setImage(null);
					} else {

						//今あるデータベースの画像パスを入れておく
						String imageTemp = drinkMainYoshimoto.getImage();

						//エンティティに画像パスをいれなおす
						drinkMainYoshimoto.setImage(imageTemp);
					}

					//更新を実行
					drinkMainYoshimotoRepository.saveAndFlush(drinkMainYoshimoto);
				}
				//ファイルをアップロード
				uploadFile(drinkMainYoshimoto, form.getImage());

				//更新を実行
				return drinkMainYoshimotoRepository.saveAndFlush(drinkMainYoshimoto);

			}
		}
		return null;
	}

	@Override
	public void deleteDrinkById(long id) {

		//更新対象のレコードが存在する場合、削除フラグを1にする
		drinkMainYoshimotoRepository.delete(id);
	}

	@Override
	public void deleteDrinkComp(ArrayList<Long> ids) {

		//対象のレコードを削除する
		drinkMainYoshimotoRepository.deleteComp(ids);
	}

	/**
	 * 選択したファイルを指定のパスにアップロードする
	 * @param DrinkMainYoshimoto drinkMainYoshimoto
	 * @param MultiPartFile image
	 */
	private void uploadFile(DrinkMainYoshimoto drinkMainYoshimoto, MultipartFile image) {

		//画像を挿入していた場合（挿入していなければNULL)
		if (!image.isEmpty()) {

			//追加する画像のファイルパス、Cドライブからstaticまでのパス
			Path path = Paths.get(CommonConst.STATIC_PATH + "/DrinkImageYoshimoto");

			//ファイル名を付けるため拡張子や現在日時を取得
			int dot = image.getOriginalFilename().lastIndexOf(".");
			String extention = "";
			if (dot > 0) {

				//拡張子を小文字にする
				extention = image.getOriginalFilename().substring(dot).toLowerCase();
			}
			String fileName = DateTimeFormatter.ofPattern("yyyyMMddHHmmssSSS").format(LocalDateTime.now());

			//エンティティに画像の値を入れる
			drinkMainYoshimoto.setImage("/DrinkImageYoshimoto/" + fileName + extention);

			//指定した場所にファイルを書き込む
			path = path.resolve(fileName + extention);
			try (OutputStream os = Files.newOutputStream(path, StandardOpenOption.CREATE)) {
				byte[] bytes = image.getBytes();
				os.write(bytes);
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}

}
