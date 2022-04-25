package ex4;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

public class DBAccessEx10 {
	public static void main(String[] args) {
		System.out.println("削除する会社IDを入力してください -> ");
		Scanner sc = new Scanner(System.in);
		int co_id = sc.nextInt();

		String url = "jdbc:mysql://localhost/testdb";
		String user = "root";
		String password = "";

		try (Connection con = DriverManager.getConnection(url, user, password);
				Statement st = con.createStatement()) {

			String sql = "delete from company where co_id = " + co_id + ";";
			int reslut = st.executeUpdate(sql);
			if (reslut == 1) {
				System.out.println("削除は成功しました");
			} else {
				System.out.println("削除は失敗しました");
			}

		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
}
