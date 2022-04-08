package Ex3_C1;

public class Ex3_C1 {
	public static void main(String[] args) {
		int i,j, k, l;
		for(i = 0; i<5; i++) {
			for(j = 0; j<=i; j++) {
				System.out.print("*");
			}
			System.out.println("");
		}

		System.out.println("");

		for(k = 0; k < 5; k++) {
			for(l = 0; l < 5 - k ; l++) {
				System.out.print("*");
			}
			System.out.println("");
		}
	}
}
