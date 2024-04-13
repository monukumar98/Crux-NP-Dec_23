package Lec29;

import java.util.*;

public class LinkedList_Java {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LinkedList<Integer> ll = new LinkedList<>();
		// stack
		ll.addFirst(10);
		ll.addFirst(20);
		ll.addFirst(30);
		System.out.println(ll);
		System.out.println(ll.remove());// remove first
		System.out.println(ll);

		// Queue
//		LinkedList<Integer> ll1 = new LinkedList<>();
		Queue<Integer> ll1 = new LinkedList<>();
		ll1.add(10);//add last
		ll1.add(20);
		ll1.add(30);
		ll1.add(40);
		System.out.println(ll1);
		System.out.println(ll1.remove());// remove first
		System.out.println(ll1);
	}

}




