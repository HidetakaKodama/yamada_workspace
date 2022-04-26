package daoClass;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class TraDao {
	private static final String url = "jdbc:mysql://localhost/testdb";
	private static final String user = "root";
	private static final String password = "";

	public List<Trainee> searchByCold(int cold) {
		List<Trainee> list = new ArrayList<>();
		Trainee trainee = null;
		try {
			Connection con = DriverManager.getConnection(url,user,password);
			PreparedStatement pstmt = con.prepareStatement
					("SELECT id,name,age,sex FROM trainee WHERE id = ?");
			pstmt.setInt(1,cold);
			ResultSet rs = pstmt.executeQuery();
			while(rs.next()) {
				trainee = new Trainee();
				trainee.setId(rs.getInt("id"));
				trainee.setName(rs.getString("name"));
				trainee.setAge(rs.getInt("age"));
				trainee.setSex(rs.getString("sex"));
				list.add(trainee);
			}
		}catch(SQLException e) {
			e.printStackTrace();
		}
		return list;
	}
}
