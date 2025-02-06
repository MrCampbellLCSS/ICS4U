package ReviewPart2;

import java.util.Scanner;

public class Q5 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int score = 0, total = 0, numScore = 0;
		do{
			System.out.print("Enter a test score [999 to quit]: ");
			score = sc.nextInt();
			
			if (score == 999) continue;
			else {
				total += score;
				numScore++;
			}
		}while (score != 999);
		double average = (double)total / (double)numScore;
		System.out.printf("Your average test score is %f%%.", average);
		
		sc.close();
	}

}
