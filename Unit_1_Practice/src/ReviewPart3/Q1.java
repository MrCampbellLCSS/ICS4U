package ReviewPart3;

import java.util.Scanner;

public class Q1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String user, password;	//store the user's information
		
		//Prompt the user for their username and save in uppercase
		System.out.print("Enter a username: ");
		user = sc.next();
		user = user.toUpperCase();
		
		//Prompt the user for an 8+ character password
		do {
			System.out.print("Enter a password that is at least 8 characters: ");
			password = sc.next();
			password = password.toLowerCase();
		} while (password.length() < 8);
		
		//Display username and password
		System.out.println("Your username is " + user + " and your password is "+ password + ".");
		sc.close();
	}

}
