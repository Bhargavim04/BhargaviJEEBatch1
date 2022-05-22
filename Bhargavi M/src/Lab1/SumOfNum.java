package Lab1;

import java.util.Scanner;

public class SumOfNum {

	static int calculateSum(int N) {
		int S1, S2, S3;
		int X = 3;
		int Y = 5;
		int num;

		S1 = ((N / X)) * (2 * X + (N / X - 1) * X) / 2;
		S2 = ((N / Y)) * (2 * Y + (N / Y - 1) * Y) / 2;
		S3 = ((N / (X * Y))) * (2 * (X * Y) + (N / (X * Y) - 1) * (X * Y)) / 2;

		num = S1 + S2 - S3;
		return num;
	}

	public static void main(String[] args) {

		int n;
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter a number : ");
		n = scan.nextInt();

		System.out.println(calculateSum(n));

	}

}
