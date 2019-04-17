package problems.easy.longest_common_prefix;

import java.io.IOException;
import java.util.Arrays;

public class Main {

	public static void main(String[] args) throws IOException {
		String res = new Main().longestCommonPrefix(new String[] { "flower", "flow", "flight" });
		System.out.println(res);
	}

	public String longestCommonPrefix(String[] strs) {

		Arrays.sort(strs, (x, y) -> {

		});

		StringBuilder builder = new StringBuilder();
		for (int i = 0; i < strs[0].length(); i++) {
			boolean canAppend = true;
			for (int j = 1; j < strs.length; j++) {
				canAppend = strs[0].charAt(i) == strs[j].charAt(i);
				if (!canAppend)
					break;
			}
			if (canAppend) {
				builder.append(strs[0].charAt(i));
			}
		}
		return builder.toString();
	}

}