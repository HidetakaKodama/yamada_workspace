package daoClass;

public class DBAccessSample5 {
	public static void main(String[] args) {
		TraDao dao = new TraDao();
		int id = 1;
		Trainee trainee = dao.searchById(id);

		if(trainee != null) {
			System.out.println("ID：" + trainee.getId() + " 名前：" + trainee.getName()
			+ " 年齢：" + trainee.getAge() + " 性別：" + trainee.getSex());
		}else {
			System.out.println("研修生は見つかりませんでした。");
		}
	}
}
