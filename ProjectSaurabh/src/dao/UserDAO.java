package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.*;

import book_store.User;
import database.DatabaseConnection;
import database.UserCrudOps;

public class UserDAO {

	public User createUser(User u) throws SQLException {
		Connection con = DatabaseConnection.getConnection();
		PreparedStatement stmt = con.prepareStatement(UserCrudOps.INSERT_USER);
		if (con != null)
			;
		{
			int id = u.getUserid();
			String email = u.getEmail();
			String name = u.getFullname();
			String password = u.getPassword();
			stmt.setInt(1, id);
			stmt.setString(2, email);
			stmt.setString(3, name);
			stmt.setString(4, password);
			int result = stmt.executeUpdate();
			if (result > 0) {
				System.out.println("Record Inserted");
			}
		}
		return u;
	}

	public User updateUser(User u) throws SQLException {
		Connection con = DatabaseConnection.getConnection();
		PreparedStatement stmt = con.prepareStatement(UserCrudOps.UPDATE_USER);
		if (con != null) {
			int id = u.getUserid();
			String email = u.getEmail();
			String name = u.getFullname();
			String password = u.getPassword();
			stmt.setString(1, email);
			stmt.setString(2, name);
			stmt.setString(3, password);
			stmt.setInt(4, id);
			int result = stmt.executeUpdate();
			if (result > 0) {
				System.out.println("Record Updated");
			}
		}
		return u;
	}

	public int deleteUser(int delid) throws SQLException {
		// TODO Auto-generated method stub

		Connection con = DatabaseConnection.getConnection();
		PreparedStatement stmt = con.prepareStatement(UserCrudOps.DELETE_FROM_USER);
		if (con != null) {
			int id = delid;
			stmt.setInt(1, id);
			int result = stmt.executeUpdate();
			if (result > 0) {
				System.out.println("Record Deleted");
			}
		}

		return delid;
	}

	public User get(int gid) throws SQLException {
		// TODO Auto-generated method stub
		Connection con = DatabaseConnection.getConnection();
		PreparedStatement stmt = con.prepareStatement(UserCrudOps.GET_USER);
		User u = null;
		if (con != null) {
			int id = gid;
			stmt.setInt(1, id);
			ResultSet rs = stmt.executeQuery();
			if (rs.next()) {
				String email = rs.getString("email");
				String name = rs.getString("fullname");
				String password = rs.getString("password");
				u = new User();
				u.setEmail(email);
				u.setFullname(name);
				u.setPassword(password);
			}
		}
		return u;
	}

	public List<User> getAll() throws SQLException {
		// TODO Auto-generated method stub
		List<User> userList = new ArrayList<>();
		Connection con = DatabaseConnection.getConnection();
		PreparedStatement stmt = con.prepareStatement(UserCrudOps.GET_ALL);
		if (con != null) {
			ResultSet rs = stmt.executeQuery();
			while ((rs.next())) {
				String email = rs.getString("email");
				String name = rs.getString("fullname");
				String password = rs.getString("password");
				User u = new User();
				u.setEmail(email);
				u.setFullname(name);
				u.setPassword(password);
				userList.add(u);
			}
		}
		return userList;
	}
}