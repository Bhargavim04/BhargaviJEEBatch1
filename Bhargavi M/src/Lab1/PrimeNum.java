package Lab1;

import java.util.Scanner;
import java.lang.*;

public class PrimeNum {

	int count = 0;
	int arr[] = new int[100];

	void getPrime(int a) {
		arr[0] = 2;
		for (int i = 2; i < a; i++) {
			for (int j = 0; arr[j] != 0; j++) {
				if (i % arr[j] != 0) {
					if (count <= j) {
						arr[j + 1] = i;
						count++;
						break;
					}
				}
				if (i % arr[j] == 0) {
					break;
				}
			}
		}
	}

	void display() 
	{
		for (int i = 0; arr[i] != 0; i++)
		{
			System.out.print(arr[i]+" ");
		}
	}

	public static void main(String[] args) {
			
        System.out.println("Enter the number upto which you want to print the prime number : ");
        Scanner ob = new Scanner(System.in);
        int a=ob.nextInt();
        PrimeNum ob1 = new PrimeNum();
        ob1.getPrime(a);
        ob1.display();

	}

}
