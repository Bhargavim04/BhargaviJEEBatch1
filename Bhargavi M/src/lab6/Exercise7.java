package lab6;
import java.util.*;
import java.util.stream.Collectors;

public class Exercise7 {

	static void reverse(Integer a[])
    {
        Collections.reverse(Arrays.asList(a));
        System.out.println(Arrays.asList(a));
        
    }
	public static void main(String[] args) {
		
		Integer [] arr = {10, 20, 30, 40, 50};
        reverse(arr);
	}

}
