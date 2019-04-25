package problems.easy.factorial_trailing_zeroes;

import java.io.IOException;

public class Main {

	public static void main(String[] args) throws IOException {
		long res = 0;
		//		res = new Main().trailingZeroes(3);//0
		//		System.out.println(res);
		//
		//		res = new Main().trailingZeroes(5);//1
		//		System.out.println(res);

		res = new Main().trailingZeroes(30);//7
		System.out.println(res);
	}

	/**
	 * {@linkplain https://leetcode.com/problems/factorial-trailing-zeroes/discuss/185386/Java-Solution}
	 */
	public long trailingZeroes(int n) {
		int numOfFives = 0;
		while (true) {
			if (n / 5 < 1) {
				break;
			} else {
				numOfFives += n / 5;
				n = n / 5;
			}
		}
		return numOfFives;
	}

}