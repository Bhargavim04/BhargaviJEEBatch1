package lab5;

import java.util.Scanner;

public class E2ValidateName {

	public static void main(String[] args) throws E2InvalidName {
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter First Name");
		String firstName = scan.nextLine();
		
		System.out.println("Enter Second Name");
		String secondName = scan.nextLine();
		
		if(firstName.length()==0 || secondName.length()==0 ) {
			throw new E2InvalidName("Name not valid");
		}
		else {
			System.out.println("Your Name is Valid");
		}

	}

}
