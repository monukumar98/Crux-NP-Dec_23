package Lec34;
public class LinkedList<T> {
	class Node {
		T val;
		Node next;
	}

	private Node head;
	private Node tail;
	private int size = 0;

	// O(1)
	public void addFirst(T item) {
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
	public void addLast(T item) {
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
	public void addat_index(T item, int k) throws Exception {
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

	public T getFirst() {
		return head.val;
	}

	public T getLast() {
		return tail.val;
	}

	public T getatindex(int k) throws Exception {
		return GetNode(k).val;
	}

	// O(1)
	public T removeFirst() {
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
	public T removeLast() throws Exception {
		if (size == 1) {
			return removeFirst();
		} else {
			Node temp = GetNode(size - 2);
			T v = tail.val;// old tail ki value return krna hai
			tail = temp;
			tail.next = null;
			size--;
			return v;

		}
	}

	// O(N)
	public T removeat_Index(int k) throws Exception {
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
	
	public static void main(String[] args) {
		LinkedList<String> ll = new LinkedList<>();
		ll.addLast("Raj");
		ll.addLast("Ankit");
		ll.addLast("Kamlesh");
		ll.addLast("Amisha");
		ll.addLast("Puneet");
		ll.addLast("Ankita");
		ll.Display();
	}
}














