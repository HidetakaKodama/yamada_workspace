package Ex5_B2;

public class Ex5_B2 {
	public static void main(String[]args) {
		String[][] num = {
				{"100円", "150円", "200円"},
				{"200円", "110円", "220円"},
				{"250円", "160円", "150円"}
		};

		System.out.print("\t"+"\t"+"\t");
		System.out.println("卵"+"\t"+"\t"+"牛乳"+"\t"+"キャベツ");
		for (int i = 0; i < num.length; i++) {
			System.out.print("スーパー" + (i + 1) );

			for (int j = 0; j < num[i].length; j++) {
				System.out.print("\t" + num[i][j] );
			}
			System.out.println();
		}
	}
}
