package com.java.homwork1;

import javax.swing.JOptionPane;

public class ArrayWork {

	public static void main(String[] args) {

		OEManage manage = new OEManage();
		for (int i = 0; i < 10; i++) {
			String inputValue = JOptionPane.showInputDialog("Input Value (" + (i + 1) + ")");

			double value = Double.parseDouble(inputValue);
			int parseValue = (int) value;
			manage.checkOE(parseValue);

		}
		manage.displayAll();
	}

}
