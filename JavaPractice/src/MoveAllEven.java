//7.       Given an array of integers move all even numbers to the beginning of the array.

import java.util.ArrayList;
import java.util.Arrays;

public class MoveAllEven {
	public static void main(String[] args) {

		Integer[] NUMBERS = { 3, 5, 4, 6, 8, 9, 7, 10 };

		ArrayList<Integer> ints = new ArrayList<>(Arrays.asList(NUMBERS));
		int nextIdx = 0;
		for (int i = 0; i < ints.size(); i++) {
			if (ints.get(i) % 2 == 0) {
				ints.add(nextIdx++, ints.remove(i));
			}
		}
		System.out.println(ints);
	}

}
