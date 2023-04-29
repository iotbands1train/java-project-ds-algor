package mod08.designAlgorithms;

import java.util.Scanner;

public class GCD_Euclid {
	  /** Main method */
 
	  /** Main method */
	  public static void main() {
	    // Create a Scanner
	    Scanner input = new Scanner(System.in);

	    // Prompt the user to enter two integers
	    System.out.print("Enter first integer: ");
	    int m = input.nextInt();
	    System.out.print("Enter second integer: ");
	    int n = input.nextInt();

	    System.out.println("The greatest common divisor for " + m +
	      " and " + n + " is " + gcd(m, n));
	  }
	  /** Find gcd for intergers m and n */
	  public static int gcd(int m, int n) {
	    if (m % n == 0)
	      return n;
	    else
	      return gcd(n, m % n);
	  }

}