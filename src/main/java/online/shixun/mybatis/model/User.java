package online.shixun.mybatis.model;

public class User {
	private int id;
	private String username;
	private int age;
	private String address;
	
	
	public User() {
		super();
	}
	
	public User(String username, int age, String address) {
		super();
		this.username = username;
		this.age = age;
		this.address = address;
	}

	public User(int id, String username, int age, String address) {
		super();
		this.id = id;
		this.username = username;
		this.age = age;
		this.address = address;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	@Override
	public String toString() {
		return "User [id=" + id + ", username=" + username + ", age=" + age + ", address=" + address + "]";
	}
	
	
	
	
}
