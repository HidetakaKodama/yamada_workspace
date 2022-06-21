package jp.co.futureantiques.webapptraining.model.perfumeAnzai;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.Transient;

import lombok.Data;

@Data
@Entity
public class TieupAnzai {

	/** タイアップID**/
	@Id
	@GeneratedValue
	@Column(name = "id")
	private long id;

	/** タイアップ名**/
	@Column(name = "tieup")
	private String tieup;

	/**削除フラグ**/
	@Column(name = "del_flg")
	private String delFlg;

	/**登録日時**/
	@Column(name = "create_date")
	private String createDate;

	/**更新日時**/
	@Column(name = "update_date")
	private String updateDate;

	/**外部キー設定：　アルバムID**/
	@Transient
	@OneToMany(targetEntity = PerfumeMainAnzai.class, mappedBy = "tieup")
	@JoinColumn(name = "id", referencedColumnName = "tieup_id")
	private List<PerfumeMainAnzai> perfumeMainList;

}
