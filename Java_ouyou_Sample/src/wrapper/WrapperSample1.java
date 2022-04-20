package wrapper;

public class WrapperSample1 {
	public static void main(String[] args) {
		//基本型
		int num = 10;
		//ラッパークラスでラップ(包む)
		Integer obj = new Integer(num);
		//ラップ(包む)したことで基本型がオブジェクトとして扱われる
	}
}
