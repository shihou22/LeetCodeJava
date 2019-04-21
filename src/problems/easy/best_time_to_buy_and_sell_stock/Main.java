package problems.easy.best_time_to_buy_and_sell_stock;

import java.io.IOException;

public class Main {

	public static void main(String[] args) throws IOException {
		int res = 0;
		int[] wk;
		wk = new int[] { 7, 1, 5, 3, 6, 4 };
		res = new Main().maxProfit(wk);//5
		System.out.println(res);

		wk = new int[] { 7, 6, 4, 3, 1 };
		res = new Main().maxProfit(wk);//0
		System.out.println(res);

		wk = new int[] { 2, 1, 4 };
		res = new Main().maxProfit(wk);//2
		System.out.println(res);
	}

	public int maxProfit(int[] prices) {

		int res = 0;
		int minPrice = Integer.MAX_VALUE - 1;
		for (int i = 0; i < prices.length; i++) {
			minPrice = Integer.min(minPrice, prices[i]);
			res = Integer.max(res, prices[i] - minPrice);
		}
		return res;
	}

	public int maxProfitOrigin(int[] prices) {

		int res = 0;
		for (int i = 0; i < prices.length; i++) {
			for (int j = i; j < prices.length; j++) {
				if (prices[i] >= prices[j]) {
					continue;
				}
				res = Integer.max(res, prices[j] - prices[i]);
			}
		}
		return res;
	}
}