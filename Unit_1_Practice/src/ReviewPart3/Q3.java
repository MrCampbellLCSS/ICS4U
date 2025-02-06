package ReviewPart3;

import java.util.Scanner;

public class Q3 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String phrase;	//stores the user's string
		
		//Prompt the user for a string that is at least 8 characters long
		do {
			System.out.print("Enter a string at least 8 characters long: ");
			phrase = sc.next();
		} while (phrase.length() < 8);
		
		//Determine and print the first 3 characters
		int length = phrase.length();
		System.out.println("The first 3 characters are: " + phrase.substring(0, 3));
		
		//Determine and print the last 3 characters
		System.out.println("The last 3 characters are: " + phrase.substring(length - 3));
		//Determine and print the middle 3 characters
		int middle = length/2;
		System.out.println("The middle 3 characers are: " + phrase.substring(middle-1, middle+2));
		sc.close();
	}

}
