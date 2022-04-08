package Ex4_A1;

public class Ex4_A1 {
	public static void main(String[] args) {
		int total = 0;
		for(int i = 1; i <= 100; i++) {
			if(i%2 == 0) {
				total = total + i;
			}
		}
		System.out.println(total);
	}
}
