package jp.co.futureantiques.webapptraining.repository.animeWatanabe;

import java.util.ArrayList;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.transaction.annotation.Transactional;

import jp.co.futureantiques.webapptraining.model.animeWatanabe.AnimeMainWatanabe;

/**
 *AnimeMainWatanabeリポジトリのインターフェス
 *
 *@author Watanabe
 */
public interface AnimeMainWatanabeRepository
		extends JpaRepository<AnimeMainWatanabe, Long>, JpaSpecificationExecutor<AnimeMainWatanabe> {

	/**
	 * 対象レコードの削除フラグを1にする
	 *
	 * @param long id
	 */
	@Transactional
	@Modifying
	@Query("UPDATE AnimeMainWatanabe SET delFlg = 1 WHERE id = :id")
	void delete(@Param("id") final long id);

	/**
	 * 対象のレコードを削除する
	 *
	 * @param ArrayList<Long> ids
	 */
	@Transactional
	@Modifying
	@Query("DELETE FROM AnimeMainWatanabe WHERE id IN(:ids)")
	void deleteComp(@Param("ids") final ArrayList<Long> ids);
}
