package jp.co.futureantiques.webapptraining.model.nbaplayersTakahashi;

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
 * SQL NbaplayersMainTakahashiテーブルと対応しているエンティティ
 *
 * @author Takumi Takahashi
 */
@Data
@Entity
public class NbaplayersMainTakahashi {

	/** NBA選手ID */
	@Id
	@GenericGenerator(name = "gen", strategy = "increment")
	@GeneratedValue(generator = "gen")
	private long id;

	/** 選手名 */
	@Column(name = "player_name")
	@Size(min = 1, max = 256)
	private String playerName;

	/** ポジションID */
	@Column(name = "position_id")
	private Integer positionId;

	/** 所属チームID */
	@Column(name = "team_id")
	private Integer teamId;

	/** 身長 */
	@Column(name = "height")
	private int height;

	/** 体重 */
	@Column(name = "weight")
	private int weight;

	/** コメント */
	@Column(name = "comment")
	@Size(max = 256)
	private String comment;

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
	@ManyToOne(targetEntity = PositionTakahashi.class)
	@JoinColumn(name = "position_id", referencedColumnName = "id", insertable = false, updatable = false)
	private PositionTakahashi positionTakahashi;

	/** 外部キー設定：所属チーム */
	@ManyToOne(targetEntity = TeamTakahashi.class)
	@JoinColumn(name = "team_id", referencedColumnName = "id", insertable = false, updatable = false)
	private TeamTakahashi teamTakahashi;

}
