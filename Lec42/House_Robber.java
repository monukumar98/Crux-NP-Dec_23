package Lec42;

import java.util.Arrays;

public class House_Robber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = { 2, 7, 9, 3, 1 };
		System.out.println(Maximum_Value(arr, 0));
		int[] dp = new int[arr.length];
		Arrays.fill(dp, -1);
		System.out.println(Maximum_ValueTD(arr, 0, dp));
		System.out.println(Maximum_Value2(arr, arr.length - 1));

	}

	public static int Maximum_ValueBU(int[] arr) {
		if (arr.length == 1) {
			return arr[0];
		}
		int[] dp = new int[arr.length];
		dp[0] = arr[0];
		dp[1] = Math.max(arr[0], arr[1]);
		for (int i = 2; i < dp.length; i++) {

			int rob = arr[i] + dp[i - 2];
			int dont_rob = dp[i - 1];

			dp[i] = Math.max(rob, dont_rob);
		}

		return dp[dp.length - 1];

	}

	public static int Maximum_ValueTD(int[] arr, int i, int[] dp) {
		if (i >= arr.length) {
			return 0;
		}
		if (dp[i] != -1) {
			return dp[i];
		}
		int rob = arr[i] + Maximum_ValueTD(arr, i + 2, dp);
		int dont_rob = Maximum_ValueTD(arr, i + 1, dp);

		return dp[i] = Math.max(rob, dont_rob);
	}

	public static int Maximum_Value2(int[] arr, int i) {
		if (i < 0) {
			return 0;
		}

		int rob = arr[i] + Maximum_Value2(arr, i - 2);
		int dont_rob = Maximum_Value2(arr, i - 1);

		return Math.max(rob, dont_rob);
	}

	public static int Maximum_Value(int[] arr, int i) {
		if (i >= arr.length) {
			return 0;
		}
		int rob = arr[i] + Maximum_Value(arr, i + 2);
		int dont_rob = Maximum_Value(arr, i + 1);

		return Math.max(rob, dont_rob);
	}

}
