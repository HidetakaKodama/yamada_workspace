package Ex1_C1;

public class orderMain {
	public static void main(String[] args) {
		System.out.println("メニューのサイズを選んでください。");

		Hamburger s1 = new Hamburger("チーズバーガー");
		FrenchFries s2 = new FrenchFries("ポテト");
		Drink s3 = new Drink("ファンタメロン");

		s1.selectSize();
		s2.selectSize();
		s3.selectSize();

		int s1Size = s1.selectSize();
		int s2Size = s2.selectSize();
		int s3Size = s3.selectSize();


	}
}
