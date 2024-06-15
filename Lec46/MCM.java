package Lec46;

import java.util.Arrays;

public class MCM {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = { 4, 2, 3, 5, 1 };
		// M1 = 4*2
		// M2 = 2*3
		// M3 = 3*5
		// M4 = 5*1
		int[][] dp = new int[arr.length][arr.length];
		for (int[] a : dp) {
			Arrays.fill(a, -1);
		}
		System.out.println(mcm(arr, 0, arr.length - 1, dp));

	}

	public static int mcm(int[] arr, int si, int ei, int[][] dp) {
		if (si + 1 == ei) {
			return 0;
		}
		if (dp[si][ei] != -1) {
			return dp[si][ei];
		}
		int ans = Integer.MAX_VALUE;
		for (int k = si + 1; k < ei; k++) {
			int f = mcm(arr, si, k, dp);
			int s = mcm(arr, k, ei, dp);
			// si*k && k*ei
			int self = arr[si] * arr[k] * arr[ei];
			int total = f + s + self;
			ans = Math.min(ans, total);
		}
		return dp[si][ei] = ans;

	}

}
