package Lab1;
import java.util.Scanner;
public class SumOfCubes {

	public static void main(String[] args) {
		int sum=0;
		System.out.println("Enter a Number");
		Scanner scan= new Scanner(System.in);
		int num=scan.nextInt();
		while(num!=0)
		{
			int num1=num%10;
			sum+=num1*num1*num1;
			num/=10;
		}
		System.out.println("The sum of cubes of digits of the given number is "+sum);
	}

}
