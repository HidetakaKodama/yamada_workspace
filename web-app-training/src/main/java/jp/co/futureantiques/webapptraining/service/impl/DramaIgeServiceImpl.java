package jp.co.futureantiques.webapptraining.service.impl;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import jp.co.futureantiques.webapptraining.model.dramaIge.BroadcastStationIge;
import jp.co.futureantiques.webapptraining.model.dramaIge.DayOfWeekIge;
import jp.co.futureantiques.webapptraining.model.dramaIge.DramaMainIge;
import jp.co.futureantiques.webapptraining.model.dramaIge.GenreIge;
import jp.co.futureantiques.webapptraining.model.dramaIge.SeasonIge;
import jp.co.futureantiques.webapptraining.model.form.dramaIge.DramaIgeInputForm;
import jp.co.futureantiques.webapptraining.model.form.dramaIge.DramaIgeSearchForm;
import jp.co.futureantiques.webapptraining.repository.dramaIge.BroadcastStationIgeRepository;
import jp.co.futureantiques.webapptraining.repository.dramaIge.DramaMainIgeRepository;
import jp.co.futureantiques.webapptraining.repository.dramaIge.GenreIgeRepository;
import jp.co.futureantiques.webapptraining.repository.specification.DramaIgeSpecification;
import jp.co.futureantiques.webapptraining.service.DramaIgeService;

/**
 * DramaIgeのサービス実装クラス
 *
 * @author Ige
 *
 */
@Service
public class DramaIgeServiceImpl implements DramaIgeService {

	/** DramaMainIgeリポジトリ*/
	private final DramaMainIgeRepository dramaMainIgeRepository;

	/** GenreIgeリポジトリ*/
	private final GenreIgeRepository genreIgeRepository;

	/** BroadcastStationIgeリポジトリ*/
	private final BroadcastStationIgeRepository broadcastStationIgeRepository;

	/**
	 * コンストラクタ
	 *
	 * @param DramaMainIgeRepository dramaMainIgeRepository
	 * @param GenreIgeRepository genreIgeRepository
	 * @param BroadcastStationIgeRepository broadcastStationIgeRepository
	 *
	 */
	@Autowired
	public DramaIgeServiceImpl(DramaMainIgeRepository dramaMainIgeRepository, GenreIgeRepository genreIgeRepository,
			BroadcastStationIgeRepository broadcastStationRepository) {
		this.dramaMainIgeRepository = dramaMainIgeRepository;
		this.genreIgeRepository = genreIgeRepository;
		this.broadcastStationIgeRepository = broadcastStationRepository;
	}

	@Override
	public List<GenreIge> getListGenreIge() {

		// GenreIgeテーブルのレコードをID順に取得する
		return genreIgeRepository.findAll(new Sort(Sort.Direction.ASC, "id"));
	}

	@Override
	public List<BroadcastStationIge> getListBroacastStationIge() {

		// BroadcastStationIgeテーブルのレコードをID順に取得する
		return broadcastStationIgeRepository.findAll(new Sort(Sort.Direction.ASC, "id"));
	}

	@Override
	public Page<DramaMainIge> getPageDramaMain(final DramaIgeSearchForm form, final Pageable pageable) {

		// 検索条件を生成しDramaMainテーブルのレコードを取得する
		return dramaMainIgeRepository.findAll(DramaIgeSpecification.generateDramaSpecification(form), pageable);
	}

	@Override
	public List<DramaMainIge> getListDramaMainIge(final DramaIgeSearchForm form) {

		// 検索条件を生成しDramaMainテーブルのレコードを取得する
		return dramaMainIgeRepository.findAll(DramaIgeSpecification.generateDramaSpecification(form));
	}

	@Override
	public DramaMainIge getDrama(final long id) {

		// DramaMainIgeテーブルを主キー検索する
		return dramaMainIgeRepository.findOne(id);
	}

	@Override
	public DramaMainIge insertDrama(final DramaIgeInputForm form) {

		// DramaMainテーブルにデータを新規登録する
		final DramaMainIge dramaMainIge = form.convertToDramaMainIgeForInsert();
		return dramaMainIgeRepository.save(dramaMainIge);
	}

