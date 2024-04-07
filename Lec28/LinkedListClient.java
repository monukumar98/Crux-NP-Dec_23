package Lec28;

public class LinkedListClient {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		LinkedList ll = new LinkedList();
		ll.addFirst(10);
		ll.addFirst(20);
		ll.addFirst(30);
		ll.addFirst(40);
		ll.addLast(-9);
		ll.addat_index(90,2);
		ll.Display();
		System.out.println(ll.getFirst());
		System.out.println(ll.getLast());
		System.out.println(ll.getatindex(2));
		System.out.println(ll.removeFirst());
		ll.Display();
		System.out.println(ll.removeLast());
		ll.Display();
		System.out.println(ll.removeat_Index(2));
		ll.Display();

	}

}
