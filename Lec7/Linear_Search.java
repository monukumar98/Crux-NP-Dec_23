package Lec7;

public class Linear_Search {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = { 2, 3, 45, 1, 7, 9, 34, 56, 77 };
		int item = 7;
//		int[] arr = new int[] { 2, 3, 45, 1, 7, 9, 34, 56, 77 };
		System.out.println(Search(arr, item));
	}

	public static int Search(int[] arr, int item) {
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] == item) {
				return i;
			}
		}

		return -1;
	}
}
