package problems.medium.container_with_most_water;

import java.io.IOException;

public class Main {

	public static void main(String[] args) throws IOException {
		int res = 0;
		int[] inA = null;
		inA = new int[] { 1, 8, 6, 2, 5, 4, 8, 3, 7 };
		res = new Main().maxArea(inA);
		System.out.println(res);
	}

	public int maxArea(int[] height) {

		int res = 0;
		int i = 0;
		int j = height.length - 1;
		/*
		 * 両側で挟みながら選択範囲を絞っていく
		 */
		while (i < j && i < height.length && j >= 0) {
			if (height[i] < height[j]) {
				int wk = height[i] * (j - i);
				res = Integer.max(res, wk);
				/*
				 * height[i]の方が小さいということは、
				 * この位置を維持して探索しても意味がない（これ以上数値を大きくすることができない）
				 * のでこちらを動かす。
				 * 反対側を動かした場合、height[i]よりheight[j]側に小さい値が出現するまで
				 * 値は変動しない。
				 * height[j]の方が大きいのであれば、height[i]はこの位置を維持したほうがいいので
				 * height[j]側を動かす。
				 */
				i++;
			} else {
				int wk = height[j] * (j - i);
				res = Integer.max(res, wk);
				j--;
			}
		}
		return res;

	}

	public int maxAreaOrigin(int[] height) {

		int res = 0;
		for (int i = 0; i < height.length; i++) {
			for (int j = i + 1; j < height.length; j++) {
				int wk = 0;
				int heightT = height[i] < height[j] ? height[i] : height[j];
				wk = heightT * (j - i);
				res = Integer.max(res, wk);
			}
		}
		return res;

	}

}