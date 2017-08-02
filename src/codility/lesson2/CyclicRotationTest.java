package codility.lesson2;

import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;

public class CyclicRotationTest {

	private CyclicRotation cyclicRotation;

	@Before
	public void setup() {
		cyclicRotation = new CyclicRotation();
	}

	@Test
	public void emptyArray_ShouldReturnEmptyArray() throws Exception {
		int[] numbers = {};
		assertEquals(0, cyclicRotation.solution(numbers, 1).length);
	}

	@Test
	public void arrayOfOne_ShouldReturnArrayWithSameElement() throws Exception {
		int[] numbers = { 5 };
		int[] solution = cyclicRotation.solution(numbers, 1);
		assertEquals(1, solution.length);
		assertEquals(5, solution[0]);
	}

	@Test
	public void arrayWithTwoElementsAndRotateByZero_ShouldReturnArrayWithElementsInSamePlace() throws Exception {
		int[] numbers = { 3, 5 };
		int[] solution = cyclicRotation.solution(numbers, 0);
		assertEquals(2, solution.length);
		assertEquals(3, solution[0]);
		assertEquals(5, solution[1]);
	}

	@Test
	public void arrayWithTwoElementsAndRotateByOne_ShouldReturnArrayWithElementsReversed() throws Exception {
		int[] numbers = { 3, 5 };
		int[] solution = cyclicRotation.solution(numbers, 1);
		assertEquals(2, solution.length);
		assertEquals(5, solution[0]);
		assertEquals(3, solution[1]);
	}

	@Test
	public void arrayWithTwoElementsAndRotateByTwo_ShouldReturnArrayWithElementsInSamePlace() throws Exception {
		int[] numbers = { 3, 5 };
		int[] solution = cyclicRotation.solution(numbers, 2);
		assertEquals(2, solution.length);
		assertEquals(3, solution[0]);
		assertEquals(5, solution[1]);
	}

	@Test
	public void arrayWithMoreElementsAndRotateByOne_ShouldReturnRotatedArray() throws Exception {
		int[] numbers = { 3, 5, 7 };
		int[] solution = cyclicRotation.solution(numbers, 1);
		assertEquals(3, solution.length);
		assertEquals(7, solution[0]);
		assertEquals(3, solution[1]);
		assertEquals(5, solution[2]);

	}

	@Test
	public void arrayWithMoreElementsAndRotateByTwo_ShouldReturnRotatedArray() throws Exception {
		int[] numbers = { 3, 5, 7 };
		int[] solution = cyclicRotation.solution(numbers, 2);
		assertEquals(3, solution.length);
		assertEquals(5, solution[0]);
		assertEquals(7, solution[1]);
		assertEquals(3, solution[2]);
	}
}
