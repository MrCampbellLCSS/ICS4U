package ReviewPart3;

import java.util.Scanner;

public class Q6 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String first, last;	//save the user's name
		int group; //stores the group number
		
		//Prompt the user for their name
		System.out.print("Enter your first name: ");
		first = sc.next();
		System.out.print("Enter your last name: ");
		last = sc.next();
		sc.close();
		
		//Determine the user's group
		if (last.compareToIgnoreCase("J") < 0) group = 1;
		else if (last.compareToIgnoreCase("T") < 0) group = 2;
		else group = 3;
		
		//Display the result
		System.out.println(first + " " + last + " is assigned to Group " + group);
	}

}
