package jp.co.futureantiques.webapptraining.model.form.resipeishikawa;



import java.sql.Timestamp;
import java.util.Date;

import javax.validation.constraints.NotNull;
import javax.validation.constraints.Pattern;
import javax.validation.constraints.Size;

import org.hibernate.validator.constraints.NotBlank;

import jp.co.futureantiques.webapptraining.model.resipeishikawa.ResipeMainIshikawa;
import lombok.Data;

/**
 * 献立登録・更新画面用のFormクラス
 *
 * @author t.ishikawa
 */
@Data
public class ResipeIshikawaInputForm {

	/**ID*/
	private int id;

	/**献立名*/
	@NotBlank(message = "common.text.error.require")
	@Size(max = 255)
	private String resipeTitle;

	/**献立名*/
	@NotBlank(message = "common.text.error.require")
	@Size(max = 255)
	private String resipeTitle2;

	/**野菜ID1*/
	@NotNull(message = "common.text.error.require")
	private Integer vegetableId1;

	/**野菜ID2*/
	private Integer vegetableId2;

	/**ジャンルID*/
	@NotNull(message = "common.text.error.require")
	private Integer genreId;

	/**調理時間*/
	@NotBlank(message = "common.text.error.require")
	@Size(max = 4,message = "common.text.error.size.max.four")
	@Pattern(regexp = "^([+-]?0|[+-]?[1-9][0-9]*)?$",message = "common.text.error.numeric")
	private String cookTimeStr;

	/**更新日時(排他制御用)*/
	private String updateDate;

	/**
	 *フィールドにエンティティの中身を入れる
	 *
	 * @param resipeMainIshikawa
	 */
	public void initWithResipeMainIshikawa(ResipeMainIshikawa resipeMainIshikawa) {
		this.setId((int)resipeMainIshikawa.getId());
		this.setResipeTitle(resipeMainIshikawa.getResipeTitle());
		this.setResipeTitle2(resipeMainIshikawa.getResipeTitle2());
		this.setVegetableId1(resipeMainIshikawa.getVegetableId1());
		this.setVegetableId2(resipeMainIshikawa.getVegetableId2());
		this.setGenreId(resipeMainIshikawa.getGenreId());
		this.setCookTimeStr(String.valueOf(resipeMainIshikawa.getCookTime()));
		this.setUpdateDate(String.valueOf(resipeMainIshikawa.getUpdateDate()));
	}

	/**
	 * ResipeMainエンティティに登録値を入れる
	 *
	 * @param ResipeMainIshikawa resipeIshikawa
	 * @return resipeIshikawa
	 */
public ResipeMainIshikawa convertToResipeMainIshikawaForInsert() {
		ResipeMainIshikawa resipeMainIshikawa = new ResipeMainIshikawa();
		resipeMainIshikawa = convertToResipeMainIshikawa(resipeMainIshikawa);
		resipeMainIshikawa.setCreateDate(new Timestamp(new Date().getTime()));
		resipeMainIshikawa.setUpdateDate(resipeMainIshikawa.getCreateDate());
		return resipeMainIshikawa;
}


	/**
	 *ResipeMainIshikawaエンティティに更新値を入れる
	 *
	 * @param ResipeMainIshikawa resipeMainIshikawa
	 * @return ResipeMainIshikawa
	 */
	public ResipeMainIshikawa convertToResipeMainIshikawaForUpdate(ResipeMainIshikawa resipeMainIshikawa) {
		resipeMainIshikawa = convertToResipeMainIshikawa(resipeMainIshikawa);
		resipeMainIshikawa.setUpdateDate(new Timestamp(new Date().getTime()));
		return resipeMainIshikawa;
	}

	/**
	 *ResipeMainIshikawaエンティティに入力値を入れる
	 *
	 *@param ResipeMainIshikawa resipeMainIshikawa
	 *@param ResipeMainIshikawa
	 */
	private ResipeMainIshikawa convertToResipeMainIshikawa(ResipeMainIshikawa resipeMainIshikawa) {
		resipeMainIshikawa.setResipeTitle(this.resipeTitle);
		resipeMainIshikawa.setResipeTitle2(this.resipeTitle2);
		resipeMainIshikawa.setVegetableId1(this.vegetableId1);
		resipeMainIshikawa.setVegetableId2(this.vegetableId2);
		resipeMainIshikawa.setGenreId(this.genreId);
		resipeMainIshikawa.setCookTime(Integer.parseInt(this.cookTimeStr));
		resipeMainIshikawa.setDelFlg("0");
		return resipeMainIshikawa;
		}
}