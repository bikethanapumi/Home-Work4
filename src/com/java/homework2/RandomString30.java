package com.java.homework2;

public class RandomString30 {
	private static char RandomStr() {
		String seed_chars = "ABCDEFGHIJKLMNOPQRSTUVWXYZ1234567890";
		double random = Math.random();
		int select = (int) (random * seed_chars.length());
		char selected = seed_chars.charAt(select);
		return selected;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// TODO Auto-generated method stub
		char[] strChar = new char[30];
		int updateIndex = 0;
		Boolean checkStatus = true;
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
			System.out.print(strChar[i]);

		}

	}

}
