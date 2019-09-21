import java.util.Scanner;

public class Encrypt {
	public static void main(String[] args) {
		// Declare variables
		Scanner in = new Scanner(System.in);
		int toEncrypt;
		int digit1;
		int digit2;
		int digit3;
		int digit4;
		int result;
		
		// Prompt user for input
		System.out.print("Enter the 4-digit integer to be encrypted: ");
		toEncrypt = in.nextInt();
		
		// Calculate the encrypted result by doing each digit individually
		digit1 = ((toEncrypt / 10) + 7) % 10;
		digit2 = (toEncrypt + 7) % 10;
		digit3 = ((toEncrypt / 1000) + 7) % 10;
		digit4 = ((toEncrypt / 100) + 7) % 10;
		result = 1000 * digit1 + 100 * digit2 + 10 * digit3 + digit4;
		
		// Print result
		System.out.println("Encrypted integer: " + result);
		in.close();
	}
}
