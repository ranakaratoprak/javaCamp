package example5.dataAccess.concretes;

import java.util.ArrayList;
import java.util.List;

import example5.dataAccess.abstracts.UserDao;
import example5.entities.concretes.User;

public class HibernateUserDao implements UserDao {

	private ArrayList<User> users = new ArrayList<User>();

	public HibernateUserDao() {
		User user1 = new User(1, "Rana", "Karatoprak", "rana@rana.com", "123456");
		User user2 = new User(2, "rana", "kara", "rana1@rana.com", "145615");

		users.add(user1);
		users.add(user2);

	}

	@Override
	public void add(User user) {
		this.users.add(user);
		System.out.println("Hibernate ile eklendi " + user.getFirstName());

	}

	@Override
	public void update(User user) {
		User userUpdate = get(user.getId());
		userUpdate.setFirstName(user.getFirstName());
		userUpdate.setLastName(user.getLastName());
		userUpdate.setEmail(user.getEmail());
		userUpdate.setPassword(user.getPassword());

		System.out.println("Hibernate ile güncellendi " + user.getFirstName());

	}

	@Override
	public void delete(User user) {
		this.users.remove(user);
		System.out.println("Hibernate ile silindi " + user.getFirstName());

	}

	@Override
	public List<User> getAll() {

		return users;
	}

	@Override
	public String getMail(String email) {
		for (User user : this.users) {
			if (user.getEmail() == email) {
				return email;
			}
		}
		return null;
	}

	@Override
	public User get(int id) {
		for (User user : users) {
			if(user.getId() == id) {
				return user;
			}
		}
		return null;
	}

	@Override
	public boolean loginUser(String email, String password) {
		for(User user : this.users) {
			if(user.getEmail() == email && user.getPassword() == password) {
				return true;
			}
		}
		return false;
	}

}
