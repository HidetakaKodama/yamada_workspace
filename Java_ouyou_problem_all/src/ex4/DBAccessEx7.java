package ex4;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

public class DBAccessEx7 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("研修生の名前を入力してください -> ");
		String name = sc.next();

		String url = "jdbc:mysql://localhost/testdb";
		String user = "root";
		String password = "";

		try (Connection con = DriverManager.getConnection(url, user, password);
				Statement st = con.createStatement()) {

			String sql = "SELECT id,age FROM trainee WHERE name = '" + name + "' ORDER BY id";
			ResultSet rs = st.executeQuery(sql);
			boolean isFound = false;

			while (rs.next()) {
				isFound = true;
				int id = rs.getInt("id");
				int age = rs.getInt("age");
				System.out.println("ID：" + id
						+ " 年齢：" + age);
			}

			if (isFound == false) {
				System.out.println("指定されたベンダーの資格は存在しません。");
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
}
