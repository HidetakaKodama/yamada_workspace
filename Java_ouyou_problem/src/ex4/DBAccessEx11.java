package ex4;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Scanner;

public class DBAccessEx11 {
	public static void main(String[] args) {
		System.out.println("会社IDを入力してください -> ");
		Scanner sc = new Scanner(System.in);
		int change = sc.nextInt();

		String url = "jdbc:mysql://localhost/testdb";
		String user = "root";
		String password = "";

		try (Connection con = DriverManager.getConnection(url, user, password);
				PreparedStatement pstmt = con.prepareStatement("SELECT trainee.id FROM trainee "
						+ "JOIN company ON trainee.co_id = company.co_id WHERE company.co_id = ?")) {
			pstmt.setInt(1, change);
			ResultSet rs = pstmt.executeQuery();
			while (rs.next()) {
				System.out.println("研修生ID:" + rs.getInt("id"));
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
}
