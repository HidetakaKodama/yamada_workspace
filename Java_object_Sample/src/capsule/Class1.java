package capsule;

public class Class1 {
	int id;
	String name;

	Class1(int id, String name){
		this.id = id;
		this.name = name;
	}

	protected void introduce() {
		System.out.println(id);
		System.out.println(name);
	}
}



//public ：パッケージ関係なく、どこからでも参照することが可能
//private：同じクラス内じゃないと参照することはできない
//protected：同じパッケージ内やサブクラスなら参照可能
//指定なし：同じパッケージ内なら参照可能

//基本的にprivateで必要最小限のアクセス制御をする(現場)
