package pMain;

import java.util.Scanner;

public class CMain {
	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		System.out.print("How many touchdowns? ");
		double Touchdowns = input.nextDouble();
		
		System.out.print("How many yards? ");
		double Yards = input.nextDouble();
		
		System.out.print("How many interceptions? ");
		double Interceptions = input.nextDouble();
		
		System.out.print("How many completions? ");
		double Completions = input.nextDouble();
		
		System.out.print("How many attempted? ");
		double Attempted = input.nextDouble();

		PasserRating Alpha = new PasserRating(Touchdowns, Yards, Interceptions, Completions, Attempted);
		System.out.printf("The passer rating is: %.2f", Alpha.Rating());
		
		input.close();

	}
}
