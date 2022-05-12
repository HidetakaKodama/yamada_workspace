package dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import entity.Member;

public class MemberDao{
	private static final String DRIVER = "com.mysql.jdbo.Driver";
	private static final String URL = "jdbc:mysql://localhost/dbdatabase";
	private static final String USER = "root";
	private static final String PASSWORD = "";

	private Connection getConnection() throws
		ClassNotFoundException, SQLException{
		Class.forName(DRIVER);
		Connection con = DriverManager.getConnection(URL,USER,PASSWORD);
		return con;
	}

	public Member searchMyId(int id) {
		Member member = null;
		String sql = "SELECT id,name,age,address,password"
				+ "FROM member WHERE id = ?";
		try(Connection con = getConnection(); PreparedStatement
				pstmt = con.prepareStatement(sql);){
			pstmt.setInt(1,id);
			ResultSet rs = pstmt.executeQuery();
			if(rs.next()) {
				member = new Member();
				int id2 = rs.getInt("id");
				String name = rs.getString("name");
				int age = rs.getInt("age");
				String address = rs.getString("address");
				String password = rs.getString("password");
				member.setId(id2);
				member.setName(name);
				member.setAge(age);
				member.setAddress(address);
				member.setPassword(password);
			}
		}catch(SQLException | ClassNotFoundException e) {
			e.printStackTrace();
		}
		return member;
	}

	public Member searchById(int id) {
		return null;
	}
}