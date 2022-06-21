package jp.co.futureantiques.webapptraining.model.animeWatanabe;

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
 * AnimeMainWatanabeテーブルと対応するEntity
 *
 * @author Watanabe
 */
@Data
@Entity
public class AnimeMainWatanabe {

	/**アニメID*/
	@Id
	@GenericGenerator(name = "gen", strategy = "increment")
	@GeneratedValue(generator = "gen")
	private long id;

	/** アニメ名 */
	@Column(name = "anime_title")
	@Size(min = 1, max = 255)
	private String animeTitle;

	/** アニメ制作会社ID */
	@Column(name = "company_id")
	private Integer companyId;

	/** 原作ID */
	@Column(name = "original_id")
	private Integer originalId;

	/** 公開年 */
	@Column(name = "release_year")
	private Integer releaseYear;

	/** 話数 */
	@Column(name = "episode")
	private Integer episode;

	/** 続編 */
	@Column(name = "sequel")
	private String sequel;

	/** オープニング主題歌 */
	@Column(name = "op")
	private String op;

	/** 削除フラグ */
	@Column(name = "del_flg")
	private String delFlg;

	/** 登録日時 */
	@Column(name = "create_date")
	private Timestamp createDate;

	/** 更新日時 */
	@Column(name = "update_date")
	private Timestamp updateDate;

	/** 外部キー設定:アニメ制作会社 */
	@ManyToOne(targetEntity = CompanyWatanabe.class)
	@JoinColumn(name = "company_id", referencedColumnName = "id", insertable = false, updatable = false)
	private CompanyWatanabe companyWatanabe;

	/** 外部キー設定:原作 */
	@ManyToOne(targetEntity = OriginalWatanabe.class)
	@JoinColumn(name = "original_id", referencedColumnName = "id", insertable = false, updatable = false)
	private OriginalWatanabe originalWatanabe;
}
