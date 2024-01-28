package Lec12;

public class Wave_Print {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[][] arr = { { 12, 3, 5, 6 }, { 2, 13, 15, 16 }, { 9, 7, 8, 61 } };
		Wave(arr);
	}

	public static void Wave(int[][] arr) {
		for (int c = 0; c < arr[0].length; c++) {
			if (c % 2 == 0) {
				for (int r = 0; r < arr.length; r++) {
					System.out.print(arr[r][c]);
				}
			} else {
				for (int r = arr.length - 1; r >= 0; r--) {
					System.out.print(arr[r][c]);
				}
			}
		}
	}

}
