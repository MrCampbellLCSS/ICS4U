package ReviewPart4;

import java.util.*;

public class Q1_to_10 {
	
	//Global Variables
	Scanner input = new Scanner(System.in);

	/**
	 * Draws a line of a given number of symbols
	 * @param length	The number of $ symbols in the line
	 */
	static void drawBar(int length) {
		for (int i = 0; i < length; i++) {
			System.out.print("$");
		}
		System.out.println();
	}//end drawBar(int)
	
	
	/**
	 * Draws a line consisting of a given number of symbols
	 * @param length	The number of symbols in the line
	 * @param symbol	The symbol used to draw the line
	 */
	static void drawBar(int length, String symbol) {
		for (int i = 0; i < length; i++) {
			System.out.print(symbol);
		}
		System.out.println(); 
	}//end drawBar(int, String)
	
	
	/**
	 * Draws a box
	 * @param length	The length of the box
	 * @param width		The width of the box
	 */
	static void drawBox(int length, int width) {
		for (int i = 0; i < width; i++) {
			drawBar(length);
		}
	}//end drawBox(int, int)

	
	/**
	 * Draws a box using a specific symbol
	 * @param length	The box's length
	 * @param width		The box's width
	 * @param symbol	The symbol used to draw the box
	 */
	static void drawBox(int length, int width, String symbol) {
		//Draw the top of the box
		drawBar(length, symbol);
		//draw the outline for the middle of the box
		for (int i = 1; i < width-1; i++) {
			int spaces = length -2;
			System.out.print(symbol);
			for (int j = 0; j < spaces; j++) {
				System.out.print(" ");
			}
			System.out.println(symbol);
		}
		//draw the bottom of the box
		drawBar(length, symbol);
	}//end drawBar(int, int, String)
	
	
	/**
	 * Draw the roof of the house
	 */
	static void addRoof() {
		System.out.println("   /\\   ");
		System.out.println("  /  \\  ");
		System.out.println(" /    \\ ");
		System.out.println("/______\\");
	}//end addRoof()
		
	
	/**
	 * Draw the base of the house
	 */
	static void addBase() {
		System.out.println("|      |");
		System.out.println("|      |");
		System.out.println("|______|");
	}//end addBase()
		
	
	/**
	 * Draw the walkway of the house
	 */
	static void addWalkway() {
		System.out.println("   **");
		System.out.println("   **********");
	}//end addWalkway()
	

	/**
	 * Prompts the user for their tests scores and calculates their
	 * average score.
	 * @param numTest	The integer number of test scores to prompt 
	 * 				the user for
	 * @return		Returns the double average test score for all tests
	 */

	double average(int numTest) {
		double total = 0.0;
		for (int i = 0; i < numTest; i++) {
			System.out.print("Enter a test score: ");
			double score = input.nextDouble();
			total += score;
		}
		double avg = total / (double)numTest;
		return avg;
	}//end average(int)

	
	/**
	 * Simulates choosing a random playing card from a deck of 52 cards.
	 * A = 1, J = 11, Q = 12, K = 13. Hearts are 1 - 13, Diamonds are 14 - 26, 
	 * Clubs are 27 - 39, and Spades are 40 - 52.
	 * @return		Returns the integer that corresponds to the random card.
	 */
	int getCard() {
		int card = (int)((Math.random() * 52) + 1);
		return card;
	}//end getCard()
	
	
	/**
	 * Calculates a number raised to the power of 4
	 * @param x	The double number to raise to the power of 4
	 * @return 	The double value of x^4
	 */

	double powerOfFour(double x) {
		double answer = x * x * x * x;
		return answer;
	}//end powerOfFour()


	/**
	 * Takes an integer from 1 to 10 and returns the Spanish word for it.
	 * @param number		The integer to translate into Spanish
	 * @return		The Spanish word for the number, or Error if not 1-10
	 */
	static String translate(int number) {
		switch(number) {
		case 1: return "uno";
		case 2: return "dos";
		case 3: return "tres";
		case 4: return "cuatro";
		case 5: return "cinco";
		case 6: return "seis";
		case 7: return "siete";
		case 8: return "ocho";
		case 9: return "nueve";
		case 10: return "diez";
		default: return "Error";
		}
	}


	public static void main(String[] args) {
		addRoof();
		addBase();
		addWalkway();
	}

}
