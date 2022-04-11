package Sansyou;

public class StudentRefMain {
	public static void main(String[] args) {
		Student std1 = new Student();
		Student std2 = std1;

		std1.id = 1001;
		std1.name = "山田太郎";
		std1.introduce();
		std2.introduce();
	}
}


class Student{
	int id;
	String name;

	void introduce() {
		System.out.println("学籍番号は" + id + "です。");
		System.out.println("名前は" + name + "です。");
	}
}