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
 * Genreテーブルに対応するEntityクラス
 *
 * @author t.ishikawa
 */
@Data
@Entity
public class GenreIshikawa {

	/**ジャンルID*/
	@Id
	@GeneratedValue
	@Column(name = "id")
	private int id;

	/**ジャンル*/
	@Column(name = "genre")
	@Size(max = 255)
	private String genre;

	/**削除フラグ*/
	@Column(name = "del_flg")
	private String delFlg;

	/**登録日時*/
	@Column(name = "create_date")
	private String createDate;

	/**更新日時*/
	@Column(name = "update_date")
	private String updateDate;

	/**外部キー設定：ジャンルID*/
	@Transient
	@OneToMany(targetEntity = ResipeMainIshikawa.class,mappedBy = "genre")
	@JoinColumn(name = "id",referencedColumnName = "genre_id")
	private List<ResipeMainIshikawa>resipeMainIshikawaList;
}
