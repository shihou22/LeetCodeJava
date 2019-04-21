package problems.easy.climbing_stairs;

import java.io.IOException;

public class Main {

	public static void main(String[] args) throws IOException {
		int res = 0;
//		res = new Main().climbStairs(1);//1
//		System.out.println(res);
//		res = new Main().climbStairs(2);//2
//		System.out.println(res);
//		res = new Main().climbStairs(3);//3
//		System.out.println(res);
		res = new Main().climbStairsOrigin(4);//5
		System.out.println(res);
	}

	public int climbStairs(int n) {
		if (n == 1) {
			return 1;
		}
		int[] dp = new int[n + 2];

		dp[0] = 1;
		for (int i = 0; i < n; i++) {
			dp[i + 1] = dp[i] + dp[i + 1];
			dp[i + 2] = dp[i] + dp[i + 2];
		}
		return dp[n];
	}

	public int climbStairsMorau(int n) {
		if (n == 1) {
			return 1;
		}
		int[] dp = new int[n + 2];

		dp[1] = 1;
		dp[2] = 2;
		dp[3] = 3;
		for (int i = 4; i <= n; i++) {
			dp[i] = dp[i - 1] + dp[i - 2];
		}
		return dp[n];
	}

	public int climbStairsOrigin(int n) {
		return saikiOrigin(n, 0, new int[n]);
	}

	public int saikiOrigin(int n, int currentI, int[] memo) {
		if (currentI > n) {
			return 0;
		}
		if (currentI >= n) {
			return 1;
		}
		if(memo[currentI] != 0) {
			return memo[currentI];
		}

		int val1 = saikiOrigin(n, currentI + 1, memo);
		int val2 = saikiOrigin(n, currentI + 2, memo);
		memo[currentI] = val1 + val2;
		return val1 + val2;

	}

}