	@Override
	public DramaMainIge updateDrama(DramaIgeInputForm form) {

		// 更新対象のレコードを取得する
		DramaMainIge dramaMainIge = dramaMainIgeRepository.findOne((long) form.getId());
		if (dramaMainIge != null) {

			// 更新対象のレコードが存在する場合排他チェック
			if (form.getUpdateDate().equals(String.valueOf(dramaMainIge.getUpdateDate()))) {

				// 削除フラグが1にされていた場合
				if (Integer.parseInt(dramaMainIge.getDelFlg()) == 1) {
					return null;
				}

				// チェックOKの場合、更新
				dramaMainIge = form.convertToDramaMainIgeForUpdate(dramaMainIge);
				return dramaMainIgeRepository.saveAndFlush(dramaMainIge);
			}
		}
		return null;
	}

	@Override
	public List<SeasonIge> getListSeasonIge() {

		// 季節のリストを作成する
		List<SeasonIge> list = new ArrayList<SeasonIge>();
		SeasonIge seasonIge = new SeasonIge();
		seasonIge.setId(0);
		seasonIge.setSeason("");
		list.add(seasonIge);
		SeasonIge seasonIge1 = new SeasonIge();
		seasonIge1.setId(1);
		seasonIge1.setSeason("春");
		list.add(seasonIge1);
		SeasonIge seasonIge2 = new SeasonIge();
		seasonIge2.setId(2);
		seasonIge2.setSeason("夏");
		list.add(seasonIge2);
		SeasonIge seasonIge3 = new SeasonIge();
		seasonIge3.setId(3);
		seasonIge3.setSeason("秋");
		list.add(seasonIge3);
		SeasonIge seasonIge4 = new SeasonIge();
		seasonIge4.setId(4);
		seasonIge4.setSeason("冬");
		list.add(seasonIge4);
		return list;
	}

	@Override
	public List<DayOfWeekIge> getListDayOfWeekIge() {

		// 曜日のリストを作る
		List<DayOfWeekIge> list = new ArrayList<DayOfWeekIge>();
		DayOfWeekIge dayOfWeekIge = new DayOfWeekIge();
		dayOfWeekIge.setId(0);
		dayOfWeekIge.setDayOfWeek("");
		list.add(dayOfWeekIge);
		DayOfWeekIge dayOfWeekIge1 = new DayOfWeekIge();
		dayOfWeekIge1.setId(1);
		dayOfWeekIge1.setDayOfWeek("月");
		list.add(dayOfWeekIge1);
		DayOfWeekIge dayOfWeekIge2 = new DayOfWeekIge();
		dayOfWeekIge2.setId(2);
		dayOfWeekIge2.setDayOfWeek("火");
		list.add(dayOfWeekIge2);
		DayOfWeekIge dayOfWeekIge3 = new DayOfWeekIge();
		dayOfWeekIge3.setId(3);
		dayOfWeekIge3.setDayOfWeek("水");
		list.add(dayOfWeekIge3);
		DayOfWeekIge dayOfWeekIge4 = new DayOfWeekIge();
		dayOfWeekIge4.setId(4);
		dayOfWeekIge4.setDayOfWeek("木");
		list.add(dayOfWeekIge4);
		DayOfWeekIge dayOfWeekIge5 = new DayOfWeekIge();
		dayOfWeekIge5.setId(5);
		dayOfWeekIge5.setDayOfWeek("金");
		list.add(dayOfWeekIge5);
		DayOfWeekIge dayOfWeekIge6 = new DayOfWeekIge();
		dayOfWeekIge6.setId(6);
		dayOfWeekIge6.setDayOfWeek("土");
		list.add(dayOfWeekIge6);
		DayOfWeekIge dayOfWeekIge7 = new DayOfWeekIge();
		dayOfWeekIge7.setId(7);
		dayOfWeekIge7.setDayOfWeek("日");
		list.add(dayOfWeekIge7);
		return list;
	}

	@Override
	public void deleteDramaById(long id) {

		// 更新対象のレコードを取得する
		DramaMainIge dramaMainIge = dramaMainIgeRepository.findOne(id);
		if (dramaMainIge != null) {

			// 更新対象のレコードが存在する場合、削除フラグを1にする
			dramaMainIgeRepository.delete(id);
		}
	}

	@Override
	public void deleteDramaComp(ArrayList<Long> ids) {

		// 対象のレコードを削除する
		dramaMainIgeRepository.deleteComp(ids);
	}

	@Override
	public void restoreById(long id) {

		// 対象のレコードを取得
		DramaMainIge dramaMainIge = dramaMainIgeRepository.findOne(id);
		if(dramaMainIge !=null) {

			// 対象のレコードの削除フラグを0にする
			dramaMainIgeRepository.restore(id);
		}
	}
}
