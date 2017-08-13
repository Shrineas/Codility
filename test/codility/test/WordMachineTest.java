package codility.test;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class WordMachineTest {
	private WordMachine wordMachine;

	@Before
	public void setUp() throws Exception {
		wordMachine = new WordMachine();
	}

	@Test
	public void singleNumber_ReturnsNumber() throws Exception {
		assertEquals(5, wordMachine.solution("5"));
	}

	@Test
	public void singleOperation_ReturnsMinusOne() throws Exception {
		assertEquals(-1, wordMachine.solution("POP"));
		assertEquals(-1, wordMachine.solution("DUP"));
		assertEquals(-1, wordMachine.solution("+"));
		assertEquals(-1, wordMachine.solution("-"));
	}

	@Test
	public void testSampleString() throws Exception {
		assertEquals(7, wordMachine.solution("13 DUP 4 POP 5 DUP + DUP + -"));
		assertEquals(-1, wordMachine.solution("5 6 + -"));
		assertEquals(-1, wordMachine.solution("3 DUP 5 - -"));
	}
}
