package ex4;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Scanner;

public class DBAccessEx3 {
	public static void main(String[] args) throws SQLException{
		System.out.println("会社名を入力してください -> ");
		Scanner sc = new Scanner(System.in);
		String company_name = sc.next();
		String url = "jdbc:mysql://localhost/testdb";
		String user = "root";
		String password = "";

		try (Connection con = DriverManager.getConnection(url, user, password);
				PreparedStatement pstmt = con.prepareStatement("SELECT id,name FROM trainee "
						+ "JOIN company ON trainee.co_id = company.co_id "
						+ "WHERE co_name = ? ORDER BY id")) {
			pstmt.setString(1, company_name);
			ResultSet rs = pstmt.executeQuery();

			boolean isFound = false;

			while (rs.next()) {
				isFound = true;
				int id = rs.getInt("id");
				String name = rs.getString("name");
				System.out.println("ID：" + id + " 名前：" + name);
			}

			if (isFound == false) {
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
}
