package problems.easy.majority_element;

import java.io.IOException;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class Main {

	public static void main(String[] args) throws IOException {
		int res = 0;
		int[] wk;
		wk = new int[] { 3, 2, 3 };
		res = new Main().majorityElement(wk);//3
		System.out.println(res);

		wk = new int[] { 2, 2, 1, 1, 1, 2, 2 };
		res = new Main().majorityElement(wk);//2
		System.out.println(res);
	}

	public int majorityElementLieSolution(int[] nums) {
		Arrays.sort(nums);
		return nums[nums.length / 2];
	}

	public int majorityElement(int[] nums) {
		Map<Integer, Integer> wk = new HashMap<Integer, Integer>();
		int res = 0;
		int reI = 0;
		for (int i : nums) {
			wk.merge(i, 1, (oldV, newV) -> oldV + newV);
			if (wk.get(i) > res) {
				res = wk.get(i);
				reI = i;
			}
		}
		return reI;
	}
}