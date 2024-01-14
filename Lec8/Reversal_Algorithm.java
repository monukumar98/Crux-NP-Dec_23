package Lec8;

public class Reversal_Algorithm {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = { 1, 2, 3, 4, 5, 6, 7 };
		int k = 3;
		Rotate_Array(arr, k);
	}

	public static void Rotate_Array(int[] arr, int k) {
		int n = arr.length;
		k = k % n;
		// 1. starting ke n-k element Reverse kra hu
		Reverse(arr, 0, n - k - 1);
		// 2. Ending ke k element Reverse kra hu
		Reverse(arr, n - k, n - 1);
		// 3. Saare Element Reverse kra hu
		Reverse(arr, 0, n - 1);
	}
	public static void Reverse(int[] arr, int i, int j) {
		while (i < j) {
			int temp = arr[i];
			arr[i] = arr[j];
			arr[j] = temp;
			i++;
			j--;
		}
	}

}
