package ex_B1;

import java.util.Scanner;

public class B1 {
	public static void main(String[] args) {
		System.out.println("縦は何行にしますか？");
		Scanner i = new Scanner(System.in);
		int  ver = i.nextInt();

		System.out.println("横は何行にしますか？");
		Scanner j = new Scanner(System.in);
		int  bes = j.nextInt();

		Calc_square("*", ver , bes);
	}

	public static void Calc_square(String ast, int v, int b) {;
		for(int i = 0; i < v; i++) {
			for(int j = 0; j < b; j++) {
				System.out.print(ast);
			}
			System.out.println();
		}
	}
}
