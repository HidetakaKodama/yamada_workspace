package ex5.ex5_main;

import java.util.Scanner;

import ex5.ex5_dao.TraineeDao;
import ex5.ex5_entity.Trainee;

public class TraineeDaoMain5 {
	public static void main(String[] args) {
		System.out.println("削除する研修生IDを入力してください");
		System.out.print("-> ");
		Scanner sc = new Scanner(System.in);

		Trainee trainee = new Trainee();
		int id = sc.nextInt();
		trainee.setId(id);

		TraineeDao dao = new TraineeDao();
		trainee = dao.searchById(id);

		if(trainee != null) {
			System.out.println("ID：" + trainee.getId() + " 名前：" + trainee.getName() + " 年齢：" + trainee.getAge()
	        + " 性別：" + trainee.getSex() + " 単元：" + trainee.getUnitId() + " 会社ID：" + trainee.getCold());
		}else {
			System.out.println("研修生は見つかりませんでした。");
		}

		System.out.println();
		System.out.println("この研修生の情報を削除しますか？ [はい：1  いいえ：2]");
		System.out.println("-> ");
		int delete = sc.nextInt();

		if(delete == 1) {
			int result = dao.deleteById(id);
			if(result == 1) {
			System.out.println("削除に成功しました");
			}
		}else {
			System.out.println("削除に失敗しました");
		}
	}
}
