package ReviewPart1;

import java.util.Scanner;

public class Q3 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int secret = 14;
		System.out.print("Guess a number between 1 and 20: ");
		int guess = sc.nextInt();
		if (guess == secret) System.out.println("just right");
		else if (guess > secret) System.out.println("too high");
		else System.out.println("too low");

		sc.close();
	}

}
