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
import jp.co.futureantiques.webapptraining.model.form.vtuberUmehara.VtuberUmeharaInputForm;
import jp.co.futureantiques.webapptraining.model.form.vtuberUmehara.VtuberUmeharaSearchForm;
import jp.co.futureantiques.webapptraining.model.vtuberUmehara.CompanyUmehara;
import jp.co.futureantiques.webapptraining.model.vtuberUmehara.ContentsUmehara;
import jp.co.futureantiques.webapptraining.model.vtuberUmehara.FormsUmehara;
import jp.co.futureantiques.webapptraining.model.vtuberUmehara.VtuberMainUmehara;
import jp.co.futureantiques.webapptraining.repository.specification.VtuberUmeharaSpecification;
import jp.co.futureantiques.webapptraining.repository.vtuberUmehara.CompanyUmeharaRepository;
import jp.co.futureantiques.webapptraining.repository.vtuberUmehara.ContentsUmeharaRepository;
import jp.co.futureantiques.webapptraining.repository.vtuberUmehara.FormsUmeharaRepository;
import jp.co.futureantiques.webapptraining.repository.vtuberUmehara.VtuberMainUmeharaRepository;
import jp.co.futureantiques.webapptraining.service.VtuberUmeharaService;

/**
 * VtuberUmeharaのサービス実装クラス
 *
 * @author future
 */
@Service
public class VtuberUmeharaServiceImpl implements VtuberUmeharaService {

	/** VtuberMainUmeharaリポジトリ */
	private final VtuberMainUmeharaRepository vtuberMainUmeharaRepository;

	/** CompanyUmeharaリポジトリ */
	private final CompanyUmeharaRepository companyUmeharaRepository;

	/** FormsUmeharaリポジトリ */
	private final FormsUmeharaRepository formsUmeharaRepository;

	/** ContentsUmeharaリポジトリ */
	private final ContentsUmeharaRepository contentsUmeharaRepository;

	/**
	 * コンストラクタ
	 *
	 * @param VtuberMainUmeharaRepository vtuberMainUmeharaRepository
	 * @param CompanyUmeharaRepository companyUmeharaRepository
	 * @param FormsUmeharaRepository formsUmeharaRepository
	 * @param ContentsUmeharaRepository contentsUmeharaRepository
	 */
	@Autowired
	public VtuberUmeharaServiceImpl(VtuberMainUmeharaRepository vtuberMainUmeharaRepository,
			CompanyUmeharaRepository companyUmeharaRepository,
			FormsUmeharaRepository formsUmeharaRepository, ContentsUmeharaRepository contentsUmeharaRepository) {
		this.vtuberMainUmeharaRepository = vtuberMainUmeharaRepository;
		this.companyUmeharaRepository = companyUmeharaRepository;
		this.formsUmeharaRepository = formsUmeharaRepository;
		this.contentsUmeharaRepository = contentsUmeharaRepository;
	}

	@Override
	public List<FormsUmehara> getListFormsUmehara() {

		// FormsUmeharaテーブルのレコードをID順に取得する
		return formsUmeharaRepository.findAll(new Sort(Sort.Direction.ASC, "id"));
	}

	@Override
	public List<CompanyUmehara> getListCompanyUmehara() {

		// CompanyUmeharaテーブルのレコードをID順に取得する
		return companyUmeharaRepository.findAll(new Sort(Sort.Direction.ASC, "id"));
	}

	@Override
	public List<ContentsUmehara> getListContentsUmehara() {

		// ContentsUmeharaテーブルのレコードをID順に取得する
		return contentsUmeharaRepository.findAll(new Sort(Sort.Direction.ASC, "id"));
	}

	@Override
	public Page<VtuberMainUmehara> getPageVtuberUmehara(final VtuberUmeharaSearchForm form, final Pageable pageable) {

		// 検索条件を生成しVtuberMainUmeharaテーブルのレコードを取得する
		return vtuberMainUmeharaRepository.findAll(VtuberUmeharaSpecification.generateVtuberUmeharaSpecification(form),
				pageable);
	}

	@Override
	public List<VtuberMainUmehara> getListVtuberUmehara(final VtuberUmeharaSearchForm form) {

		// 検索条件を生成しVtuberMainUmeharaテーブルのレコードを取得する
		return vtuberMainUmeharaRepository.findAll(VtuberUmeharaSpecification.generateVtuberUmeharaSpecification(form));
	}

