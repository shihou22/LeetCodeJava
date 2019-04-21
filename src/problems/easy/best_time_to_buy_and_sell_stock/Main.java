package problems.easy.best_time_to_buy_and_sell_stock;

import java.io.IOException;

public class Main {

	public static void main(String[] args) throws IOException {
		int res = 0;
		int[] wk;
		//		wk = new int[] { 1, 2, 3, 4, 5 };
		//		res = new Main().maxProfit(wk);//4
		//		System.out.println(res);
		//
		//		wk = new int[] { 7, 6, 4, 3, 1 };
		//		res = new Main().maxProfit(wk);//0
		//		System.out.println(res);

		wk = new int[] { 7, 1, 5, 3, 6, 4 };
		res = new Main().maxProfit(wk);//7
		System.out.println(res);

	}

	public int maxProfit(int[] prices) {

		if (prices == null || prices.length == 0) {
			return 0;
		}
		int res = 0;
		int ret = 0;
		int minPrice = Integer.MAX_VALUE - 1;
		int prev = prices[0];
		for (int i = 0; i < prices.length; i++) {
			minPrice = Integer.min(minPrice, prices[i]);
			res = Integer.max(res, prices[i] - minPrice);
			if (prev > prices[i] || i == prices.length - 1) {
				ret += res;
				res = 0;
				minPrice = prices[i];
			}
			prev = prices[i];
		}
		return ret;
	}

}