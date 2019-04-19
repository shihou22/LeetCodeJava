package problems.easy.remove_duplicates_from_sorted_array;

import java.io.IOException;

public class Main {

	public static void main(String[] args) throws IOException {
		int res = 0;
		int[] rtmp = null;
		rtmp = new int[] { 1, 1, 2 };
		res = new Main().removeDuplicates(rtmp);
		System.out.println(res);
		rtmp = new int[] { 0, 0, 1, 1, 1, 2, 2, 3, 3, 4 };
		res = new Main().removeDuplicates(rtmp);
		System.out.println(res);
	}

	public int removeDuplicates(int[] nums) {
		if (nums == null || nums.length == 0) {
			return 0;
		}
		int prev = 0;
		for (int i = 0; i < nums.length; i++) {
			if (nums[prev] != nums[i]) {
				prev++;
				nums[prev] = nums[i];
			}
		}
		return prev + 1;
	}

	public int removeDuplicatesOrigin(int[] nums) {
		if (nums == null || nums.length == 0) {
			return 0;
		}
		int res = 1;
		int prev = nums[0];
		int prevIndex = 1;
		for (int i = 1; i < nums.length; i++) {
			if (prev != nums[i]) {
				res++;
				prev = nums[i];
				nums[prevIndex] = nums[i];
				prevIndex += 1;
			}
		}
		return res;
	}

}