package codility.lesson1;

import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;

public class BinaryGapTest {

	private BinaryGap binaryGap;

	@Before
	public void setup() {
		binaryGap = new BinaryGap();
		// 0 - 0 -> 0
		// 1 - 1 -> 0
		// 2 - 10 -> 0
		// 3 - 11 -> 0
		// 4 - 100 -> 0
		// 5 - 101 -> 1
		// 7 - 111 -> 0
		// 9 - 1001 -> 2
		// 10 - 1010 -> 1
		// 13 - 10101 -> 1
		// 37 - 100101 -> 2
	}

	@Test
	public void lowValuesWithoutBinaryGap_ShouldReturnZero() throws Exception {
		assertEquals(0, binaryGap.solution(0));

		assertEquals(0, binaryGap.solution(1));

		assertEquals(0, binaryGap.solution(4));
	}

	@Test
	public void binaryValuesWithOnlyOnes_ShouldReturnZero() throws Exception {
		assertEquals(0, binaryGap.solution(7));
	}

	@Test
	public void simplestBinaryGapNumberFive_ShouldReturnOne() throws Exception {
		assertEquals(1, binaryGap.solution(5));
	}

	@Test
	public void twoOnesContainingZeroes_ShouldReturnNumberOfZeroes() throws Exception {
		assertEquals(2, binaryGap.solution(9));
	}

	@Test
	public void binaryValueWithGapEndingWithZero_ShouldReturnSizeOfGap() throws Exception {
		assertEquals(1, binaryGap.solution(10));
	}

	@Test
	public void binaryValueWithMultipleGapsSameSize_ShouldReturnSizeOfGap() throws Exception {
		assertEquals(1, binaryGap.solution(13));
	}

	@Test
	public void binaryValueWithMultipleGapsDifferentSize_ShouldReturnSizeOfBiggestGap() throws Exception {
		assertEquals(2, binaryGap.solution(37));
	}
}
