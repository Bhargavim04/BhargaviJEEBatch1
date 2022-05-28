package lab6;
import java.util.*;
//Create a method which accepts an array of numbers and
//returns the numbers and their squares in Hashmap
public class Exercise3 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the number of elements you want to add to array");
		int n=scan.nextInt();
		//create a ArrayList
		ArrayList<Integer> al = new ArrayList<Integer>();
		System.out.println("Enter the array elements");
		for(int i=0;i<n;i++) {
			int j=scan.nextInt();
			al.add(j);
		}
		
		HashMap<Integer, Integer> hm = new HashMap();
		for(int j=0;j<al.size();j++) {
			int key=al.get(j);
			int val=key*key;
			hm.put(key, val);
		}
		System.out.println("Entered Numbers with its squares");
		for (Map.Entry m : hm.entrySet()) {
			System.out.println(m.getKey() + "   " + m.getValue());
		}
		
	}

}
