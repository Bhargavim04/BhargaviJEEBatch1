package lab9;

import java.util.Scanner;

//Write a method that uses lambda expression
//to format a given string, where a space is inserted between each character of string.

public class Exercise2 {

	@FunctionalInterface
	interface Intf {
		void space(String str);
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the String");
		String st = sc.next();

		Intf intf = (String str) -> {
			StringBuilder result = new StringBuilder();
			if (str.length() > 0) {
				result.append(str.charAt(0));
				for (int i = 1; i < str.length(); i++) {
					result.append(" ");
					result.append(str.charAt(i));
				}
			}
			System.out.println("After adding space in between string : " + result);
		};
		intf.space(st);

	}

}
