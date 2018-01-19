package com.java.homework4;

public class User {
	public String username;
	public String password;
	public User() {
		
	}
	public User(String username) {
		this.username = username;
		this.password=RandomPassword.RandomStr();
	}

	public User(String username, String password) {
		this.username = username;
		this.password = password;
	}

	public void displayUser() {
		System.out.println("Username :" + this.username + "\n" + "Password :" + this.password);
		System.out.println("------------------------------------------");
	}

}
