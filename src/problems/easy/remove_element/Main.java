package problems.easy.remove_element;

import java.io.IOException;

public class Main {

	public static void main(String[] args) throws IOException {
		int res = 0;
		int[] tmp = null;
		tmp = new int[] { 3, 2, 2, 3 };
		res = new Main().removeElement(tmp, 3);
		System.out.println(res);
		tmp = new int[] { 0, 1, 2, 2, 3, 0, 2, 4 };
		res = new Main().removeElement(tmp, 2);
		System.out.println(res);
	}

	public int removeElement(int[] nums, int val) {

		int res = nums.length - 1;
		int index = 0;
		while (index < res) {
			if (nums[index] == val) {
				nums[index] = nums[res];
				res--;
			} else {
				index++;
			}
		}

		return res + 1;

	}

	public int removeElementOrigi(int[] nums, int val) {

		int res = nums.length;
		for (int i = 0; i < nums.length; i++) {
			if (nums[i] != val) {
				continue;
			}
			res--;
			for (int j = i + 1; j < nums.length; j++) {
				if (nums[j] != val) {
					nums[i] = nums[j];
					nums[j] = val;
					res++;
					break;
				}
			}
		}
		return res;

	}

}