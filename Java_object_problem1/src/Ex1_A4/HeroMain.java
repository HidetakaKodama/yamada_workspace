package Ex1_A4;

public class HeroMain {
	public static void main(String[] args) {
		Hero std = new Hero();
		std.action();
		std.action("グレネード");
		std.action("アサルトライフル", 1000);
		std.action(500, "サブマシンガン");
	}
}

