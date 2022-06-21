package jp.co.futureantiques.webapptraining.model.animeWatanabe;

import java.sql.Timestamp;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.Transient;
import javax.validation.constraints.Size;

import lombok.Data;

/**
 * CompanyWatanabeテーブルと対応するEntity
 *
 * @author Watanabe
 */
@Data
@Entity
public class CompanyWatanabe {

	/** アニメ制作会社ID */
	@Id
	@GeneratedValue
	@Column(name = "id")
	private long id;

	/** 制作会社名 */
	@Column(name = "name")
	@Size(max = 256)
	private String name;

	/** 削除フラグ */
	@Column(name = "del_flg")
	private String delFlg;

	/** 登録日時 */
	@Column(name = "create_date")
	private Timestamp createDate;

	/** 更新日時 */
	@Column(name = "update_date")
	private Timestamp updateDate;

	/** 外部キー設定：アニメ制作会社ID */
	@Transient
	@OneToMany(targetEntity = AnimeMainWatanabe.class, mappedBy = "companyWatanabe")
	@JoinColumn(name = "id", referencedColumnName = "company_id")
	private List<AnimeMainWatanabe> animeMainList;
}
