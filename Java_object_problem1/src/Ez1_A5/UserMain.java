package Ez1_A5;

public class UserMain {
	public static void main(String[] args) {
		User std1 = new User("ハナ", 878787);
		User std2 = new User();

		std1.message();
		std2.message();
	}
}


class User{
	String name;
	int id;

	User(String name, int id){
		this.name = name;
		this.id = id;
	}

	User(){
		this("名無し",-1);
	}

	void message() {
		System.out.println("ようこそ" + name + "さん！");
		System.out.println("あなたのユーザーIDは" + id + "です。");
	}
}