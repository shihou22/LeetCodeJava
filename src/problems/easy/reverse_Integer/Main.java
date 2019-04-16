package problems.easy.reverse_Integer;

import java.io.IOException;

public class Main {

	public static void main(String[] args) throws IOException {
		//		int wk = new Main().reverse(-123);
		int wk = new Main().reverse(1534236469);
		//		int wk = new Main().reverse(1534236469);
		System.out.println(wk);
	}

	public int reverse(int x) {

		int res = 0;
		int wkX = x;
		while (wkX != 0) {
			int tmp = wkX % 10;
			wkX /= 10;
			if (res > Integer.MAX_VALUE / 10 || (res == Integer.MAX_VALUE && tmp > 7)) {
				return 0;
			}
			if (res < Integer.MIN_VALUE / 10 || (res == Integer.MIN_VALUE && tmp > -8)) {
				return 0;
			}
			res *= 10;
			res += tmp;
		}
		return res;

	}

	public int reverseTLE(int x) {

		StringBuffer buffer = new StringBuffer(Long.toString(x));
		try {
			if (x > 0) {
				int res = Integer.parseInt(buffer.reverse().toString());
				return res;
			} else {
				int res = Integer.parseInt(buffer.reverse().toString().replaceAll("-", "").toString());
				return res * -1;
			}

		} catch (NumberFormatException e) {
			return 0;
		}

	}

}