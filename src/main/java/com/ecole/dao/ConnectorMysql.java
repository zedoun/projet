
package com.ecole.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConnectorMysql {

// attributs de classe e type Connection
	private Connection con = null;

	private String url = "jdbc:mysql://localhost/gestion_school";
	private String user = "root";
	private String password = "root";

	public ConnectorMysql() {

		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			con = DriverManager.getConnection(url, user, password);

		} catch (SQLException e) {

			e.printStackTrace();

		} catch (ClassNotFoundException e) {
			e.printStackTrace();

		}
	}

	public Connection getCon() {
		return con;
	}

	public static void main(String[] args) {
		ConnectorMysql c = new ConnectorMysql();

		System.out.println(c.getCon());
	}

}
