package Ex5_A3;

public class Ex5_A3 {
	public static void main(String[] args) {
		int HiScore = 0;
		int[] scores = {88, 55, 77, 99, 66};

//		for(int i = 0; i < scores.length; i++) {        失敗
//			HiScore = Math.max(scores[i], scores[i+1]);
//		}

		for(int i = 0; i < scores.length; i++) {
			if(HiScore < scores[i]) {
				HiScore = scores[i];
			}
		}
		System.out.println("最高得点は " + HiScore);
	}
}
