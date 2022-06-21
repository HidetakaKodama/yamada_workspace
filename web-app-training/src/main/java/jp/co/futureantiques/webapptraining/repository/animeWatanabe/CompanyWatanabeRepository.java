package jp.co.futureantiques.webapptraining.repository.animeWatanabe;

import org.springframework.data.jpa.repository.JpaRepository;

import jp.co.futureantiques.webapptraining.model.animeWatanabe.CompanyWatanabe;

/**
 * CompanyWatanabeリポジトリのインターフェイス
 *
 * @author Watanabe
 */
public interface CompanyWatanabeRepository extends JpaRepository<CompanyWatanabe, Long> {

}
