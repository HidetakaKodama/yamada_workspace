package constructor_overload;

public class StudentOLMain {
	public static void main(String[] args) {
		StudentOL std1 = new StudentOL(1001, "山田太郎");
		StudentOL std2 = new StudentOL(1002);
		std1.introduce();
		std2.introduce();
	}
}


class StudentOL{
	int id;
	String name;

	StudentOL(int id, String name){
		this.id = id;
		this.name = name;
	}

	StudentOL(int id){
		this(id, "未入力");
	}

	void introduce() {
		System.out.println("学籍番号は" + id + "です。");
		System.out.println("名前は" + name + "です。");
	}
}