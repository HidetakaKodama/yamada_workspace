package Ex6_B4;

public class Ex6_B4 {
	public static void main(String[] args) {
		int[] num = {11, 99, 55, 200, 66, 1, 77, 88, 100};

		int max = Calc_num(num);
		System.out.println("最大値は  " + max);
	}

	public static int Calc_num(int[] num) {
		int max_num = 0;
		for(int i = 0; i < num.length; i++) {
			if(max_num < num[i]) {
				max_num = num[i];
			}
		}
		return max_num;
	}
}
