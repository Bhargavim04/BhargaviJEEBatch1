package lab2;

import java.util.Arrays;
import java.util.Scanner;
//Create a method that can accept an array of String objects and sort in alphabetical order. 
//The elements in the left half should be completely in uppercase and the elements in the right half should be completely in lower case. Return the resulting array.
public class Assignment2 {
	public static void sortString(String[] str1)
	{  
		Arrays.sort(str1);
        
        for (int i=0;i<str1.length;i++)
        {
        	System.out.print(str1[i]+" ");
        }
		}  
	

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the number of string elements you want to add to array "); 
	    int m = scan.nextInt();
	    String str[] = new String[m];
	    System.out.println("Enter the elements of the array: "); 
	    for(int i=0;i<m;i++)
	    {
	        String s = scan.nextLine();
	        str[i]=s;
	    }
	    Assignment2 as2=new Assignment2();
	    as2.sortString(str);

	}

}
