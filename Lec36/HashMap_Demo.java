package Lec36;

import java.util.*;

public class HashMap_Demo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashMap<String, Integer> map = new HashMap<>();
		// add
		map.put("Raj", 89);
		map.put("Kamleash", 79);
		map.put("Ankit", 39);
		map.put("Anku", 59);
		map.put("Shivam", 65);
		map.put("Kaju", 78);
		map.put("Ankita", 57);
		map.put("Puneet", 57);
		map.put("Amisha", 75);
		map.put("Pooja", 94);
		map.put("Amisha", 25);
//		map.put(null, 17);
//		map.put(null, 171);
		System.out.println(map);
		// remove
//		System.out.println(map.remove("Raj"));//89
//		System.out.println(map.remove("Shiva"));
//		System.out.println(map);
//
//		// get
//		System.out.println(map.get("Kaju"));
//		System.out.println(map.get("Shiva"));
//
//		// check key
//		System.out.println(map.containsKey("Amit"));
//		System.out.println(map.containsKey("Pooja"));
//
//		// display
//
//		// size
//		System.out.println(map.size());
		
		TreeMap<String, Integer> map1 = new TreeMap<>();
		// add
		map1.put("Raj", 89);
		map1.put("Kamleash", 79);
		map1.put("Ankit", 39);
		map1.put("Anku", 59);
		map1.put("Shivam", 65);
		map1.put("Kaju", 78);
		map1.put("Ankita", 57);
		map1.put("Puneet", 57);
		map1.put("Amisha", 75);
		map1.put("Pooja", 94);
		map1.put("Amisha", 25);
		System.out.println(map1);
		LinkedHashMap<String, Integer> map2 = new 	LinkedHashMap<>();
		// add
		map2.put("Raj", 89);
		map2.put("Kamleash", 79);
		map2.put("Ankit", 39);
		map2.put("Anku", 59);
		map2.put("Shivam", 65);
		map2.put("Kaju", 78);
		map2.put("Ankita", 57);
		map2.put("Puneet", 57);
		map2.put("Amisha", 75);
		map2.put("Pooja", 94);
		map2.put("Amisha", 25);
		System.out.println(map2);
		//System.out.println(map.keySet());
//		Set<String> key = map.keySet();
//		for(String k : key) {
//			System.out.println(k+" "+map.get(k));
//		}
		for(String key : map.keySet()) {
			System.out.println(key+" "+map.get(key));
		}

	}

}










