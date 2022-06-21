package jp.co.futureantiques.webapptraining.model.vtuberUmehara;

import java.sql.Timestamp;
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
 * 会社テーブルと対応するEntity
 *
 * @author future
 */
@Data
@Entity
public class CompanyUmehara {

	/** 会社ID */
	@Id
	@GeneratedValue
	@Column(name = "id")
	private long id;

	/** 会社名*/
	@Column(name = "company_name")
	@Size(max = 255)
	private String companyName;

	/** 会社URL */
	@Column(name = "company_url")
	@Size(max = 255)
	private String companyUrl;

	/** 会社住所 */
	@Column(name = "company_address")
	@Size(max = 255)
	private String companyAddress;

	/** Vtuber人数 */
	@Column(name = "numbers_vtuber")
	private Integer numbersVtuber;

	/** 会社設立年 */
	@Column(name = "company_year")
	private Integer companyYear;

	/** コメント */
	@Column(name = "company_comment")
	@Size(max = 255)
	private String companyComment;

	/** 削除フラグ */
	@Column(name = "del_flg")
	private String delFlg;

	/** 登録日時 */
	@Column(name = "create_date")
	private Timestamp createDate;

	/** 更新日時 */
	@Column(name = "update_date")
	private Timestamp updateDate;

	/** 会社画像 */
	@Column(name = "company_image")
	private String companyImage;

	/** 外部キー設定：会社 */
	@Transient
	@OneToMany(targetEntity = VtuberMainUmehara.class, mappedBy = "companyUmehara")
	@JoinColumn(name = "id", referencedColumnName = "company_id")
	private List<VtuberMainUmehara> VtuberMainUmeharaList;
}
