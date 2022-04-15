package Ex3_A2;

import java.util.InputMismatchException;//Scanner
import java.util.Scanner;

public class ExceptionEx3_A2 {
	public static void main(String[] args) {
		String[] a = {"りんご", "みかん", "さくらんぼ", "桃", "梨"};
		System.out.println("参照したいデータのインデックスを入力してください");
		try {

			Scanner sc = new Scanner(System.in);
			int index = sc.nextInt();
			System.out.println(index + "： " + a[index]);

		} catch (InputMismatchException e) {
			System.out.println("インデックスは整数で入力してください。");
		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("お探しのインデックスは存在しません。");
		}
	}
}
