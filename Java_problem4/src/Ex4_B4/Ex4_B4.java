package Ex4_B4;

public class Ex4_B4 {
	public static void main(String[]args) {
		for(int i = 1; i <= 40; i++) {
			if((i% 3 == 0) && (i % 5 != 0)) {
				System.out.println("Fizz,");
			}else if((i % 5 == 0) && (i% 3 != 0)) {
				System.out.println("Buzz,");
			}else if((i% 3 == 0) && (i % 5 == 0)) {
				System.out.println("Fizz Buzz,");
			}else {
				System.out.println(i + ",");
			}
		}
	}
}
