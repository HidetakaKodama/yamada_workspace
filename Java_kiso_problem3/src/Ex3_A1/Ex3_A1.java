package Ex3_A1;

public class Ex3_A1 {
	public static void main(String[] args) {
		int total,Total,TotaL,i,j,x;
		total = 0;
		Total = 0;
		TotaL = 0;
		i = 0;
		j = 0;
		x = 0;

		for(i = 0; i <5; i++) {
			total = total + 3;
//			total += 3;
		}
		System.out.println("total = " + total);

		while(j<5) {
			Total = Total + 3;
			j++;
		}
		System.out.println("Total = " + Total);


		do {
			TotaL = TotaL + 3;
			x++;
		}while(x<5);
		System.out.println("TotaL = " + TotaL);

	}
}



