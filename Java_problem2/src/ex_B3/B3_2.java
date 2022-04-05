package ex_B3;

import java.util.Scanner;

public class B3_2 {
	public static void main(String[]args) {
		System.out.println("あなたの西暦を入力してください！");
		Scanner num = new Scanner(System.in);
		int year = num.nextInt();

//        if(year% 4 == 0) {
//        	if(year%100 == 0) {
//        		System.out.println("花は咲きません！");
//        	}else {
//        		if(year%400 == 0) {
//        			System.out.println("花は咲きます！");
//        		}else {
//        			System.out.println("花は咲きません！");
//        		}
//        	}
//        }else {
//        	System.out.println("花は咲きません！");
//        }


		if((year% 4 == 0) && (year%100 == 1) || (year%400 == 0)) {
			System.out.println("花は咲きます！");
		}else {
			System.out.println("花は咲きません！");
		}
	}
}
