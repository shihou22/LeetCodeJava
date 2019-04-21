package problems.easy.maximum_subarray;

import java.io.IOException;
import java.util.Arrays;

public class Main {

	public static void main(String[] args) throws IOException {
		int res = 0;
		int[] wk;
		//		wk = new int[] { -2, 1, -3, 4, -1, 2, 1, -5, 4 };
		//		res = new Main().maxSubArray(wk);//6
		//		System.out.println(res);
		wk = new int[] { -2, -1, -3, -4, -1, -2, -1, -5, -4 };
		res = new Main().maxSubArray(wk);//6
		System.out.println(res);
		//		wk = new int[] { 1 };
		//		res = new Main().maxSubArray(wk);//1
		//		System.out.println(res);
		//		wk = new int[] { -1 };
		//		res = new Main().maxSubArray(wk);//1
		//		System.out.println(res);
	}

	/*
	 * subarrayの最大値用
	 */
	public int maxSubArray(int[] nums) {
		int max = nums[0];
		int keepMax = nums[0];
		for (int i = 1; i < nums.length; i++) {
			if (keepMax < 0)
				keepMax = 0;
			keepMax += nums[i];
			max = Math.max(max, keepMax);
		}
		return max;
	}

	public int maxSubArrayMod(int[] nums) {

		int res = Integer.MIN_VALUE + 1;
		for (int i = 0; i < nums.length; i++) {
			res = Integer.max(saiki(nums, i, 0, Integer.MIN_VALUE + 1), res);
		}
		return res;
	}

	private int saiki(int[] nums, int currentI, int sum, int res) {
		if (currentI >= nums.length) {
			return res;
		}

		int tmp = sum + nums[currentI];
		res = Integer.max(res, tmp);

		return saiki(nums, currentI + 1, sum + nums[currentI], res);

	}

	public int maxSubArrayOrigin(int[] nums) {

		if (nums == null) {
			return 0;
		}

		int res = Integer.MIN_VALUE + 1;
		for (int i = 0; i < nums.length; i++) {
			for (int j = i; j < nums.length; j++) {
				int[] tmp = Arrays.copyOfRange(nums, i, j + 1);
				int wk = Arrays.stream(tmp).sum();
				res = Integer.max(res, wk);
			}
		}
		return res;

	}
}