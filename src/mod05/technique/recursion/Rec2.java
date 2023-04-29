package mod05.technique.recursion;

import java.util.Scanner;

/*
 * 
 * 
 * 
 *18.13 (Find the largest number in an array) Write a recursive method that 
 *returns the largest integer in an array. Write a test program that 
 *prompts the user to enter a list of eight integers and displays the largest element.
 * 
 * 
 */
public class Rec2 {

	public static void main() {

		Scanner input = new Scanner(System.in);
		System.out.print("Enter eight integers: ");
		int[] list = new int[8];
		for (int i = 0; i < list.length; i++) {
			list[i] = input.nextInt();
		}
		input.close();
		System.out.println("The largest element is " + max(list));
	}
 

	public static int max(int[] list) {
		int max = list[list.length - 1];
		int index = list.length - 1;
		return max(list, index, max);
	}

	private static int max(int[] list, int index, int max) {
		if (index < 0)
			return max;
		else if (list[index] > max) {
			return max(list, index - 1, list[index]);
		} else
			return max(list, index - 1, max);
	}
}
