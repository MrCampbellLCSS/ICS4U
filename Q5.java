package ReviewPart1;

import java.util.Scanner;

public class Q5 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		boolean small, green;
		System.out.print("Do you want to eat something small? true or false: ");
		small = sc.nextBoolean();
		System.out.print("Do you want to eat something green? true or false: ");
		green = sc.nextBoolean();
		
		if (small && green) System.out.println("You should eat a pea.");
		else if (small && !green) System.out.println("You should eat a cherry.");
		else if (!small && green) System.out.println("You should eat a watermelon.");
		else System.out.println("You should eat a pumpkin.");

		sc.close();
	}

}
