package overRide;

public class HumanFallOut {
	public static void main(String[] args) {
		Class2 c2 = new Class2();
		c2.getName("晴れ");
		c2.getNum(290);
		c2.introduce();
	}
}

class Class1 {
	protected String name;
	protected int num ;

	public String setName() {
		return this.name;
	}

	public void getName(String name) {
		this.name = name;
	}


	public int setNum() {
		return this.num;
	}

	public void getNum(int num) {
		this.num = num;
	}



	public void introduce() {
		System.out.println("あなたの出席場合は" + this.name + "ですね？");
		System.out.println("あなたの好きなナンバーは" + this.num + "ですね？");
	}
}


class Class2 extends Class1 {
	@Override
	public void introduce() {
		System.out.println("明日の天気は" + this.name + "ですね。");
		System.out.println("明日の天気ナンバーは" + this.num + "です。");
	}
}




