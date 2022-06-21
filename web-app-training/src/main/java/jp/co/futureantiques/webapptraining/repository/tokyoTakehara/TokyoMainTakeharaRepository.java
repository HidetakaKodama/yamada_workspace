package jp.co.futureantiques.webapptraining.repository.tokyoTakehara;

import java.util.ArrayList;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.transaction.annotation.Transactional;

import jp.co.futureantiques.webapptraining.model.tokyoTakehara.TokyoMainTakehara;

/**
 * TokyoMainTakeharaリポジトリのインターフェース
 *
 */
public interface TokyoMainTakeharaRepository
		extends JpaRepository<TokyoMainTakehara, Integer>, JpaSpecificationExecutor<TokyoMainTakehara> {

	/**
	 * 対象レコードの削除フラグを1にする
	 * @param int id
	 */
	@Transactional
	@Modifying
	@Query("UPDATE TokyoMainTakehara SET delFlg = 1 WHERE id = :id")
	void delete(@Param("id") final int id);

	/**
	 * 対象レコードの削除フラグを0にする
	 * @param int id
	 * @author Y.Takehara
	 */
	@Transactional
	@Modifying
	@Query("UPDATE TokyoMainTakehara SET delFlg = 0 WHERE id IN(:ids)")
	void restore(@Param("ids") final ArrayList<Integer> ids);

	/**
	 * 対象のレコードを削除する
	 *
	 * @param ArrayList<Integer> ids
	 */
	@Transactional
	@Modifying
	@Query("DELETE FROM TokyoMainTakehara WHERE id IN(:ids)")
	void deleteComp(@Param("ids") final ArrayList<Integer> ids);
}
