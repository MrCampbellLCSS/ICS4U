package ReviewPart3;

import java.util.Random;
import java.util.Scanner;

public class Q7_12 {

	public static void main(String[] args) {
		// Q7
		int[] n = new int[5]; 
		n[3] = 7;
		
		//Q8
		String[] ducks = {"Donald", "Huey", "Dewey", "Louis"};
		
		// Q9
		Scanner sc = new Scanner(System.in);
		String[] friends = new String[3];
		for (int i = 0; i < friends.length; i++) {
			System.out.print("Enter a friend’s name: ");
			friends[i] = sc.next();
		}
		System.out.println("The names of your friends are:");
		for (int j = 0; j < friends.length; j++) System.out.println(friends[j]);
		
		// Q10
		int[] squares = new int[10];
		for (int i = 0; i < squares.length; i++) squares[i] = i * i;

		// Q11
		int[] numbers = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
		System.out.println("Countdown:");
		for (int i = numbers.length - 1; i >= 0; i--) System.out.println(numbers[i]);
		System.out.println("GO!");

		// Q12
		int[] nums = new int[25];
		Random rand = new Random();

		//fill array with random integers between 0-99
		for (int i = 0; i < nums.length; i++) {
			nums[i] = rand.nextInt(100);
		}
				
		//First, print out all the odd numbers
		System.out.print("ODD: ");
		for (int j = 0; j < nums.length; j++) {
			if (nums[j] % 2 == 1) {
				System.out.print(nums[j] + " ");
			}
		}
			
		//Now print out all the even numbers
		System.out.print("\nEVEN: ");
		for (int k = 0; k < nums.length; k++) {
			if (nums[k] % 2 == 0) {
				System.out.print(nums[k] + " ");
			}
		}

	}

}
