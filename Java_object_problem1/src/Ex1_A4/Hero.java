package Ex1_A4;

public class Hero {
	void action(){
		System.out.println("敵に攻撃！");
	}

	void action(String weapon) {
		System.out.println(weapon + "で敵に攻撃！");
	}

	void action(String weapon, int damage) {
		System.out.println(weapon + "で敵に攻撃。" + "敵に" + damage + "のダメージ！");
	}

	void action(int damage, String weapon) {
		System.out.println(weapon + "で敵に攻撃。" + "敵に" + damage + "のダメージ！");
	}
}
