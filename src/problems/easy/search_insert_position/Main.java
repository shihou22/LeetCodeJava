package problems.easy.search_insert_position;

import java.io.IOException;
import java.util.Arrays;

public class Main {

	public static void main(String[] args) throws IOException {
		int res = 0;
		int[] nums;
		nums = new int[] { 1, 3, 5, 6 };//2
		res = new Main().searchInsert(nums, 5);
		System.out.println(res);
		nums = new int[] { 1, 3, 5, 6 };//1
		res = new Main().searchInsert(nums, 2);
		System.out.println(res);
		nums = new int[] { 1, 3, 5, 6 };//4
		res = new Main().searchInsert(nums, 7);
		System.out.println(res);
		nums = new int[] { 1, 3, 5, 6 };//0
		res = new Main().searchInsert(nums, 0);
		System.out.println(res);
	}

	public int searchInsert(int[] nums, int target) {
		for (int i = 0; i < nums.length; i++) {
			if (nums[i] >= target) {
				return i;
			}
		}
		return nums.length;
	}

	public int searchInsertOrig(int[] nums, int target) {
		int res = Arrays.binarySearch(nums, target);
		return res >= 0 ? res : ~res;
	}
}