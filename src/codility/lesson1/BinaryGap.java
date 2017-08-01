package codility.lesson1;

public class BinaryGap {

	public int solution(int n) {
		String binaryString = Integer.toBinaryString(n);

		if (!binaryString.contains("0")) {
			return 0;
		}

		char[] binaryChars = binaryString.toCharArray();
		int biggestGap = 0;
		int currentGap = 0;
		for (int i = 0; i < binaryChars.length; i++) {
			if (binaryChars[i] == '1') {
				if (currentGap > biggestGap) {
					biggestGap = currentGap;
				}
				currentGap = 0;
			} else {
				currentGap++;
			}
		}
		return biggestGap;
	}

}
