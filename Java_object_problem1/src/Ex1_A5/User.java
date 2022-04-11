package Ex1_A5;

public class User {
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
