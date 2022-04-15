package Ex3_B1;

public class MealTicketFactory_Ex3B1 {

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
		}
		return std;
	}
}
