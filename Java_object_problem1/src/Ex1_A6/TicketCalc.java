package Ex1_A6;

public class TicketCalc {
	static int ticket(int basic, int age) {
		 if(age <= 15) {
			 basic -= 500;
		 }else if(age > 25) {
			 basic += 500;
		 }
		 return basic;
	 }
}
