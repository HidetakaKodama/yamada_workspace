package Ex6_B5;

public class Ex6_B5 {
	public static void main(String[] args) {
		int[] num = {33, 40, 55, 78, 52, 100};    //358

		int total = Calc_num(num);
		System.out.println("合計値は  " + total);
	}

	public static int Calc_num(int[] num) {
		int total_num = 0;
		for(int i = 0; i < num.length; i++) {
			total_num += num[i];
		}
		return total_num;
	}
}
