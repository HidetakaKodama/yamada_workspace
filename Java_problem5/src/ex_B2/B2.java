package ex_B2;

public class B2 {
	public static void main(String[]args) {
		String[][] scores = {
				{"スーパー1", "100円", "150円", "200円"},
				{"スーパー2", "200円", "110円", "220円"},
				{"スーパー3", "250円", "160円", "150円"}
		};

		String num = "";
		for(int i = 0; i < scores.length; i++ ) {
			for(int j = 0; j<scores[i].length; j++){
				num += scores[i][j];
			}
		}
		System.out.print(num);
	}
}
