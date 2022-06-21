package jp.co.futureantiques.webapptraining.model.drinkYoshimoto;

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
 * DrinkMainテーブルと対応するEntityクラス
 *
 * @author Yoshimoto
 * */
@Data
@Entity
public class DrinkMainYoshimoto {

	/** 飲み物ID */
	@Id
	@GenericGenerator(name = "gen", strategy = "increment")
	@GeneratedValue(generator = "gen")
	private long drinkId;

	/** 商品名 */
	@Column(name = "drink_name")
	private String drinkName;

	/** カテゴリーID */
	@Column(name = "category_id")
	private Integer categoryId;

	/** メーカーID */
	@Column(name = "maker_id")
	private Integer makerId;

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

	/** 外部キー設定：カテゴリーID */
	@ManyToOne(targetEntity = DrinkCategoryYoshimoto.class)
	@JoinColumn(name = "category_id", referencedColumnName = "category_id", insertable = false, updatable = false)
	private DrinkCategoryYoshimoto drinkCategoryYoshimoto;

	/** 外部キー設定：メーカーID */
	@ManyToOne(targetEntity = DrinkMakerYoshimoto.class)
	@JoinColumn(name = "maker_id", referencedColumnName = "maker_id", insertable = false, updatable = false)
	private DrinkMakerYoshimoto drinkMakerYoshimoto;
}
