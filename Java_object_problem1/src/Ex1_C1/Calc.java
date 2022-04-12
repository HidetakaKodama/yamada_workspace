package Ex1_C1;
/**
 *
 * メニューを選んだ際、それぞれの金額を合計したものを戻り値で返す。
 *
 */
public class Calc {
	int total(int ham, int ff, int dri) {
		int totalPrice = ham + ff + dri;
		return totalPrice;
	}
}
