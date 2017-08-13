package codility.test;

import java.util.LinkedList;
import java.util.NoSuchElementException;

public class WordMachine {
	public int solution(String S) {
		if (S.isEmpty()) {
			return -1;
		}
		int maxValue = 1048575;

		String[] operations = S.split(" ");

		LinkedList<Integer> machine = new LinkedList<>();
		for (String operation : operations) {
			try {
				if (operation.equals("DUP")) {
					if (machine.isEmpty()) {
						return -1;
					}
					machine.push(machine.peek());
				} else if (operation.equals("POP")) {
					machine.pop();
				} else if (operation.equals("+")) {
					int result = machine.pop() + machine.pop();
					if (result > maxValue) {
						return -1;
					}
					machine.push(result);
				} else if (operation.equals("-")) {
					int result = machine.pop() - machine.pop();
					if (result > maxValue) {
						return -1;
					}
					machine.push(result);
				} else {
					Integer value = Integer.valueOf(operation);
					if (value > maxValue) {
						return -1;
					}
					machine.push(value);
				}
			} catch (NoSuchElementException exception) {
				return -1;
			}
		}

		return machine.pop().intValue();
	}
}
