package Lab1;

import java.util.Scanner;

public class Assignment6 {
	
	
	public int calculateDifference(int num) {
		//sumOfSquares
		int sum2 = 0;
		for (int i = 1; i <num+1; i++) {
			sum2 += i * i;
		}
		//squareOfSum
		int sum1 = 0;
		sum1 = num * (1 + num) / 2;
		sum1 = sum1 * sum1;
		
		int sum=sum1-sum2;
		return sum;
		
	}

	public static void main(String[] args) {
		int n;
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter a number : ");
		n = scan.nextInt();
		Assignment6 as=new Assignment6();
		System.out.println(as.calculateDifference(n));


	}

}
