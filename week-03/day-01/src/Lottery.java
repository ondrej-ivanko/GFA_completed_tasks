import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.*;

public class Lottery {

	public static void main(String[] args) {
		// Create a method that find the 5 most common lottery numbers in lottery.csv
		Path filename = Paths.get("lottery.csv");
		commonFinder(filename);
	}

	public static void commonFinder(Path filename) {
		// First I open Coma-separated-value (CSV) file and copy all line to List<LinesOfCsv> as Strings.
		List<String> linesOfCsv = new ArrayList<>();
		try {
			linesOfCsv = Files.readAllLines(filename);
		} catch (IOException ex) {
			ex.printStackTrace();
		}
		// Second. Through for loop, I split the lines by ";", which yields single elements I can iterate through.
		// Also I replace some unwanted strings like "Ft" and " " to clean the elements.
		List<String[]> splitCsv = new ArrayList<>();
		for (int i = 0; i < linesOfCsv.size(); i++) {
			linesOfCsv.set(i, linesOfCsv.get(i).replace(" Ft", "").replace(" ", ""));
			splitCsv.add(linesOfCsv.get(i).split(";"));
		}
		// Here I have variable to count how many an element appear in the whole file.
		String current = "";
		int seenTimes = 0;
		// ArrayList<sortedElements> stores all elements from iteration through one column of CSV file.
		// Hash Map will store all unique elements with their occurrence times through the whole CSV file.
		ArrayList<String> sortedElements = new ArrayList<>();
		HashMap<String, Integer> hashedCountOfOccurence = new HashMap<>();
		// I go though only first column and than every row, because same types of numbers are in one column always.
		// I add all elements to sortedElements list.
		for (int column = 0; column < 16; column++) {
			for (String[] line : splitCsv) {
				// This condition is necessary because "" is counted as a character.
				if (line[column].equals("")) {
					continue;
				} else {
					sortedElements.add(line[column]);
				}
			}
			// This method sorts all elements in the list, so I can avoid counting the same element multiple times
			// and can safely rewrite current and seenTimes variables when different element appears.
			Collections.sort(sortedElements);
			// Goes through the sortedElements and count unique element and its occurrence.
			for (String number : sortedElements) {
				// Check if I have different number and if the number is as key already in Hash Map, so it does not
				// overwrite the value in Hash Map again with new one.
				if (!current.equals(number) & !hashedCountOfOccurence.containsKey(number)) {
					// When I run out of occurrence of one element, I add it to hash map and reset seenTimes.
					hashedCountOfOccurence.put(current, seenTimes);
					seenTimes = 0;
					// Otherwise I overwrite them.
					current = number;
					seenTimes++;
					// If num is in Hash Map, than update the existing record.
			} else if (!current.equals(number) & hashedCountOfOccurence.containsKey(number)) {
					hashedCountOfOccurence.replace(number, hashedCountOfOccurence.get(number) + 1);
				} else {
					seenTimes++;
				}
			}
			// sortedElements needs to be reset so I dont add more element to it when iterating though next column.
			sortedElements = new ArrayList<>();
		}
		// This loops through Hash map and check/overwrites the most occurring item with its occurrence.
		String withMostOccurence = "";
		int occurenceCount = 0;
		for (Map.Entry<String, Integer> el : hashedCountOfOccurence.entrySet()) {
			if (el.getValue() > occurenceCount) {
				withMostOccurence = el.getKey();
				occurenceCount = el.getValue();
			}
		}
		System.out.println(withMostOccurence + " : " + occurenceCount);
	}
}
