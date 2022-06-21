package jp.co.futureantiques.webapptraining.model.playerKuramoto;

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
 * PlayerMainKuramotoテーブルと対応するEntity
 *
 * @author future
 */
@Data
@Entity
public class PlayerMainKuramoto {

	/** 選手ID */
	@Id
	@GenericGenerator(name = "gen", strategy = "increment")
	@GeneratedValue(generator = "gen")
	private long id;

	/** 選手名 */
	@Column(name = "player_name")
	private String playerName;

	/** ポジションID */
	@Column(name = "position_id")
	private Integer positionId;

	/** 投打ID */
	@Column(name = "bt_id")
	private Integer btId;

	/** 年齢 */
	@Column(name = "player_age")
	private Integer playerAge;

	/** プロ在籍年数 */
	@Column(name = "player_years")
	private Integer playerYears;

	/** 出身地 */
	@Column(name = "player_place")
	@Size(max = 255)
	private String playerPlace;

	/** 削除フラグ */
	@Column(name = "del_flg")
	private String delFlg;

	/** 登録日時 */
	@Column(name = "create_date")
	private Timestamp createDate;

	/** 更新日時 */
	@Column(name = "update_date")
	private Timestamp updateDate;

	/** 外部キー設定：ポジション */
	@ManyToOne(targetEntity = PlayerPositionKuramoto.class)
	@JoinColumn(name = "position_id", referencedColumnName = "id", insertable = false, updatable = false)
	private PlayerPositionKuramoto position;

	/** 外部キー設定：投打 */
	@ManyToOne(targetEntity = PlayerBtKuramoto.class)
	@JoinColumn(name = "bt_id", referencedColumnName = "id", insertable = false, updatable = false)
	private PlayerBtKuramoto bt;
}