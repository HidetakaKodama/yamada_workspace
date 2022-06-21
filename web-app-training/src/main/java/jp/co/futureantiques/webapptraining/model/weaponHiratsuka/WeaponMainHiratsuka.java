package jp.co.futureantiques.webapptraining.model.weaponHiratsuka;

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
 * WeaponMainテーブルと対応するEntity
 *
 * @author hiratsuka
 */
@Data
@Entity

public class WeaponMainHiratsuka {

	/** 武器ID */
	@Id
	@GenericGenerator(name = "gen", strategy = "increment")
	@GeneratedValue(generator = "gen")
	private long id;

	/** 武器名 */
	@Column(name = "weaponname")
	private String weaponname;

	/** 武器タイプID */
	@Column(name = "weapontype_id")
	private Integer weapontypeId;

	/** コスト */
	@Column(name = "cost")
	private int cost;

	/** 頭ダメージ */
	@Column(name = "headdamage")
	private Integer headdamage;

	/** 胴ダメージ */
	@Column(name = "bodydamage")
	private Integer bodydamage;

	/** 脚部ダメージ */
	@Column(name = "legdamage")
	private Integer legdamage;

	/** 連射速度 */
	@Column(name = "rate")
	private Double rate;

	/** 射撃方式 */
	@Column(name = "shottype_id")
	private Integer shottypeId;

	/** 削除フラグ */
	@Column(name = "del_flg")
	private String delFlg;

	/** 登録日時 */
	@Column(name = "create_date")
	private Timestamp createDate;

	/** 更新日時 */
	@Column(name = "update_date")
	private Timestamp updateDate;

	/** 外部キー設定：武器タイプ */
	@ManyToOne(targetEntity = WeapontypeHiratsuka.class)
	@JoinColumn(name = "weapontype_id", referencedColumnName = "id", insertable = false, updatable = false)
	private WeapontypeHiratsuka weapontype;

	/** 外部キー設定：射撃方式 */
	@ManyToOne(targetEntity = ShottypeHiratsuka.class)
	@JoinColumn(name = "shottype_id", referencedColumnName = "id", insertable = false, updatable = false)
	private ShottypeHiratsuka shottype;
}