package model.bean;

public class User {
	private int user_id;
	private String name;
	private String password;
	public User() {
		super();
	}
	public int getUser_id() {
		return this.user_id;
	}
	public void setUser_id(int id) {
		this.user_id = id;
	}
	public String getName_id() {
		return this.name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getPassword() {
		return this.password;
	}
}
