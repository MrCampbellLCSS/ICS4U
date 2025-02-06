package ReviewPart2;

import java.util.Scanner;

public class Q4 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.print("Enter an integer between 1 and 100: ");
		int factor = sc.nextInt();
		System.out.printf("The multiples of %d are:%n", factor);
		for (int n = 1; n <= 100; n++) {
			if (n%factor == 0) System.out.println(n);
		}

		sc.close();
	}

}
