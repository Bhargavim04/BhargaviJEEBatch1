package lab9;

import java.util.Scanner;
import java.util.function.Predicate;

//Write a method that uses lambda expression to accept username and password and return true or false. 
//If password is less that 8 characters then it will return false otherwise true.

public class Exercise3 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Username");
		String name = sc.next();
		System.out.println("Enter the Password");
		String pwd = sc.next();
		int len = pwd.length();
		Predicate<Integer> p = (Integer leng) -> leng >= 8 ? true : false;
		System.out.println(p.test(len));

	}

}
