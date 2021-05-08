package example2;

public class User {
	private int userId;
	private String email;
	
	public User() {
		
	}
	
	public User(int userId, String email) {
		super();
		this.userId = userId;
		this.email = email;
	}

	public int getUserId() {
		return userId;
	}

	public void setUserId(int userId) {
		this.userId = userId;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}
	
}
