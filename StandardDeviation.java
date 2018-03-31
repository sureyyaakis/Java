import java.util.Scanner;

public class MeanAndStrdDev 
{
	public static void main(String[] args)
	{
		Scanner input = new Scanner(System.in);
		System.out.println("Enter 10 numbers: ");
		double number = 0; 
		double total = 0;
		double dev = 0;
		
		for (int i=0; i<10; i++)
		{
			number = input.nextDouble();
			total += number; 
			dev += number * number;
		}
		System.out.printf("The mean is %.2f\n", (total / 10));
		dev = Math.sqrt(((dev -((total * total) / 10)) / 9)); 
		System.out.printf("The standard deviation id %f", dev);
		
		input.close();
			
	}
}
