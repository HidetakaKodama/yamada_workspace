package Ex1_C1;

import java.util.Scanner;

public class Drink {
	String name;

	Drink(String name){
		this.name = name;
	}

	int selectSize() {
		Scanner s = new Scanner(System.in);
		int size = s.nextInt();

		System.out.println(name);
		System.out.println("1:S、2:M、3:L");

		switch(size) {
		case 1:
			size = 150;
			break;
		case 2:
			size = 200;
			break;
		case 3:
			size = 250;
			break;
		}
		return size;
	}
}
