package com.java.homework3.usermanager;

public class User {
	public String username;
	public String password;
	public User() {
		
	}
	public User(String username) {
		this.username = username;
		createPassword();
	}

	public void createPassword() {
		String password = myRandomStr();
		this.password = password;
	}

	public void displayUser() {
		System.out.println("Username :" + this.username + "\n" + "Password :" + this.password);
		System.out.println("------------------------------------------");
	}

	public String myRandomStr() {

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

	public char RandomStr() {
		String seed_chars = "ABCDEFGHIJKLMNOPQRSTUVWXYZ1234567890";
		double random = Math.random();
		int select = (int) (random * seed_chars.length());
		char selected = seed_chars.charAt(select);
		return selected;
	}
}
