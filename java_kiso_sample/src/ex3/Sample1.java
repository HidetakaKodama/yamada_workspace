package ex3;

public class Sample1 {
	public static void main(String[]args) {
		int age = 38;
		String name1 = "Smith";
		String name2 = "Will";
		double weight = 70.5;
		char str = 'あ';
		System.out.println("年齢は" + age);
		System.out.println("あなたの名前は" + (name2 + name1));
		System.out.println("体重は" + weight);
		System.out.println("あなたのお気に入りの文字は" + str);


		int weight1 = 29;
		int weight2 = 30;
		int weight3 = weight1+weight2;
		System.out.println(weight1);
		System.out.println(weight2);
		System.out.println("合計は" + weight3);

		String mon1 = "\\100";
		System.out.println("最初の値段は" + mon1);
		String name3 = "\'あいう\'";
		System.out.println("あの方の名前は" + name3);
		String name4 = "\"えおか\"";
		System.out.println("あの方の背後にいるお方は" + name4);

	}
}
