package codility.test;

import java.util.Arrays;

public class Airplane {
	public int solution(int N, String S) {
		if (S.isEmpty()) {
			return N * 3;
		}
		String[] seats = S.split(" ");
		boolean[][] blocksTaken = new boolean[N][3];

		int freeBlocks = N * 3;

		for (String seat : seats) {
			int row = Integer.parseInt(seat.substring(0, seat.length() - 1)) - 1;
			int blockNr = parseBlockNr(seat);
			if (!blocksTaken[row][blockNr]) {
				freeBlocks--;
			}
			blocksTaken[row][blockNr] = true;
		}

		return freeBlocks;
	}

	private int parseBlockNr(String seat) {
		String c = seat.toUpperCase().substring(seat.length() - 1);
		if (Arrays.asList("A", "B", "C").contains(c)) {
			return 0;
		}
		if (Arrays.asList("D", "E", "F", "G").contains(c)) {
			return 1;
		}
		if (Arrays.asList("H", "I", "J").contains(c)) {
			return 2;
		}
		return -1;
	}
}
