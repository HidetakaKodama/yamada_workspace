package daoClass;

import java.util.List;

public class DBAccessSample6 {
	public static void main(String[] args) {
		TraDao dao = new TraDao();
		int cold = 3;
		List<Trainee> list = dao.searchByCold(cold);
		if(!list.isEmpty()) {
			for(int i = 0; i < list.size(); i++) {
				Trainee trainee = list.get(i);
				System.out.println("ID：" + trainee.getId() + " 名前：" + trainee.getName()
										+ " 年齢：" + trainee.getAge() + " 性別：" + trainee.getSex());
			}
		}else {
			System.out.println("研修生は見つかりませんでした。");
		}
	}
}
