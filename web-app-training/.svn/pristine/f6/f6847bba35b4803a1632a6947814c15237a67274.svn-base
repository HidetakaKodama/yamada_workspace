package jp.co.futureantiques.webapptraining.model.perfumeAnzai;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.Transient;

import lombok.Data;

@Data
@Entity
public class AlbumAnzai {

	/** アルバムID**/
	@Id
	@GeneratedValue
	@Column(name = "id")
	private long id;

	/** アルバム名**/
	@Column(name = "album")
	private String album;

	/**削除フラグ**/
	@Column(name = "del_flg")
	private String delFlg;

	/**登録日時**/
	@Column(name = "create_date")
	private String createDate;

	/**更新日時**/
	@Column(name = "update_date")
	private String updateDate;

	/**外部キー設定：　タイアップID**/
	@Transient
	@OneToMany(targetEntity = PerfumeMainAnzai.class, mappedBy = "alubumanzai")
	@JoinColumn(name = "id", referencedColumnName = "album_id")
	private List<PerfumeMainAnzai> perfumeMainList;

}
