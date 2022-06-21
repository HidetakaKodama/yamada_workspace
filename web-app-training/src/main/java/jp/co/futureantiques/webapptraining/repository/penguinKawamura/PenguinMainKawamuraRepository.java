package jp.co.futureantiques.webapptraining.repository.penguinKawamura;

import java.util.ArrayList;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.transaction.annotation.Transactional;

import jp.co.futureantiques.webapptraining.model.penguinKawamura.PenguinMainKawamura;

/**
 * PenguinMainKawamuraリポジトリのインターフェース
 * @author Mariko Kawamura
 */
public interface PenguinMainKawamuraRepository
		extends JpaRepository<PenguinMainKawamura, Long>, JpaSpecificationExecutor<PenguinMainKawamura>{

	/**
	 * 対象レコードの削除フラグを１にする
	 * @param long id
	 */
	@Transactional
	@Modifying
	@Query("update PenguinMainKawamura set delFlg=1 where id= :id")
	void delete(@Param("id") final long id);

	/**
	 * 対象レコードを削除する
	 * @param ArrayList<Long> ids
	 */
	@Transactional
	@Modifying
	@Query("delete from PenguinMainKawamura where id in (:ids)")
	void deleteComp(@Param("ids") final ArrayList<Long> ids);

}
