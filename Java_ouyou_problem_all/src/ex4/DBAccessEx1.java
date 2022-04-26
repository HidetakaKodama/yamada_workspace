package ex4;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class DBAccessEx1 {
	public static void main(String[] args) throws SQLException{
		String url = "jdbc:mysql://localhost/testdb";
		String user = "root";
		String password = "";
		Connection con = DriverManager.getConnection(url,user,password);
		PreparedStatement pstmt = con.prepareStatement("SELECT id,name,age FROM trainee WHERE id <= 3");

		ResultSet rs = pstmt.executeQuery();

		while(rs.next()) {
			int id = rs.getInt("id");
			String name = rs.getString("name");
			int age = rs.getInt("age");
			System.out.println("ID：" + id + "  名前：" + name + "  年齢：" + age);
		}
		pstmt.close();
		con.close();
	}
}
