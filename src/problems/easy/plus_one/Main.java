package problems.easy.plus_one;

import java.io.IOException;
import java.util.Arrays;

public class Main {

	public static void main(String[] args) throws IOException {
		int[] res = null;
		int[] wk;
		//		wk = new int[] { 1, 2, 3 };
		//		res = new Main().plusOne(wk);//1,2,4
		//		System.out.println(res);

		//		wk = new int[] { 4, 3, 2, 1 };
		//		res = new Main().plusOne(wk);//4,3,2,2
		//		System.out.println(res);

		//		wk = new int[] { 9 };
		//		res = new Main().plusOne(wk);//1,0
		//		System.out.println(res);

		wk = new int[] { 9, 9, 9 };
		res = new Main().plusOne(wk);//4,3,2,2
		System.out.println(res);

		wk = new int[] { 8, 9, 9 };
		res = new Main().plusOne(wk);//4,3,2,2
		System.out.println(res);
	}

	public int[] plusOne(int[] digits) {
		int[] wk = new int[digits.length + 1];
		int p = 1;
		for (int i = digits.length - 1; i >= 0; i--) {
			wk[i + 1] = wk[i + 1] + digits[i] + p;
			if (wk[i + 1] >= 10) {
				wk[i + 1] = 0;
				wk[i] += 1;
			}
			p = 0;
		}
		return Arrays.copyOfRange(wk, wk[0] == 0 ? 1 : 0, wk.length);
	}

}