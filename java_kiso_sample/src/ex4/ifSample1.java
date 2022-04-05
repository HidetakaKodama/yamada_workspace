package ex4;

public class ifSample1 {
	public static void main(String[]arg2) {
		String str = "くもり";

		if(str.equals("晴れ")) {
			System.out.println("その天気予報は間違えています");
		}else if(str.equals("雪")){
			System.out.println("その天気予報は間違ています");
		}else {
			System.out.println("Best !!");
		}
		System.out.println("あなたは正しい選択をしました！！");
	}
}
