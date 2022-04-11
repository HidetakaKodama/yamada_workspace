package Ex1_A2;

public class Person1A2Main {
	public static void main(String[] args) {
		Person1A2 std = new Person1A2("山田太郎",40);
		std.introduce();
		std.getOlder(15);
		std.introduce();
	}
}


class Person1A2 {
	String name;
	int age;

	Person1A2(String name, int age){
		this.name = name;
		this.age = age;
	}

	void introduce(){
		System.out.println("私の名前は" + name + "です。");
		System.out.println("年齢は" + age + "歳です。");
	}

	void getOlder(int years) {
		System.out.println("[" + years + "年後]");
		age += years;
	}

}