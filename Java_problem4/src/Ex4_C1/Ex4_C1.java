package Ex4_C1;

public class Ex4_C1 {
	public static void main(String[]args) {
		for (int i = 0; i < 5; i++) {
			for (int j = 0; j < 5; j++) {
				if (j < 4 - i) {
					System.out.print(" ");
				} else {
					System.out.print("*");
				}
			}
			System.out.println();
		}
		System.out.println();

		for(int k = 0; k < 5; k++) {
			for(int l = 0; l < 5 - k ; l++) {
				System.out.print("*");
			}
			System.out.println("");
		}
	}
}
