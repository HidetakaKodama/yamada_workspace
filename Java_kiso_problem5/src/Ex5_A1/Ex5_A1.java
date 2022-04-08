package Ex5_A1;

public class Ex5_A1 {
	public static void main(String[] args) {
		int[] scores = {88, 55, 77, 99, 66};
		for(int i = 0; i < scores.length; i++) {
			if(scores[i] >= 70) {
				System.out.println(scores[i]);
			}
		}
	}
}
