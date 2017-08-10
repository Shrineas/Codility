package codility.lesson4;

public class MissingInteger {

	public int solution(int[] input) {
        boolean[] valuesExisting = getArrayOfExistingValues(input);

        return getFirstPositiveValueNotExisting(valuesExisting);
	}

    private boolean[] getArrayOfExistingValues(int[] input) {
        boolean[] valuesExisting = new boolean[input.length + 1];

        for (int value : input) {
            if (value > 0 && value <= input.length) {
                valuesExisting[value] = true;
            }
        }
        return valuesExisting;
    }

    private int getFirstPositiveValueNotExisting(boolean[] valuesExisting) {
        for (int i = 1; i < valuesExisting.length; i++) {
            if (!valuesExisting[i]) {
                return i;
            }
        }
        return valuesExisting.length;
    }

}
