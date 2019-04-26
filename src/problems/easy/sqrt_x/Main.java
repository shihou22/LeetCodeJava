package problems.easy.sqrt_x;

import java.io.IOException;

public class Main {

	public static void main(String[] args) throws IOException {
		int res = 0;
		//		res = new Main().mySqrt(4);//2
		//		System.out.println(res);
		//
		//		res = new Main().mySqrt(8);//2
		//		System.out.println(res);

		res = new Main().mySqrt(36);//6
		System.out.println(res);
	}

	public int mySqrt(int x) {
		if (x == 0 || x == 1) {
			return x;
		}
		int l = 1;
		int r = x;
		while (l < r) {
			int mid = (l + r) / 2;
			if (mid == l || mid == x / mid) {
				return mid;
			}
			if (mid > x / mid) {
				r = mid;
			} else {
				l = mid;
			}
		}
		return 0;
	}

}