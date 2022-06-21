package jp.co.futureantiques.webapptraining.model.penguinKawamura;

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
 * penguin_main_kawamuraテーブルと対応するエンティティ
 * @author Mariko Kawamura
 */
@Data
@Entity
public class AttributeKawamura {

	/** 属性ID */
	@Id
	@GeneratedValue
	@Column(name ="attribute_id")
	private int attributeId;

	/** 属名 */
	@Column(name ="attribute_name")
	@Size(max = 256)
	private String attributeName;

	/** 削除フラグ */
	@Column(name = "del_flg")
	private String delFlg;

	/** 登録日時 */
	@Column(name = "create_date")
	private Timestamp createDate;

	/** 更新日時 */
	@Column(name = "update_date")
	private Timestamp updateDate;

	/** 外部キー設定:属性ID */
	@Transient
	@OneToMany(targetEntity = PenguinMainKawamura.class, mappedBy = "attributeKawamura")
	@JoinColumn(name = "attribute_id", referencedColumnName = "attribute_id")
	private List<PenguinMainKawamura> penguinMainKawamura;
}
