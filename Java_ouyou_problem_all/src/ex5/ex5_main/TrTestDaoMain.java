package ex5.ex5_main;

import java.util.List;
import java.util.Scanner;

import ex5.ex5_dao.TrTestDao;
import ex5.ex5_entity.TrTest;

public class TrTestDaoMain {
	public static void main(String[] args) {
		System.out.println("単元IDを入力してください");
		System.out.print("-> ");
		Scanner sc = new Scanner(System.in);
		int unitId = sc.nextInt();

		TrTestDao dao = new TrTestDao();
		List<TrTest> list = dao.searchTrByUnitId(unitId);

		if(!list.isEmpty()) {
			System.out.println("標準APIを学習している研修生は以下の通りです");
		for(TrTest trtest : list) {
			System.out.println("研修生ID：" + trtest.getId() + " 名前：" + trtest.getName()
			+ " テスト実施日" + trtest.getTestDate());
		}
		}else {
			System.out.println("テストを受ける研修生はいません");
		}
	}
}
