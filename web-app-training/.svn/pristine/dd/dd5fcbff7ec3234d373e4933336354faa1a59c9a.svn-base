package jp.co.futureantiques.webapptraining.model.gameMiura;

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
 * game_main_miuraテーブルと対応するEntityクラス
 *
 * @author Miura
 */
@Data
@Entity
public class GameMainMiura {
	/** ゲームID */
	@Id
	@GenericGenerator(name = "gen", strategy = "increment")
	@GeneratedValue(generator = "gen")
	private long id;

	/** ゲームタイトル */
	@Column(name = "game_title")
	private String gameTitle;

	/** ジャンルID */
	@Column(name = "genre_id")
	private Integer genreId;

	/** ハードID */
	@Column(name = "hard_id")
	private Integer hardId;

	/** 発売日 */
	@Column(name = "release_year")
	private String releaseYear;

	/** コメント */
	@Column(name = "comment")
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

	/** 外部キー設定: ジャンルID */
	@ManyToOne(targetEntity = GameGenreMiura.class)
	@JoinColumn(name = "genre_id", referencedColumnName = "id", insertable = false, updatable = false)
	private GameGenreMiura gameGenreMiura;

	/** 外部設定: ハードID*/
	@ManyToOne(targetEntity = GameHardMiura.class)
	@JoinColumn(name = "hard_id", referencedColumnName = "id", insertable = false, updatable = false)
	private GameHardMiura gameHardMiura;
}
