package ReviewPart4;

import java.util.Scanner;

public class ImprovedSimpleCalculator {

	/**
	 * Adds two integers
	 * @param x	The first integer
	 * @param y	The second integer
	 * @return	The sum of x and y
	 */
	static int add(int x, int y) {
		return x + y;
	}//end add(int, int)
	
	
	/**
	 * Subtracts two integers
	 * @param x	The first integer
	 * @param y	The second integer
	 * @return	The difference of x and y
	 */
	static int subtract(int x, int y) {
		return x - y;
	}//end add(int, int)
	
	
	/**
	 * Adds two floating point numbers
	 * @param x	The first double
	 * @param y	The second double
	 * @return	The sum of x and y
	 */
	static double add(double x, double y) {
		return x + y;
	}//end add(double, double)
	
	
	/**
	 * Subtracts two floating point numbers
	 * @param x	The first double
	 * @param y	The second double
	 * @return	The difference of x and y
	 */
	static double subtract(double x, double y) {
		return x + y;
	}//end add(double, double)
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Set up input stream and answer variable
		Scanner input = new Scanner(System.in);
		double answer;
		
		//Menu
		System.out.println("Welcome to the Simple Calculator!");
		System.out.println("Which operation would you like to perform?");
		System.out.println("1. Add integers\t\t3. Subtract integers");
		System.out.println("2. Add decimals\t\t4. Subtract decimals");
		
		//Prompt the user for their choice of operation and 2 numbers
		System.out.print("Your choice: ");
		int choice = input.nextInt();
		System.out.print("Enter the first number: ");
		double x = input.nextDouble();
		System.out.print("Enter the second number: ");
		double y = input.nextDouble();

		//Perform the correct operation and display the result
		switch(choice) {
		case 1: answer = add((int)x,(int)y); break;
		case 2: answer = add(x,y); break;
		case 3: answer = subtract((int)x,(int)y); break;
		case 4: answer = subtract(x,y); break;
		default: answer = 0.0;
		}
		
		//Display the result
		System.out.println("The answer is: " + answer);
		input.close();
	}

}

