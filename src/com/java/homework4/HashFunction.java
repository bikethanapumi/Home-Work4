package com.java.homework4;

import java.security.MessageDigest;

public class HashFunction {

	public static String HashPassword(String password) throws Exception {
		MessageDigest messageDigest = MessageDigest.getInstance("MD5");
		byte[] hash = null;
		try {
			hash = messageDigest.digest(password.getBytes());

		} catch (Exception e) {
			e.printStackTrace();
		}
		StringBuilder sb = new StringBuilder();
		for (int i = 0; i < hash.length; ++i) {
			String hex = Integer.toHexString(hash[i]);
			if (hex.length() == 1) {
				sb.append(0);
				sb.append(hex.charAt(hex.length() - 1));
				
			} else {
				sb.append(hex.substring(hex.length() - 2));
				
			}
		}
		
		return sb.toString().toUpperCase();

	}
}
