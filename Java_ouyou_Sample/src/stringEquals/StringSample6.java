package stringEquals;

public class StringSample6 {
	public static void main(String[] args) {
		String str = "りんご : みかん : もも";
		String[] values = str.split(":");      //「：」を境にして切り離し、順番に数字を配列に代入する。
		for(int i = 0; i < values.length; i++) {
			System.out.println(values[i]);
		}
	}
}
