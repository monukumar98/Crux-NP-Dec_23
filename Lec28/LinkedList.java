package Lec28;

public class LinkedList {
	class Node {
		int val;
		Node next;
	}

	private Node head;
	private Node tail;
	private int size = 0;

	// O(1)
	public void addFirst(int item) {
		Node nn = new Node();
		nn.val = item;
		if (size == 0) {
			head = nn;
			tail = nn;
			size++;
		} else {
			nn.next = head;
			head = nn;
			size++;
		}

	}

	// O(1)
	public void addLast(int item) {
		if (size == 0) {
			addFirst(item);
		} else {
			Node nn = new Node();
			nn.val = item;
			tail.next = nn;
			tail = nn;
			size++;
		}
	}

	// O(N)
	public void addat_index(int item, int k) throws Exception {
		if (k == 0) {
			addFirst(item);
		} else if (k == size) {
			addLast(item);
		} else {
			Node k_1th = GetNode(k - 1);
			Node nn = new Node();
			nn.val = item;
			nn.next = k_1th.next;
			k_1th.next = nn;
			size++;

		}

	}

	public int getFirst() {
		return head.val;
	}

	public int getLast() {
		return tail.val;
	}

	public int getatindex(int k) throws Exception {
		return GetNode(k).val;
	}

	// O(1)
	public int removeFirst() {
		Node temp = head;
		if (size == 1) {
			head = null;
			tail = null;
			size--;
		} else {
			head = head.next;
			temp.next = null;
			size--;
		}
		return temp.val;

	}

	// O(N)
	public int removeLast() throws Exception {
		if (size == 1) {
			return removeFirst();
		} else {
			Node temp = GetNode(size - 2);
			int v = tail.val;// old tail ki value return krna hai
			tail = temp;
			tail.next = null;
			size--;
			return v;

		}
	}

	// O(N)
	public int removeat_Index(int k) throws Exception {
		if (k == 0) {
			return removeFirst();
		} else if (k == size - 1) {
			return removeLast();
		} else {
			Node kth = GetNode(k);// curr
			Node k_th = GetNode(k - 1);// prev
			k_th.next = kth.next;
			kth.next = null;
			size--;
			return kth.val;
		}

	}

	private Node GetNode(int k) throws Exception {
		if (k < 0 || k >= size) {
			throw new Exception("Suno k glt hai bklol");
		}
		Node temp = head;
		for (int i = 0; i < k; i++) {
			temp = temp.next;
		}
		return temp;
	}

	public void Display() {
		Node temp = head;
		while (temp != null) {
			System.out.print(temp.val + "-->");
			temp = temp.next;
		}
		System.out.println(".");

	}
}
