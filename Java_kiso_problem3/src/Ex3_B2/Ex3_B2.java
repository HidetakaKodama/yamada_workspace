package Ex3_B2;

public class Ex3_B2 {
	public static void main(String[] args) {
		int num = 0;
		for(int i = 1; i<10; i++) {
			for(int j = 1; j<10; j++) {
				num = i * j;
				System.out.print(num);
			}
			System.out.println("");
		}
	}
}
