package jp.co.futureantiques.webapptraining.model.tokyoTakehara;

import java.sql.Timestamp;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

import org.hibernate.annotations.GenericGenerator;

import lombok.Data;

/**
 * TokyoMainTakeharaテーブルと対応するEntity
 *
 */
@Data
@Entity
public class TokyoMainTakehara {

	/** 区ID */
	@Id
	@GenericGenerator(name = "gen", strategy = "increment")
	@GeneratedValue(generator = "gen")
	private int id;

	/** 区名 */
	@Column(name = "ward_name")
	private String wardName;

	/** 区章 */
	@Column(name = "symbol")
	private String symbol;

	/** 地域ID */
	@Column(name = "location_id")
	private int locationId;

	/** 人口 */
	@Column(name = "population")
	private Integer population;

	/** 面積(㎢) */
	@Column(name = "area")
	private Float area;

	/** 区役所の最寄駅 */
	@Column(name = "ward_office")
	private String wardOffice;

	/** 平均年収(万円) */
	@Column(name = "average_annual_income")
	private Integer averageAnnualIncome;

	/** 公示地価(円/㎡) */
	@Column(name = "official_land_price")
	private Integer officialLandPrice;

	/** 出身の著名人 */
	@Column(name = "performer")
	private String performer;

	/** 削除フラグ */
	@Column(name = "del_flg")
	private String delFlg;

	/** 登録日時 */
	@Column(name = "create_date")
	private Timestamp createDate;

	/** 更新日時 */
	@Column(name = "update_date")
	private Timestamp updateDate;

	/** 外部キー設定：所在地域 */
	@ManyToOne(targetEntity = LocationTakehara.class)
	@JoinColumn(name = "location_id", referencedColumnName = "location_id", insertable = false, updatable = false)
	private LocationTakehara locationTakehara;

}
