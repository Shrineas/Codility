package codility.lesson4;

import java.util.Collection;
import java.util.TreeSet;

public class MissingInteger {

	public int solution(int[] input) {
		Collection<Integer> sortedNoDupes = sortAndRemoveDuplicateIntegers(input);

		return getFirstPositiveIntegerNotInArray(sortedNoDupes);
	}

	private Collection<Integer> sortAndRemoveDuplicateIntegers(int[] input) {
		Collection<Integer> sortedNoDupes = new TreeSet<>();
		for (int value : input) {
			sortedNoDupes.add(value);
		}
		return sortedNoDupes;
	}

	private int getFirstPositiveIntegerNotInArray(Collection<Integer> sortedNoDupes) {
		int currentValue = 1;
		for (Integer integer : sortedNoDupes) {
			if (integer > 0 && integer != currentValue) {
				return currentValue;
			}
			currentValue++;
		}
		return currentValue;
	}

}
