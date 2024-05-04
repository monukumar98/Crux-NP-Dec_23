package Lec35;


import java.util.Collections;
import java.util.PriorityQueue;

public class Heap_Clinet {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Heap hp = new Heap();
		hp.add(10);
		hp.add(20);
		hp.add(30);
		hp.add(1);
		hp.add(5);
		hp.add(7);
		hp.add(3);
		hp.add(2);
		hp.Display();

		//PriorityQueue<Integer> pq = new PriorityQueue<>();//min heap
		PriorityQueue<Integer> pq = new PriorityQueue<>(Collections.reverseOrder());// max
		pq.add(10);
		pq.add(20);
		pq.add(30);
		pq.add(1);
		pq.add(5);
		pq.add(7);
		pq.add(3);
		pq.add(2);
		System.out.println(pq);
		System.out.println(pq.peek());// get
		System.out.println(pq.poll());// remove
		System.out.println(pq);

	}

}
