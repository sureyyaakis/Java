// Sureyya Betul Akis
/* Write an application to accept an integer number and a double number from the user, 
 * then shows an output of same result after dividing each by 5.
Example:   inputting: 3 and 3.0    outputting:    0.6 and 0.6 */

import java.util.Scanner;

class SameValues {
	
    public static void main(String[] args) {
    	int num1;
        double num2;
    	Scanner input = new Scanner(System.in);

        
        
        System.out.print("Enter an Integer number: ");
        num1 = input.nextInt();

        System.out.print("Enter a double number: ");
        num2 = input.nextDouble();
               
      

        System.out.println("divided by 5: " + ((double)num1/5));
        // we took the number as a integer but in the assignment it says result be 0.6 (double).
        // I searched and I found casting. 

        System.out.println("divided by 5: " + (num2/5));

    }
}

