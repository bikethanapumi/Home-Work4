package com.java.homwork1;

public class OEManage {
	public void checkOE(int num) {
		if (num % 2 != 0) {
			OddNumber.split(num);
		} else {
			EvenNumber.split(num);
		}
	}

	public void displayAll() {
		OddNumber.display();
		EvenNumber.display();
	}
}
