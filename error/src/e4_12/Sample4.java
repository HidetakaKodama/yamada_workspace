package e4_12;

public class Sample4 {
	public static void main(String[] args) {
		int HiScore = 0;
		int[] scores = {88, 55, 77, 99, 66};

		for(int i = 0; i < scores.length; i++) {
			HiScore = Math.max(scores[i], scores[i+1]);
		}
		System.out.println("最高得点は " + HiScore);
	}
}
