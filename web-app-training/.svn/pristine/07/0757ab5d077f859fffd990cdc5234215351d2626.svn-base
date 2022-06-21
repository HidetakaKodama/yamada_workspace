package jp.co.futureantiques.webapptraining.model.penguinKawamura;

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
 * SQL penguin_main_kawamuraテーブルと対応しているエンティティ
 * @author Mariko Kawamura
 */
@Data
@Entity
public class PenguinMainKawamura {

	/** ペンギンID */
	@Id
	@GenericGenerator(name = "gen", strategy ="increment")
	@GeneratedValue(generator ="gen")
	private long id;

	/** ペンギンの名前 */
	@Column(name ="name")
	private String name;

	/** 属性ID */
	@Column(name ="attribute_id")
	private Integer attributeId;

	/** コメント */
	@Column(name ="comment")
	private String comment;

	/** 画像 */
	@Column(name ="image")
	private String image;

	/** 削除フラグ */
	@Column(name ="del_flg")
	private String delFlg;

	/** 登録日時 */
	@Column(name ="create_date")
	private Timestamp createDate;

	/** 更新日時 */
	@Column(name ="update_date")
	private Timestamp updateDate;

	/** 外部キー設定：属性 */
	@ManyToOne(targetEntity = AttributeKawamura.class)
	@JoinColumn(name = "attribute_id", referencedColumnName = "attribute_id", insertable = false, updatable = false)
	private AttributeKawamura attributeKawamura;


}
