package ex4;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

public class DBAccessEx4 {
	public static void main(String[] args) throws SQLException{
		System.out.println("会社IDを変更する研修生のIDを入力してください -> ");
		Scanner sc = new Scanner(System.in);
		int id = sc.nextInt();

		System.out.println("会社ID（変更後）を入力してください -> ");
		int change = sc.nextInt();
		String url = "jdbc:mysql://localhost/testdb";
		String user = "root";
		String password = "";
		try (Connection con = DriverManager.getConnection(url, user, password);
				PreparedStatement pstmt = con.prepareStatement("UPDATE trainee SET co_id ="
						+ " ? WHERE id = ?")) {
			pstmt.setInt(1, change);
			pstmt.setInt(2, id);
			pstmt.executeUpdate();
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
}
