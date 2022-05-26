package lab3;

import java.time.*;
import java.util.*;

public class DateDuration {

	static void find(LocalDate first_date, LocalDate second_date) {
		// Get period between the first and the second date
		Period difference = Period.between(first_date, second_date);
		// Show date difference in years, months, and days
		System.out.print("Difference between two dates is:\n");
		System.out.printf("%d days, %d months and %d years", difference.getDays(), difference.getMonths(),
				difference.getYears());
	}

	public static void main(String[] args) {

		
		LocalDate first_date = LocalDate.of(2021, 05, 26);
		LocalDate second_date= LocalDate.now();
		// Calling find() method to get and print the period between both dates
		find(first_date, second_date);

	}

}
