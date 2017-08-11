package codility.lesson5;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class PassingCarsTest {
    private PassingCars passingCars;

    @Before
    public void setUp() throws Exception {
        passingCars = new PassingCars();
    }

    @Test
    public void singleCar_ShouldReturnZero() throws Exception {
        assertEquals(0, passingCars.solution(new int[]{0}));
    }

    @Test
    public void singleCarMovingOtherDirection_ShouldReturnZero() throws Exception {
        assertEquals(0, passingCars.solution(new int[]{1}));
    }

    @Test
    public void twoCarsMovingSameDirection_ShouldReturnZero() throws Exception {
        assertEquals(0, passingCars.solution(new int[] {0, 0}));
    }

    @Test
    public void twoCarsMovingOppositeDirectionTowardsEachOther_ShouldReturnOne() throws Exception {
        assertEquals(1, passingCars.solution(new int[] {0, 1}));
    }

    @Test
    public void twoCarsMovingOppositeDirectionAwayFromEachOther_ShouldReturnZero() throws Exception {
        assertEquals(0, passingCars.solution(new int[] {1, 0}));
    }

    @Test
    public void oneCarPassingAllOtherCars_ShouldReturnNumberOfCarsPassed() throws Exception {
        assertEquals(4, passingCars.solution(new int[]{0, 1, 1, 1, 1}));
    }

    @Test
    public void oneCarPassingSomeOtherCars_ShouldReturnNumberOfCarsPassed() throws Exception {
        assertEquals(3, passingCars.solution(new int[]{1, 1, 0, 1, 1, 1}));
    }

    @Test
    public void twoCarsPassingOtherCars_ShouldReturnNumberOfCarsPassed() throws Exception {
        assertEquals(5, passingCars.solution(new int[] {0, 1, 0, 1, 1}));
    }

}
