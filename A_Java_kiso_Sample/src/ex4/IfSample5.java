package ex4;

public class IfSample5 {
	public static void main(String[] args) {
		boolean isNoLaundry = true;
		boolean isNoClothes = true;
		int num;

		if(isNoLaundry) {
			if(isNoClothes) {
				num = 0;
			}else {
				num = 1;
			}
		}else {
			num = 2;
		}
		System.out.println("残りの家事は" + num + "です。");
	}
}
