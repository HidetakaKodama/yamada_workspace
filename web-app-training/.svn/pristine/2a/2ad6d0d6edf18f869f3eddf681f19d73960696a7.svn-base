package jp.co.futureantiques.webapptraining.model.playerKuramoto;

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
 * PlayerBtKuramotoテーブルと対応するEntity
 *
 * @author future
 */
@Data
@Entity
public class PlayerBtKuramoto {

	/** 投打ID */
	@Id
	@GeneratedValue
	@Column(name = "id")
	private int id;

	/** 投打名 */
	@Column(name = "bt_info")
	@Size(max = 255)
	private String btInfo;

	/** 削除フラグ */
	@Column(name = "del_flg")
	private String delFlg;

	/** 登録日時 */
	@Column(name = "create_date")
	private String createDate;

	/** 更新日時 */
	@Column(name = "update_date")
	private String updateDate;

	/** 外部キー設定：投打ID */
	@Transient
	@OneToMany(targetEntity = PlayerMainKuramoto.class, mappedBy = "playerBt")
	@JoinColumn(name = "id", referencedColumnName = "bt_id")
	private List<PlayerMainKuramoto> playerMainKuramotoList;
}