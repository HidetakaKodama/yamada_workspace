package jp.co.futureantiques.webapptraining.repository;

import jp.co.futureantiques.webapptraining.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * 詳細：https://gist.github.com/ryo-murai/3741340
 * @author Created by YaoHaitao on 2018/3/13.
 * @since 2018-03-13 14:56
 */
public interface UserRepository extends JpaRepository<User, Long> {

    User findByUsername(String username);
}