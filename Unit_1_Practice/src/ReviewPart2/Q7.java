package ReviewPart2;

import java.util.Scanner;

public class Q7 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a number: ");
		int number = sc.nextInt();
		boolean prime = true;	//assume the number is prime, then try to show its not
		int count = 2;	//we don't need to check for a factor of 1

		//using a while loop

		/* We only need to check factors up to the square root of number (otherwise we are double-checking factors) */
		while (count < (int)Math.sqrt(number)) {
			//If number divides easily by count, then count if a factor and number is NOT prime
			if (number % count == 0) {
				prime = !prime;
				break;
			}
			count++;
		}

		if (prime) System.out.println("This value is prime.");
		else System.out.println("This number is not prime.");

		//using a for loop - same principle, just different looping structure
		prime = true;
		for (int f = 2; f < (int)Math.sqrt(number); f++) {
			if (number % f == 0) {
				prime = !prime;
				break;
			}
		}

		if (prime) System.out.println("This value is prime.");
		else System.out.println("This number is not prime.");

		sc.close();
	}

}
