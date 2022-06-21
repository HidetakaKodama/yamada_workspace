package jp.co.futureantiques.webapptraining.model.dogKanno;

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
 * DogCountryKannoと対応するEntityクラス
 *
 * @author future
 */
@Data
@Entity
public class DogCountryKanno {

	/** 原産国ID */
	@Id
	@GeneratedValue
	@Column(name = "id")
	private int id;

	/** 国名 */
	@Column(name = "country")
	@Size(max = 256)
	private String country;

	/** 削除フラグ */
	@Column(name = "del_flg")
	private String delFlg;

	/** 登録日時 */
	@Column(name = "create_date")
	private Timestamp createDate;

	/** 更新日時 */
	@Column(name = "update_date")
	private Timestamp updateDate;

	/** 外部キー設定：原産国ID */
	@Transient
	@OneToMany(targetEntity = DogMainKanno.class, mappedBy = "dogCountryKanno")
	@JoinColumn(name = "id", referencedColumnName = "country_id")
	private List<DogMainKanno> dogMainList;

}
