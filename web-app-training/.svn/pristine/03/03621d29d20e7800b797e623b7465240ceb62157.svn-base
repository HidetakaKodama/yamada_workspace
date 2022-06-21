package jp.co.futureantiques.webapptraining.model.form.drinkYoshimoto;

import java.sql.Timestamp;
import java.util.Date;

import javax.validation.constraints.Size;

import org.hibernate.validator.constraints.NotBlank;
import org.springframework.web.multipart.MultipartFile;

import jp.co.futureantiques.webapptraining.constant.CommonConst;
import jp.co.futureantiques.webapptraining.model.drinkYoshimoto.DrinkMainYoshimoto;
import lombok.Data;

/**
 * 飲み物登録・更新画面用のFormクラス
 *
 * @author Yoshimoto
 *
 */
@Data
public class DrinkYoshimotoInputForm {

	/** ID */
	private int drinkId;

	/** 商品名 */
	@NotBlank(message = "common.text.error.require")
	@Size(max = 256, message = "drink.text.error.countover")
	private String drinkName;

	/** カテゴリーID */
	private Integer categoryId;

	/** メーカーID */
	private Integer makerId;

	/** 画像 */
	private MultipartFile image;

	/** 更新日時（排他制御用） */
	private String updateDate;

	/** 画像削除フラグ */
	private String imageDelFlg;

	/**
	 * フィールドにエンティティの中身を入れる
	 *
	 * @param drinkMainYoshimoto
	 */
	public void initWithDrinkMainYoshimoto(DrinkMainYoshimoto drinkMainYoshimoto) {
		this.setDrinkId((int) drinkMainYoshimoto.getDrinkId());
		this.setDrinkName(drinkMainYoshimoto.getDrinkName());
		this.setCategoryId(drinkMainYoshimoto.getCategoryId());
		this.setMakerId(drinkMainYoshimoto.getMakerId());
		this.setUpdateDate(String.valueOf(drinkMainYoshimoto.getUpdateDate()));
	}

	/**
	 * DrinkMainYoshimotoエンティティに登録値を入れる
	 *
	 * @return DrinkMainYoshimoto
	 */
	public DrinkMainYoshimoto convertToDrinkMainYoshimotoForInsert() {
		DrinkMainYoshimoto drinkMainYoshimoto = new DrinkMainYoshimoto();
		drinkMainYoshimoto = convertToDrinkMainYoshimoto(drinkMainYoshimoto);
		drinkMainYoshimoto.setCreateDate(new Timestamp(new Date().getTime()));
		drinkMainYoshimoto.setUpdateDate(drinkMainYoshimoto.getCreateDate());
		return drinkMainYoshimoto;
	}

	/**
	 * DrinkMainYoshimotoエンティティに更新値を入れる
	 *
	 * @param DrinkMainYohimoto drinkMainYoshimoto
	 * @return DrinkMainYoshimoto
	 */
	public DrinkMainYoshimoto convertToDrinkMainYoshimotoForUpdate(DrinkMainYoshimoto drinkMainYoshimoto) {
		drinkMainYoshimoto = convertToDrinkMainYoshimoto(drinkMainYoshimoto);
		drinkMainYoshimoto.setUpdateDate(new Timestamp(new Date().getTime()));
		return drinkMainYoshimoto;
	}

	/**
	 * DrinkMainYoshimotoエンティティに入力値を入れる
	 *
	 * @param DrinkMainYoshimoto drinkMainYoshimoto
	 * @return DrinkMainYoshimoto
	 */
	private DrinkMainYoshimoto convertToDrinkMainYoshimoto(DrinkMainYoshimoto drinkMainYoshimoto) {
		drinkMainYoshimoto.setDrinkName(this.drinkName);
		if (this.categoryId == CommonConst.NOT_ENTERD) {

			//カテゴリーが入力されていなかった場合
			drinkMainYoshimoto.setCategoryId(null);
		} else {

			//カテゴリーが入力されていた場合
			drinkMainYoshimoto.setCategoryId(this.categoryId);
		}
		if (this.makerId == CommonConst.NOT_ENTERD) {

			//メーカーが入力されていなかった場合
			drinkMainYoshimoto.setMakerId(null);
		} else {

			//メーカーが入力されていた場合
			drinkMainYoshimoto.setMakerId(this.makerId);
		}
		drinkMainYoshimoto.setDelFlg("0");
		return drinkMainYoshimoto;
	}
}
