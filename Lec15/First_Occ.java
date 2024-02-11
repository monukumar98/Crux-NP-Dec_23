package Lec15;

public class First_Occ {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = { 2, 3, 4, 3, 4, 5, 6, 3, 4, 4, 4, 5 };
		int item = 4;
		System.out.println(Index(arr, 0, item));

	}

	public static int Index(int[] arr, int i, int item) {
		if (i == arr.length) {
			return -1;
		}
		if (arr[i] == item) {

			return i;
		}
		return Index(arr, i + 1, item);
	}

}




