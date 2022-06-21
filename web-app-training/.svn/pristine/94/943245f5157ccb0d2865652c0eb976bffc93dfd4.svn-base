package jp.co.futureantiques.webapptraining.model.form.weaponHiratsuka;

import java.sql.Timestamp;
import java.util.Date;

import javax.validation.constraints.Min;
import javax.validation.constraints.Pattern;
import javax.validation.constraints.Size;

import org.hibernate.validator.constraints.NotBlank;

import jp.co.futureantiques.webapptraining.model.weaponHiratsuka.WeaponMainHiratsuka;
import lombok.Data;

/**
 * 武器データ登録・更新画面用のFormクラス
 *
 * @author hiratsuka
 */
@Data
public class WeaponHiratsukaInputForm {

	/** ID */
	private int id;

	/** 武器名 */
	@NotBlank(message = "common.text.error.require")
	@Size(max = 255, message ="Weapon1.text.error.name")
	private String weaponname;

	/** 武器タイプID */
	@Min (value=1,message = "Weapon1.text.error.weapontype")
	private Integer weapontypeId;

	/** 射撃方式ID */
	@Min (value=1,message = "Weapon1.text.error.shottype")
	private Integer shottypeId;

	/** コスト */
	@Size(min = 1, max = 5, message = "Weapon1.text.error.cost")
	@Pattern(regexp = "^([+-]?0|[+-]?[1-9][0-9]*)?$", message = "common.text.error.numeric")
	private String costStr;

	/** 頭ダメージ */
	@Size(max = 4, message = "common.text.error.size.max.four")
	@Pattern(regexp = "^([+-]?0|[+-]?[1-9][0-9]*)?$", message = "common.text.error.numeric")
	private String headdamageStr;

	/** 胴ダメージ */
	@Size(max = 4, message = "common.text.error.size.max.four")
	@Pattern(regexp = "^([+-]?0|[+-]?[1-9][0-9]*)?$", message = "common.text.error.numeric")
	private String bodydamageStr;

	/** 脚部ダメージ */
	@Size(max = 4, message = "common.text.error.size.max.four")
	@Pattern(regexp = "^([+-]?0|[+-]?[1-9][0-9]*)?$", message = "common.text.error.numeric")
	private String legdamageStr;

	/** 連射速度 */
	@Pattern(regexp = "^([+-]?0|[+-]?[0-9]?[0-9]?(\\.[0-9][0-9]?[1-9]?)?)?$", message = "Weapon1.text.error.rate")
	private String rateStr;

	/** 更新日時（排他制御用） */
	private String updateDate;

	/**
	 * フィールドにエンティティの中身を入れる
	 *
	 * @param WeaponMain
	 */
	public void initWithWeaponMainHiratsuka(WeaponMainHiratsuka weaponMainHiratsuka) {
		this.setId((int) weaponMainHiratsuka.getId());
		this.setWeaponname(weaponMainHiratsuka.getWeaponname());
		this.setWeapontypeId(weaponMainHiratsuka.getWeapontypeId());
		this.setShottypeId(weaponMainHiratsuka.getShottypeId());
		this.setCostStr(String.valueOf(weaponMainHiratsuka.getCost()));
		if (weaponMainHiratsuka.getHeaddamage() != null) {
			this.setHeaddamageStr(String.valueOf(weaponMainHiratsuka.getHeaddamage()));
		}
		if (weaponMainHiratsuka.getBodydamage() != null) {
			this.setBodydamageStr(String.valueOf(weaponMainHiratsuka.getBodydamage()));
		}
		if (weaponMainHiratsuka.getLegdamage() != null) {
			this.setLegdamageStr(String.valueOf(weaponMainHiratsuka.getLegdamage()));
		}
		if (weaponMainHiratsuka.getRate() != null) {
			this.setRateStr(String.valueOf(weaponMainHiratsuka.getRate()));
		}
		this.setUpdateDate(String.valueOf(weaponMainHiratsuka.getUpdateDate()));
	}

	/**
	 * WeaponMainエンティティに登録値を入れる
	 *
	 * @return WeaponMain
	 */
	public WeaponMainHiratsuka convertToWeaponMainHiratsukaForInsert() {
		WeaponMainHiratsuka weaponMainHiratsuka = new WeaponMainHiratsuka();
		weaponMainHiratsuka = convertToWeaponMainHiratsuka(weaponMainHiratsuka);
		weaponMainHiratsuka.setCreateDate(new Timestamp(new Date().getTime()));
		weaponMainHiratsuka.setUpdateDate(weaponMainHiratsuka.getCreateDate());
		return weaponMainHiratsuka;
	}

	/**
	 * WeaponMainエンティティに更新値を入れる
	 *
	 * @param WeaponMain weaponMain
	 * @return WeaponMain
	 */
	public WeaponMainHiratsuka convertToWeaponmMainHiratsukaForUpdate(WeaponMainHiratsuka weaponMainHiratsuka) {
		weaponMainHiratsuka = convertToWeaponMainHiratsuka(weaponMainHiratsuka);
		weaponMainHiratsuka.setUpdateDate(new Timestamp(new Date().getTime()));
		return weaponMainHiratsuka;
	}

	/**
	 * WeaponMainエンティティに入力値を入れる
	 *
	 * @param WeaponMain weaponMain
	 * @return WeaponMain
	 */
	private WeaponMainHiratsuka convertToWeaponMainHiratsuka(WeaponMainHiratsuka weaponMainHiratsuka) {
		weaponMainHiratsuka.setWeaponname(this.weaponname);
		weaponMainHiratsuka.setWeapontypeId(this.weapontypeId);
		weaponMainHiratsuka.setShottypeId(this.shottypeId);
		weaponMainHiratsuka.setCost(Integer.parseInt(this.costStr));

		if (!this.headdamageStr.isEmpty()) {

			// 頭部ダメージが入力されていた場合
			weaponMainHiratsuka.setHeaddamage(Integer.parseInt(this.headdamageStr));
		} else {

			// 頭部ダメージが入力されていなかった場合
			weaponMainHiratsuka.setHeaddamage(null);
		}

		if (!this.bodydamageStr.isEmpty()) {

			// 胴ダメージが入力されていた場合
			weaponMainHiratsuka.setBodydamage(Integer.parseInt(this.bodydamageStr));
		} else {

			// 胴ダメージが入力されていなかった場合
			weaponMainHiratsuka.setBodydamage(null);
		}

		if (!this.legdamageStr.isEmpty()) {

			// 脚部ダメージが入力されていた場合
			weaponMainHiratsuka.setLegdamage(Integer.parseInt(this.legdamageStr));
		} else {

			// 脚部ダメージが入力されていなかった場合
			weaponMainHiratsuka.setLegdamage(null);
		}

		if (!this.rateStr.isEmpty()) {

			// 連射速度が入力されていた場合
			weaponMainHiratsuka.setRate(Double.parseDouble(this.rateStr));
		} else {

			// 連射速度が入力されていなかった場合
			weaponMainHiratsuka.setRate(null);
		}

		weaponMainHiratsuka.setDelFlg("0");
		return weaponMainHiratsuka;
	}
}