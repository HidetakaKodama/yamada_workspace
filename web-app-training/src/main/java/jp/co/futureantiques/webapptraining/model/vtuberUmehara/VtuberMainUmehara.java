package jp.co.futureantiques.webapptraining.model.vtuberUmehara;

import java.sql.Timestamp;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.validation.constraints.Size;

import org.hibernate.annotations.GenericGenerator;

import com.fasterxml.jackson.annotation.JsonFormat;

import lombok.Data;

/**
 * vtuberテーブルと対応するエンティティ
 * @author future
 *
 */
@Data
@Entity
public class VtuberMainUmehara {

	/** vtuberID */
	@Id
	@GenericGenerator(name = "gen", strategy = "increment")
	@GeneratedValue(generator = "gen")
	private long id;

	/** Vtuber名 */
	@Column(name = "vtuber_name")
	@Size(max = 255)
	private String vtuberName;

	/** 会社ID */
	@Column(name = "company_id")
	private Integer companyId;

	/** 動画形態ID */
	@Column(name = "forms_id")
	private Integer formsId;

	/** 動画内容ID */
	@Column(name = "contents_id")
	private Integer contentsId;

	/** チャンネル登録者数 */
	@Column(name = "channel_followers")
	private Integer channelFollowers;

	/** チャンネルURL */
	@Column(name = "channel_url")
	@Size(max = 255)
	private String channelUrl;

	/** チャンネル作成日 */
	@Column(name = "channel_date")
	@JsonFormat(pattern = "yyyy-MM-dd")
	private Date channelDate;

	/** コメント */
	@Column(name = "comment")
	@Size(max = 255)
	private String comment;

	/** 登録日時 */
	@Column(name = "create_date")
	private Timestamp createDate;

	/** 更新日時 */
	@Column(name = "update_date")
	private Timestamp updateDate;

	/** 削除フラグ */
	@Column(name = "del_flg")
	private String delFlg;

	/** 画像 */
	@Column(name ="image")
	private String image;

	/** 外部キー設定：会社 */
	@ManyToOne(targetEntity = CompanyUmehara.class)
	@JoinColumn(name = "company_id", referencedColumnName = "id", insertable = false, updatable = false)
	private CompanyUmehara companyUmehara;

	/** 外部キー設定：動画内容 */
	@ManyToOne(targetEntity = ContentsUmehara.class)
	@JoinColumn(name = "contents_id", referencedColumnName = "id", insertable = false, updatable = false)
	private ContentsUmehara contentsUmehara;

	/** 外部キー設定：動画形態 */
	@ManyToOne(targetEntity = FormsUmehara.class)
	@JoinColumn(name = "forms_id", referencedColumnName = "id", insertable = false, updatable = false)
	private FormsUmehara formsUmehara;
}