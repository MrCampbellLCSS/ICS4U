package ReviewPart3;

import java.util.Scanner;

public class Q2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String first, middle, last;	//store the user's information
		
		//Prompt the user for their name
		System.out.print("Enter your first name: ");
		first = sc.next().toLowerCase();
		System.out.print("Enter your middle name: ");
		middle = sc.next().toUpperCase();
		System.out.print("Enter your last name: ");
		last = sc.next().toLowerCase();
		
		//Create and display the monogram
		String monogram = first.substring(0,1) + middle.substring(0,1) + last.substring(0,1);
		System.out.println("Your monogram is: " + monogram);
		//Using charAt() instead of substring()
		System.out.print("Your monogram is: " );
		System.out.print(first.charAt(0));
		System.out.print(middle.charAt(0));
		System.out.println(last.charAt(0));
		sc.close();
	}

}
