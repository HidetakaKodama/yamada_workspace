package Ex1_C1;

import java.util.Scanner;

public class Hamburger {
	String name;

	Hamburger(String name){
		this.name = name;
	}

	int selectSize() {
		Scanner s = new Scanner(System.in);
		int size = s.nextInt();

		System.out.println(name);
		System.out.println("1:シングル、 2:ダブル");

		switch(size) {
		case 1:
			size = 240;
			break;
		case 2:
			size = 350;
			break;
		}
		return size;
	}
}
