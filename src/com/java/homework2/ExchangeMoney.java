package com.java.homework2;

import javax.swing.JOptionPane;

public class ExchangeMoney {
	private static double Exchange(String bath, String other) {
		double ExUSD = 0.0;
		double ExEUR = 0.0;
		double Exjpy = 0.0;
		double Bath = Double.parseDouble(bath);
		if (Bath <= 28) {
			JOptionPane.showMessageDialog(null, "please insert more than 29", "Exchange", JOptionPane.ERROR_MESSAGE);
		} else if (Bath >= 29.69) {
			if (other.equalsIgnoreCase("usd")) {
				ExUSD = Bath / 32.20;
				return ExUSD;
			} else if (other.equalsIgnoreCase("eur")) {
				ExEUR = Bath / 39.83;
				return ExEUR;
			} else if (other.equalsIgnoreCase("jpy")) {
				Exjpy = (Bath / 29.69) * 100;
				return Exjpy;
			} else {
				JOptionPane.showMessageDialog(null, "Currency not supported", "Excange Money",
						JOptionPane.ERROR_MESSAGE);
			}

		}
		return 0.0;
	}

	private static void displayMoney(String other, String Bath, double Exchange) {
		if (other.equalsIgnoreCase("usd")) {
			JOptionPane.showMessageDialog(null, String.format("Exchange: " + Bath + "Bath\n USD: %.2f ", Exchange),
					"Exchange Money System", JOptionPane.PLAIN_MESSAGE);
		} else if (other.equalsIgnoreCase("eur")) {
			JOptionPane.showMessageDialog(null, String.format("Exchange: " + Bath + "Bath\n EUR: %.2f ", Exchange),
					"Exchange Money System", JOptionPane.PLAIN_MESSAGE);
		} else if (other.equalsIgnoreCase("jpy")) {
			JOptionPane.showMessageDialog(null, String.format("Exchange: " + Bath + "Bath\n JPY: %.2f ", Exchange),
					"Exchange Money System", JOptionPane.PLAIN_MESSAGE);
		} else {
			JOptionPane.showMessageDialog(null, "Currency not supported", "Excange Money", JOptionPane.ERROR_MESSAGE);
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String inputBath = JOptionPane.showInputDialog("Input Bath");
		String inputOther = JOptionPane.showInputDialog("Input Other");
		double exChange=Exchange(inputBath, inputOther);
		
		displayMoney(inputOther,inputBath,exChange);
	}

}
