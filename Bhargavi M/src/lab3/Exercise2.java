package lab3;

import java.util.Scanner;

//Create a class containing a method to create the mirror image of a String. 
//The method should return the two Strings separated with a pipe(|) symbol 
public class Exercise2 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.print("Enter a string: ");
		// read the string
		String str = scan.nextLine();

		StringBuffer sbf = new StringBuffer(str);
		StringBuffer sbf1 = new StringBuffer(sbf);
		// reverse the string
		sbf1.reverse();
		sbf.append("|");

		sbf.append(sbf1);

		System.out.println("Mirror Image " + sbf);
	}

}
