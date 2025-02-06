package ReviewPart2;

public class Q2 {

	public static void main(String[] args) {
		//using a while loop
		int guessMe = 8, number = 1;
		do {
			if (number == guessMe) {
				System.out.println("found it!");
				break;
			} else if (number < guessMe) {
				System.out.println("too low");
			} else {
				System.out.println("oops.");
				break;
			}
			number += 1;
		} while (number <= guessMe);
		
		//using a for loop - using num instead of number to avoid errors
		guessMe = 8;
		for (int num = 1; num <= guessMe; num++) {
			if (num == guessMe) {
				System.out.println("found it!");
				break;
			} else if (num < guessMe) {
				System.out.println("too low");
			} else {
				System.out.println("oops.");
				break;
			}
		}
	}

}
