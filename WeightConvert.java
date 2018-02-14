// Sureyya Betul Akis
// Write a program that converts pounds into kilograms
// One pound is 0.454 kilograms.

import java.util.Scanner;

class WeightConvert {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("Enter a number in pounds: ");
		double pounds = input.nextDouble();
		
		double kilograms = pounds * 0.454;
		System.out.print(pounds + " pounds is " + kilograms + " kilograms");	
	}
}