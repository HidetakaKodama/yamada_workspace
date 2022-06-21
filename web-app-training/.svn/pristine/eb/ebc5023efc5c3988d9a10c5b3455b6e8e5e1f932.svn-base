package jp.co.futureantiques.webapptraining.model.form.dogKanno;

import java.sql.Timestamp;
import java.util.Date;

import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

import org.hibernate.validator.constraints.NotBlank;
import org.springframework.web.multipart.MultipartFile;

import jp.co.futureantiques.webapptraining.model.dogKanno.DogMainKanno;
import lombok.Data;

/**
 * 犬登録・更新画面用のフォームクラス
 *
 * @author future
 */
@Data
public class DogInputForm {

	/** 犬ID */
	private int dogId;

	/** 犬種 */
	@NotBlank(message = "common.text.error.require")
	@Size(max = 256 , message = "dog.text.error.invalid.name")
	private String dogName;

	/** 原産国ID */
	private Integer countryId;

	/** サイズ */
	@NotNull(message = "common.text.error.require")
	@Min(1)
	private Integer sizeId;

	/** 性格・特徴 */
	@NotBlank(message = "common.text.error.require")
	@Size(max = 256, message = "dog.text.error.invalid.name")
	private String charcter;

	/** 画像 */
    @NotNull(message = "common.text.error.require")
	private MultipartFile image;

	/** 更新日時(排他制御用) */
	private String updateDate;

	/**
	 * フィールドにエンティティの中身を入れる
	 *
	 * @param dogMainKanno
	 */
	public void initWithDogMainKanno(DogMainKanno dogMainKanno) {
		this.setDogId((int) dogMainKanno.getDogId());
		this.setDogName(dogMainKanno.getDogName());
		this.setCountryId(dogMainKanno.getCountryId());
		this.setSizeId(dogMainKanno.getSizeId());
		this.setCharcter(dogMainKanno.getCharcter());
		this.setUpdateDate(String.valueOf(dogMainKanno.getUpdateDate()));
	}

	/**
	 * DogMainKannoエンティティに登録値を入れる
	 *
	 * @return DogMainKanno
	 */
	public DogMainKanno convertToDogMainKannoforInsert() {
		DogMainKanno dogMainKanno = new DogMainKanno();
		dogMainKanno = convertToDogMainKanno(dogMainKanno);
		dogMainKanno.setCreateDate(new Timestamp(new Date().getTime()));
		dogMainKanno.setUpdateDate(dogMainKanno.getCreateDate());
		return dogMainKanno;
	}

	/**
	 * DogMainKannoエンティティに更新値を入れる
	 *
	 * @param DogMainKanno
	 * @return dogMainKanno
	 */
	public DogMainKanno convertToDogMainKannoForUpdate(DogMainKanno dogMainKanno) {
		dogMainKanno = convertToDogMainKanno(dogMainKanno);
		dogMainKanno.setUpdateDate(new Timestamp(new Date().getTime()));
		return dogMainKanno;
	}

	/**
	 * DogMainKannoエンティティに入力値を入れる
	 *
	 * @param DogMainKanno dogMainKanno
	 * @return DogMainKanno
	 */
	private DogMainKanno convertToDogMainKanno(DogMainKanno dogMainKanno) {
		dogMainKanno.setDogName(this.dogName);
		dogMainKanno.setCountryId(this.countryId);
		dogMainKanno.setSizeId(this.sizeId);
		dogMainKanno.setCharcter(this.charcter);
		dogMainKanno.setDelFlg("0");
		return dogMainKanno;

	}

}
