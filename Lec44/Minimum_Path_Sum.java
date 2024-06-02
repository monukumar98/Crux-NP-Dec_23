package Lec44;

public class Minimum_Path_Sum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[][] arr = { { 1, 3, 1 }, { 1, 5, 1 }, { 4, 2, 1 } };
		System.out.println(Minimum_Sum(arr, 0, 0));

	}

	public static int Minimum_Sum(int[][] arr, int cr, int cc) {
		if (cr == arr.length - 1 && cc == arr[0].length - 1) {
			return arr[cr][cc];
		}
		if (cr >= arr.length || cc >= arr[0].length) {
			return Integer.MAX_VALUE;
		}

		int d = Minimum_Sum(arr, cr + 1, cc);
		int r = Minimum_Sum(arr, cr, cc + 1);
		return Math.min(d, r) + arr[cr][cc];
	}

}
