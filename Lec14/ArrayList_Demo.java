package Lec14;

import java.util.*;

public class ArrayList_Demo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Integer> ll = new ArrayList<>();
		System.out.println(ll);
		// add
		ll.add(10);
		ll.add(20);
		ll.add(30);
		ll.add(40);
		System.out.println(ll);
		ll.add(1, -9);// index ka range 0 to size
		System.out.println(ll);
		// size
		System.out.println(ll.size());
		// get index ka range 0 to size-1
		System.out.println(ll.get(1));
		// remove index ka range 0 to size-1
		System.out.println(ll.remove(2));// index number
		System.out.println(ll);
		// upate
		ll.set(2, -3);
		System.out.println(ll);
		// print
		for (int i = 0; i < ll.size(); i++) {
			System.out.print(ll.get(i) + " ");
		}
		System.out.println();
		int[] arr = new int[5];
		for (int v : arr) {
			System.out.print(v + " ");
		}
		System.out.println();
		for (int v : ll) {
			System.out.print(v + " ");
		}
	}

}
