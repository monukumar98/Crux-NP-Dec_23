package Lec14;

import java.util.*;

public class Arrays_Sum_Of_Two_Arrays {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] arr1 = new int[n];
		for (int i = 0; i < arr1.length; i++) {
			arr1[i] = sc.nextInt();
		}
		int m = sc.nextInt();
		int[] arr2 = new int[m];
		for (int i = 0; i < arr2.length; i++) {
			arr2[i] = sc.nextInt();
		}
		Sum_of_Two_Array(arr1, arr2);

	}

	public static void Sum_of_Two_Array(int[] arr1, int[] arr2) {
		int i = arr1.length - 1;
		int j = arr2.length - 1;
		int carry = 0;
		ArrayList<Integer> ll = new ArrayList<>();
		while (i >= 0 && j >= 0) {
			int sum = carry + arr1[i] + arr2[j];
			ll.add(sum % 10);
			carry = sum / 10;
			i--;
			j--;
		}
		while (i >= 0) {
			int sum = carry + arr1[i];
			ll.add(sum % 10);
			carry = sum / 10;
			i--;
		}
		while (j >= 0) {
			int sum = carry + arr2[j];
			ll.add(sum % 10);
			carry = sum / 10;
			j--;
		}
		if (carry != 0) {
			ll.add(carry);
		}
		for (int k = ll.size() - 1; k >= 0; k--) {
			System.out.print(ll.get(k) + ", ");
		}
		System.out.println("END");
	}

}
