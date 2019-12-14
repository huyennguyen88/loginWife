package model.bean;

public class Wife {
	private int wife_id;
	private String name;
	private String address;
	private boolean alive;
	public  Wife() {
		super();
	}
	public int getWife_id() {
		return this.wife_id;
	}
	public void setWife_id(int id) {
		this.wife_id = id;
	}
	public String getName() {
		return this.name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getAddress() {
		return this.address;
	}
	public void setAddress(String address) {
		this.address =address;
	}
	public boolean isAlive() {
		return this.alive;
	}
	public void setAlive(boolean alive) {
		this.alive = alive;
	}
	
}
