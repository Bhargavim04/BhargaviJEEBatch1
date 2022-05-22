package Lab1;
import java.util.Scanner;

public class TrafficLight {

	public static void main(String[] args) {
		int i;
		Scanner scan= new Scanner(System.in);
		System.out.println("Choose Traffic Signal using Number");
		System.out.println("1) RED");
		System.out.println("2) YELLOW");
		System.out.println("3) GREEN");
		i=scan.nextInt();
		
		switch(i)
		{
		case 1:
			System.out.println("STOP");
			break;
		case 2: System.out.println("READY");
				break;
		case 3: System.out.println("GO");
				break;
				
		}

	}

}
