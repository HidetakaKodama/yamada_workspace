package ex5.ex5_dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import ex5.ex5_entity.Trainee;

public class TraineeDao {
	private static final String url = "jdbc:mysql://localhost/testdb";
	private static final String user = "root";
	private static final String password = "";

	public Trainee searchById(int id) {
		Trainee trainee = null;
		try {
			Connection con = DriverManager.getConnection(url,user,password);
			PreparedStatement pstmt = con.prepareStatement
					("SELECT * FROM trainee WHERE id = ?");
			pstmt.setInt(1,id);
			ResultSet rs = pstmt.executeQuery();
			if(rs.next()) {
				trainee = new Trainee();
				trainee.setId(rs.getInt("id"));
				trainee.setName(rs.getString("name"));
				trainee.setAge(rs.getInt("age"));
				trainee.setSex(rs.getString("sex"));
				trainee.setUnitId(rs.getInt("unit_id"));
				trainee.setCold(rs.getInt("co_id"));
			}
		}catch(SQLException e) {
			e.printStackTrace();
		}
		return trainee;
	}




	public List<Trainee> searchByUnitId(int unit_id){
		List<Trainee> list = new ArrayList<>();
		try {
			Connection con = DriverManager.getConnection(url,user,password);
			PreparedStatement pstmt = con.prepareStatement
					("SELECT * FROM trainee WHERE unit_id = ?");
			pstmt.setInt(1,unit_id);
			ResultSet rs = pstmt.executeQuery();
			while(rs.next()) {
				Trainee trainee = new Trainee();
				trainee.setId(rs.getInt("id"));
				trainee.setName(rs.getString("name"));
				trainee.setAge(rs.getInt("age"));
				trainee.setSex(rs.getString("sex"));
				trainee.setUnitId(rs.getInt("unit_id"));
				trainee.setCold(rs.getInt("co_id"));
				list.add(trainee);
			}
		}catch(SQLException e) {
			e.printStackTrace();
		}
		return list;
	}


}

