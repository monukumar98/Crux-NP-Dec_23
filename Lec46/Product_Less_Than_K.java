package Lec46;

public class Product_Less_Than_K {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = { 1, 2, 3, 4, 2 };
		int k = 10;
		System.out.println(Count_SubArray(arr, k));
	}

	public static int Count_SubArray(int[] arr, int k) {
		int c = 0;
		int si = 0, ei = 0, p = 1;
		while (ei < arr.length) {
			// grow
			p = p * arr[ei];
			// shrink
			while (p >= k && si <= ei) {
				p = p / arr[si];
				si++;
			}

			// ans
			c += (ei - si + 1);

			ei++;
		}
		return c;

	}
}
