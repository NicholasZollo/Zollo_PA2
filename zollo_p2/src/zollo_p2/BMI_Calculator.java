package zollo_p2;

import java.util.Scanner;

public class BMI_Calculator {

	public static void main(String[] args) {
		// Declare all variables to be used
		Scanner in = new Scanner(System.in);
		String mode;
		float weight;
		float height;
		float BMI;
		
		// Ask user for which units they would like to input
		System.out.print("Would you like to use metric units instead of imperial? (y/n): ");
		mode = in.next();
		
		// Depending on choice, take in input and use the correct formula to calculate BMI
		if(mode.equalsIgnoreCase("y")) {
			System.out.print("Enter your weight in kilograms: ");
			weight = in.nextFloat();
			System.out.print("Enter your height in meters: ");
			height = in.nextFloat();
			
			BMI = weight / (height * height);
		}
		else {
			System.out.print("Enter your weight in pounds: ");
			weight = in.nextFloat();
			System.out.print("Enter your height in inches: ");
			height = in.nextFloat();
			
			BMI = 703 * weight / (height * height);
		}
		// Print the calculated BMI rounded to one decimal point
		System.out.printf("\nYour calculated BMI is %.1f\n", BMI);
		
		// Print the different BMI categories
		System.out.printf("\nBMI categories:\n");
		System.out.println("Underweight: BMI < 18.5");
		System.out.println("Normal weight: 18.5 < BMI < 25");
		System.out.println("Overweight: 25 < BMI < 30");
		System.out.println("Obesity: BMI > 30");
		
		in.close();
	}
}
