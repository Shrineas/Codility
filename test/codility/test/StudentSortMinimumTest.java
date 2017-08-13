package codility.test;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class StudentSortMinimumTest {

	private StudentSortMinimum studentSortMinimum;

	@Before
	public void setUp() throws Exception {
		studentSortMinimum = new StudentSortMinimum();
	}

	@Test
	public void testSingleStudent() throws Exception {
		assertEquals(0, studentSortMinimum.solution(new int[] {5}));
	}

	@Test
	public void testSampleArray() throws Exception {
		assertEquals(3, studentSortMinimum.solution(new int [] {1, 2, 6, 5, 5, 8, 9}));
	}

	@Test
	public void onlyFirstAndSecondAndLastAndSecondToLast() throws Exception {
		assertEquals(4, studentSortMinimum.solution(new int[] {2, 1, 3, 4, 5, 6, 8, 7}));
	}
}
