package Lab1;

import java.util.Scanner;

public class Assignment8 {

	public static void checkNumber(int n){
        boolean isPowOfTwo = true;
        int num = n;
        while(n>1){
            if(n%2!=0)
                isPowOfTwo = false;
            n=n/2;
        }
        if(isPowOfTwo)
            System.out.println("Given number " + num + " is power of 2");
        else
            System.out.println("Given number " + num + " is not power of 2");
    }
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
        System.out.println("Enter a number to check");
        int num = scan.nextInt();
        checkNumber(num);
	}

}
