package problems.easy.two_sum2;

import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

public class Main {

	public static void main(String[] args) throws IOException {
		int[] wk = new Main().twoSum2(new int[] { 2, 7, 11, 15 }, 9);
		for (int i : wk) {
			System.out.println(i);
		}
	}

	public int[] twoSum2(int[] numbers, int target) {

		Map<Integer, Integer> wk = new HashMap<Integer, Integer>();
		for (int i = 0; i < numbers.length; i++) {
			wk.put(numbers[i], i + 1);
		}
		for (int i = 0; i < numbers.length; i++) {
			int val = target - numbers[i];
			if (wk.containsKey(val) && wk.get(val) != i) {
				return new int[] { i + 1, wk.get(val) };
			}
		}

		throw new IllegalArgumentException("HOGE");
	}

}