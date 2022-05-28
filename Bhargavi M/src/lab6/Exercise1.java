package lab6;

import java.util.*;
//Create a method which accepts a hash map and 
//return the values of the map in sorted order as a List.
public class Exercise1 {

	public static HashMap<Integer, String> getValues(HashMap<Integer, String> hm) {
		List<Map.Entry<Integer, String>> list = new LinkedList(hm.entrySet());

		// Sort the list
		Collections.sort(list, new Comparator<Map.Entry<Integer, String>>() {
			public int compare(Map.Entry<Integer, String> o1, Map.Entry<Integer, String> o2)

			{
				return (o1.getValue()).compareTo(o2.getValue());
			}
		});

		// put data from sorted list to hashmap
		HashMap<Integer, String> temp = new LinkedHashMap();
		for (Map.Entry<Integer, String> hm1 : list) {
			temp.put(hm1.getKey(), hm1.getValue());
		}
		return temp;
	}

	public static void main(String[] args) {
		HashMap<Integer, String> hm = new HashMap();
		hm.put(105, "Python");
		hm.put(101, "C");
		hm.put(103, "Java");
		hm.put(102, "C++");

		Map<Integer, String> hm1 = getValues(hm);

		// print the sorted hashmap
		for (Map.Entry en : hm1.entrySet()) {
			System.out.println("Key = " + en.getKey() + ", Value = " + en.getValue());
		}

	}

}
