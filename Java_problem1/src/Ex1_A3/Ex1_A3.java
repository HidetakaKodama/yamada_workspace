package Ex1_A3;

import java.util.Scanner;

public class Ex1_A3 {
	public static void main(String[]args) {
		System.out.println("この下に1個目の整数を入力してください！");
		Scanner num1 = new Scanner(System.in);
	    int ans1 = num1.nextInt();
	    System.out.println(ans1);

	    System.out.println("この下に2個目の整数を入力してください！");
		Scanner num2 = new Scanner(System.in);
	    int ans2 = num2.nextInt();
	    System.out.println(ans2);

	    int ans3 = ans1 + ans2;
	    int ans4 = ans3 / 2;
	    System.out.println("平均値は" + (float)(ans4));
	}
}
