package ReviewPart1;

import java.util.Scanner;

public class Q2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("How old are you? ");
		int age = sc.nextInt();
		if (age >= 18) {
			System.out.println("You can vote.");
		} else {
			System.out.println("You cannot vote.");
		}
		
		sc.close();


	}

}
