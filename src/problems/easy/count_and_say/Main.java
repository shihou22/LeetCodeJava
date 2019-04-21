package problems.easy.count_and_say;

import java.io.IOException;

public class Main {

	public static void main(String[] args) throws IOException {
		String res = "";
		res = new Main().countAndSay(1);//1
		System.out.println(res);
		res = new Main().countAndSay(4);//1211
		System.out.println(res);
		res = new Main().countAndSay(5);//111221
		System.out.println(res);
		res = new Main().countAndSay(6);//312211
		System.out.println(res);
		res = new Main().countAndSay(7);//13112221
		System.out.println(res);
		res = new Main().countAndSay(8);//1113213211
		System.out.println(res);
		res = new Main().countAndSay(9);//31131211131221
		System.out.println(res);
		res = new Main().countAndSay(10);//13211311123113112211
		System.out.println(res);
	}

	/*
	 * 11   -> two one  -> 2つの1
	 * 21   -> 1つの2、1つの1
	 * 1211 -> 1つの1、1つの2、2つの1
	 *
	 * 1.     one one -> 1
	 * 2.     one two -> 11
	 * 3.     two one -> 21X
	 * 4.     one two , one one -> 12,11
	 * 5.     one one , one two , two one -> 11,12,21
	 * 6.     three one , two two ,one one -> 31,22,11
	 * 7.     one three , one one , two two , two one -> 13,11,22,21
	 *
	 *ひとつ前の値を表現している。
	 */

	public String countAndSay(int n) {
		//		String res = "1";
		StringBuilder res = new StringBuilder();
		res.append("1");
		for (int i = 1; i < n; i++) {
			String tmp = res.toString();
			//			res = "";
			res.setLength(0);
			int start = 0;
			while (start < tmp.length()) {
				char num = tmp.charAt(start);
				int cnt = 0;
				for (int j = start; j < tmp.length(); j++) {
					if (tmp.charAt(j) != num) {
						break;
					}
					start++;
					cnt++;
				}
				//				res += cnt + "" + (num - 48);]
				res.append(cnt).append(num - 48);
			}
		}
		//		return res;
		return res.toString();
	}

}