package listToString;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ListToString {
	
	// Java 7
	private static final String SEPARATOR = ",";

	public static void main(String[] args) {

		// Java 8
		/*
		 * List<String> cities = Arrays.asList("Milan", "London", "New York",
		 * "San Francisco"); String citiesCommaSeparated = String.join(",",
		 * cities); System.out.println(citiesCommaSeparated);
		 */

		// Java 7
		List<String> cities = Arrays.asList("Milan", "London", "New York", "San Francisco");
		List<String> ids = new ArrayList<String>();
		ids.add("1");
		ids.add("2");
		ids.add("3");
		String idList = ids.toString();
		System.out.println(idList);
		String csv = idList.substring(1, idList.length() - 1).replace(", ", ",");
		System.out.println(csv);
		List<String> listAgain = Arrays.asList(csv.split(","));
		for(String li : listAgain){
			System.out.println("List Again "+li);
		}
		
		/*StringBuilder csvBuilder = new StringBuilder();
		for (String city : ids) {
			csvBuilder.append(city);
			csvBuilder.append(SEPARATOR);
		}
		String csv = csvBuilder.toString();
		System.out.println(csv);
		// OUTPUT: Milan,London,New York,San Francisco,
		// Remove last comma
		csv = csv.substring(0, csv.length() - SEPARATOR.length());
		System.out.println(csv);*/
		// OUTPUT: Milan,London,New York,San Francisco
		
		String test = "I am preparing for OCPJP";
		String[] tokens = test.split("\\S");
		System.out.println(tokens.length);
	}
}
