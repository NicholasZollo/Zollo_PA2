package zollo_p3;

import java.util.Scanner;

public class Poll {
	public static void main(String[] args) {
		// Declare all variables that will be used in program
		Scanner in = new Scanner(System.in);
		String cont;
		String[] topics = new String[]{"Climate Change", "Health Care", "Gun Control", "Student Loans", "Income Inequality"};
		int[][] responses = new int[5][10];
		int response;
		int numResponses = 1;
		int sumResponses;
		int max = 0;
		int min;
		String maxTopic = "";
		String minTopic = "";
		
		while(true)
		{
			// Receives the input from the user on how important each issue is, increments
			// responses array values corresponding to the current topic and rating given
			System.out.printf("For each issue displayed, rate how important it is from 1 (least important) to 10 (most important):\n\n");
			for(int i = 0; i < 5; i++) {
				System.out.print(topics[i] + ": ");
				response = in.nextInt();
				responses[i][response - 1]++;
			}
			
			// Ask user if they want to continue input, exit while loop if they don't
			System.out.printf("\nContinue adding responses? (y/n): ");
			cont = in.next();
			System.out.println();
			if(cont.equalsIgnoreCase("n")) {
				break;
			}
			numResponses += 1;
		}
		
		// Sets min equal to a the maximum possible point total so it will always get overwritten by the first issue's point total
		min = 10 * numResponses;
		
		// Prints the header for hte table so that it lines up with all the columns in the table
		System.out.printf("%18s%4d%4d%4d%4d%4d%4d%4d%4d%4d%4d\n\n", "Rating", 1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
		
		for(int i = 0; i < 5; i++) {
			sumResponses = 0;
			
			//Prints the topic name in each row
			System.out.printf("%18s", topics[i]);
			
			// Prints the response tally for each row and computes the point total for the row by multiplying the tally by the rating and adding it to sumResponses
			for(int j = 0; j < 10; j++)
			{
				System.out.printf("%4d", responses[i][j]);
				sumResponses += responses[i][j] * (j + 1);
			}
			
			// Finds minimum and maximum point totals by comparing them to the existing min and max value as it goes through every topic
			if(sumResponses <= min) {
				min = sumResponses;
				minTopic = topics[i];
			}
			if(sumResponses >= max) {
				max = sumResponses;
				maxTopic = topics[i];
			}
			
			// Calculates and prints the average rating for each topic to the right of the row
			System.out.printf("   Average rating: %.2f\n", sumResponses / (float) numResponses);
		}
		
		// Prints the highest and lowest point total and their topics below the table
		System.out.println();
		System.out.println("The issue with the highest point total is " + maxTopic + " with a total of " + max + " points.");
		System.out.println("The issue with the lowest point total is " + minTopic + " with a total of " + min + " points.");
		
		in.close();
	}
}
