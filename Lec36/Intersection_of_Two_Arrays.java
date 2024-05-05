package Lec36;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

public class Intersection_of_Two_Arrays {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr1 = { 1, 2, 2, 1 };
		int[] arr2 = { 2, 2 };
		System.out.println(Arrays.toString(Intersection(arr1, arr2)));
	}

	public static int[] Intersection(int[] arr1, int[] arr2) {
		HashMap<Integer, Integer> map = new HashMap<>();
		for (int i = 0; i < arr1.length; i++) {

			if (map.containsKey(arr1[i])) {
				map.put(arr1[i], map.get(arr1[i]) + 1);
			} else {
				map.put(arr1[i], 1);
			}
		}
		List<Integer> ll = new ArrayList<>();
		for (int i = 0; i < arr2.length; i++) {
			if (map.containsKey(arr2[i]) && map.get(arr2[i]) > 0) {
				ll.add(arr2[i]);
				map.put(arr2[i], map.get(arr2[i]) - 1);
			}

		}
		int[] ans = new int[ll.size()];
		for (int i = 0; i < ll.size(); i++) {
			ans[i] = ll.get(i);
		}

		return ans;
	}

}
