package com.java.homework4;

public class CheckInput {
	public static boolean checkAll(String strLine) {
		if(checkNull(strLine)) {
			if(checkFreeValue(strLine)) {
				if(checkSpecialChar(strLine)) {
					return true;
				}else {
					return false;
				}
			}else {
				return false;
			}
		}else {
			return false;	
		}
		
	}
	private static boolean checkFreeValue(String strLine) {
		if(strLine.equals("")) {
			return false;
		}else {
			return true;
		}
		
	}
	private static boolean checkSpecialChar(String strLine) {
		String specialChar ="!@#$%^&*(\"\'\\)_-+/><=";
		strLine.trim();
		for(int i=0 ;i<specialChar.length();i++) {
			for(int j=0;j<strLine.length();j++) {
				if(strLine.charAt(j)==specialChar.charAt(i)) {
					return false;
				}
			}
		}
		return true;
	}
	private static boolean checkNull(String strLine) {
		if(strLine==null) {
			return false;
		}else {
		return true;
		}
	}
}
