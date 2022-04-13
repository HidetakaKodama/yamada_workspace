package Ex2_A5;

public class CookingMain {
	public static void main(String[] args) {
		Cooking std1 = new Boil();
		Cooking std2 = new Bake();

		std1.foodstuff = "ジャガイモ";
		std2.foodstuff = "にんじん";

		std1.ingredients();
		std1.cook();
		std2.ingredients();
		std2.cook();

//		CookPan(std1);
//		CookPan(std2);
//	}

//	public static void CookPan(Cooking std){
//		std.ingredients();
//		std.cook();

	}
}
