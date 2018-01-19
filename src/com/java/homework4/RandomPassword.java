package com.java.homework4;

public class RandomPassword {

	public static String RandomStr() {
		String seed_chars = "ABCDEFGHIJKLMNOPQRSTUVWXYZ1234567890";
		String newPass = "";
		for (int i = 0; i < 8; i++) {
			double random = Math.random();

			int select = (int) (random * seed_chars.length());
			char selected = seed_chars.charAt(select);
			newPass += selected;
		}
		return newPass;
	}
}
