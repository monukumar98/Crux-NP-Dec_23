package Lec36;

import java.util.*;

public class Set_Demo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashSet<Integer> set = new HashSet<>();
		set.add(2);
		set.add(12);
		set.add(8);
		set.add(-2);
		set.add(11);
		set.add(9);
		set.add(67);
		System.out.println(set);
//		System.out.println(set.contains(13));
//		System.out.println(set.contains(11));
//		System.out.println(set.remove(11));
//		System.out.println(set.remove(110));
//		System.out.println(set);
//		System.out.println(set.size());
//		for (int v : set) {
//			System.out.print(v + " ");
//		}
//		System.out.println();
		TreeSet<Integer> set1 = new TreeSet<>();
		set1.add(2);
		set1.add(12);
		set1.add(8);
		set1.add(-2);
		set1.add(11);
		set1.add(9);
		set1.add(67);
		System.out.println(set1);
		LinkedHashSet<Integer> set2 = new LinkedHashSet<>();
		set2.add(2);
		set2.add(12);
		set2.add(8);
		set2.add(-2);
		set2.add(11);
		set2.add(9);
		set2.add(67);
		System.out.println(set2);

	}

}
