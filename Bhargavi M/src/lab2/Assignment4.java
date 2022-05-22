package lab2;

import java.util.Arrays;
import java.util.Scanner;

public class Assignment4 {

	static void modifyArray(int[] my_array)
    {
        
        //Assuming all elements in input array are unique
         
        int n = my_array.length;
         
        //Comparing each element with all other elements
         
        for (int i = 0; i < n; i++) 
        {
            for (int j = i+1; j < n; j++)
            {
                //If any two elements are found equal
                 
                if(my_array[i] == my_array[j])
                {
                    //Replace duplicate element with last unique element
                     
                    my_array[j] = my_array[n-1];
                     
                    n--;
                     
                    j--;
                }
            }
        }
         
        //Copying only unique elements of my_array into array1
         
        int[] array1 = Arrays.copyOf(my_array, n);
         
        System.out.println();
         
        //Descending order
        for (int i = 0; i < array1.length; i++) {   
            for (int j = i+1; j < array1.length; j++) {   
               if(array1[i] < array1[j]) {  
                   int temp = array1[i];  
                   array1[i] = array1[j];  
                   array1[j] = temp;  
               }   
            }   
        }
        System.out.println("Array ");
        
        for (int i = 0; i < array1.length; i++)
        {
            System.out.print(array1[i]+"\t");
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
		Assignment4 as4 = new Assignment4();
		as4.modifyArray(array);
	}

}
