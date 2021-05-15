package example5.dataAccess.abstracts;

import java.util.List;

import example5.entities.concretes.User;

public interface UserDao {
	void add(User user);
	void update(User user);
	void delete(User user);
	String getMail(String email);
	boolean loginUser(String email, String password);
	User get(int id);
	List<User> getAll();
}