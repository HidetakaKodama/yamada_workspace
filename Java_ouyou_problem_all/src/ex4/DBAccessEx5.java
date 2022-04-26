package ex4;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class DBAccessEx5 {
	public static void main(String[] args) {
		String url = "jdbc:mysql://localhost/testdb";
		String user = "root";
		String password = "";

		try (Connection con = DriverManager.getConnection(url, user, password);
				Statement st = con.createStatement()) {
			String sql = "SELECT co_id,co_name,co_location FROM company "
					+ "WHERE co_id = 3";
			ResultSet rs = st.executeQuery(sql);
			while (rs.next()) {
				int co_id = rs.getInt("co_id");
				String co_name = rs.getString("co_name");
				String co_location = rs.getString("co_location");
				System.out.println("会社ID：" + co_id
						+ " 会社名：" + co_name
						+ " 所在地：" + co_location);
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
}
