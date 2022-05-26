package lab5;

import java.util.Scanner;

public class E1ValidateAge {

	public static void main(String[] args) throws E1InvalidAge {
		
		System.out.println("Enter the Age of the person: ");
		Scanner scan = new Scanner(System.in);
		int age = scan.nextInt();
		if(age<15) {
			throw new E1InvalidAge("Enter age greater than 15");
		}
	}

}
