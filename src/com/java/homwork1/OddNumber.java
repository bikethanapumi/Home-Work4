package com.java.homwork1;

public class OddNumber {
	static int[] odd = new int[10];
	static int index = 0;

	public static void split(int num) {
		// TODO Auto-generated method stub
		odd[index] = num;
		index++;

	}

	public static void display() {
		// TODO Auto-generated method stub
		for (int i = 0; i < index; i++) {
			System.out.println("Odd :" + odd[i]);
		}

	}

}
