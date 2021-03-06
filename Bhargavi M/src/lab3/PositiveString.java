package lab3;

import java.util.Arrays;
import java.util.Scanner;
//Create a method that accepts a String and checks if it is a positive string.
//A string is considered a positive string, if on moving from left to right each character in
//the String comes after the previous characters in the Alphabetical order.
//For Example: ANT is a positive String (Since T comes after N and N comes after A). 
//The method should return true if the entered string is positive
public class PositiveString {

	static boolean isPositiveStr(String s)
    {
        // length of the string
        int n = s.length();
       
        // create a character array
        // of the length of the string
        char c[] = new char [n];
       
        // assign the string
        // to character array
        for (int i = 0; i < n; i++) {
            c[i] = s.charAt(i);
        }
       
        // sort the character array
        Arrays.sort(c);
       
        // check if the character array
        // is equal to the string or not
        for (int i = 0; i < n; i++)
            if (c[i] != s.charAt(i)) 
                return false;
               
        return true;    
    }
	public static void main(String[] args) {
		String str1;
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the String");
		str1=scan.nextLine();
		if (isPositiveStr(str1))
	           System.out.println("True");
	        else
	            System.out.println("False");
		

	}

}
