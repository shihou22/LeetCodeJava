package problems.easy.palindrome_number;

import java.io.IOException;

public class Main {

	public static void main(String[] args) throws IOException {
		boolean res = new Main().isPalindrome(1231);
		System.out.println(res);
	}

	public boolean isPalindrome(int x) {
		if (x < 0) {
			return false;
		}
		int wk = x;
		int total = 0;
		boolean res = true;
		while (wk != 0) {
			int tmp = wk % 10;
			wk /= 10;
			total *= 10;
			total += tmp;
		}
		return x == total;
	}

	public boolean isPalindromeCX(int x) {
		if (x < 0 || x < 10) {
			return false;
		}
		String wk = Integer.toString(x);
		int left = 0;
		int right = wk.length() - 1;
		boolean res = true;
		while (left < right) {
			if (wk.charAt(left) != wk.charAt(right)) {
				res = false;
				break;
			}
			left++;
			right--;
		}
		return res;
	}

}