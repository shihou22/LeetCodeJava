package problems.medium.string_to_integer_atoi;

import java.io.IOException;

public class Main {

	public static void main(String[] args) throws IOException {
		int res = 0;
//		res = new Main().myAtoi("4193 with words");
//		System.out.println(res);
//		res = new Main().myAtoi(" words 4193 with");
//		System.out.println(res);
//		res = new Main().myAtoi("-4193 with words");
//		System.out.println(res);
//		res = new Main().myAtoi(" words -4193 with");
//		System.out.println(res);
//		res = new Main().myAtoi("+-4193 with");
//		System.out.println(res);
//		res = new Main().myAtoi("  ");
//		System.out.println(res);
//		res = new Main().myAtoi(" +- ");
//		System.out.println(res);
//		res = new Main().myAtoi("words and 987");
//		System.out.println(res);
		res = new Main().myAtoi("-2147483648");
		System.out.println(res);
		res = new Main().myAtoi(" -42");
		System.out.println(res);
		res = new Main().myAtoi("-91283472332");
		System.out.println(res);

	}

	public int myAtoi(String str) {
		String wk = str.trim();
		if (wk.isEmpty()) {
			return 0;
		}

		boolean flgSign = true;
		int numIndex = 0;
		char first = wk.charAt(0);
		switch (first) {
		case '+':
			numIndex++;
			break;
		case '-':
			flgSign = false;
			numIndex++;
			break;
		default:
			break;
		}
		int num = 0;
		for (char tmp : wk.substring(numIndex).toCharArray()) {

			if (tmp >= '0' && tmp <= '9') {
				if (flgSign && ((num > Integer.MAX_VALUE / 10) || (num == Integer.MAX_VALUE / 10 && (tmp - 48) > 7))) {
					return Integer.MAX_VALUE;
				}
				if (!flgSign && ((-num < Integer.MIN_VALUE / 10) || (-num == Integer.MIN_VALUE / 10 && (tmp - 48) > 8))) {
					return Integer.MIN_VALUE;
				}
				num = num * 10 + (tmp - 48);
			} else {
				break;
			}

		}

		return flgSign ? num : num * -1;

	}
}