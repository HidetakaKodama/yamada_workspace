package jp.co.futureantiques.webapptraining.repository.playerKuramoto;

import org.springframework.data.jpa.repository.JpaRepository;

import jp.co.futureantiques.webapptraining.model.playerKuramoto.PlayerBtKuramoto;

/**
 * BtKuramotoリポジトリのインターフェース
 *
 * @author future
 */
public interface BtKuramotoRepository extends JpaRepository<PlayerBtKuramoto, Long> {
}