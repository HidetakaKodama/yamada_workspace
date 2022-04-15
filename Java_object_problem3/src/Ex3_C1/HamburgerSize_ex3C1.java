package Ex3_C1;

import java.util.Scanner;

public class HamburgerSize_ex3C1 extends AbstractSize_ex3C1{
	public HamburgerSize_ex3C1(String name) {
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
