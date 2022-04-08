package ex3;

import java.util.Scanner;

public class Sample7 {
	public static void main(String[] args) {

		   System.out.println("この下に好きな整数を入力してください！");
		   System.out.println("入力するとその整数が表示されます。");

	       Scanner s = new Scanner(System.in);
	       int num = s.nextInt();

	       System.out.println(num);
		}
}
