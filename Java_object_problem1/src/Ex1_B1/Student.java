package Ex1_B1;

public class Student {
	int id;
	String name;

	Student(int id, String name){
		this.id = id;
		this.name = name;
	}

	void introduce() {
		System.out.print("学籍番号：" + id + " ");
		System.out.println("生徒氏名：" + name);
	}
}
