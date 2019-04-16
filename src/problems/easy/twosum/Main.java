package problems.easy.twosum;

import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

public class Main {

	public static void main(String[] args) throws IOException {
		//		int[] wk = new Main().twoSum1(new int[] { -1,-2,-3,-4,-5 }, -8);
		int[] wk = new Main().twoSum2(new int[] { -1, -2, -3, -4, -5 }, -8);
		for (int i : wk) {
			System.out.println(i);
		}
	}

	public int[] twoSum1(int[] nums, int target) {

		int[] wk = new int[2];

		for (int i = 0; i < nums.length; i++) {
			for (int j = i + 1; j < nums.length; j++) {
				if (nums[i] + nums[j] == target) {
					wk[0] = i;
					wk[1] = j;
				}
			}
		}
		return wk;
	}

	public int[] twoSum2(int[] nums, int target) {

		Map<Integer, Integer> map = new HashMap<Integer, Integer>();

		for (int i = 0; i < nums.length; i++) {
			map.put(nums[i], i);
		}

		for (int i = 0; i < nums.length; i++) {
			int val = target - nums[i];
			if (map.containsKey(val) && map.get(val) != i) {
				return new int[] { i, map.get(val) };
			}
		}
		throw new IllegalArgumentException();
	}
}