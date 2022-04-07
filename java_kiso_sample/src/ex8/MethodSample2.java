package ex8;

public class MethodSample2 {
	public static void main(String[]args) {
		double num1 = 40.5;
		double num2 = 50.5;

		int average = Calc_average(num1, num2);
		System.out.println("平均値は" + average);
	}

	public static int Calc_average(double n1, double n2) {
		int ave = (int)(n1 + n2) / 2;
		return ave;
	}
}
