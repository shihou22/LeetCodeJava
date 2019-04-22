package problems.easy.single_number;

import java.io.IOException;
import java.util.HashSet;
import java.util.Set;

public class Main {

	public static void main(String[] args) throws IOException {
		int res = 0;
		int[] wk;
		wk = new int[] { 2, 2, 1 };
		res = new Main().singleNumber(wk);//1
		System.out.println(res);

		wk = new int[] { 4, 1, 2, 1, 2 };
		res = new Main().singleNumber(wk);//4
		System.out.println(res);
	}

	public int singleNumber(int[] nums) {
		int res = 0;
		for (int i = 0; i < nums.length; i++) {
			res ^= nums[i];
		}
		return res;
	}

	public int singleNumberOrigin(int[] nums) {
		int res = 0;
		Set<Integer> wk = new HashSet<Integer>();
		for (int i = 0; i < nums.length; i++) {
			if (wk.contains(nums[i])) {
				wk.remove(nums[i]);
			} else {
				wk.add(nums[i]);
			}
		}
		for (Integer integer : wk) {
			return integer;
		}
		return res;
	}

}