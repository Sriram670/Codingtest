package com.example.codingtest.User;
public class UserDAO {
	int id;
	private String name;
	private String username;
	private String phno;
	private String email;
	public UserDAO(String name, String username, String phno, String email) {
		// TODO Auto-generated constructor stub
		super();
		this.name=name;
		this.username=username;
		this.phno=phno;
		this.email=email;
	}
	public String getPhno() {
		return phno;
	}
	public void setPhno(String phno) {
		this.phno = phno;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	
	
	

}
