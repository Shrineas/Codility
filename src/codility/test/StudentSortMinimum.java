package codility.test;

import java.util.Arrays;

public class StudentSortMinimum {
	public int solution(int[] A) {
		int lastLowestIndexSorted = 0;
		int firstHighestIndexSorted = A.length - 1;
		int i = 1;
		while (i < A.length && A[i] > A[i - 1]) {
			lastLowestIndexSorted = i++;
		}

		i = A.length - 1;
		while (i > lastLowestIndexSorted && A[i] > A[i - 1]) {
			firstHighestIndexSorted = i--;
		}
		return firstHighestIndexSorted - lastLowestIndexSorted;
	}

	public int solutionWithSort(int[] A) {
		int[] sorted = Arrays.copyOf(A, A.length);
		Arrays.sort(sorted);
		int changed = 0;
		for (int i = 0; i < A.length; i++) {
			if (A[i] != sorted[i]) {
				changed++;
			}
		}
		return changed;
	}
}
