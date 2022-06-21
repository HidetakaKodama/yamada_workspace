package jp.co.futureantiques.webapptraining.model.perfumeAnzai;

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

@Data
@Entity
public class PerfumeMainAnzai {

	/** 曲名ID**/
	@Id
	@GenericGenerator(name = "gen", strategy = "increment")
	@GeneratedValue(generator = "gen")
	private long id;

	/** 曲名**/
	@Column(name = "song_name")
	@Size(min = 1, max = 255)
	private String songName;

	/** 発売年**/
	@Column(name ="release_year")
	@Size(min = 1, max = 4)
	private Integer releaseYear;

	/** 作詞者**/
	@Column(name = "lyricist_name")
	private String lyricistName;

	/** アルバムID**/
	@Column(name = "album_id")
	private Integer albumId;

	/** タイアップID**/
	@Column(name = "tieup_id")
	private Integer tieupId;

	/** コメント**/
	@Column(name = "comment")
	private String comment;

	/**削除フラグ**/
	@Column(name = "del_flg")
	private String delFlg;

	/**登録日時**/
	@Column(name = "create_date")
	private Timestamp createDate;

	/**更新日時**/
	@Column(name = "update_date")
	private Timestamp updateDate;

	/**外部キー設定： アルバム**/
	@ManyToOne(targetEntity = AlbumAnzai.class)
	@JoinColumn(name = "album_id", referencedColumnName = "id", insertable = false, updatable = false)
	private AlbumAnzai albumAnzai;

	/**外部キー設定： タイアップ**/
	@ManyToOne(targetEntity = TieupAnzai.class)
	@JoinColumn(name = "tieup_id", referencedColumnName = "id", insertable = false, updatable = false)
	private TieupAnzai tieupAnzai;

}
