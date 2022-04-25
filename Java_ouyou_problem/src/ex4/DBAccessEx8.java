package ex4;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class DBAccessEx8 {
	public static void main(String[] args) {
		String url = "jdbc:mysql://localhost/testdb";
		String user = "root";
		String password = "";

		try (Connection con = DriverManager.getConnection(url, user, password);
				Statement st = con.createStatement()) {

			String sql = "INSERT INTO company VALUES(8,'海老原製作所','新宿')";
			int reslut = st.executeUpdate(sql);

			if (reslut == 1) {
				System.out.println("登録に成功しました");
			} else {
				System.out.println("登録に失敗しました");
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
}
