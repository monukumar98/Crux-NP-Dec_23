package Lec44;

public class Minimum_Falling_Path_Sum_II {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[][] arr = { { 2, 1, 3 }, { 6, 5, 4 }, { 7, 8, 9 } };
		int ans = Integer.MAX_VALUE;
		for (int i = 0; i < arr[0].length; i++) {
			ans = Math.min(ans, Falling_Path_Sum(arr, 0, i));
		}
		System.out.println(ans);

	}

	public static int Falling_Path_Sum(int[][] arr, int cr, int cc) {

		if (cr == arr.length - 1) {
			return arr[cr][cc];
		}
		int ans = Integer.MAX_VALUE;
		for (int col = 0; col < arr[0].length; col++) {
			if (col == cc) {
				continue;
			}
			ans = Math.min(ans, Falling_Path_Sum(arr, cr + 1, col));
		}
		return ans + arr[cr][cc];

	}

}
