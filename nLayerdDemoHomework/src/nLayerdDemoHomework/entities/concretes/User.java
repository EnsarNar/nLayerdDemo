package nLayerdDemoHomework.entities.concretes;

import nLayerdDemoHomework.entities.abstracts.Entity;

public class User implements Entity{
	//Variables
	private int id;
	private String password;
	private String email;
	private String firstName;
	private String lastName;
	//Constructor
	public User() {
		
	};
	public User(int id, String password, String email, String firstName, String lastName) {
		super();
		this.id = id;
		this.password = password;
		this.email = email;
		this.firstName = firstName;
		this.lastName = lastName;
	}
	//Getters and Setters
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	
}
