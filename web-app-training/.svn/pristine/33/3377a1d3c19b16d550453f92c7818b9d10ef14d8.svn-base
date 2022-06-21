package jp.co.futureantiques.webapptraining.model.dogKanno;

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
 * DogSizeKannoと対応するEntity
 *
 * @author future
 */
@Data
@Entity
public class DogSizeKanno {

	/** サイズID */
	@Id
	@GeneratedValue
	@Column(name = "id")
	private int id;

	/** サイズ */
	@Column(name = "size")
	@Size(max = 256)
	private String size;

	/** 削除フラグ */
	@Column(name = "del_flg")
	private String delFlg;

	/** 登録日時 */
	@Column(name = "create_date")
	private Timestamp createDate;

	/** 更新日時 */
	@Column(name = "update_date")
	private Timestamp updateDate;

	/** 外部キー設定:サイズID */
	@Transient
	@OneToMany(targetEntity = DogMainKanno.class, mappedBy = "dogSizeKanno")
	@JoinColumn(name = "id ", referencedColumnName = "size_id")
	private List<DogMainKanno> dogMainList;

}
