package dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import entity.Trainee;

public class TraineeDao {
	private static final String url = "jdbc:mysql://localhost/testdb";
	private static final String user = "root";
	private static final String password = "";

	private Connection getConnection() throws ClassNotFoundException, SQLException {
		Class.forName("com.mysql.jdbc.Driver");
		Connection con = DriverManager.getConnection(url, user, password);
		return con;
	}


	public List<Trainee> searchByCo(int coId) {

		List<Trainee> list = new ArrayList<Trainee>();

		try {
			Connection con = getConnection();
			String sql = "SELECT id,name,age FROM trainee WHERE co_id = ?";
			PreparedStatement pst = con.prepareStatement(sql);
			pst.setInt(1, coId);
			ResultSet rs = pst.executeQuery();
			while (rs.next()) {
				Trainee trainee = new Trainee();
				int id = rs.getInt("id");
				String name = rs.getString("name");
				int age = rs.getInt("age");
				trainee.setId(id);
				trainee.setName(name);
				trainee.setAge(age);
				list.add(trainee);
			}
		} catch (SQLException | ClassNotFoundException e) {
			e.printStackTrace();
		}
		return list;
	}
}