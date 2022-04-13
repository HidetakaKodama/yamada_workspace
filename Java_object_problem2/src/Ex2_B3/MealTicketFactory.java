package Ex2_B3;

public class MealTicketFactory {
	public MealTicket chooseMeal(int num) {
		MealTicket std = null;
		switch(num) {
		case 1:
			std = new CurryTicket();
			break;
		case 2:
			std = new RamenTicket();
			break;
		case 3:
			std = new SushiTicket();
			break;
		default:
			System.out.println("有効な整数を入力してください");
			break;
		}
		return std;

//		if(num == 1) {
//			std = new CurryTicket();
//		}else if(num == 2){
//			std = new RamenTicket();
//		}else if(num == 3) {
//			std = new SushiTicket();
//		}else {
//			System.out.println("有効な数字を入力してください");
//		}
//		return std;

	}
}
