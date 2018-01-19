package com.java.homwork1;
import javax.swing.JOptionPane;

public class Circle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String Radius=JOptionPane.showInputDialog("Input Radius");
		double r = Double.parseDouble(Radius);
		
		double Area=3.14*(r*r);
		double Circleline=2*r;
		
		JOptionPane.showMessageDialog(null,String.format("Area : %.2f \nCircleline : %.2f", Area,Circleline),"Circle",JOptionPane.PLAIN_MESSAGE );
		
	}

}
