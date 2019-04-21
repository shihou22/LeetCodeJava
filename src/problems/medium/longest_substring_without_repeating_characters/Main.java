package problems.medium.longest_substring_without_repeating_characters;

import java.io.IOException;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class Main {

	public static void main(String[] args) throws IOException {
		int res = 0;
		//		res = new Main().lengthOfLongestSubstring("acbbacbb");//3
		//		System.out.println(res);
		//		res = new Main().lengthOfLongestSubstring("bbbbb");//1
		//		System.out.println(res);
		//		res = new Main().lengthOfLongestSubstring("pwwkew");//3
		//		System.out.println(res);
		//		res = new Main().lengthOfLongestSubstring("");//0
		//		System.out.println(res);
		//		res = new Main().lengthOfLongestSubstring(" ");//1
		//		System.out.println(res);
		//		res = new Main().lengthOfLongestSubstring("aa");//1
		//		System.out.println(res);
		//		res = new Main().lengthOfLongestSubstring("aab");//2
		//		System.out.println(res);
		//		res = new Main().lengthOfLongestSubstring("dvdf");//3
		//		System.out.println(res);
		res = new Main().lengthOfLongestSubstring("dvaacvsfgd");//3
		System.out.println(res);
	}

	/*
	 * 尺取りに近い
	 */
	public int lengthOfLongestSubstring(String s) {
		if (s == null || s.length() == 0)
			return 0;
		Set<Character> set = new HashSet<Character>();
		int i = 0;
		int j = 0;
		int max = 0;

		while (j < s.length()) {
			Character c = s.charAt(j);

			if (set.contains(c)) {
				set.remove(s.charAt(i));
				i++;
			} else {
				set.add(c);
				max = Integer.max(max, j - i+1);
				j++;
			}

		}
		return max;

	}

	public int lengthOfLongestSubstringWoops(String s) {

		if (s == null || s.equals("")) {
			return 0;
		}
		if (s.length() == 1) {
			return 1;
		}
		int res = 1;
		int[] dp = new int[s.length()];
		dp[0] = 1;
		Map<Character, Integer> useC = new HashMap<Character, Integer>();
		useC.put(s.charAt(0), 0);
		for (int i = 1; i < s.length(); i++) {
			if (useC.containsKey(s.charAt(i))) {
				int tmpI = useC.get(s.charAt(i));
				dp[tmpI] = 0;
				i = tmpI;
				useC.clear();
				continue;
			} else {
				dp[i] = dp[i - 1] + 1;
			}
			useC.put(s.charAt(i), i);
			res = Integer.max(res, dp[i]);
		}
		return res;
	}

	public int lengthOfLongestSubstringOrigin(String s) {

		int res = 0;
		for (int i = 0; i < s.length(); i++) {
			Set<Character> useC = new HashSet<Character>();

			for (int j = i; j < s.length(); j++) {
				if (!useC.contains(s.charAt(j))) {
					useC.add(s.charAt(j));
				} else {
					break;
				}
			}
			res = Integer.max(res, useC.size());
		}
		return res;
	}

}