package ex8;

import java.util.Scanner;

public class MethodSample3 {
	public static void main(String[] args) {
		System.out.println("要素の１個目を入力してください");
		Scanner s1 = new Scanner(System.in);
		int score1 = s1.nextInt();

		System.out.println("要素の2個目を入力してください");
		Scanner s2 = new Scanner(System.in);
		int score2 = s2.nextInt();

		System.out.println("要素の3個目を入力してください");
		Scanner s3 = new Scanner(System.in);
		int score3 = s3.nextInt();

		System.out.println("要素の4個目を入力してください");
		Scanner s4 = new Scanner(System.in);
		int score4 = s4.nextInt();

		System.out.println("要素の5個目を入力してください");
		Scanner s5 = new Scanner(System.in);
		int score5 = s5.nextInt();

		int[] scores = new int[5];
		scores[0] = score1;
		scores[1] = score2;
		scores[2] = score3;
		scores[3] = score4;
		scores[4] = score5;

		System.out.println();
		System.out.println("あなたが入力した要素はそれぞれ");
		for(int i = 0; i < scores.length; i++) {
			System.out.println("scores"+ "[" + i + "]：" + scores[i]);
		}

		int hi = methodCalc(scores);
		System.out.println("この中で一番大きい数字は " + hi);
	}


	static int methodCalc(int[] s){
		int hiScore = 0;
		for(int j = 0; j < s.length; j++) {
			if(hiScore < s[j]) {
				hiScore = s[j];
			}
		}
		return hiScore;
	}
}
