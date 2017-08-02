package codility.lesson2;

public class CyclicRotation {

	public int[] solution(int[] numbers, int rotation) {
		int[] result = numbers;
		for (int i = 1; i <= rotation; i++) {
			result = rotateNumbers(result);
		}
		return result;
	}

	private int[] rotateNumbers(int[] numbers) {
		int[] result = new int[numbers.length];

		for (int i = 0; i < numbers.length; i++) {
			result[i == result.length - 1 ? 0 : i + 1] = numbers[i];
		}
		return result;
	}

}
