package jp.co.futureantiques.webapptraining.model.form.vtuberUmehara;

import java.text.SimpleDateFormat;

import com.fasterxml.jackson.annotation.JsonFormat;

import jp.co.futureantiques.webapptraining.model.vtuberUmehara.VtuberMainUmehara;
import lombok.Data;

/**
 * Vtuber検索画面のFormクラス
 *
 * @author future
 */
@Data
public class VtuberUmeharaSearchForm {

	/** ID */
	private Integer id;

	/** Vtuber名 */
	private String vtuberName;

	/** 会社ID */
	private Integer companyId;

	/** 動画形態ID */
	private Integer formsId;

	/** 動画内容ID */
	private Integer contentsId;

	/** チャンネルURL */
	private String channelUrl;

	/** チャンネル登録者数 */
	private int channelFollowers;

	/** チャンネル作成日 */
	@JsonFormat(pattern = "yyyy-MM-dd")
	private String channelDate;

	/** コメント */
	private String comment;

	/** 削除フラグON用 */
	private int isDelete;

	/** 画像 */
	private String image;


	/**
	 * 各フィールドに値を設定する
	 *
	 * @param vtuberMainUmehara
	 */
	public void setValues(VtuberMainUmehara vtuberMainUmehara) {
		this.setId((int) vtuberMainUmehara.getId());
		this.setVtuberName(vtuberMainUmehara.getVtuberName());
		this.setCompanyId(vtuberMainUmehara.getCompanyId());
		this.setFormsId(vtuberMainUmehara.getFormsId());
		this.setContentsId(vtuberMainUmehara.getContentsId());
		this.setChannelUrl(vtuberMainUmehara.getChannelUrl());
		this.setChannelFollowers(vtuberMainUmehara.getChannelFollowers());
		SimpleDateFormat sdf= new SimpleDateFormat("yyyy-MM-dd");
		this.setChannelDate(sdf.format(vtuberMainUmehara.getChannelDate()));
		this.setComment(vtuberMainUmehara.getComment());
	}
}
