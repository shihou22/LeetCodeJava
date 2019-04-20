package problems.easy.implement_str_str;

import java.io.IOException;

public class Main {

	public static void main(String[] args) throws IOException {

		System.out.println("a".indexOf(""));
		System.out.println("".indexOf(""));
		System.out.println("".indexOf("a"));
		int res = 0;
		res = new Main().strStr("hello", "ll");
		System.out.println(res);
		res = new Main().strStr("aaaaa", "bba");
		System.out.println(res);
		res = new Main().strStr("a", "");
		System.out.println(res);
		res = new Main().strStr("", "");
		System.out.println(res);
		res = new Main().strStr("", "a");
		System.out.println(res);
		res = new Main().strStr("a", "a");
		System.out.println(res);
	}

	public int strStr(String haystack, String needle) {
		if (haystack == null || needle == null) {
			return -1;
		}
		if (needle.length() == 0) {
			return 0;
		}

		for (int i = 0; i < haystack.length(); i++) {
			if (haystack.charAt(i) == needle.charAt(0) && i + needle.length() <= haystack.length()) {
				boolean isMatch = true;
				for (int j = 0; j < needle.length(); j++) {
					if (haystack.charAt(i + j) != needle.charAt(j)) {
						isMatch = false;
						break;
					}
				}
				if (isMatch) {
					return i;
				}
			}

		}
		return -1;
	}

}