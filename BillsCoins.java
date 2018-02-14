/* Write an application that prompts for and reads a double value representing a monetary amount. 
 * Then determine the fewest number of each bill and coin needed to represent that amount, starting with the highest. 
*/

import java.util.Scanner;

public class BillsCoins {
			
	public static void main(String[] args) {
	
		double amount;
		double oneDollar, fiveDollar, twentyDollar;
		double penny, nickel, dime, quarter;


		Scanner scan = new Scanner(System.in);

		System.out.print("What is the amount? ");
		amount = scan.nextDouble();

		System.out.println();
		
		twentyDollar = amount / 20;
		amount = amount %20;

		fiveDollar = amount / 5;
		amount = amount % 5;

		oneDollar = amount / 1;
		amount = amount % 1;

		quarter = amount / .25;
		amount = amount % .25;

		dime = amount / .10;
		amount = amount % .10;

		nickel = amount / .05;
		amount = amount % .05;

		penny = amount / .01;
		amount = amount % .01;

		System.out.println((int)twentyDollar + " twenty dollar bills");
		System.out.println((int)fiveDollar + " five dollar bils");
		System.out.println((int)oneDollar + " one dollar bills");
		System.out.println((int)quarter + " quarters");
		System.out.println((int)dime + " dimes ");
		System.out.println((int)nickel + " nickels");
		System.out.println((int)penny + " pennies");
	}
}
