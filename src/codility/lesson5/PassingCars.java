package codility.lesson5;

public class PassingCars {

    public int solution(int[] input) {
        int carCount = 0;
        int carsPassed = 0;
        for (int car : input) {
            if (car == 0) {
                carCount++;
            } else {
                carsPassed += carCount;
            }
            if(carsPassed > 1000000000) {
                return -1;
            }
        }
        return carsPassed;
    }
}
