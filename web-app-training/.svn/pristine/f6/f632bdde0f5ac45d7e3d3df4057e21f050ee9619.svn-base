package jp.co.futureantiques.webapptraining.repository.dogKanno;

import java.util.ArrayList;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.transaction.annotation.Transactional;

import jp.co.futureantiques.webapptraining.model.dogKanno.DogMainKanno;

/**
 * DogMainKannoリポジトリのインターフェイス
 *
 * @author future
 */
public interface DogMainKannoRepository
		extends JpaRepository<DogMainKanno, Long>, JpaSpecificationExecutor<DogMainKanno> {

	/**
	 * 対象レコードの削除フラグを1にする
	 *
	 * @param long id
	 */
	@Transactional
	@Modifying
	@Query("UPDATE DogMainKanno SET delFlg = 1 WHERE dogId = :id")
	void delete(@Param("id") final long id);

	/**
	 * 対象のレコードを削除する
	 *
	 * @param ArrayList<Long> ids
	 */
	@Transactional
	@Modifying
	@Query("DELETE FROM DogMainKanno WHERE dogId IN(:ids)")
	void deleteComp(@Param("ids") final ArrayList<Long> ids);
}
