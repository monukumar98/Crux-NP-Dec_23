package Lec7;

public class Arrays_Swap_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = { 1, 34, 56, 78, 90 };
		System.out.println(arr[0] + " " + arr[1]);// 1 34
		Swap(arr[0], arr[1]);
		System.out.println(arr[0] + " " + arr[1]);
	}

	public static void Swap(int a, int b) {
		int c = a;
		a = b;
		b = c;

	}

}
