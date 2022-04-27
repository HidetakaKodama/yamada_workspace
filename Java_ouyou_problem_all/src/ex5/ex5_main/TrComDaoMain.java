package ex5.ex5_main;

import java.util.List;
import java.util.Scanner;

import ex5.ex5_dao.TrComDao;
import ex5.ex5_entity.TrCom;

public class TrComDaoMain {
	public static void main(String[] args) {
		System.out.println("会社IDを入力してください");
		System.out.print("-> ");
		Scanner sc = new Scanner(System.in);
		int cold = sc.nextInt();

		TrComDao dao = new TrComDao();
		List<TrCom> list  = dao.searchByCold(cold);

		if(!list.isEmpty()) {
			System.out.println(list.get(0).getCoName() + "に所属している研修生は以下の通りです");
			for(TrCom trcom : list) {
				System.out.println("研修生ID ： " + trcom.getId());
			}
		}else {
			System.out.println("所属している研修生はいません");
		}
	}
}
