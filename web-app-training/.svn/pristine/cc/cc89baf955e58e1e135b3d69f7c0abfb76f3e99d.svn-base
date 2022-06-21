package jp.co.futureantiques.webapptraining.model.vtuberUmehara;

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
 * 動画形態テーブルと対応するEntityクラス
 * @author future
 *
 */
@Data
@Entity
public class FormsUmehara {

	/** 動画形態ID */
	@Id
	@GeneratedValue
	@Column(name = "id")
	private long id;

	/** 配信・投稿形態 */
	@Column(name = "stream_form")
	@Size(max = 255)
	private String streamForm;

	/** 削除フラグ */
	@Column(name = "del_flg")
	private String delFlg;

	/** 登録日時 */
	@Column(name = "create_date")
	private String createDate;

	/** 更新日時 */
	@Column(name = "update_date")
	private String updateDate;

	/** 外部キー設定：動画形態ID */
	@Transient
	@OneToMany(targetEntity = VtuberMainUmehara.class, mappedBy = "formsUmehara")
	@JoinColumn(name = "id", referencedColumnName = "forms_id")
	private List<VtuberMainUmehara> vtuberMainUmeharaList;
}
