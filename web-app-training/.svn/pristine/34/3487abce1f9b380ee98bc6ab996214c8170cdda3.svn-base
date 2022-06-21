package jp.co.futureantiques.webapptraining.model.nbaplayersTakahashi;

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
 * PositionTakahashiテーブルと対応するEntityクラス
 *
 * @author Takumi Takahashi
 */
@Data
@Entity

public class PositionTakahashi {

	/** ポジションID */
	@Id
	@GeneratedValue
	@Column(name = "id")
	private int id;

	/** ポジション */
	@Column(name = "position")
	@Size(max = 256)
	private String position;

	/** 削除フラグ */
	@Column(name = "del_flg")
	private String delFlg;

	/** 登録日時 */
	@Column(name = "create_date")
	private String createDate;

	/** 更新日時 */
	@Column(name = "update_date")
	private String updateDate;

	/** 外部キー設定：ポジションID */
	@Transient
	@OneToMany(targetEntity = NbaplayersMainTakahashi.class, mappedBy = "positiontakahashi")
	@JoinColumn(name = "id", referencedColumnName = "position_id")
	private List<NbaplayersMainTakahashi> nbaplayersMainTakahashiList;

}
