package ex5.ex5_dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import ex5.ex5_entity.TrTest;

public class TrTestDao {
	private static final String url = "jdbc:mysql://localhost/testdb";
	private static final String user = "root";
	private static final String password = "";

	public List<TrTest> searchTrByUnitId(int unitId){
		TrTest trtest = null;
		List<TrTest> list = new ArrayList<>();
		try {
			Connection con = DriverManager.getConnection(url,user,password);
			PreparedStatement pstmt = con.prepareStatement
					("SELECT trainee.id,trainee.name,test.test_date,unit.unit_name FROM trainee "
							+ "JOIN unit ON trainee.unit_id = unit.unit_id JOIN test ON trainee.id = test.id "
							+ "WHERE trainee.unit_id = ?");
			pstmt.setInt(1,unitId);
			ResultSet rs = pstmt.executeQuery();
			while(rs.next()) {
				trtest = new TrTest();
				trtest.setId(rs.getInt("id"));
				trtest.setName(rs.getString("name"));
				trtest.setTestDate(rs.getString("test_date"));
				trtest.setUnitName(rs.getString("unit_name"));
				list.add(trtest);
			}
		}catch(SQLException e) {
			e.printStackTrace();
		}
		return list;
	}
}
