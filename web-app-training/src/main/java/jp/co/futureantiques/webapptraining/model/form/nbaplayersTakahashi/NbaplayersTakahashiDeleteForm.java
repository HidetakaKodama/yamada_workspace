package jp.co.futureantiques.webapptraining.model.form.nbaplayersTakahashi;

import java.util.ArrayList;

import javax.validation.constraints.Size;

import lombok.Data;

/**
 * NBA選手データ削除画面のFormクラス
 *
 * @author TakumiTakahashi
 */
@Data
public class NbaplayersTakahashiDeleteForm {

	/** 削除ID */
	@Size(min = 1, message = "common.text.error.require.check")
	private ArrayList<Long> deleteIds;
}