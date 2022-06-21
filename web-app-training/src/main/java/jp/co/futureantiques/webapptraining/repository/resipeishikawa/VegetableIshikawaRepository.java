package jp.co.futureantiques.webapptraining.repository.resipeishikawa;

import org.springframework.data.jpa.repository.JpaRepository;

import jp.co.futureantiques.webapptraining.model.resipeishikawa.VegetableIshikawa;

/**
 * Vegetableリポジトリのインターフェース
 *
 *@author t.ishikawa
 */
public interface VegetableIshikawaRepository extends JpaRepository<VegetableIshikawa,Long> {
}