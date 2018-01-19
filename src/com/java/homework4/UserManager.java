package com.java.homework4;

import javax.swing.JOptionPane;

public class UserManager {

	public User[] users;

	public UserManager() throws Exception {
		users = new User[50];
		addUser();
	}

	public void addUser() throws Exception {
		for (int i = 0; i < 3; i++) {
			String newUser = JOptionPane.showInputDialog("Enter New User");
			
			users[i] = new User(newUser);

		}
		
	}

	public void addMemberUser() throws Exception {
		int countNull = 0;

		for (int i = 0; i < users.length; i++) {
			if (users[i] == null) {
				String newMemberUser = JOptionPane.showInputDialog("Enter New Member User");
				String newPassword = JOptionPane.showInputDialog("Enter Password");
				String password = HashFunction.HashPassword(newPassword);
				String newMemberType = JOptionPane.showInputDialog("Enter Type Of Member");
				//
				String member_type = checkMemberType(newMemberType);
				//

				users[i] = new MemberUser(newMemberUser, member_type, password);
				countNull++;
			}
			if (countNull == 3)
				break;

		}
	}

	public String checkMemberType(String newMemberType) {
		String member_type;
		if (newMemberType.equalsIgnoreCase("standard") || newMemberType.equalsIgnoreCase("silver")
				|| newMemberType.equalsIgnoreCase("gold")) {
			member_type = newMemberType;
			return member_type;
		} else {
			member_type = "standard";
			return member_type;
		}
	}

	public void displayAllUser() {
		for (int i = 0; i < users.length; i++) {
			if (users[i] != null)
				users[i].displayUser();

		}

	}

}
