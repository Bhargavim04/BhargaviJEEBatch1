package lab6;

import java.util.*;

public class Exercise4 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number of students");
		int s = sc.nextInt();
		System.out.println("Enter the Student Registration Number and Marks scored");
		HashMap<Integer, Integer> hm = new HashMap();
		for (int i = 0; i < s; i++) {
			int stuNum = sc.nextInt();
			int marks = sc.nextInt();
			hm.put(stuNum, marks);
		}

		HashMap<Integer, String> hm1 = new HashMap();

		for (int k1 : hm.values()) {
	
			if (k1 >= 90) {
				for (Map.Entry m : hm.entrySet()) {
					Object key = m.getKey();
					String str = key.toString();
					int k = Integer.parseInt(str);
					hm1.put(k, "GOLD");
				}
			} else if (k1 >= 80 && k1 < 90) {
				for (Map.Entry m : hm.entrySet()) {
					Object key = m.getKey();
					String str = key.toString();
					int k = Integer.parseInt(str);
					hm1.put(k, "SILVER");
				}
			} else if (k1 >= 70 && k1 < 80) {
				for (Map.Entry m : hm.entrySet()) {
					Object key = m.getKey();
					String str = key.toString();
					int k = Integer.parseInt(str);
					hm1.put(k, "BRONZE");
				}
			} else
				System.out.println("No medal for marks below 70");
		}
		for (Map.Entry m1 : hm1.entrySet()) {
			System.out.println("Registration Number:" + m1.getKey() + " Medal:" + m1.getValue());
		}

	}

}
