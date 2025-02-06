package ReviewPart1;

import java.util.Scanner;

public class Q1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("What's your name? ");
		String name = sc.next();
		System.out.print("How old are you? ");
		int age = sc.nextInt();
		System.out.printf("Hi, %s!%n", name);
		System.out.printf("You are %d years old.%n", age);
		sc.close();
	}

}
