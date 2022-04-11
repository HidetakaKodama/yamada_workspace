package e4_12;

/**
 *
 * 配列の要素にスコアを表す数字を代入し、その要素の中で一番大きい数字を抜き出すコードを表している。
 *
 */
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
