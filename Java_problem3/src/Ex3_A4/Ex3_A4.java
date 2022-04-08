package Ex3_A4;

public class Ex3_A4 {
	public static void main(String[]args) {
		int star = 3;
		int starnum = 5;

		for(int ver = 0; ver<star; ver++) {
			for(int bes = 0; bes<starnum; bes++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}
}


//ここでの反省点
//・「print」 と 「println」の違いに気を付けよう。