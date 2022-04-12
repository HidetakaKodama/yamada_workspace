package Ex2_A3;

public class EmployeeMain {
	public static void main(String[] args) {
	Employee std1 = new Employee();

	std1.age = 40;
	std1.height = 182.5;

	MedicalEmp std2 = new MedicalEmp();

	std2.age = 29;
	std2.height = 175.0;

	std1.info();
	std1.introduce();
	std2.info();
	std2.introduce();

	}
}
