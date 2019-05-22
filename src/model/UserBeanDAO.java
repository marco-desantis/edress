package model;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class UserBeanDAO {

	public synchronized boolean doSave(UserBean ub) {
		Connection conn = null;
		PreparedStatement ps = null;

		try {
			conn = DriverManagerConnectionPool.getConnection();
			ps = conn.prepareStatement("INSERT INTO utente VALUE(?,?,?,?,?,?,?);");
			ps.setString(1, ub.getEmail());
			ps.setString(2, ub.getPsw());
			ps.setString(3, ub.getNome());
			ps.setString(4, ub.getCognome());
			ps.setString(5, ub.getCitta());
			ps.setString(6, ub.getIndirizzo());
			ps.setInt(7, ub.getCap());

			ps.executeUpdate();
			return true;
		} catch (SQLException e) {
			e.printStackTrace();
			return false;
		} finally {
			try {
				DriverManagerConnectionPool.releaseConnection(conn);
				ps.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
	}

	public synchronized UserBean doRetrieveByKey(String email, String psw) {
		Connection conn = null;
		PreparedStatement ps = null;

		try {
			conn = DriverManagerConnectionPool.getConnection();
			UserBean ub = new UserBean(email, psw);

			ps = conn.prepareStatement("SELECT * FROM utente WHERE email = ? AND chiave = ?");
			ps.setString(1, email);
			ps.setString(2, psw);

			ResultSet res = ps.executeQuery();
			if (res.next()) {
				ub.setNome(res.getString("nome"));
				ub.setCognome(res.getString("cognome"));
				ub.setCitta(res.getString("citta"));
				ub.setIndirizzo(res.getString("indirizzo"));
				ub.setCap(res.getInt("cap"));
				return ub;
			}
			DriverManagerConnectionPool.releaseConnection(conn);
			ps.close();

		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			try {
				DriverManagerConnectionPool.releaseConnection(conn);
				ps.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}

		return null;
	}
}
