package lab3;

import java.util.Scanner;

public class Exercise4 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the number");
		int num= scan.nextInt();
		//convert primitive to object
		Integer num1= Integer.valueOf(num);
		//convert int to string
		String str= num1.toString();
		Integer num2= new Integer(0);
		int diff;
		StringBuffer sbf = new StringBuffer();
		for(int i=0;i<str.length();i++) {
			int a = Character.getNumericValue(str.charAt(i));
			int a1 = Character.getNumericValue(str.charAt(i+1));
			diff=a1-a;
			if(diff<0)
			diff=a-a1;
			sbf.append(diff);
			//num2 = Integer.parseInt(sbf.toString());
		}
		StringBuffer sbf1 = new StringBuffer();
		int j=sbf1.lastIndexOf(str);
		sbf.append(j);
		//Integer num3;
		//num3 = Integer.parseInt(sbf.toString());
		String str1 = new String(sbf);
		System.out.println(str1);
		
		
	}

}
