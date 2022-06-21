package jp.co.futureantiques.webapptraining.model.weaponHiratsuka;

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
 * Weapontypeテーブルと対応するEntityクラス
 *
 * @author hiratsuka
 */
@Data
@Entity

public class WeapontypeHiratsuka {

	/** 武器タイプID */
	@Id
	@GeneratedValue
	@Column(name = "id")
	private int id;

	/** 武器タイプ */
	@Column(name = "weapontype")
	@Size(max = 255)
	private String weapontype;

	/** 削除フラグ */
	@Column(name = "del_flg")
	private String delFlg;

	/** 登録日時 */
	@Column(name = "create_date")
	private String createDate;

	/** 更新日時 */
	@Column(name = "update_date")
	private String updateDate;

	/** 外部キー設定：ジャンルID */
	@Transient
	@OneToMany(targetEntity = WeaponMainHiratsuka.class, mappedBy = "weapontype")
	@JoinColumn(name = "id", referencedColumnName = "weapontype_id")
	private List<WeaponMainHiratsuka> weaponMainList;
}