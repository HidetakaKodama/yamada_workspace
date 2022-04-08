package Ex3_A3;

public class Ex3_A3 {
	public static void main(String[]args){
		int i = 0;
		int j = 1;
		int x = 1;
		int total = 0;
		int Total = 0;
		int TotaL = 0;

		System.out.println("for文の場合");
		for(i = 1; i <= 10; i++) {
			total = total + i;
		}
		System.out.println(total);


		System.out.println("while文の場合");
		while(j<=10) {
			Total = Total + j;
			j++;
		}
		System.out.println(Total);


		System.out.println("do-while文の場合");
		do{
			TotaL = TotaL + x;
			x++;
		}while(x<=10);
		System.out.println(TotaL);

	}
}
