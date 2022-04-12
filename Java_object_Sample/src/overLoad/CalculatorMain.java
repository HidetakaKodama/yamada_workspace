package overLoad;

public class CalculatorMain {
	public static void main(String[] args) {
		Calculator cal = new Calculator();
		int iSum = cal.add(2, 7);
		System.out.println("整数の和は" + iSum);
		double dSum = cal.add(3.14, 8.7);
		System.out.println("少数の和は" + dSum);
	}
}

class Calculator{

	int add(int num1, int num2) {
		return num1 + num2;
	}

	double add(double num1, double num2) {
		return num1 + num2;
	}
}
