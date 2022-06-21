package jp.co.futureantiques.webapptraining.repository.triathlonMori;

import org.springframework.data.jpa.repository.JpaRepository;

import jp.co.futureantiques.webapptraining.model.triathlonMori.TypeMori;

/**
 * TypeMoriリポジトリのインターフェース
 *
 * @author future
 */
public interface TypeMoriRepository extends JpaRepository<TypeMori, Long> {
}