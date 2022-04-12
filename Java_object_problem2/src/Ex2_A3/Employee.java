package Ex2_A3;

public class Employee {
	public int age;
	public double height;

	public void introduce() {
		System.out.println("会社員です。");
	}

	public void info() {
		System.out.println("年齢：" + age + "歳");
		System.out.println("身長：" + height + "cm");
	}
}
