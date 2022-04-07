package ex2;

public class A2 {
	public static void main(String[]args) {
		int num = 39;
		int Num = 40;
		double average = Calc_average(num,Num);

		System.out.println("平均値は, " + average);
	}

	public static double Calc_average(int n, int N) {
		double ave = (double)(n + N) / 2;
		return ave;
	}
}
