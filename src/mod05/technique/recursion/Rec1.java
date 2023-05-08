package mod05.technique.recursion;

import java.util.Scanner;

/* 
* *18.10 (Occurrences of a specified character in a string) Write a recursive
* method that finds the number of occurrences of a specified letter in a string
* using the following method header: public static int count(String str, char
* a) For example, count("Welcome", 'e') returns 2. Write a test program that
* prompts the user to enter a string and a character, and displays the number
* of occurrences for the character in the string. 
*/


public class Rec1 {
	public static int count(String str, char a) {
		if (str.length() == 0) {
			return 0;
		}

		int count = count(str.substring(1), a);
		if (str.charAt(0) == a) {
			count++;
		}
		return count;
	}

	public static void main() {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter a string: ");
		String str = input.nextLine();
		System.out.println("Enter a character: ");
		char a = input.next().charAt(0);
		int count = count(str, a);
		System.out.println("The number of occurrences of " + a + " in " + str + " =   ["+count+"]");
	}
 
}
