package Ex1_B2;

public class PriceInfo {
	Result getResult(int price, int tax, int cut) {
		Result res = new Result();
		int calc1 = price * (100 + tax) / 100;
		res.withTax = calc1;
		int calc2 = calc1 * (100 - cut) / 100;
		res.discount = calc2;
		return res;
	}
}
