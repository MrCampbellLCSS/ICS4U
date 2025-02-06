package ReviewPart3;

import java.util.Scanner;

public class Q5 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String phrase;	//user's text
		int words = 1;	//counts words in text - base case is 1 word
		
		//Prompt the user for a piece of text
		System.out.print("Enter text: ");
		phrase = sc.nextLine();	//Make sure you use nextLine() and not next() here
		phrase = phrase.toLowerCase();
		
		//Count the words in the text
		for (int i = 0; i < phrase.length(); i++) {
			if (phrase.charAt(i) == ' ') words++;
		}
		
		//Display the total number of vowels in the program
		System.out.println("The number of words in " + phrase + " is " + words);
		sc.close();
		
//		// Alternative Solution
//		Scanner sc = new Scanner(System.in);
//		String phrase;	//user's text
//				
//		//Prompt the user for a piece of text
//		System.out.print("Enter text: ");
//		phrase = sc.nextLine();	//Make sure you use nextLine() and not next() here
//		String[] words = phrase.split(" ");
//		
//		//Display the total number of words in the program
//		System.out.println("The number of words in " + phrase + " is " + words.length);
//		sc.close();
	}

}
