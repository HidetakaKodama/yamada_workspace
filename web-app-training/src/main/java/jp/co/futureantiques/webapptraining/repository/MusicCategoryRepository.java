package jp.co.futureantiques.webapptraining.repository;

import jp.co.futureantiques.webapptraining.model.MusicCategory;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * @author Created by YaoHaitao on 2018/3/16.
 * @since 2018-03-16 09:01
 */
public interface MusicCategoryRepository extends JpaRepository<MusicCategory, Long> {}
