package lab3;

import java.util.Scanner;

public class Exercise2 {

	public static void main(String[] args) {
		Scanner scan= new Scanner(System.in);   
		System.out.print("Enter a string: ");  
		String str= scan.nextLine(); 
		StringBuffer sbf = new StringBuffer(str);
		StringBuffer sbf1= new StringBuffer(sbf);
		sbf1.reverse();
		sbf.append("|");
		sbf.append(sbf1);
        
        System.out.println("Mirror Image " + sbf);
	}

}
