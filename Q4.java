package ReviewPart1;

import java.util.Scanner;

public class Q4 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter your grade for this class: ");
		int grade = sc.nextInt();
		grade = grade / 10;
		
		switch(grade) {
		case 0:
		case 1:
		case 2:
		case 3:
		case 4: System.out.println("You have an F in this class"); break;
		case 5: System.out.println("You have an E in this class"); break;
		case 6: System.out.println("You have an D in this class"); break;
		case 7: System.out.println("You have an C in this class"); break;
		case 8: System.out.println("You have an B in this class"); break;
		case 9:
		case 10: System.out.println("You have an A in this class"); break;
		default: System.out.println("Something went wrong."); 
		}
		
		/* 
		 * Using the arrow delimiter instead of colon + break command in the switch statement 
		    switch(grade) {
			case 0, 1, 2, 3, 4 -> System.out.println("You have an F in this class");
			case 5 -> System.out.println("You have an E in this class");
			case 6 -> System.out.println("You have an D in this class");
			case 7 -> System.out.println("You have an C in this class");
			case 8 -> System.out.println("You have an B in this class");
			case 9, 10 -> System.out.println("You have an A in this class");
			default -> System.out.println("Something went wrong."); 
			}
		*/

		sc.close();
	}

}
