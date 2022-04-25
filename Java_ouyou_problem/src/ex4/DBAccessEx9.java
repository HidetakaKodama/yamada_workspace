package ex4;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

public class DBAccessEx9 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("所在地を変更する会社IDを入力してください -> ");
		int co_id = sc.nextInt();
		System.out.println("所在地を入力してください -> ");
		String co_location = sc.next();

		String url = "jdbc:mysql://localhost/testdb";
		String user = "root";
		String password = "";

		try (Connection con = DriverManager.getConnection(url, user, password);
				Statement st = con.createStatement()) {

			String sql = "UPDATE company SET co_location = '" + co_location + "' WHERE co_id = "
					+ co_id;
			int reslut = st.executeUpdate(sql);
			if (reslut == 1) {
				System.out.println("更新は成功しました");
			} else {
				System.out.println("更新は失敗しました");
			}

		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
}
