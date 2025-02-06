package ReviewPart2;

import java.util.Scanner;

public class Q6 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int factorial = 1;
		System.out.print("Enter a number: ");
		int n = sc.nextInt();
		for (int i = 1; i <= n; i++) {
			factorial *= i;
		}
		System.out.println(n + "! = " + factorial);

		sc.close();
	}

}
