package lab6;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

public class Exercise6 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number of people");
		int s = sc.nextInt();
		System.out.println("Enter the voter ID Number and Birth year");
		HashMap<Integer, Integer> hm = new HashMap();
		for (int i = 0; i < s; i++) {
			int voterId = sc.nextInt();
			int year = sc.nextInt();
			hm.put(voterId, year);
		}
		List<Integer> list = new ArrayList();
		for (int k1 : hm.values()) {
			int age=2022-k1;
			if (age >18) {
				for (Map.Entry m : hm.entrySet()) {
					Object key = m.getKey();
					String str = key.toString();
					int k = Integer.parseInt(str);
					list.add(k);
				}
			} else {
				System.out.println("Not Eligible to Vote");
			}
				
		}
		System.out.println("The list of voter Id eligible are : "+list);

	}

}
