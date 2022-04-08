package Ex3_A6;

public class Ex3_A6 {
	public static void main(String[] args) {
		int fact_Total = 1;
		int fact_tOtal = 1;
		int fact_toTal = 1;
		int fact_totAl = 1;
		int fact_totaL = 1;

		for(int a = 1; a>0; a--) {
			fact_Total = fact_Total * a;
		}
		System.out.println("1の階乗 = " + fact_Total);

		for(int b = 2; b>0; b--) {
			fact_tOtal = fact_tOtal * b;
		}
		System.out.println("2の階乗 = " + fact_tOtal);

		for(int c = 3; c>0; c--) {
			fact_toTal = fact_toTal * c;
		}
		System.out.println("3の階乗 = " + fact_toTal);

		for(int d = 4; d>0; d--) {
			fact_totAl = fact_totAl * d;
		}
		System.out.println("4の階乗 = " + fact_totAl);

		for(int e = 5; e>0; e--) {
			fact_totaL = fact_totaL * e;
		}
		System.out.println("5の階乗 = " + fact_totaL);
	}
}
