import java.util.Scanner;

// Code copied and modified from Encrypt class

public class Decrypt {
	public static void main(String[] args) {
		// Declare variables
		Scanner in = new Scanner(System.in);
		int toDecrypt;
		int digit1;
		int digit2;
		int digit3;
		int digit4;
		int result;
		
		// Prompt user for input
		System.out.print("Enter the 4-digit integer to be decrypted: ");
		toDecrypt = in.nextInt();
		
		// Calculate the decrypted result by doing each digit individually
		digit1 = ((toDecrypt / 10) + 3) % 10;
		digit2 = (toDecrypt + 3) % 10;
		digit3 = ((toDecrypt / 1000) + 3) % 10;
		digit4 = ((toDecrypt / 100) + 3) % 10;
		result = 1000 * digit1 + 100 * digit2 + 10 * digit3 + digit4;
		
		// Print result
		System.out.println("Decrypted integer: " + result);
		in.close();
	}
}
