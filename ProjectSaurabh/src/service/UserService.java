package service;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import book_store.User;
import dao.UserDAO;

public class UserService {
	public UserDAO userdao;

	public UserService(UserDAO userdao) {
		super();
		this.userdao = userdao;
	}

	public User saveUser(User u) {
		User u1 = null;
		try {
			u1 = userdao.createUser(u);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return u1;
	}

	public User updateUser(User u) {
		User u1 = null;
		try {
			u1 = userdao.updateUser(u);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return u1;
	}

	public int deleteUser(int id) {
		try {
			userdao.deleteUser(id);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return id;
	}

	public User getUser(int id) {
		User u = null;
		try {
			u = userdao.get(id);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return u;
	}

	public List<User> getAll() {
		List<User> userList = new ArrayList<>();
		try {
			userList = userdao.getAll();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		return userList;
	}

}