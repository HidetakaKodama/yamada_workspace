package Ex4_B2;

public class Ex4_B2 {
	public static void main(String[]args) {
		System.out.println("「continue」をした場合");
		for(int i = 1; i <= 100; i++) {
			if(i % 8 == 0) {
				continue;
			}
			System.out.println(i);
		}

		System.out.println("「continue」をしなかった場合");
		for(int i = 1; i <= 100; i++) {
			if(i % 8 != 0) {
				System.out.println(i);
			}
		}
	}
}

