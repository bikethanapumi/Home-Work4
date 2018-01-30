package com.java.homwork1;

public class EvenNumber {
	static int[] even = new int[10];
	static int index = 0;

	public static void split(int num) {
		// TODO Auto-generated method stub
		even[index] = num;

		index++;

	}

	public static void display() {
		// TODO Auto-generated method stub
		for (int i = 0; i < index; i++) {
			System.out.println("Even :" + even[i]);
		}
	}

}
