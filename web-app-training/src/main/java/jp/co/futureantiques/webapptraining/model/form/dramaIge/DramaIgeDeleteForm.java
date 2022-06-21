package jp.co.futureantiques.webapptraining.model.form.dramaIge;

import java.util.ArrayList;

import javax.validation.constraints.Size;

import lombok.Data;

/**
 * ドラマ削除画面のクラス
 *
 * @author Ige
 *
 */
@Data
public class DramaIgeDeleteForm {

	/** 削除ID */
	@Size(min = 1, message = "common.text.error.require.check")
	private ArrayList<Long> deleteIds;
}
