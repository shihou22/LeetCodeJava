package problems.easy.length_of_last_word;

import java.io.IOException;

public class Main {

	public static void main(String[] args) throws IOException {
		int res = 0;
		res = new Main().lengthOfLastWord("Hello World");//5
		System.out.println(res);

		res = new Main().lengthOfLastWord(" ");//5
		System.out.println(res);
	}

	public int lengthOfLastWord(String s) {
		if (s == null || s.isEmpty()) {
			return 0;
		}
		boolean isEmpty = true;
		int cnt = 0;
		for (int i = s.length() - 1; i >= 0; i--) {
			if (s.charAt(i) == ' ' && isEmpty) {
				continue;
			} else if (s.charAt(i) == ' ' && !isEmpty) {
				return cnt;
			}
			cnt++;
			isEmpty = false;
		}
		return cnt;
	}

	public int lengthOfLastWordOrigin(String s) {
		if (s == null || s.isEmpty()) {
			return 0;
		}
		String[] wk = s.split(" ");
		for (int i = wk.length - 1; i >= 0; i--) {
			if (wk[i].length() > 0) {
				return wk[i].length();
			}
		}
		return 0;
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