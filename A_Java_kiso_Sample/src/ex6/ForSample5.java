package ex6;

public class ForSample5 {
	public static void main(String[] args) {
		int i,j;
		for(i = 1; i <= 10; i++){ //行
			for(j = 1;j <= 10; j++){ //列
				if(j <= i){
					System.out.print("■");
				}else{
					System.out.print("□");
				}
			}
			System.out.println("");
		}
	}
}
