package Ex1_A1;

public class Person1A1Main {
	public static void main(String[] args) {
		Person1A1 std = new Person1A1();

		std.name = "山田太郎";
		std.age = 15;

		std.introduce();
		std.getOlder(25);
		std.introduce();
		std.alcohol();
	}
}


class Person1A1 {
	String name;
	int age;

	void introduce() {
		System.out.println("私の名前は" + name + "です。");
		System.out.println("年齢は" + age + "歳です。");
	}

	void getOlder(int years) {
		System.out.println("[" + age + "年後]");
		age += years;
	}

	void alcohol() {
		if(age >= 20) {
			System.out.println("飲酒できる年齢です!");
		}else {
			System.out.println("まだ飲酒できる年齢ではありません・・・。");
		}
	}

}