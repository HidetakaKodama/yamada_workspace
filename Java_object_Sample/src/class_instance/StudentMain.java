package class_instance;

public class StudentMain {
	public static void main(String[] args) {
		Student std1 = new Student();
		Student std2 = new Student();

		std1.id = 100;
		std1.name = "山田太郎";
		std2.id = 200;
		std2.name = "東京太郎";

		std1.introduce();
		std2.introduce();

	}
}


class Student {
	int id;
	String name;

	void introduce() {
		System.out.println("学籍番号 = " + id);
		System.out.println("名前 = " + name);
	}
}