package Lab1;

import java.util.Scanner;

public class TestFibbo {
	int a = 1;
	int b = 1;
	int c = 0;
	int count;

	int input(int a) {
		count = a;
		count = fabo(count);
		return count;
	}

	int fabo(int count) {
		if (count != 2) {
			c = a + b;
			a = b;
			b = c;
			fabo(--count);
		}
		return c;
	}

	public static void main(String[] args) {
		System.out.println("Enter the number n to print the fibonacci series ");
		Scanner scan = new Scanner(System.in);
		short a = scan.nextShort();
		TestFibbo ob1 = new TestFibbo();
		long b = ob1.input(a);
		System.out.println("The " + a + "th number of the fibonacci series is " + b);

	}

}
