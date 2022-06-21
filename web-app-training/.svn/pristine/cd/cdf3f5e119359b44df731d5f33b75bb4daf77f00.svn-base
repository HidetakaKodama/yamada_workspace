package jp.co.futureantiques.webapptraining.model.form.triathlonMori;

import java.sql.Timestamp;
import java.util.Date;

import javax.validation.constraints.Size;

import org.hibernate.validator.constraints.NotBlank;
import org.springframework.web.multipart.MultipartFile;

import jp.co.futureantiques.webapptraining.model.triathlonMori.TriathlonMainMori;
import lombok.Data;

/**
 * 自転車登録・更新画面用のFormクラス
 *
 * @author future
 */
@Data
public class TriathlonMoriInputForm {

	/** ID */
	private int id;

	/** 画像 */
	private MultipartFile image;

	/** 自転車名 */
	@NotBlank(message = "common.text.error.require")
	@Size(max = 255)
	private String name;

	/** タイプID */
	private Integer typeId;

	/** メーカーID */
	private Integer makerId;

	/** 価格 */
	@NotBlank(message = "triathlon.text.error.size.max.seven")
	@Size(max = 7, message = "triathlon.text.error.size.max.seven")
	private String price;

	/** 更新日時（排他制御用） */
	private String updateDate;

	/** 画像削除フラグ */
	private String imageDelFlg;

	/**
	 * フィールドにエンティティの中身を入れる
	 *
	 * @param triathlonMainMori
	 */
	public void initWithTriathlonMainMori(TriathlonMainMori triathlonMainMori) {
		this.setId((int) triathlonMainMori.getId());
		this.setName(triathlonMainMori.getName());
		this.setTypeId(triathlonMainMori.getTypeId());
		this.setMakerId(triathlonMainMori.getMakerId());
		this.setPrice(triathlonMainMori.getPrice());
		this.setUpdateDate(String.valueOf(triathlonMainMori.getUpdateDate()));
	}

	/**
	 * TriathlonMainMoriエンティティに登録値を入れる
	 *
	 * @return TriathlonMainMori
	 */
	public TriathlonMainMori convertToTriathlonMainMoriForInsert() {
		TriathlonMainMori triathlonMainMori = new TriathlonMainMori();
		triathlonMainMori = convertToTriathlonMainMori(triathlonMainMori);
		triathlonMainMori.setCreateDate(new Timestamp(new Date().getTime()));
		triathlonMainMori.setUpdateDate(triathlonMainMori.getCreateDate());
		return triathlonMainMori;
	}

	/**
	 * TriathlonMainMoriエンティティに更新値を入れる
	 *
	 * @param TriathlonMainMori triathlonMainMori
	 * @return triathlonMainMori
	 */
	public TriathlonMainMori convertToTriathlonMainMoriForUpdate(TriathlonMainMori triathlonMainMori) {
		triathlonMainMori = convertToTriathlonMainMori(triathlonMainMori);
		triathlonMainMori.setUpdateDate(new Timestamp(new Date().getTime()));
		return triathlonMainMori;
	}

	/**
	 * TriathlonMainMoriエンティティに入力値を入れる
	 *
	 * @param TriathlonMainMori triathlonMainMori
	 * @return TriathlonMainMori
	 */
	private TriathlonMainMori convertToTriathlonMainMori(TriathlonMainMori triathlonMainMori) {
		triathlonMainMori.setName(this.name);
		triathlonMainMori.setTypeId(this.typeId);
		triathlonMainMori.setMakerId(this.makerId);
		triathlonMainMori.setPrice(this.price);
		triathlonMainMori.setDelFlg("0");

//		if(this.genreId == CommonConst.NOT_ENTERD) {
//
//			// ジャンルが入力されていなかった場合
//			movieMain.setGenreId(null);
//		}else {
//
//			// ジャンルが入力されていた場合
//			movieMain.setGenreId(this.genreId);
//		}
//		if(this.actorId == CommonConst.NOT_ENTERD) {
//
//			// 俳優が入力されていなかった場合
//			movieMain.setActorId(null);
//		}else {
//
//			// 俳優が入力されていた場合
//			movieMain.setActorId(this.actorId);
//		}
//		movieMain.setReleaseYear(Integer.parseInt(this.releaseYearStr));
//		if (!this.runTimeStr.isEmpty()) {
//
//			// 上映時間が入力されていた場合
//			movieMain.setRunTime(Integer.parseInt(this.runTimeStr));
//		} else {
//
//			// 上映時間が入力されていなかった場合
//			movieMain.setRunTime(null);
//		}
		return triathlonMainMori;
	}
}
