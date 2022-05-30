package lab6;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Exercise5 {
		
	public static int getSecondSmallest(Integer[] a) {
		List<Integer> list=Arrays.asList(a);  
		Collections.sort(list);  
		int element=list.get(1);  
		return element; 
		
	}

	public static void main(String[] args) {
		
		
		Integer arr[]={1,2,5,6,3,2};  
		
		System.out.println("Second Smallest: "+getSecondSmallest(arr)); 
		
		
	}

}
