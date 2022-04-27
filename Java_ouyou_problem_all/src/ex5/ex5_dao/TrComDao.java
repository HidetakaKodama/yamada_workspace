package ex5.ex5_dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import ex5.ex5_entity.TrCom;

public class TrComDao {
	private static final String url = "jdbc:mysql://localhost/testdb";
	private static final String user = "root";
	private static final String password = "";

	public List<TrCom> searchByCold(int cold){
		TrCom trcom = null;
		List<TrCom> list = new ArrayList<>();
		try {
			Connection con = DriverManager.getConnection(url,user,password);
			PreparedStatement pstmt = con.prepareStatement
					("SELECT id,co_name FROM trainee "
							+ "JOIN company ON trainee.co_id = company.co_id WHERE trainee.co_id = ?");
			pstmt.setInt(1,cold);
			ResultSet rs = pstmt.executeQuery();
			while(rs.next()) {
				trcom = new TrCom();
				trcom.setId(rs.getInt("id"));
				trcom.setCoName(rs.getString("co_name"));
				list.add(trcom);
			}
		}catch(SQLException e) {
			e.printStackTrace();
		}
		return list;
	}
}
