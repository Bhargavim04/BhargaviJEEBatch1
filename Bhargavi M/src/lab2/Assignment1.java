package lab2;
import java.util.Scanner;
//Create a method which accepts an array of integer 
//elements and return the second smallest element in the array
public class Assignment1 {

	public int getSecondSmallest(int[] a,int total)
	{  
		int temp;  
		for (int i = 0; i < total; i++)   
		        {  
		            for (int j = i + 1; j < total; j++)   
		            {  
		                if (a[i] > a[j])   
		                {  
		                    temp = a[i];  
		                    a[i] = a[j];  
		                    a[j] = temp;  
		                }  
		            }  
		        }  
		       return a[1];
		}  
	public static void main(String[] args) {
		int n; 
		Scanner scan=new Scanner(System.in);  
		System.out.println("Enter the number of elements you want to store: ");   
		n=scan.nextInt(); 
		int[] array = new int[10];  
		System.out.println("Enter the elements of the array: ");  
		for(int i=0; i<n; i++)  
		{   
		array[i]=scan.nextInt();  
		}  
		System.out.println();
		Assignment1 as= new Assignment1();
		System.out.println("Second smallest: "+as.getSecondSmallest(array,n)); 
	}

}
