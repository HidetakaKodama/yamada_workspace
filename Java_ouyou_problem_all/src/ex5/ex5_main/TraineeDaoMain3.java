package ex5.ex5_main;

import java.util.Scanner;

import ex5.ex5_dao.TraineeDao;
import ex5.ex5_entity.Trainee;

public class TraineeDaoMain3 {
	public static void main(String[] args) {
		Trainee trainee = new Trainee();
		Scanner sc = new Scanner(System.in);
		System.out.println("研修生ID：");
		int id = sc.nextInt();
		trainee.setId(id);
		System.out.println("名前：");
		String name = sc.next();
		trainee.setName(name);
		System.out.println("年齢：");
		int age = sc.nextInt();
		trainee.setAge(age);
		System.out.println("性別：");
		String sex = sc.next();
		trainee.setSex(sex);
		System.out.println("会社ID：");
		int cold = sc.nextInt();
		trainee.setCold(cold);

		TraineeDao dao = new TraineeDao();
		int result = dao.insert(trainee);

		if(result == 1) {
			System.out.println("追加に成功しました");
		}else {
			System.out.println("追加に失敗しました");
		}
	}
}
