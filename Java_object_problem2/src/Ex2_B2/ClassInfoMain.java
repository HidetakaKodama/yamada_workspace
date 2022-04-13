package Ex2_B2;

public class ClassInfoMain {
	public static void main(String[] args) {
		AbstractClassInfo std1 = new HighLevelClass();
		AbstractClassInfo std2 = new SportsClass();
		AbstractClassInfo std3 = new EnglishClass();

		std1.classInfo();
		System.out.println();
		std2.classInfo();
		System.out.println();
		std3.classInfo();
	}
}
