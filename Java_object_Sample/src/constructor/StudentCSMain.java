package constructor;

public class StudentCSMain {
	public static void main(String[] args) {
		StudentCS std1 = new StudentCS(1001,"山田太郎");
		std1.introduce();

		StudentCS std2 = new StudentCS(1002,"河野太郎");
		std2.introduce();
	}
}


class StudentCS {
	int id;
	String name;

	StudentCS(int id, String name){
		this.id = id;
		this.name = name;
	}

	void introduce() {
		System.out.println("学籍番号は" + id + "です。");
		System.out.println("名前は" + name + "です。");
	}
}