package Exception;

public class ExceptionSample2 {
	public static void main(String[] args) {
		System.out.println("mainを開始します");
		method();
		System.out.println("mainを終了します");
	}

	static void method() {
		System.out.println("メソッドを開始します");
		int[] a = new int[3];
		a[3] = 30;
		System.out.println("メソッドを終了します");
	}
}
