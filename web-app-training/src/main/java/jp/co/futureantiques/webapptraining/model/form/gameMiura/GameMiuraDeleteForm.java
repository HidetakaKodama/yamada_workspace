package jp.co.futureantiques.webapptraining.model.form.gameMiura;

import java.util.ArrayList;

import javax.validation.constraints.Size;

import lombok.Data;

/**
 * ゲーム削除画面のFormクラス
 *
 * @author miura
 */
@Data
public class GameMiuraDeleteForm {

	/** 削除ID */
	@Size(min = 1, message = "common.text.error.require.check")
	private ArrayList<Long> deleteIds;
}
