package jp.co.futureantiques.webapptraining.model.animeWatanabe;

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

/**
 * OriginalWatanabeと対応するEntity
 *
 * @author Watanabe
 */
@Data
@Entity
public class OriginalWatanabe {

	/** 原作ID */
	@Id
	@GeneratedValue
	@Column(name = "id")
	private long id;

	/** 原作 */
	@Column(name = "original")
	@Size(max = 256)
	private String original;

	/** 削除フラグ */
	@Column(name = "del_flg")
	private String delFlg;

	/** 登録日時 */
	@Column(name = "create_date")
	private Timestamp createDate;

	/** 更新日時 */
	@Column(name = "update_date")
	private Timestamp updateDate;

	/** 外部キー設定:原作ID */
	@Transient
	@OneToMany(targetEntity = AnimeMainWatanabe.class, mappedBy = "originalWatanabe")
	@JoinColumn(name = "id ", referencedColumnName = "original_id")
	private List<AnimeMainWatanabe> animeMainList;
}
