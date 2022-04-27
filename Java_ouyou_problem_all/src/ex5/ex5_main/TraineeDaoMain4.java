package ex5.ex5_main;

import java.util.Scanner;

import ex5.ex5_dao.TraineeDao;
import ex5.ex5_entity.Trainee;

public class TraineeDaoMain4 {
	public static void main(String[] args) {
		System.out.println("研修生IDを入力してください");
		System.out.print("-> ");
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

		System.out.println();
		System.out.println("新しい会社IDを入力してください");
		System.out.println("-> ");
		int cold = sc.nextInt();
		trainee.setCold(cold);

		System.out.println("この研修生の情報を更新しますか？ [はい：1  いいえ：2]");
		System.out.println("-> ");
		int ans = sc.nextInt();

		if(ans == 1) {
			int result = dao.updateById(id, cold);
			if(result == 1) {
				System.out.println("ID：" + trainee.getId() + " 名前：" + trainee.getName() + " 年齢：" + trainee.getAge()
				+ " 性別：" + trainee.getSex() + " 単元：" + trainee.getUnitId() + " 会社ID：" + trainee.getCold());
			}
		}else {
			System.out.println("更新できませんでした。");
		}
	}
}
