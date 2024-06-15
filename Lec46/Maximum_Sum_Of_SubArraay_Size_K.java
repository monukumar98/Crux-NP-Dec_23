package Lec46;

public class Maximum_Sum_Of_SubArraay_Size_K {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = { 2, 3, 4, 51, 7, 8, 5, 2, 3, 4 };
		int k = 3;
		System.out.println(Maximum_Sum(arr, k));

	}

	public static int Maximum_Sum(int[] arr, int k) {
		int ans = 0;
		int sum = 0;
		for (int i = 0; i < k; i++) {
			sum += arr[i];
		}
		ans = sum;
		for (int i = k; i < arr.length; i++) {
			sum = sum + arr[i];// grow
			sum = sum - arr[i - k];// reduce the wimdow size
			ans = Math.max(ans, sum);

		}
		return ans;
	}

}
