package jp.co.futureantiques.webapptraining.model.triathlonMori;

import java.sql.Timestamp;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.validation.constraints.Size;

import org.hibernate.annotations.GenericGenerator;

import lombok.Data;

/**
 * triathlon_main_moriテーブルに対応するEntity
 *
 *@author future
 * */

@Data
@Entity
public class TriathlonMainMori {

	/**自転車ID */
	@Id
	@GenericGenerator(name = "gen", strategy = "increment")
	@GeneratedValue(generator = "gen")
	private long id;

	/**自転車名 */
	@Column(name = "name")
	@Size(max = 256)
	private String name;

	/**タイプID */
	@Column(name = "type_id")
	private Integer typeId;

	/**メーカーID */
	@Column(name = "maker_id")
	private Integer makerId;

	/**価格 */
	@Column(name = "price")
	private String price;

	/**画像 */
	@Column(name = "image")
	private String image;

	/** 削除フラグ */
	@Column(name = "del_flg")
	private String delFlg;

	/** 登録日時 */
	@Column(name = "create_date")
	private Timestamp createDate;

	/** 更新日時 */
	@Column(name = "update_date")
	private Timestamp updateDate;

	/** 外部キー設定 :タイプ */
	@ManyToOne(targetEntity = TypeMori.class)
	@JoinColumn(name = "type_id", referencedColumnName = "id", insertable = false, updatable = false)
	private TypeMori typeMori;

	/** 外部キー設定 :メーカー */
	@ManyToOne(targetEntity = MakerMori.class)
	@JoinColumn(name = "maker_id", referencedColumnName = "id", insertable = false, updatable = false)
	private MakerMori makerMori;

}
