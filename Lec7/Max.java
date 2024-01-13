package Lec7;

public class Max {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = { 2, 3, 45, 1, 7, 9, 34, 56, 77 };
		System.out.println(max(arr));
	}

// MAX_VALUE;// 2^31-1
	public static int max1(int[] arr) {
		int m = Integer.MIN_VALUE;// -2^31
		for (int i = 0; i < arr.length; i++) {
			m = Math.max(arr[i], m);

		}
		return m;
	}

	public static int max(int[] arr) {
		int m = arr[0];
		for (int i = 1; i < arr.length; i++) {
			if (arr[i] > m) {
				m = arr[i];
			}
		}
		return m;
	}

}
