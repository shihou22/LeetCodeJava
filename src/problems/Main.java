package problems;

import java.io.IOException;

public class Main {

	public static void main(String[] args) throws IOException {
		int res = 0;
		int[] wk;
		wk = new int[] { -2, 1, -3, 4, -1, 2, 1, -5, 4 };
		res = new Main().maxSubArray(wk);//6
		System.out.println(res);
	}

	public int maxSubArray(int[] nums) {

	}

	private static class ListNode {
		int val;
		ListNode next;

		ListNode(int x) {
			val = x;
			next = null;
		}
	}

}