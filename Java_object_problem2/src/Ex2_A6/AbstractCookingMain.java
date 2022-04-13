package Ex2_A6;

public class AbstractCookingMain {
	public static void main(String[] args) {
		AbstractCooking std1 = new BoilAB();
		AbstractCooking std2 = new BakeAB();

		std1.foodstuff = "ジャガイモ";
		std2.foodstuff = "にんじん";

		std1.ingredients();
		std1.cook();
		std2.ingredients();
		std2.cook();
	}
}
