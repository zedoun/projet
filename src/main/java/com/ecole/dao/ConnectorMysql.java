
package com.ecole.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConnectorMysql {

// attributs de classe e type Connection
	private Connection con = null;

	private String url = "jdbc:mysql://localhost/gestion_ecole";
	private String user = "changez le nom de user";
	private String password = "définez le mot de pass";

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
