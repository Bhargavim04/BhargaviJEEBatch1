package lab9;

import java.util.Scanner;

//Write a lambda expression which accepts x and y numbers and return x pow y.

public class Exercise1 {

	@FunctionalInterface
	interface Intf1 {
		void power(int x, int y);
	}

	public static void main(String[] args) {
		int x, y;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Number1");
		x = sc.nextInt();
		System.out.println("Enter the Number2");
		y = sc.nextInt();

		Intf1 intf1 = (int a, int b) -> {

			double result = Math.pow(a, b);
			System.out.println(a + "  Power  " + b + " = " + result);
		};

		intf1.power(x, y);
	}

}
