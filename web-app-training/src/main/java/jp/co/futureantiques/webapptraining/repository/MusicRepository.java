package jp.co.futureantiques.webapptraining.repository;

import jp.co.futureantiques.webapptraining.model.Music;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;

/**
 * @author Created by YaoHaitao on 2018/3/16.
 * @since 2018-03-16 08:59
 */
public interface MusicRepository extends JpaRepository<Music, Long>, JpaSpecificationExecutor<Music> {}
