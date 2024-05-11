package Lec37;

import java.util.*;
import java.util.HashMap;

public class Group_Anagrams {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[] arr = { "eat", "tea", "tan", "ate", "nat", "bat" };
		System.out.println(Anagrams(arr));

	}

	public static List<List<String>> Anagrams(String[] arr) {
		HashMap<String, List<String>> map = new HashMap<>();
		for (int i = 0; i < arr.length; i++) {
			String k = Key(arr[i]);
			if (!map.containsKey(k)) {
				map.put(k, new ArrayList<>());
			}
			map.get(k).add(arr[i]);
		}
		List<List<String>> ll = new ArrayList<>();
		for (String key : map.keySet()) {
			ll.add(map.get(key));
		}
		return ll;
	}

	public static String Key(String s) {
		int[] freq = new int[26];
		for (int i = 0; i < s.length(); i++) {
			int idx = s.charAt(i) - 'a';
			freq[idx]++;// freq[idx] = freq[idx]+1;

		}
		StringBuilder sb = new StringBuilder();
		for (int i = 0; i < freq.length; i++) {
			sb.append(freq[i]+" ");
		}
		return sb.toString();
	}
}
