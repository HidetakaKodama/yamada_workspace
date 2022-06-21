package jp.co.futureantiques.webapptraining.model.resipeishikawa;

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
 * ResipeMainIshikawaテーブルと対応するEntity
 *
 * @author t.ishikawa
 */

@Entity
@Data
public class ResipeMainIshikawa {

	/**レシピID*/
	@Id
	@GenericGenerator(name = "gen" , strategy = "increment")
	@GeneratedValue(generator = "gen")
	private long id;

	/**レシピ名*/
	@Column(name = "resipe_title")
	private String resipeTitle;

	/**レシピ名(ひらがな)*/
	@Column(name = "resipe_title2")
	private String resipeTitle2;

	/**野菜ID1*/
	@Column(name = "vegetable_id1")
	private Integer vegetableId1;

	/**野菜ID2*/
	@Column(name = "vegetable_id2")
	private Integer vegetableId2;

	/**ジャンルID*/
	@Column(name = "genre_id")
	private Integer genreId;

	/**調理時間*/
	@Column(name = "cook_time")
	private Integer cookTime;

	/**削除フラグ*/
	@Column(name = "del_flg")
	private String delFlg;

	/**登録日時*/
	@Column(name = "create_date")
	private Timestamp createDate;

	/**更新日時*/
	@Column(name = "update_date")
	private Timestamp updateDate;

	/**外部キー設定：野菜*/
	@ManyToOne(targetEntity = VegetableIshikawa.class)
	@JoinColumn(name = "vegetable_id1",referencedColumnName = "id",insertable = false,updatable = false)
	private VegetableIshikawa vegetable1;

	/**外部キー設定：野菜*/
	@ManyToOne(targetEntity = VegetableIshikawa.class)
	@JoinColumn(name = "vegetable_id2",referencedColumnName = "id",insertable = false,updatable = false)
	private VegetableIshikawa vegetable2;

	/**外部キー設定：ジャンル*/
	@ManyToOne(targetEntity = GenreIshikawa.class)
	@JoinColumn(name = "genre_id",referencedColumnName = "id",insertable = false,updatable = false)
	private GenreIshikawa genre;
}