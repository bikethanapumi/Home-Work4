package com.java.homework3.usermanager;

import javax.swing.JOptionPane;

public class UserManager {

	public User[] users;
	boolean status;
	// int count;

	public UserManager() {
		users = new User[50];
		addUser();
	}

	public void addUser() {

		for (int i = 0; i < 3; i++) {
			String newUser = JOptionPane.showInputDialog("Enter New User");
			System.out.println(newUser);
			//
			while (newUser == null || newUser.equals("")) {
				if (newUser == null)
					System.exit(0);
				JOptionPane.showMessageDialog(null, "Please Insert", "Warning", JOptionPane.WARNING_MESSAGE);
				newUser = JOptionPane.showInputDialog("Enter New User");
			}
			//

			users[i] = new User(newUser);

			if (i == (users.length - 1)) {

				JOptionPane.showMessageDialog(null, "Number of User Out of Bound", "Warning!!",
						JOptionPane.WARNING_MESSAGE);
				break;
			}

		}
	}

	public void displayAllUser() {
		for (int i = 0; i < users.length; i++) {
			if (users[i] != null)
				users[i].displayUser();
		}
	}

}
