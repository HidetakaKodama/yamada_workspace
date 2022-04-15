package Ex3_C1;

import java.util.Scanner;

public class DrinkSize_ex3C1 extends AbstractSize_ex3C1{
	public DrinkSize_ex3C1(String name) {
		super(name);
	}

	public int selectSize() {
		int size = 0;
		System.out.println(this.getName());
		System.out.println("1：S、2：M、3：L");

		Scanner dd = new Scanner(System.in);
		int ds = dd.nextInt();

		switch(ds) {
		case 1:
			size= 150;
			break;
		case 2:
			size = 300;
			break;
		case 3:
			size = 600;
			break;
		}
		return size;
	}
}
