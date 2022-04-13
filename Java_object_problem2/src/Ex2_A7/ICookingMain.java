package Ex2_A7;

public class ICookingMain {
	public static void main(String[] args) {
		ICooking std1 = new BoilIF();
		ICooking std2 = new BakeIF();

		std1.cook();
		std2.cook();
	}
}
