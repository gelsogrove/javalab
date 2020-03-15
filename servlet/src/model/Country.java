package model;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;

public class Country {

	private String name;
	private String code;

	private Connection conn = null;
	private Statement stmt = null;

	//Constructor
	public Country()  {
		try {
			//Connection
			java.sql.DriverManager.registerDriver(new com.mysql.jdbc.Driver());

			this.conn = DriverManager.getConnection("jdbc:mysql://localhost/ecommerce?user=root&password=");

			//Create Statement
			this.stmt =  conn.createStatement();

		}catch(Exception ex) {
			System.out.println(ex.getMessage());
		}
	}

	//Methods

	public String getCode() {
		return code;
	}

	public void setCode(String code) {
		this.code = code;
	}



	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}



	public ArrayList<Country> GetCountries() {

		try {

			//SQL
			String sql = "Select * from country";

			//Execute query
			ResultSet rs  = this.stmt.executeQuery(sql);

			ArrayList<Country> categories = new ArrayList<Country>();

			while (rs.next()) {
				Country item = new Country();
				item.setCode(rs.getString("code"));
				item.setName(rs.getString("name"));

				categories.add(item);
			}

			return categories;

		}catch (Exception ex) {
			System.out.println(ex.getMessage());
			return null;
		}

	}


}
