package codility.lesson4;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class PermCheckTest {

	private PermCheck permCheck;

	@Before
	public void setUp() throws Exception {
		permCheck = new PermCheck();
	}

	@Test
	public void singleValueOne_ShouldReturnOne() throws Exception {
		assertEquals(1, permCheck.solution(new int[]{1}));

	}

	@Test
	public void singleValueNotOne_ShouldReturnZero() throws Exception {
		assertEquals(0, permCheck.solution(new int[]{3}));
	}

	@Test
	public void sortedValuesValidPermutation_ShouldReturnOne() throws Exception {
		assertEquals(1, permCheck.solution(new int[]{1, 2, 3, 4}));
	}

	@Test
	public void sortedValuesInvalidPermutation_ShouldReturnZero() throws Exception {
		assertEquals(0, permCheck.solution(new int[]{1, 2, 4, 5}));
	}

	@Test
	public void unsortedValuesValidPermutation_ShouldReturnOne() throws Exception {
		assertEquals(1, permCheck.solution(new int[]{2, 4, 3, 1, 5}));
	}

	@Test
	public void unsortedValuesInvalidPermutation_ShouldReturnZero() throws Exception {
		assertEquals(0, permCheck.solution(new int[]{5, 2, 3, 1, 6}));
	}

	@Test
	public void permutationWithDuplicates_ShouldReturnZero() throws Exception {
		assertEquals(0, permCheck.solution(new int[]{1, 2, 3, 3}));
	}
}
