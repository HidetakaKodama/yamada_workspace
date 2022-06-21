package jp.co.futureantiques.webapptraining.model.resipeishikawa;

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
 * Vegetableテーブルと対応するEntity
 *
 * @author t.ishikawa
 */
@Data
@Entity
public class VegetableIshikawa {

	/**野菜ID*/
	@Id
	@GeneratedValue
	@Column(name = "id")
	private int id;

	/**野菜名*/
	@Column(name = "vegetable")
	@Size(max = 255)
	private String vegetable;

	/**削除フラグ*/
	@Column(name = "del_flg")
	private String delFlg;

	/**登録日時*/
	@Column(name = "create_date")
	private String createDate;

	/**更新日時*/
	@Column(name = "update_date")
	private String updateDate;

	/**外部キー設定：野菜1*/
	@Transient
	@OneToMany(targetEntity = ResipeMainIshikawa.class,mappedBy = "vegetable1")
	@JoinColumn(name = "id",referencedColumnName = "vegetable_id1")
	private List<ResipeMainIshikawa>resipeMainIshikawaList;

	/**外部キー設定：野菜2*/
	@Transient
	@OneToMany(targetEntity = ResipeMainIshikawa.class,mappedBy = "vegetable2")
	@JoinColumn(name = "id",referencedColumnName = "vegetable_id2")
	private List<ResipeMainIshikawa>resipeMainList;
}