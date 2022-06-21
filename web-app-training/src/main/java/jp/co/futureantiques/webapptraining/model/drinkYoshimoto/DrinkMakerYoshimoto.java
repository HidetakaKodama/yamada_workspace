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
 * Makerテーブルと対応するEntityクラス
 *
 * @author Yoshimoto
 * */
@Data
@Entity
public class DrinkMakerYoshimoto {

	/** メーカーID */
	@Id
	@GeneratedValue
	@Column(name = "maker_id")
	private int makerId;

	/** メーカー名 */
	@Column(name = "maker_name")
	@Size(max = 256)
	private String makerName;

	/** 削除フラグ */
	@Column(name = "del_flg")
	private String delFlg;

	/** 登録日時 */
	@Column(name = "create_date")
	private String createDate;

	/** 更新日時 */
	@Column(name = "update_date")
	private String updateDate;

	/** 外部キー設定：メーカーID*/
	@Transient
	@OneToMany(targetEntity = DrinkMainYoshimoto.class, mappedBy = "drinkMakerYoshimoto")
	@JoinColumn(name = "maker_id", referencedColumnName = "maker_id")
	private List<DrinkMainYoshimoto> drinkMainList;

}
