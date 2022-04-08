package Ex3_A5;

public class Ex3_A5 {
	public static void main(String[] args) {
		int fact_total = 1;
		for(int i = 5; i>0; i--) {
			fact_total = fact_total * i;
		}
		System.out.println("5の階乗 = " + fact_total);
	}
}
