package jp.co.futureantiques.webapptraining.model.form.penguinKawamura;


import java.sql.Timestamp;
import java.util.Date;

import javax.validation.constraints.Size;

import org.hibernate.validator.constraints.NotBlank;
import org.springframework.web.multipart.MultipartFile;

import jp.co.futureantiques.webapptraining.model.penguinKawamura.PenguinMainKawamura;
import lombok.Data;

/**
 * ペンギン登録・更新画面用のFormクラス
 * @author Mariko Kawamura
 */

@Data
public class PenguinInputForm {

	/** ペンギンID */
	private int id;

	/** 画像 */
	private MultipartFile image;

	/** ペンギンの名前 */
	@NotBlank(message = "common.text.error.require")
	@Size(max = 256)
	private String name;

	/** 属性ID */
	private Integer attributeId;

	/** コメント */
	@Size(max = 256)
	private String comment;

	/** 更新日時(排他制御用) */
	private String updateDate;

	/** 画像削除フラグ */
	private String imageDelFlg;

	/**
	 * フィールドにエンティティの中身を入れる
	 * @param PenguinMainKawamua penguinMainKawamura
	 */
	public void initWithPenguinMainKawamura(PenguinMainKawamura penguinMainKawamura) {
		this.setId((int)penguinMainKawamura.getId());
		this.setName(penguinMainKawamura.getName());
		this.setAttributeId(penguinMainKawamura.getAttributeId());
		this.setComment(penguinMainKawamura.getComment());
		this.setUpdateDate(String.valueOf(penguinMainKawamura.getUpdateDate()));
	}

	/**
	 * PenguinMainKawamuraエンティティに登録値を入れる
	 * @return PenguinMainKawamura
	 */
	public PenguinMainKawamura converToPenguinMainKawamuraForInsert() {
		PenguinMainKawamura penguinMainKawamura = new PenguinMainKawamura();
		penguinMainKawamura = converToPenguinMainKawamura(penguinMainKawamura);
		penguinMainKawamura.setCreateDate(new Timestamp(new Date().getTime()));
		penguinMainKawamura.setUpdateDate(penguinMainKawamura.getCreateDate());
		return penguinMainKawamura;
	}

	/**
	 * PenguinMainKawamuraエンティティに更新値を入れる
	 * @return penguinMainKawamura
	 * @param PenguinMainKawamura penguinMainKawamura
	 */
	public PenguinMainKawamura converToPenguinMainKawamuraForUpdate(PenguinMainKawamura penguinMainKawamura) {
		penguinMainKawamura = converToPenguinMainKawamura(penguinMainKawamura);
		penguinMainKawamura.setUpdateDate(new Timestamp(new Date().getTime()));
		return penguinMainKawamura;
	}

	/**
	 * PenguinMainKawamuraエンティティに入力値を入れる
	 * @return penguinMainKawamura
	 * @param PenguinMainKawamura penguinMainKawamura
	 */
	public PenguinMainKawamura converToPenguinMainKawamura(PenguinMainKawamura penguinMainKawamura) {
		penguinMainKawamura.setName(this.name);
		penguinMainKawamura.setAttributeId(this.attributeId);
		penguinMainKawamura.setComment(this.comment);
		penguinMainKawamura.setDelFlg("0");
		return penguinMainKawamura;
	}



}
