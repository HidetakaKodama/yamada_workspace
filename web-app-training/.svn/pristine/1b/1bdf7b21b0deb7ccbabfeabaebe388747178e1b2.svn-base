package jp.co.futureantiques.webapptraining.model.tokyoTakehara;

import java.sql.Timestamp;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.Transient;

import lombok.Data;

/**
 * TokyoMainTakeharaテーブルと対応するEntity
 *
 */
@Data
@Entity
public class LocationTakehara {

	/** 地域ID */
	@Id
	@Column(name = "location_id")
	private int locationId;

	/** 地域名 */
	@Column(name = "location_name")
	private String locationName;

	/** 削除フラグ */
	@Column(name = "del_flg")
	private String delFlg;

	/** 登録日時 */
	@Column(name = "create_date")
	private Timestamp createDate;

	/** 更新日時 */
	@Column(name = "update_date")
	private Timestamp updateDate;

	/** 外部キー設定：所在地ID */
	@Transient
	@OneToMany(targetEntity = TokyoMainTakehara.class, mappedBy = "location_name")
	@JoinColumn(name = "location_id", referencedColumnName = "location_id")
	private List<TokyoMainTakehara> tokyoMainTakeharaList;
}
