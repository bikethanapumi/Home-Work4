import javax.swing.JOptionPane;

public class ArrayWork {

	public static void main(String[] args) {
		int[] oddNumbers = new int[10];
		int countOdd = 0;
		int[] evenNumbers = new int[10];
		int countEven = 0;
		String odd = " ";
		String even = " ";

		for (int i = 0; i < 10; i++) {
			String inputValue = JOptionPane.showInputDialog("Input Value ("+(i+1)+")");

			double value = Double.parseDouble(inputValue);
			int parseValue = (int) value;

			if (parseValue % 2 != 0) {
				oddNumbers[countOdd] = parseValue;
				countOdd++;
				odd = odd + parseValue + " ";
				// คี่
			} else {
				evenNumbers[countEven] = parseValue;
				countEven++;
				even = even + parseValue + " ";
				// คู๋
			}
		}

		System.out.print("Odd Number is:");
		for (int i = 0; i < countOdd; i++) {
			System.out.print(oddNumbers[i] + " ");

		}
		System.out.println("");
		System.out.print("Even Number is:");
		for (int i = 0; i < countEven; i++) {
			System.out.print(evenNumbers[i] + " ");
		}

		JOptionPane.showMessageDialog(null, "Odd Number is :" + odd + "\n Even Number is:" + even, "Odd&Even", JOptionPane.PLAIN_MESSAGE);

	}

}
