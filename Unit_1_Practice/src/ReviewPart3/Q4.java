package ReviewPart3;

import java.util.Scanner;

public class Q4 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String phrase;	//user's text
		int vowels = 0;	//counts vowels in text
		
		//Prompt the user for a piece of text
		System.out.print("Enter text: ");
		phrase = sc.nextLine();	//Make sure you use nextLine() and not next() here
		phrase = phrase.toLowerCase();
		
		//Count the vowels in the text
		for (int i = 0; i < phrase.length(); i++) {
			if ((phrase.charAt(i) == 'a') || (phrase.charAt(i) == 'e') || (phrase.charAt(i) == 'i') || (phrase.charAt(i) == 'o') || (phrase.charAt(i) == 'u')) vowels++;
		}
		
		//Display the total number of vowels in the program
		System.out.println("The number of vowels in " + phrase + " is " + vowels);
		sc.close();
		
		/**********************************************
		 * Alternative Solution
		 **********************************************/
//		Scanner sc = new Scanner(System.in);
//		String phrase;	//user's text
//		int vowels = 0;	//counts vowels in text
//		
//		//Prompt the user for a piece of text
//		System.out.print("Enter text: ");
//		phrase = sc.nextLine();	//Make sure you use nextLine() and not next() here
//		
//		char[] letters = phrase.toLowerCase().toCharArray();
//		
//		//Count the vowels in the text
//		for (int i = 0; i < letters.length; i++) {
//			if ((letters[i] == 'a') || (letters[i] == 'e') || (letters[i] == 'i') || (letters[i] == 'o') || (letters[i] == 'u')) vowels++;
//		}
//		
//		//Display the total number of vowels in the program
//		System.out.println("The number of vowels in " + phrase + " is " + vowels);
//		sc.close();
	}

}
