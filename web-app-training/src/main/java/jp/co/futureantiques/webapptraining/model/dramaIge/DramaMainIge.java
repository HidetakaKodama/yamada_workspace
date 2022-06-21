package jp.co.futureantiques.webapptraining.model.dramaIge;

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
 * DramaMainIgeテーブルと対応するEntity
 *
 * @author future
 *
 */
@Data
@Entity
public class DramaMainIge {

	/** ドラマID */
	@Id
	@GenericGenerator(name = "gen", strategy = "increment")
	@GeneratedValue(generator = "gen")
	private long id;

	/** ドラマ名 */
	@Column(name = "drama_title")
	private String dramaTitle;

	/** ジャンルID */
	@Column(name = "genre_id")
	private Integer genreId;

	/** 放送局ID */
	@Column(name = "broadcast_station_id")
	private Integer broadcastStationId;

	/** 放送時期 */
	@Column(name = "start_season")
	private String startSeason;

	/** 放送曜日 */
	@Column(name = "day_of_week")
	private String dayOfWeek;

	/** コメント */
	@Column(name = "comment")
	@Size(max = 255)
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

	/** 外部キー設定：ジャンル */
	@ManyToOne(targetEntity = GenreIge.class)
	@JoinColumn(name = "genre_id", referencedColumnName = "id", insertable = false, updatable = false)
	private GenreIge genreIge;

	/** 外部キー設定：放送局 */
	@ManyToOne(targetEntity = BroadcastStationIge.class)
	@JoinColumn(name = "broadcast_station_id", referencedColumnName = "id", insertable = false, updatable = false)
	private BroadcastStationIge broadcastStationIge;

}
