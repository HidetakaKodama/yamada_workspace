package jp.co.futureantiques.webapptraining.model.dogKanno;

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
 * DogMainKannoテーブルと対応するEntity
 *
 * @author future
 */
@Data
@Entity
public class DogMainKanno {

	/** 犬ID */
	@Id
	@GenericGenerator(name = "gen" , strategy = "increment")
	@GeneratedValue(generator = "gen")
	private long dogId;

	/** 犬種 */
	@Column(name = "dog_name")
	private String dogName;

	/** 原産国ID */
	@Column(name = "country_id")
	private Integer countryId;

	/** サイズID */
	@Column(name = "size_id")
	private Integer sizeId;

	/** 性格・特徴 */
	@Column(name = "charcter")
	@Size(max = 256)
	private String charcter;

	/** 画像 */
	@Column(name = "image")
	private String image;

	/** 削除フラグ */
	@Column(name = "del_flg")
	private String delFlg;

	/** 登録日時 */
	@Column(name = "create_date")
	private Timestamp createDate;

	/** 更新日時 */
	@Column(name = "update_date")
	private Timestamp updateDate;

	/** 外部キー設定:原産国 */
	@ManyToOne(targetEntity = DogCountryKanno.class)
	@JoinColumn(name = "country_id" , referencedColumnName = "id" , insertable = false, updatable = false)
	private DogCountryKanno dogCountryKanno;

	/** 外部キー設定:サイズ */
	@ManyToOne(targetEntity = DogSizeKanno.class)
	@JoinColumn(name = "size_id" , referencedColumnName = "id", insertable = false, updatable = false)
	private DogSizeKanno dogSizeKanno;

}
