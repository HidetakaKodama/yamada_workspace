package ex4;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class DBAccessEx6 {
	public static void main(String[] args) {
		String url = "jdbc:mysql://localhost/testdb";
		String user = "root";
		String password = "";

		try (Connection con = DriverManager.getConnection(url, user, password);
				PreparedStatement pstmt = con.prepareStatement("SELECT id, unit_name FROM test "
						+ "JOIN unit ON test.unit_id = unit.unit_id WHERE test_date = ?")) {
			pstmt.setString(1, "8月25日");
			ResultSet rs = pstmt.executeQuery();
			while (rs.next()) {
				System.out.println("ID:" + rs.getInt("id") + " 単元名:" + rs.getString("unit_name"));
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
}
