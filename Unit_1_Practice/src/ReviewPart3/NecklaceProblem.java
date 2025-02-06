package ReviewPart3;
import java.util.Scanner;
public class NecklaceProblem {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in );
		int a, b;	//stores the first 2 numbers in necklace
		int steps = 0;	//count the number of steps
		int x,y,z;	//for calculating the necklace sequence
		
		//Prompt the user for the start of the necklace
		System.out.print("Enter the first number: ");
		a = input.nextInt();
		System.out.print("Enter the second number: ");
		b = input.nextInt();
		input.close();
		
		System.out.println();
		
		/* 
		 * Calculate and display the digits in the necklace
		 * Keep track of how many steps it takes to close
		 */
		System.out.printf("Necklace: %d %d ",a,b);
		x = a;
		y= b;
		do {
			steps++;	// count the step
			z = (x + y)%10;	//calculate the next value, ensuring we only take the ones digit
			System.out.print(z + " ");
			//update values of x and y
			x = y;
			y = z;
		} while (!(x == a && y == b));
		
		System.out.println();
		System.out.printf("It took %d step(s) to close the necklace%n", steps);
	}

}
