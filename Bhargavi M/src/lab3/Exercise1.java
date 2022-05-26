package lab3;

import java.util.Scanner;
import java.util.StringTokenizer;
//Write a Java program that reads a line of integers and
//then displays each integer and the sum of all integers. (Use String Tokenizer class)?
public class Exercise1 {

	public static void main(String[] args) {
		int n;
        int sum = 0;
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter integers with one space gap:");
        String s = scan.nextLine();
        StringTokenizer stoken = new StringTokenizer(s, " ");
        while (stoken.hasMoreTokens()) {
            String temp = stoken.nextToken();
            n = Integer.parseInt(temp);
            System.out.println(n);
            sum = sum + n;
        }
        System.out.println("sum of the integers is: " + sum);
        scan.close();

	}

}
