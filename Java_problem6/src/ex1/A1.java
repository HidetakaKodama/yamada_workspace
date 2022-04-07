package ex1;

public class A1 {
	public static void main(String[]args) {
		personal_info("鈴木", 20, 55.5);
		personal_info("山田", 40, 65.8);
		personal_info("佐藤", 30, 46.1);
	}

	public static void personal_info(String name, int age, double weight) {
		System.out.println(name + "さんは" + age + "歳、" + "体重は" + weight + "kgです。");
	}
}