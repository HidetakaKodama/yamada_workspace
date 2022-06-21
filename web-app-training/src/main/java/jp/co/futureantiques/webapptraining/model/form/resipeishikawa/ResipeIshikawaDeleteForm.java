package jp.co.futureantiques.webapptraining.model.form.resipeishikawa;

import java.util.ArrayList;

import javax.validation.constraints.Size;

import lombok.Data;

/**
 * 献立削除画面のFormクラス
 *
 * @author t.ishikawa
 */
@Data
public class ResipeIshikawaDeleteForm {

	/**削除ID*/
@Size(min=1,message = "common.text.error.require.check")
private ArrayList<Long>deleteIds;
}
