package dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Conexao {
	private static String status, usuario, senha, url, database, server;
	private static Connection conection;

	public static String getUrl() {
		return url;
	}

	public static void setUrl(String url) {
		Conexao.url = url;
	}

	public static Connection criarConexao() {
		senha = "123456";
		server = "localhost";
		database = "empregadocrud";
		usuario = "root";
		url = "jdbc:mysql://" + server + ":3306/" + database;
		try {
			conection = DriverManager.getConnection(url, usuario, senha);
		} catch (SQLException e) {
			status = "erro";
			System.out.println(status);
			e.printStackTrace();
		}
		status = "Sucesso";
		System.out.println(status);
		return conection;
	}
}
