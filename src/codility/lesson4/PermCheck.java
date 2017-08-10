package codility.lesson4;

public class PermCheck {
	public int solution(int[] inputs) {

		int[] countOfValues = new int[inputs.length + 1];

		for (int value: inputs) {
			if (value >= countOfValues.length) {
				return 0;
			}
			countOfValues[value] += 1;
		}

		for (int i = 1; i < countOfValues.length; i++) {
			int count = countOfValues[i];
			if(count != 1) {
				return 0;
			}
		}
		return 1;
	}
}
