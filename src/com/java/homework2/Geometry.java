package com.java.homework2;

import javax.swing.JOptionPane;

public class Geometry {
	private static void Circle(double radius) {
		double areaCircle = 3.14 * Math.pow(radius, 2);
		JOptionPane.showMessageDialog(null, String.format("Area of circle is : %.2f", areaCircle), "Circle Area",
				JOptionPane.PLAIN_MESSAGE);

	}

	private static void Square(double width, double longer) {
		double areaSquare = width * longer;
		JOptionPane.showMessageDialog(null, String.format("Area of Square is : %.2f", areaSquare), "Square Area",
				JOptionPane.PLAIN_MESSAGE);
	}

	private static void Triangle(double hight, double base) {
		double areaTriangle = hight * base;
		JOptionPane.showMessageDialog(null, String.format("Area of Triangle is : %.2f", areaTriangle), "Triangle Area",
				JOptionPane.PLAIN_MESSAGE);

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String selected = JOptionPane.showInputDialog("Enter 1,2 or 3 ");

		switch (selected) {
		case "1":
			String Radius = JOptionPane.showInputDialog("Insert Radius of Circle");
			double radius = Double.parseDouble(Radius);
			Circle(radius);

			break;
		case "2":
			String Width = JOptionPane.showInputDialog("Insert Width of Squre");
			String Longer = JOptionPane.showInputDialog("Insert Long of Squre");
			double width = Double.parseDouble(Width);
			double longer = Double.parseDouble(Longer);
			Square(width, longer);

			break;
		case "3":
			String Hight = JOptionPane.showInputDialog("Insert Hight of Triangle");
			String Base = JOptionPane.showInputDialog("Insert Base of Triangle");
			double hight = Double.parseDouble(Hight);
			double base = Double.parseDouble(Base);
			Triangle(hight, base);

			break;

		default:
			System.out.println("Shape not supporrted");
			JOptionPane.showMessageDialog(null, "Shape not supported", "Error", JOptionPane.ERROR_MESSAGE);

			;
			break;

		}// switch case

	}

}
