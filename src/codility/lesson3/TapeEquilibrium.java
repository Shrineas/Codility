package codility.lesson3;

public class TapeEquilibrium {

	public int solution(int[] input) {
		int smallestDifference = Integer.MAX_VALUE;
		for (int i = 1; i < input.length; i++) {
			int diff = Math.abs(input[i - 1] - input[i]);
			if (diff < smallestDifference) {
				smallestDifference = diff;
			}
		}
		return smallestDifference;
	}

}
