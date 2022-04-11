package Ex1_B1;

import java.util.Scanner;

public class StudentSearchMain {
	public static void main(String[] args) {
		Student[] cl = new Student[5];

		cl[0] = new Student(1001, "嵐山");
		cl[1] = new Student(1002, "出水");
		cl[2] = new Student(1003, "高崎");
		cl[3] = new Student(1004, "早川");
		cl[4] = new Student(1005, "和田");

		System.out.print("学籍番号を入力してください → ");
		Scanner s = new Scanner(System.in);
		int num = s.nextInt();

		boolean result = false;
		for(int i = 0; i < cl.length; i++) {
			if(num == cl[i].id) {
				cl[i].introduce();
				result = true;
				break;
			}
		}

		if(result == false) {
			System.out.println("見つかりませんでした・・・。");
		}
	}
}
