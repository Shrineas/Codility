package codility.lesson4;

import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;

public class MissingIntegerTest {

	private MissingInteger missingInteger;

	@Before
	public void setup() {
		missingInteger = new MissingInteger();
	}

	@Test
	public void singleValueOne_ShouldReturnTwo() throws Exception {
		assertEquals(2, missingInteger.solution(new int[] { 1 }));
	}

	@Test
	public void singleValueTwo_ShouldReturnOne() throws Exception {
		assertEquals(1, missingInteger.solution(new int[] { 2 }));
	}

	@Test
	public void sortedValues_MissingNextSequentialValue_ShouldReturnNextSequentialValue() throws Exception {
		assertEquals(5, missingInteger.solution(new int[] { 1, 2, 3, 4 }));
	}

	@Test
	public void sortedValues_MissingMiddleValue_ShouldReturnMiddleValue() throws Exception {
		assertEquals(3, missingInteger.solution(new int[] { 1, 2, 4, 5 }));
	}

	@Test
	public void sortedValues_MissingFirstValue_ShouldReturnOne() throws Exception {
		assertEquals(1, missingInteger.solution(new int[] { 2, 3, 4, 5 }));
	}

	@Test
	public void sortedValuesWithDuplicates_MissingNextSequentialValue_ShouldReturnNextSequentialValue() throws Exception {
		assertEquals(5, missingInteger.solution(new int[] { 1, 2, 2, 2, 3, 4 }));
	}

	@Test
	public void sortedValuesWithDuplicates_MissingMiddleValue_ShouldReturnMiddleValue() throws Exception {
		assertEquals(3, missingInteger.solution(new int[] { 1, 1, 2, 2, 4, 5, 5 }));
	}

	@Test
	public void sortedValuesWithDuplicates_MissingFirstValue_ShouldReturnOne() throws Exception {
		assertEquals(1, missingInteger.solution(new int[] { 2, 2, 3, 3, 4, 5, 5 }));
	}

	@Test
	public void unsortedValuesWithDuplicates_MissingNextSequentialValue_ShouldReturnNextSequentialValue() throws Exception {
		assertEquals(5, missingInteger.solution(new int[] { 3, 2, 1, 3, 1, 4, 2 }));
	}

	@Test
	public void unsortedValuesWithDuplicates_MissingMiddleValue_ShouldReturnMiddleValue() throws Exception {
		assertEquals(3, missingInteger.solution(new int[] { 2, 1, 5, 4, 5, 2, 4 }));
	}

	@Test
	public void unsortedValuesWithDuplicates_MissingFirstValue_ShouldReturnOne() throws Exception {
		assertEquals(1, missingInteger.solution(new int[] { 2, 4, 2, 3, 5, 2 }));
	}

	@Test
	public void unsortedValues_MultipleMissingValues_ShouldReturnFirstMissingValue() throws Exception {
		assertEquals(3, missingInteger.solution(new int[] { 2, 4, 1, 1, 4, 6, 2, 4 }));
	}

	@Test
	public void unsortedValues_WithNegativeValues_ShouldReturnFirstMissingPositiveValue() throws Exception {
		assertEquals(3, missingInteger.solution(new int[] {-1, 2, 5, -3, 1, 5}));
	}
}
