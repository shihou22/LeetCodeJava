package problems.easy.longest_common_prefix;

import java.io.IOException;
import java.util.Arrays;

public class Main {

	public static void main(String[] args) throws IOException {
		String res = "";
		res = new Main().longestCommonPrefix(new String[] { "flower", "flow", "flight" });
		System.out.println(res);
		res = new Main().longestCommonPrefix(new String[] {});
		System.out.println(res);
		res = new Main().longestCommonPrefix(new String[] { "aca", "cba" });
		System.out.println(res);
	}

	public String longestCommonPrefix(String[] strs) {

		Arrays.sort(strs, (x, y) -> {
			if (x.length() < y.length()) {
				return -1;
			} else if (x.length() > y.length()) {
				return 1;
			} else {
				return x.compareTo(y);
			}
		});

		if (strs.length == 0) {
			return "";
		}

		StringBuilder builder = new StringBuilder();
		int appended = 0;
		for (int i = 0; i < strs[0].length(); i++) {
			boolean canAppend = true;
			for (int j = 1; j < strs.length && canAppend; j++) {
				canAppend = strs[0].charAt(i) == strs[j].charAt(i);
			}
			if (canAppend && appended == i) {
				builder.append(strs[0].charAt(i));
				appended++;
			} else {
				break;
			}
		}
		return builder.toString();
	}

}