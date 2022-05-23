package Lab1;

import java.util.Scanner;
//Create a method to check if a number is an increasing number
public class Assignment7 {

	public static void  checkNumber(int num)
    {
        int temp = num;
        
        int dig = temp%10;
        temp=temp/10;
        
        boolean flag = true;
        
        while(temp>0)
        {
            if(dig<=temp%10)
            {
                flag = false;
                break;
            }
            dig = temp%10;
            temp=temp/10;
        }
        if(flag)
            System.out.println(num+" digits are in ascending order");
        else
            System.out.println(num+" digits are not in ascending order");
    }
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
        System.out.println("Enter a number to check");
        int num = scan.nextInt();
        checkNumber(num);

	}

}
