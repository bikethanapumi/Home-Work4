package com.java.homework4;

import java.util.Date;

public class MemberUser extends User {
	Date date = new Date();
	String apply_date;
	public String member_type;

	public MemberUser() {
		this.apply_date = this.date + "";
	}

	public MemberUser(String username, String member_type, String password) {
		super(username, password);
		this.member_type = member_type;
		this.apply_date = this.date + "";

	}

	@Override
	public void displayUser() {
		// TODO Auto-generated method stub
		super.displayUser();
		System.out.println("Apply Date :" + this.apply_date + "\n" + "Member Type :" + this.member_type);
	}

}
