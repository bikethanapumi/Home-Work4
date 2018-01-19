package com.java.homework2;

import javax.swing.JOptionPane;

public class UserAccountEx1 {
	private static void displayAllUsers(String[] my_users, String[] my_passwords) {
		for (int i = 0; i < my_users.length; i++) {
			if (my_users[i] != null && my_passwords[i] != null) {
				System.out.println("Username :" + my_users[i] + "/" + "Passwords :" + my_passwords[i]);
			}
		}
	}

	private static int checkExistingUser(String[] my_users, String username) {
		for (int i = 0; i < my_users.length; i++) {
			if (username.equalsIgnoreCase(my_users[i])) {

				return i;
			}
		}
		return -1;
	}

	private static boolean getCorrectPassword(String[] my_passwords, int indexUser) {
		String inputPassword = JOptionPane.showInputDialog("Enter Password");
		for (int i = 0; i < 3; i++) {
			if (inputPassword.equals(my_passwords[indexUser])) {
				return true;
			} else {
				JOptionPane.showMessageDialog(null, "Password Incorrect!!!", "Error", JOptionPane.ERROR_MESSAGE);
				inputPassword = JOptionPane.showInputDialog("Enter Password");
			}
		}
		return false;
	}

	private static void addUserToArray(String newUser, String[] my_user, String[] my_password) {
		for (int i = 0; i < my_user.length; i++) {
			if (my_user[i] == null) {
				my_user[i] = newUser;
				my_password[i] = myRandomStr();
				break;
			}
		}
	}

	private static String myRandomStr() {

		// TODO Auto-generated method stub
		char[] strChar = new char[8];
		int updateIndex = 0;
		Boolean checkStatus = true;
		String newPassword = "";
		do {

			if (updateIndex < strChar.length) {
				char randomChar = RandomStr();
				char mirror;
				if (updateIndex == 0) {
					strChar[updateIndex] = randomChar;
					updateIndex++;
				} else {
					boolean checkDuplicate = true;
					while (checkDuplicate) {
						for (int i = 0; i < strChar.length; i++) {

							if (randomChar == strChar[i]) {
								break;
							} else if (i == (strChar.length - 1) && randomChar != strChar[strChar.length - 1]) {
								strChar[updateIndex] = randomChar;
								updateIndex++;
								checkDuplicate = false;
							}

						}
						randomChar = RandomStr();
					}

				}
			} else {
				checkStatus = false;
			}

		} while (checkStatus);

		for (int i = 0; i < strChar.length; i++) {

			newPassword += strChar[i];

		}

		return newPassword;
	}

	private static char RandomStr() {
		String seed_chars = "ABCDEFGHIJKLMNOPQRSTUVWXYZ1234567890";
		double random = Math.random();
		int select = (int) (random * seed_chars.length());
		char selected = seed_chars.charAt(select);
		return selected;
	}

	// -----------------------------------------------------------------------------------//
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[] username = new String[5];
		String[] password = new String[5];
		username[0] = "Bob";
		username[1] = "Alice";
		username[2] = "John";
		password[0] = "W9F1D1HL";
		password[1] = "V4IJ6Z7F";
		password[2] = "UV5WS4X7";

		displayAllUsers(username, password);

		String inputUser = JOptionPane.showInputDialog("Enter Your Name");
		int indexUser = checkExistingUser(username, inputUser);
		boolean checkPassword = false;
		if (indexUser >= 0) {
			System.out.println("User :" + inputUser + "/" + "Status :" + indexUser);
			checkPassword = getCorrectPassword(password, indexUser);
			if (checkPassword) {
				JOptionPane.showMessageDialog(null, "Login-Success", "Login", JOptionPane.PLAIN_MESSAGE);
			} else {
				JOptionPane.showMessageDialog(null, "Fail to Login", "Fail", JOptionPane.ERROR_MESSAGE);
			}
		} else {
			System.out.println("New User");
			String newUser = JOptionPane.showInputDialog("Create New User");
			addUserToArray(newUser, username, password);
		}
		displayAllUsers(username, password);
	}

}
