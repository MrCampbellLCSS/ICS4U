package ReviewPart2;

import java.util.Scanner;

public class Q3 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		//using a while loop
		System.out.print("Enter a number: ");
		int x = sc.nextInt();
		int sum = 0, count = 1;
		while (count <= x) {
			sum +=count;
			System.out.println(count);
			count++;
		}
		System.out.printf("The sum is: %d%n", sum);

		//using a for loop
		System.out.print("Enter a number: ");
		x = sc.nextInt();
		sum = 0;
		for (int i = 0; i <= x; i++) {
			System.out.println(i);
			sum += i;
		}
		System.out.printf("The sum is: %d%n", sum);

		sc.close();

	}

}
