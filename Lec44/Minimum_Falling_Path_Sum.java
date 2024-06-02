package Lec44;

public class Minimum_Falling_Path_Sum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[][] arr = { { 2, 1, 3 }, { 6, 5, 4 }, { 7, 8, 9 } };
		int ans=Integer.MAX_VALUE;
		for (int i = 0; i < arr[0].length; i++) {
			ans =Math.min(ans, Falling_Path_Sum(arr, 0, i));
		}
		System.out.println(ans);

	}

	public static int Falling_Path_Sum(int[][] arr, int cr, int cc) {
		if (cc < 0 || cc >= arr[0].length) {
			return Integer.MAX_VALUE;
		}
		if (cr == arr.length - 1) {
			return arr[cr][cc];
		}
		int ld = Falling_Path_Sum(arr, cr + 1, cc - 1);
		int d = Falling_Path_Sum(arr, cr + 1, cc);
		int rd = Falling_Path_Sum(arr, cr + 1, cc + 1);
		return Math.min(d, Math.min(ld, rd)) + arr[cr][cc];

	}

}
