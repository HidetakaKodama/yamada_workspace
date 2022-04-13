package Ex2_C1;

import java.util.Scanner;

public class HamburgerSize extends AbstractSize{
	public HamburgerSize(String name) {
		super(name);
	}

	public int selectSize() {
		int size = 0;
		System.out.println(this.getName());
		System.out.println("１：シングル、２：ダブル");

		Scanner s = new Scanner(System.in);
		int sh = s.nextInt();

		switch(sh) {
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
