package jp.co.futureantiques.webapptraining.repository.dogKanno;

import org.springframework.data.jpa.repository.JpaRepository;

import jp.co.futureantiques.webapptraining.model.dogKanno.DogCountryKanno;

/**
 * DogCountryKannoリポジトリのインターフェイス
 *
 * @author future
 */
public interface DogCountryKannoRepository extends JpaRepository<DogCountryKanno, Long> {

}
