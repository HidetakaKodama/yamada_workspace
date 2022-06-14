package dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import entity.Country;

public class CountryDao {
	private static final String URL = "jdbc:mysql://localhost:3306/jdbc_test?serverTimezone=JST";
	private static final String USER = "root";
	private static final String PASSWORD = "";

	private Connection getConnection() throws ClassNotFoundException, SQLException {
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection con = DriverManager.getConnection(URL, USER, PASSWORD);
		return con;
	}


	public List<Country> selectAll() {
		List<Country> list = new ArrayList<Country>();
		try {
			Connection con = getConnection();
			String sql = "SELECT id, country, capital, population, area, density FROM country";
			PreparedStatement pst = con.prepareStatement(sql);
			ResultSet rs = pst.executeQuery();
			while (rs.next()) {
				Country country = new Country();

				int id = rs.getInt("id");
				String country2 = rs.getString("country");
				String capital = rs.getString("capital");
				int population = rs.getInt("population");
				double area = rs.getDouble("area");
				double density = rs.getDouble("density");

				country.setId(id);
				country.setCountry(country2);
				country.setCapital(capital);
				country.setPopulation(population);
				country.setArea(area);
				country.setDensity(density);

				list.add(country);
			}
		} catch (SQLException | ClassNotFoundException e) {
			e.printStackTrace();
		}
		return list;
	}

	public List<Country> searchByPopulation(int population) {
		List<Country> list = new ArrayList<Country>();
		try {
			Connection con = getConnection();
			String sql = "SELECT id, country, capital, population, area, density FROM country WHERE population >= ?"
					+ " ORDER BY population desc";
			PreparedStatement pst = con.prepareStatement(sql);
			pst.setInt(1, population);
			ResultSet rs = pst.executeQuery();
			while (rs.next()) {
				Country country = new Country();

				int id = rs.getInt("id");
				String country2 = rs.getString("country");
				String capital = rs.getString("capital");
				int population2 = rs.getInt("population");
				double area = rs.getDouble("area");
				double density = rs.getDouble("density");

				country.setId(id);
				country.setCountry(country2);
				country.setCapital(capital);
				country.setPopulation(population2);
				country.setArea(area);
				country.setDensity(density);

				list.add(country);
			}
		} catch (SQLException | ClassNotFoundException e) {
			e.printStackTrace();
		}
		return list;
	}

	public List<Country> searchByArea(int area) {
		List<Country> list = new ArrayList<Country>();
		try {
			Connection con = getConnection();
			String sql = "SELECT id, country, capital, population, area, density FROM country WHERE area >= ?"
					+ " ORDER BY area desc";
			PreparedStatement pst = con.prepareStatement(sql);
			pst.setInt(1, area);
			ResultSet rs = pst.executeQuery();
			while (rs.next()) {
				Country country = new Country();

				int id = rs.getInt("id");
				String country2 = rs.getString("country");
				String capital = rs.getString("capital");
				int population2 = rs.getInt("population");
				double area2 = rs.getDouble("area");
				double density = rs.getDouble("density");

				country.setId(id);
				country.setCountry(country2);
				country.setCapital(capital);
				country.setPopulation(population2);
				country.setArea(area2);
				country.setDensity(density);

				list.add(country);
			}
		} catch (SQLException | ClassNotFoundException e) {
			e.printStackTrace();
		}
		return list;
	}
}
