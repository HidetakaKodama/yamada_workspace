package jp.co.futureantiques.webapptraining.repository.nbaplayersTakahashi;

import java.util.ArrayList;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.transaction.annotation.Transactional;

import jp.co.futureantiques.webapptraining.model.nbaplayersTakahashi.NbaplayersMainTakahashi;

/**
 * NbaplayersMainTakahashiリポジトリのインターフェース
 *
 * @author TakumiTakahashi
 */

public interface NbaplayersMainTakahashiRepository
		extends JpaRepository<NbaplayersMainTakahashi, Long>, JpaSpecificationExecutor<NbaplayersMainTakahashi> {

	/**
	 * 対象レコードの削除フラグを１にする
	 *
	 * @param long id
	 */
	@Transactional
	@Modifying
	@Query("UPDATE NbaplayersMainTakahashi SET delFlg = 1 WHERE id = :id")
	void delete(@Param("id") final long id);

	/**
	 * 対象レコードを削除する
	 *
	 * @param ArrayList<Long> ids
	 */
	@Transactional
	@Modifying
	@Query("DELETE FROM NbaplayersMainTakahashi WHERE id IN (:ids)")
	void deleteComp(@Param("ids") final ArrayList<Long> ids);

}
