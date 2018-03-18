import javax.swing.JOptionPane;

public class PrimeOrNot {
	public static void main(String[] args) {
		boolean isPrime = true;
		String number = JOptionPane.showInputDialog("Pick a random number!");
		int i = Integer.parseInt(number);
		int j = i - 1;
		for (j = 2; j < i; j++) {
			if (i % j == 0) {
				isPrime = false;

			}
		}

		if (isPrime == true) {
			System.out.println("This number is prime");
		} else {
			System.out.println("This number is not prime");
		}
	}

}
