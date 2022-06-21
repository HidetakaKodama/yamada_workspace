package jp.co.futureantiques.webapptraining.repository.triathlonMori;

import org.springframework.data.jpa.repository.JpaRepository;

import jp.co.futureantiques.webapptraining.model.triathlonMori.MakerMori;

/**
 * MakerMoriリポジトリのインターフェース
 *
 * @author future
 */
public interface MakerMoriRepository extends JpaRepository<MakerMori, Long> {
}