package jp.co.futureantiques.webapptraining.model.form.weaponHiratsuka;

import jp.co.futureantiques.webapptraining.model.weaponHiratsuka.WeaponMainHiratsuka;
import lombok.Data;

/**
 * メイン画面使用されるformクラス
 *
 * @author hiratsuka
 */
@Data
public class WeaponHiratsukaSearchForm {

	/** ID */
	private Integer id;

	/** 武器名 */
	private String weaponname;

	/** 武器タイプID */
	private Integer weapontypeId;

	/** コスト */
	private Integer cost;

	/** 射撃方式ID */
	private Integer shottypeId;

	/** 削除フラグ */
	private int isDelete;

	/**
	 *
	 * 各フィールドに値を設定する
	 *
	 * @param weapon
	 */
	public void setValues(WeaponMainHiratsuka weaponMainHiratsuka) {
		this.setId((int) weaponMainHiratsuka.getId());
		this.setWeaponname(weaponMainHiratsuka.getWeaponname());
		this.setWeapontypeId(weaponMainHiratsuka.getWeapontypeId());
		this.setCost(weaponMainHiratsuka.getCost());
		this.setShottypeId(weaponMainHiratsuka.getShottypeId());

	}
}
