package jp.co.futureantiques.webapptraining.model.form.tokyoTakehara;

import java.sql.Timestamp;
import java.util.Date;

import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Pattern;
import javax.validation.constraints.Size;

import org.hibernate.validator.constraints.NotBlank;
import org.springframework.web.multipart.MultipartFile;

import jp.co.futureantiques.webapptraining.model.tokyoTakehara.TokyoMainTakehara;
import lombok.Data;

/**
 * 情報登録・更新画面用のFormクラス
 *
 */
@Data
public class TokyoTakeharaInputForm {

	/** ID */
	private int id;

	/** 区名 */
	@NotBlank(message = "common.text.error.require")
	@Size(max = 20 , message= "{max}"+"common.text.error.string.size")
	private String wardName;

	/** 所在地ID */
	@NotNull(message = "common.text.error.require")
	@Min(value = 1, message = "common.text.error.input.location")
	private int locationId;

	/** 人口 */
	@Size(max = 7, message = "common.text.error.size.max")
	@Pattern(regexp = "^([+-]?0|[+-]?[1-9][0-9]*)?$", message = "common.text.error.numeric")
	private String populationStr;

	/** 面積 */
	@Pattern(regexp = "^([+-]?0|\\d{1,2}(\\.\\d{1,2})*)?$", message = "common.text.error.float.pointtwo")
	private String areaStr;

	/** 区役所の最寄駅 */
	@Size(max = 20, message = "common.text.error.string.size")
	private String wardOffice;

	/** 平均年収 */
	@Size(max = 4, message = "common.text.error.size.max")
	@Pattern(regexp = "^([+-]?0|[+-]?[1-9][0-9]*)?$", message = "common.text.error.numeric")
	private String averageAnnualIncomeStr;

	/** 公示地価 */
	@Size(max = 7, message = "common.text.error.size.max")
	@Pattern(regexp = "^([+-]?0|[+-]?[1-9][0-9]*)?$", message = "common.text.error.numeric")
	private String officialLandPriceStr;

	/** 出身の著名人 */
	@Size(max = 10, message = "common.text.error.string.size")
	private String performer;

	/** 区章 */
	private MultipartFile symbol;

	/** 更新日時（排他制御用） */
	private String updateDate;

	/**
	 * フィールドにエンティティの中身を入れる(あらかじめ入力欄に現在のデータを入れておく)
	 *
	 * @param tokyoMainTakehara
	 */
	public void initWithTokyoMainTakehara(TokyoMainTakehara tokyoMainTakehara) {
		this.setId((int) tokyoMainTakehara.getId());
		this.setWardName(tokyoMainTakehara.getWardName());
		this.setLocationId(tokyoMainTakehara.getLocationId());
		if (tokyoMainTakehara.getPopulation() != null) {
			this.setPopulationStr(String.valueOf(tokyoMainTakehara.getPopulation()));
		}
		if (tokyoMainTakehara.getArea() != null) {
			this.setAreaStr(String.valueOf(tokyoMainTakehara.getArea()));
		}
		if (tokyoMainTakehara.getWardOffice() != null) {
			this.setWardOffice(tokyoMainTakehara.getWardOffice());
			;
		}
		if (tokyoMainTakehara.getAverageAnnualIncome() != null) {
			this.setAverageAnnualIncomeStr(String.valueOf(tokyoMainTakehara.getAverageAnnualIncome()));
		}
		if (tokyoMainTakehara.getOfficialLandPrice() != null) {
			this.setOfficialLandPriceStr(String.valueOf(tokyoMainTakehara.getOfficialLandPrice()));
		}
		if (tokyoMainTakehara.getPerformer() != null) {
			this.setPerformer(tokyoMainTakehara.getPerformer());
		}
		this.setUpdateDate(String.valueOf(tokyoMainTakehara.getUpdateDate()));
	}

	/**
	 * TokyoMainTakeharaエンティティに登録値を入れる
	 */
	public TokyoMainTakehara convertToTokyoMainTakeharaForInsert() {
		TokyoMainTakehara tokyoMainTakehara = new TokyoMainTakehara();
		tokyoMainTakehara = comvertToTokyoMainTakehara(tokyoMainTakehara);
		tokyoMainTakehara.setCreateDate(new Timestamp(new Date().getTime()));
		tokyoMainTakehara.setUpdateDate(tokyoMainTakehara.getCreateDate());
		return tokyoMainTakehara;
	}

	/**
	 * TokyoMainTakeharaエンティティに更新値を入れる
	 */
	public TokyoMainTakehara convertToTokyoMainTakeharaForUpdate(TokyoMainTakehara tokyoMainTakehara) {
		tokyoMainTakehara = comvertToTokyoMainTakehara(tokyoMainTakehara);
		tokyoMainTakehara.setUpdateDate(new Timestamp(new Date().getTime()));
		return tokyoMainTakehara;
	}

	/**
	 * TokyoMainTakeharaエンティティに入力値を入れる
	 */
	private TokyoMainTakehara comvertToTokyoMainTakehara(TokyoMainTakehara tokyoMainTakehara) {
		tokyoMainTakehara.setWardName(this.wardName);
		tokyoMainTakehara.setLocationId(this.locationId);
		if (!this.populationStr.isEmpty()) {

			//人口が入力されていた場合
			tokyoMainTakehara.setPopulation(Integer.parseInt(this.populationStr));
		} else {

			//入力されていない場合
			tokyoMainTakehara.setPopulation(null);
		}
		if (!this.areaStr.isEmpty()) {

			//面積が入力されていた場合
			tokyoMainTakehara.setArea(Float.parseFloat(this.areaStr));
		} else {

			//入力されていない場合
			tokyoMainTakehara.setArea(null);
		}
		if (!this.wardOffice.isEmpty()) {

			//区役所の最寄駅が入力されていた場合
			tokyoMainTakehara.setWardOffice(this.wardOffice);
		} else {

			//入力されていない場合
			tokyoMainTakehara.setWardOffice(null);
		}
		if (!this.averageAnnualIncomeStr.isEmpty()) {

			//平均年収が入力されていた場合
			tokyoMainTakehara.setAverageAnnualIncome(Integer.parseInt(this.averageAnnualIncomeStr));
		} else {

			//入力されていない場合
			tokyoMainTakehara.setAverageAnnualIncome(null);
		}
		if (!this.officialLandPriceStr.isEmpty()) {

			//公示地価が入力されていた場合
			tokyoMainTakehara.setOfficialLandPrice(Integer.parseInt(this.officialLandPriceStr));
		} else {

			//入力されていない場合
			tokyoMainTakehara.setOfficialLandPrice(null);
		}
		if (!this.performer.isEmpty()) {

			//出身の著名人が入力されていた場合
			tokyoMainTakehara.setPerformer(this.performer);
		} else {

			//入力されていない場合
			tokyoMainTakehara.setPerformer(null);
		}
		tokyoMainTakehara.setDelFlg("0");
		return tokyoMainTakehara;
	}
}