	@Override
	public VtuberMainUmehara getVtuberUmehara(final long id) {

		// VtuberMainUmeharaテーブルを主キー検索する
		return vtuberMainUmeharaRepository.findOne(id);
	}

	@Override
	public VtuberMainUmehara insertVtuberUmehara(final VtuberUmeharaInputForm form) {

		// VtuberMainUmeharaテーブルに新規でデータを登録する
		final VtuberMainUmehara vtuberMainUmehara = form.convertToVtuberMainUmeharaForInsert();
		//ファイルをアップロードする
		uploadFile(vtuberMainUmehara, form.getImage());

		return vtuberMainUmeharaRepository.save(vtuberMainUmehara);
	}

	@Override
	public VtuberMainUmehara updateVtuberUmehara(final VtuberUmeharaInputForm form) {

		//更新対象のレコードを取得
		VtuberMainUmehara vtuberMainUmehara = vtuberMainUmeharaRepository.findOne((long) form.getId());
		if (vtuberMainUmehara != null) {

			//更新対象のレコードが存在する場合排他チェック
			if (form.getUpdateDate().equals(String.valueOf(vtuberMainUmehara.getUpdateDate()))) {

				//チェックOKの場合、更新
				vtuberMainUmehara = form.convertToVtuberMainUmeharaForUpdate(vtuberMainUmehara);

				if (form.getImage().isEmpty()) {

					//もし画像削除フラグが１だった場合
					if (form.getImageDelFlg().matches("1")) {

						//対象のレコードの画像を削除する
						File f = new File(CommonConst.STATIC_PATH + vtuberMainUmehara.getImage());
						if (f.exists()) {

							//ファイルが存在する場合削除
							f.delete();
						}

						//vtuberMainUmeharaのimgをNULLにする（setImg）
						vtuberMainUmehara.setImage(null);

					} else {

						//今あるデータベースの画像パスを入れとく
						String imageTemp = vtuberMainUmehara.getImage();

						//エンティティに画像パスを入れなおす
						vtuberMainUmehara.setImage(imageTemp);
					}

					// 更新する
					return vtuberMainUmeharaRepository.saveAndFlush(vtuberMainUmehara);
				}

				//ファイルをアップロードする
				uploadFile(vtuberMainUmehara, form.getImage());

				return vtuberMainUmeharaRepository.saveAndFlush(vtuberMainUmehara);
			}
		}
		return null;
	}

	@Override
	public void deleteVtuberUmeharaById(final long id) {

		// 更新対象のレコードを取得する
		VtuberMainUmehara vtuberMainUmehara = vtuberMainUmeharaRepository.findOne(id);
		if (vtuberMainUmehara != null) {

			// 更新対象のレコードが存在する場合、削除フラグを1にする
			vtuberMainUmeharaRepository.delete(id);
		}
	}

	@Override
	public void deleteVtuberUmeharaComp(final ArrayList<Long> ids) {

		//対象のレコードの画像を削除する
		for (long id : ids) {
			File f = new File(CommonConst.STATIC_PATH + vtuberMainUmeharaRepository.findOne(id).getImage());
			if (f.exists()) {

				//ファイルが存在する場合削除
				f.delete();
			}
		}

		// 対象のレコードを削除する
		vtuberMainUmeharaRepository.deleteComp(ids);
	}

	/**
	 * 選択したファイルを指定のパスにアップロードする
	 * @param vtuberMainUmehara
	 * @param Image
	 */
	private void uploadFile(VtuberMainUmehara vtuberMainUmehara, MultipartFile image) {

		//画像を挿入していた場合の処理(挿入していなければNULLにするための条件式)
		if (!image.isEmpty()) {

			//追加する画像のファイルパス
			Path path = Paths.get(CommonConst.STATIC_PATH + "/VtuberUmehara");

			//ファイル名をつけるため拡張子や現在日時を取得
			int dot = image.getOriginalFilename().lastIndexOf(".");
			String extention = "";
			if (dot > 0) {
				extention = image.getOriginalFilename().substring(dot).toLowerCase();
			}
			String filename = DateTimeFormatter.ofPattern("yyyyMMddHHmmssSSS").format(LocalDateTime.now());

			//エンティティに画像の値を入れる
			vtuberMainUmehara.setImage("/VtuberUmehara/" + filename + extention);

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