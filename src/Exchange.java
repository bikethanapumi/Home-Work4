import javax.swing.JOptionPane;

public class Exchange {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String inputBath = JOptionPane.showInputDialog("Input Bath");
		double Bath = Double.parseDouble(inputBath);
		if (Bath <= 28) {
			JOptionPane.showMessageDialog(null, "please insert more than 29", "Exchange", JOptionPane.ERROR_MESSAGE);
		} else if (Bath >= 29.69) {
			double ExUSD = Bath / 32.20;
			double ExEUR = Bath / 39.83;
			double Exjpy = (Bath / 29.69) * 100;

			/*JOptionPane.showMessageDialog(null, "Exchange:" + Bath + "Bath\n" + "USD:" + ExUSD + "\n" + "EUR:" + ExEUR
					+ "\n" + "JPY:" + Exjpy + "\n", "Exchange Money System", JOptionPane.PLAIN_MESSAGE);*/

			JOptionPane.showMessageDialog(null, String.format("Exchange: "+Bath+"Bath\n USD: %.2f \nEUR:%.2f \nJPY:%.2f\n", ExUSD,ExEUR,Exjpy), "Exchange Money System", JOptionPane.PLAIN_MESSAGE);
		}

	}

}
