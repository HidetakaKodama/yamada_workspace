package Ex5_C1;

public class Ex5_C1 {
	public static void main(String[]args) {
		int[] a = {18, -4, 12, 0, 25, -18};
		int i,j;
		System.out.println("ソート前： 18,-4,12,0,25,-18");
		System.out.print("ソート後：");
		for (i = 0; i < a.length - 1; i++) {
			for (j = i; j < a.length; j++) {
				if (a[i] >= a[j]) {
					int swap = a[i];
					a[i] = a[j];
					a[j] = swap;
				}
			}
			System.out.print(a[i] + ",");
		}
	}
}
