package Ex2_C1;

import java.util.Random;
import java.util.Scanner;


public class Ex2_C1 {
	public static void main(String[]args) {

		System.out.println("あなたは何を出しますか「数字」？ グー[0], チョキ[1], パー[2]");
		Scanner a = new Scanner(System.in);
		int hand = a.nextInt();
		System.out.println("あなたが出したものは");

		Random rand = new Random();
		int num = rand.nextInt(3);

		if(hand == 0) {
			System.out.println("グー");
		}else if(hand == 1) {
			System.out.println("チョキ");
		}else if(hand == 2) {
			System.out.println("パー");
		}else {
			System.out.println("0～２の数字を入力してください");
		}

//		switch(hand) {
//		case 0:
//			System.out.println("グー");
//			break;
//		case 1:
//			System.out.println("チョキ");
//			break;
//		case 2:
//			System.out.println("パー");
//			break;
//		default:
//			System.out.println("0～2の数字を入力してください！");
//		}


		System.out.println("相手が出したものは？");

		if(num == 0) {
			System.out.println("グー");
		}else if(num == 1) {
			System.out.println("チョキ");
		}else {
			System.out.println("パー");
		}


//		switch(num) {
//		case 0:
//			System.out.println("グー");
//			break;
//		case 1:
//			System.out.println("チョキ");
//			break;
//		case 2:
//			System.out.println("パー");
//			break;
//		}
	}
}

