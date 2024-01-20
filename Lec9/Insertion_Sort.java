package Lec9;

public class Insertion_Sort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = { 1, 8, 2, 7, 9, 11, -8 };
//		InsertLastElement(arr, arr.length - 1);
		Sort(arr);
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
	}
	public static void Sort(int[] arr) {
		// TODO Auto-generated method stub
		for (int j = 1; j < arr.length; j++) {
			InsertLastElement(arr, j);
		}

	}
	public static void InsertLastElement(int[] arr, int j) {
		int item = arr[j];
		int i = j - 1;
		while (i >= 0 && arr[i] > item) {
			arr[i + 1] = arr[i];
			i--;
		}
		arr[i + 1] = item;
	}

}
