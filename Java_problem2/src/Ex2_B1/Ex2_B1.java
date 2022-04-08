package Ex2_B1;

public class Ex2_B1 {
	public static void main(String[]args) {
		int a = new java.util.Random().nextInt();
		int b = new java.util.Random().nextInt();

		System.out.println("片方の数字は" + a + "です");
		System.out.println("もう片方の数字は" + b + "です");

		if(a < b) {
			System.out.println(b + "の方が大きいです！");
		}else if(a > b){
			System.out.println(a + "の方が大きいです！");
		}else {
			System.out.println("この値らはおそらく同値です。");
		}
	}
}
