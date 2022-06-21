package jp.co.futureantiques.webapptraining.service.impl;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import jp.co.futureantiques.webapptraining.model.form.resipeishikawa.ResipeIshikawaInputForm;
import jp.co.futureantiques.webapptraining.model.form.resipeishikawa.ResipeIshikawaSearchForm;
import jp.co.futureantiques.webapptraining.model.resipeishikawa.GenreIshikawa;
import jp.co.futureantiques.webapptraining.model.resipeishikawa.ResipeMainIshikawa;
import jp.co.futureantiques.webapptraining.model.resipeishikawa.VegetableIshikawa;
import jp.co.futureantiques.webapptraining.repository.resipeishikawa.GenreIshikawaRepository;
import jp.co.futureantiques.webapptraining.repository.resipeishikawa.ResipeMainIshikawaRepository;
import jp.co.futureantiques.webapptraining.repository.resipeishikawa.VegetableIshikawaRepository;
import jp.co.futureantiques.webapptraining.repository.specification.ResipeIshikawaSpecification;
import jp.co.futureantiques.webapptraining.service.ResipeIshikawaService;

/**
 *ResipeIshikawaのサービス実装クラス
 *
 * @author t.ishikawa
 */
@Service
public class ResipeIshikawaServiceImpl implements ResipeIshikawaService {

	/**ResipeMainIshikawaリポジトリ*/
	private final ResipeMainIshikawaRepository resipeMainIshikawaRepository;

	/**Vegetableリポジトリ*/
	private final VegetableIshikawaRepository vegetableIshikawaRepository;

	/**Genreリポジトリ*/
	private final GenreIshikawaRepository genreIshikawaRepository;

	/**
	 * コンストラクタ
	 *
	 * @param ResipeMainIshikawaRepository resipeMainIshikawaRepository
	 * @param VegetableIshikawaMainRepository vegetableIshikawaMainRepository
	 * @param GenreIshikawaMainRepository genreIshikawaMainRepository
	 */
	@Autowired
	public ResipeIshikawaServiceImpl(ResipeMainIshikawaRepository resipeMainIshikawaRepository,
			VegetableIshikawaRepository vegetableIshikawaRepository,GenreIshikawaRepository genreIshikawaRepository) {
		this.resipeMainIshikawaRepository = resipeMainIshikawaRepository;
		this.vegetableIshikawaRepository = vegetableIshikawaRepository;
		this.genreIshikawaRepository = genreIshikawaRepository;
	}

	@Override
	public List<VegetableIshikawa> getListVegetable(){

		//VegetableテーブルをID順に取得する
		return vegetableIshikawaRepository.findAll(new Sort(Sort.Direction.ASC,"id"));
	}

	@Override
	public List<GenreIshikawa> getListGenre(){

		//GenreテーブルをID順に取得する
		return genreIshikawaRepository.findAll(new Sort(Sort.Direction.ASC,"id"));
	}

	@Override
	public Page<ResipeMainIshikawa> getPageResipe(final ResipeIshikawaSearchForm form, Pageable pageable) {

		//検索条件を生成しResipeIsikawaMainテーブルのレコードを取得する
		return resipeMainIshikawaRepository.findAll(ResipeIshikawaSpecification.generateResipeIshiawaSpecification(form),pageable);
	}

	@Override
	public List<ResipeMainIshikawa> getListResipe(final ResipeIshikawaSearchForm form){

		//検索条件を生成しResipeIsikawaMainテーブルのレコードを取得する
		return resipeMainIshikawaRepository.findAll(ResipeIshikawaSpecification.generateResipeIshiawaSpecification(form));
	}

	@Override
	public ResipeMainIshikawa getResipe(final long id) {

		//ResipeMainIshikawaテーブルを主キー検索する
		return resipeMainIshikawaRepository.findOne(id);
	}

	@Override
	public ResipeMainIshikawa insertResipe(final ResipeIshikawaInputForm form) {

		//ResipeIshikawaテーブルに新規でデータを登録する
		final ResipeMainIshikawa resipeMainIshikawa = form.convertToResipeMainIshikawaForInsert();
		return resipeMainIshikawaRepository.save(resipeMainIshikawa);
	}

	@Override
	public ResipeMainIshikawa updateResipe(final ResipeIshikawaInputForm form) {

		//更新対象のレコードを取得する
		ResipeMainIshikawa resipeMainIshikawa  = resipeMainIshikawaRepository.findOne((long)form.getId());
		if(resipeMainIshikawa != null) {

			//更新対象のレコードが存在する場合排他チェック
			if(form.getUpdateDate().equals(String.valueOf(resipeMainIshikawa.getUpdateDate()))) {

				//チェックOKの場合、更新
				resipeMainIshikawa = form.convertToResipeMainIshikawaForUpdate(resipeMainIshikawa);
				return resipeMainIshikawaRepository.saveAndFlush(resipeMainIshikawa);
			}
		}
		return null;
	}
	@Override
	public void deleteResipeById(final long id) {

		//更新対象のレコードを取得する
		ResipeMainIshikawa resipeMainIshikawa = resipeMainIshikawaRepository.findOne(id);
		if(resipeMainIshikawa != null) {

			//更新対象のレコードが存在する場合、削除フラグを1にする
			resipeMainIshikawaRepository.delete(id);
		}
	}

	@Override
	public void deleteResipeComp(final ArrayList<Long> ids) {

		//対象のレコードを削除する
		resipeMainIshikawaRepository.deleteComp(ids);
	}
}