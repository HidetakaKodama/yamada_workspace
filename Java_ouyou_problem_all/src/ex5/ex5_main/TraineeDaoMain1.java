package ex5.ex5_main;

import java.util.Scanner;

import ex5.ex5_dao.TraineeDao;
import ex5.ex5_entity.Trainee;

public class TraineeDaoMain1 {
	public static void main(String[] args) {
		System.out.println("研修生IDを入力してください -> ");
		Scanner sc = new Scanner(System.in);
		int id = sc.nextInt();
		TraineeDao dao = new TraineeDao();
		Trainee trainee = dao.searchById(id);

		if(trainee != null) {
			System.out.println("ID：" + trainee.getId() + " 名前：" + trainee.getName() + " 年齢：" + trainee.getAge()
			        + " 性別：" + trainee.getSex() + " 単元：" + trainee.getUnitId() + " 会社ID：" + trainee.getCold());
		}else {
			System.out.println("研修生は見つかりませんでした。");
		}
	}
}
