package Ex2_C1;

import java.util.Scanner;

public class FrenchFriesSize extends AbstractSize{
	public FrenchFriesSize(String name) {
		super(name);
	}

	public int selectSize() {
		int size = 0;
		System.out.println(this.getName());
		System.out.println("1：S、2：M、3：L");

		Scanner sh = new Scanner(System.in);
		int ff = sh.nextInt();

		switch(ff) {
		case 1:
			size = 190;
			break;
		case 2:
			size = 240;
			break;
		case 3:
			size = 900;
			break;
		}
		return size;

	}
}
