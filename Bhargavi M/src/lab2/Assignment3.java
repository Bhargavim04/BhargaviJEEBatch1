package lab2;

import java.util.*;
import java.lang.*;
import java.io.*;

public class Assignment3 {

	public int reversDigits(int num) {
		int rev = 0;
		while (num != 0) {
			int remainder = num % 10;
			rev = rev * 10 + remainder;
			num = num / 10;
		}
		return rev;
	}

	public void getSorted(int arr[], int n) {
		int temp;
		int[] arr1 = new int[n];
		for (int i = 0; i < n; i++) {
			Assignment3 as = new Assignment3();
			arr1[i] = as.reversDigits(i);
		}
		for (int i = 0; i < arr1.length; i++) {
			for (int j = i + 1; j < arr1.length; j++) {
				if (arr1[i] > arr1[j]) {
					temp = arr1[i];
					arr1[i] = arr1[j];
					arr1[j] = temp;
				}
			}
		}
		for (int i = 0; i < arr1.length; i++) {
			System.out.print(arr1[i] + " ");
		}
	}

	public static void main(String[] args) {

		int n;
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the number of elements you want to store: ");
		n = scan.nextInt();
		int[] array = new int[10];
		System.out.println("Enter the elements of the array: ");
		for (int i = 0; i < n; i++) {
			array[i] = scan.nextInt();
		}
		System.out.println();
		Assignment3 as3 = new Assignment3();
		as3.getSorted(array, n);

	}

}
