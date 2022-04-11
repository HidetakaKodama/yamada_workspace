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


