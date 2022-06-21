package jp.co.futureantiques.webapptraining.model.dramaIge;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.Transient;

import lombok.Data;

/**
 * BroadcastStationIgeテーブルと対応するEntity
 *
 * @author future
 *
 */
@Data
@Entity
public class BroadcastStationIge {

	/** 放送局ID */
	@Id
	@GeneratedValue
	@Column(name = "id")
	private int id;

	/** 放送局名 */
	@Column(name = "name")
	private String name;

	/** 削除フラグ */
	@Column(name = "del_flg")
	private String delFlg;

	/** 登録日時 */
	@Column(name = "create_date")
	private String createDate;

	/** 更新日時 */
	@Column(name = "update_date")
	private String updateDate;

	/** 外部キー設定：放送局ID */
	@Transient
	@OneToMany(targetEntity = DramaMainIge.class, mappedBy = "broadcastStationIge")
	@JoinColumn(name = "id", referencedColumnName = "broadcastStation_id")
	private List<DramaMainIge> dramaMainIgeList;

}
