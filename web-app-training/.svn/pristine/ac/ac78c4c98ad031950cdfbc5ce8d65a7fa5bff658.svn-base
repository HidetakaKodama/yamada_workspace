package jp.co.futureantiques.webapptraining.model.form.vtuberUmehara;

import java.sql.Timestamp;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

import javax.validation.constraints.Min;
import javax.validation.constraints.Pattern;
import javax.validation.constraints.Size;

import org.hibernate.validator.constraints.NotBlank;
import org.springframework.web.multipart.MultipartFile;

import com.fasterxml.jackson.annotation.JsonFormat;

import jp.co.futureantiques.webapptraining.constant.CommonConst;
import jp.co.futureantiques.webapptraining.model.vtuberUmehara.VtuberMainUmehara;
import lombok.Data;

/**
 * Vtuber登録・更新画面用のFormクラス
 *
 * @author future
 */
@Data
public class VtuberUmeharaInputForm {

	/** ID */
	private Integer id;

	/** Image */
	private MultipartFile image;

	/** Vtuber名 */
	@NotBlank(message = "common.text.error.require")
	private String vtuberName;

	/** 会社ID */
	@Min(value=1,message = "common.text.error.require")
	private Integer companyId;

	/** 動画形態ID */
	@Min(value=1,message = "common.text.error.require")
	private Integer formsId;

	/** 動画内容ID */
	@Min(value=1,message = "common.text.error.require")
	private Integer contentsId;

	/** チャンネルURL */
	@NotBlank(message = "common.text.error.require")
	private String channelUrl;

	/** チャンネル登録者数 */
	@Size(max=9,message = "common.text.error.size.max.nine")
	@Pattern(regexp = "^([+-]?0|[+-]?[1-9][0-9]*)?$", message = "common.text.error.numeric")
	private String channelFollowers;

	/** チャンネル作成日 */
	@JsonFormat(pattern = "yyyy-MM-dd")
	private String channelDate;

	/** コメント */
	private String comment;

	/** 画像削除フラグ */
	private String imageDelFlg;

	/** 更新日時（排他制御用） */
	private String updateDate;

	/**
	 * フィールドにエンティティの中身を入れる
	 *
	 * @param VtuberMainUmehara vtuberMainUmehara
	 */
	public void initWithVtuberMainUmehara(VtuberMainUmehara vtuberMainUmehara) {
		this.setId((int) vtuberMainUmehara.getId());
		this.setVtuberName(vtuberMainUmehara.getVtuberName());
		this.setCompanyId(vtuberMainUmehara.getCompanyId());
		this.setFormsId(vtuberMainUmehara.getFormsId());
		this.setContentsId(vtuberMainUmehara.getContentsId());
		this.setChannelUrl(vtuberMainUmehara.getChannelUrl());
		if (vtuberMainUmehara.getChannelFollowers()!=null) {
		this.setChannelFollowers(String.valueOf(vtuberMainUmehara.getChannelFollowers()));
		}else {
			this.setChannelFollowers(null);
		}
		SimpleDateFormat sdf=new SimpleDateFormat("yyyy-MM-dd");
		Date date=vtuberMainUmehara.getChannelDate();
		String strDate = null;
		if (date!=null) {
		strDate=sdf.format(date);
		}
		this.setChannelDate(strDate);
		this.setComment(vtuberMainUmehara.getComment());
		this.setUpdateDate(String.valueOf(vtuberMainUmehara.getUpdateDate()));
	}

	/**
	 * VtuberMainUmeharaエンティティに登録値を入れる
	 *
	 * @return VtuberMainUmehara
	 */
	public VtuberMainUmehara convertToVtuberMainUmeharaForInsert() {
		VtuberMainUmehara vtuberMainUmehara = new VtuberMainUmehara();
		vtuberMainUmehara = convertToVtuberMainUmehara(vtuberMainUmehara);
		vtuberMainUmehara.setCreateDate(new Timestamp(new Date().getTime()));
		vtuberMainUmehara.setUpdateDate(vtuberMainUmehara.getCreateDate());
		return vtuberMainUmehara;
	}

	/**
	 * VtuberMainUmeharaエンティティに更新値を入れる
	 *
	 * @param VtuberMainUmehara vtuberMainUmehara
	 * @return VtuberMainUmehara
	 */
	public VtuberMainUmehara convertToVtuberMainUmeharaForUpdate(VtuberMainUmehara vtuberMainUmehara) {
		vtuberMainUmehara = convertToVtuberMainUmehara(vtuberMainUmehara);
		vtuberMainUmehara.setUpdateDate(new Timestamp(new Date().getTime()));
		return vtuberMainUmehara;
	}

	/**
	 * VtuberMainUmeharaエンティティに入力値を入れる
	 *
	 * @param VtuberMainUmehara vtuberMainUmehara
	 * @return VtuberMainUmehara
	 */
	private VtuberMainUmehara convertToVtuberMainUmehara(VtuberMainUmehara vtuberMainUmehara) {
		vtuberMainUmehara.setVtuberName(this.vtuberName);
		if (this.companyId == CommonConst.NOT_ENTERD) {

			// 会社が入力されていなかった場合
			vtuberMainUmehara.setCompanyId(this.companyId);
		} else {

			// 会社が入力されていた場合
			vtuberMainUmehara.setCompanyId(this.companyId);
		}
		if (this.formsId == CommonConst.NOT_ENTERD) {

			// 動画形態が入力されていなかった場合
			vtuberMainUmehara.setFormsId(null);
		} else {

			// 動画形態が入力されていた場合
			vtuberMainUmehara.setFormsId(this.formsId);
		}
		if (this.contentsId == CommonConst.NOT_ENTERD) {

			// 動画内容が入力されていなかった場合
			vtuberMainUmehara.setContentsId(null);
		} else {

			// 動画内容が入力されていた場合
			vtuberMainUmehara.setContentsId(this.contentsId);
		}
		vtuberMainUmehara.setChannelUrl(this.channelUrl);
		if (!this.channelFollowers.isEmpty()) {
		vtuberMainUmehara.setChannelFollowers(Integer.valueOf(this.channelFollowers));
		}else {
			vtuberMainUmehara.setChannelFollowers(null);
		}
		// 入力されたString型の日付データをsdfを用いてDate型のデータへ変換
		if(!this.channelDate.isEmpty()) {
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
		try {
			vtuberMainUmehara.setChannelDate(sdf.parse(this.channelDate));
		} catch (ParseException e) {
			// TODO 自動生成された catch ブロック
			e.printStackTrace();
		}}else {
			vtuberMainUmehara.setChannelDate(null);
		}
		vtuberMainUmehara.setComment(this.comment);
		vtuberMainUmehara.setDelFlg("0");
		return vtuberMainUmehara;
	}
}
