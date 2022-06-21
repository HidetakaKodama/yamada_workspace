
package jp.co.futureantiques.webapptraining.model.triathlonMori;

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

/** maker_moriテーブルに対応するEntity
 *
 * @author future
 * */

@Data
@Entity
public class MakerMori {

	/** メーカーID */
	@Id
	@GeneratedValue
	@Column(name = "id")
	private Integer id;

	/** メーカー名 */
	@Column(name = "maker")
	@Size(max = 256)
	private String maker;

	/** 削除フラグ */
	@Column(name = "del_flg")
	private String delFlg;

	/** 登録削除 */
	@Column(name = "create_date")
	private Timestamp createDate;

	/** 更新日時 */
	@Column(name = "update_date")
	private Timestamp updateDate;

	/** 外部キー設定 :年代ID */
	@Transient
	@OneToMany(targetEntity=TriathlonMainMori.class, mappedBy="makerMori")
	@JoinColumn(name="id", referencedColumnName="maker_id")
	private List<TriathlonMainMori> triathlonMainMoriList;

}