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
 * 動画内容テーブルと対応するEntity
 *
 * @author future
 */
@Data
@Entity
public class ContentsUmehara {

	/** 動画内容ID */
	@Id
	@GeneratedValue
	@Column(name = "id")
	private long id;

	/** 動画内容 */
	@Column(name = "stream_content")
	@Size(max = 255)
	private String streamContent;

	/** 登録日時 */
	@Column(name = "create_date")
	private String createDate;

	/** 更新日時 */
	@Column(name = "update_date")
	private String updateDate;

	/** 外部キー設定：動画内容ID */
	@Transient
	@OneToMany(targetEntity = VtuberMainUmehara.class, mappedBy = "contentsUmehara")
	@JoinColumn(name = "id", referencedColumnName = "contents_id")
	private List<VtuberMainUmehara> vtuberMainUmeharaList;
}
