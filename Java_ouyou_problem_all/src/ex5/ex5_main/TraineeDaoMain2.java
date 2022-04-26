package ex5.ex5_main;

import java.util.List;
import java.util.Scanner;

import ex5.ex5_dao.TraineeDao;
import ex5.ex5_entity.Trainee;

public class TraineeDaoMain2 {
	public static void main(String[] args) {
		System.out.println("単元IDを入力してください -> ");
		Scanner sc = new Scanner(System.in);
		int unit_id = sc.nextInt();
		TraineeDao dao = new TraineeDao();
		List<Trainee>list = dao.searchByUnitId(unit_id);

		if(!list.isEmpty()) {
			for(int i = 0; i < list.size(); i++) {
				Trainee trainee = list.get(i);
			System.out.println("ID：" + trainee.getId() + " 名前：" + trainee.getName() + " 年齢：" + trainee.getAge()
			        + " 性別：" + trainee.getSex() + " 単元：" + trainee.getUnitId() + " 会社ID：" + trainee.getCold());
			}
		}else {
			System.out.println("研修生は見つかりませんでした。");
		}
	}
}
