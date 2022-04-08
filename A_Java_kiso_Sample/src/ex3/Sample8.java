package ex3;

public class Sample8 {
	public static void main(String[] args) {
		int i1 = 10;
		double d = i1;
//		小さい箱は大きい箱に入るので変換する必要はない
		System.out.println("i1 = " + i1);

		int i2 = 20;
		byte e = (byte)i2;
//		大きい箱は小さい箱には入らないのでちゃんと変換する
		System.out.println("i2 = "+ i2);



		String a = "200";
//		これは数字の文字なのでちゃんと数字の変換される
		int b = Integer.parseInt(a);
		System.out.println(b);


		String x = "ABC";
//		これは数字ではなく文字なのでエラーをはきだす
		int y = Integer.parseInt(x);
		System.out.println(y);


		int z = 30;
		String str1 = String.valueOf(z);
		System.out.println(str1);
	}
}
