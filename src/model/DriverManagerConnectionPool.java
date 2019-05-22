package model;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.LinkedList;
import java.util.List;

public class DriverManagerConnectionPool  {

	private static List<Connection> freeDbConnections;

	static {
		freeDbConnections = new LinkedList<Connection>();
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
		} catch (ClassNotFoundException ignored) {
		}
	}
	
	private static synchronized Connection createDBConnection() throws SQLException {
		Connection newConnection = null;
		
		String url = "jdbc:mysql://localhost:3306/logtry?useUnicode=true&useJDBCCompliantTimezoneShift=true&useLegacyDatetimeCode=false&autoReconnect=true&useSSL=false&serverTimezone=CET";
		String username = "root";
		String password = "admin";
		
		newConnection = DriverManager.getConnection(url, username, password);
		if (newConnection == null) {
			throw new SQLException("Unable to connect to " + url);
		}
		
		newConnection.setAutoCommit(true);
		return newConnection;
		
		
	}


	public static synchronized Connection getConnection() throws SQLException {
		Connection connection;

		if (!freeDbConnections.isEmpty()) {
			connection = (Connection) freeDbConnections.get(0);
			freeDbConnections.remove(0);

			try {
				if (connection.isClosed())
					connection = getConnection();
			} catch (SQLException e) {
				connection.close();
				connection = getConnection();
			}
		} else {
			connection = createDBConnection();		
		}

		return connection;
	}

	public static synchronized void releaseConnection(Connection connection) throws SQLException {
		if(connection != null) freeDbConnections.add(connection);
	}
}
