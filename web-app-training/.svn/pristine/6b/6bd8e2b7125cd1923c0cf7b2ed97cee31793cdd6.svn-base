package jp.co.futureantiques.webapptraining.model.drinkYoshimoto;

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
 * Categoryテーブルと対応するEntityクラス
 *
 * @author Yoshimoto
 *
 */
@Data
@Entity
public class DrinkCategoryYoshimoto {

	/** カテゴリーID */
	@Id
	@GeneratedValue
	@Column(name = "category_id")
	private int categoryId;

	/** カテゴリー名 */
	@Column(name = "category_name")
	@Size(max = 256)
	private String categoryName;

	/** 削除フラグ */
	@Column(name = "del_flg")
	private String delFlg;

	/** 登録日時 */
	@Column(name = "create_date")
	private String createDate;

	/** 更新日時 */
	@Column(name = "update_date")
	private String updateDate;

	/** 外部キー設定：カテゴリーID */
	@Transient
	@OneToMany(targetEntity = DrinkMainYoshimoto.class, mappedBy = "drinkcategoryyoshimoto")
	@JoinColumn(name = "category_id", referencedColumnName = "category_id")
	private List<DrinkMainYoshimoto> drinkMainYoshimoto;

}
