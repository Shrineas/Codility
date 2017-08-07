package codility.lesson3;

import java.util.Arrays;

public class PermMissingElement {

	public int solution(int[] input) {
		Arrays.sort(input);
		int maxInputValue = input.length;
		for (int i = 1; i < maxInputValue + 1; i++) {
			if (input[i - 1] != i) {
				return i;
			}
		}
		return maxInputValue + 1;
	}

}
