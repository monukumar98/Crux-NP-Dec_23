package Lec37;

import java.util.ArrayList;

public class HashMap<K, V> {

	class Node {
		K key;
		V value;
		Node next;
	}

	private ArrayList<Node> ll;
	private int size = 0;

	public HashMap() {
		this(4);
	}

	public HashMap(int n) {
		ll = new ArrayList<>();
		for (int i = 0; i < n; i++) {
			ll.add(null);
		}
	}

	public void put(K key, V value) {
		int idx = HashFun(key);
		Node temp = ll.get(idx);
		while (temp != null) {
			if (temp.key.equals(key)) {
				temp.value = value;
				return;
			}
			temp = temp.next;
		}
		temp = ll.get(idx);
		size++;
		Node nn = new Node();
		nn.key = key;
		nn.value = value;
		nn.next = temp;
		ll.set(idx, nn);
		double thf = 2.0;
		double lf = (1.0 * size) / ll.size();
		if (lf > thf) {
			rehashing();
		}

	}

	private void rehashing() {
		// TODO Auto-generated method stub
		ArrayList<Node> a = new ArrayList<>();
		for (int i = 0; i < 2 * ll.size(); i++) {
			a.add(null);
		}
		ArrayList<Node> old_list = ll;
		ll = a;
		for (Node temp : old_list) {
			while (temp != null) {
				put(temp.key, temp.value);
				temp = temp.next;
			}
		}

	}

	@Override
	public String toString() {
		String s = "{";
		for (Node temp : ll) {
			while (temp != null) {
				s = s + temp.key + "=" + temp.value + ", ";
				temp = temp.next;
			}
		}
		s= s.substring(0, s.length()-2);
		return s + "}";
	}

	public boolean containsKey(K key) {
		int idx = HashFun(key);
		Node temp = ll.get(idx);
		while (temp != null) {
			if (temp.key.equals(key)) {
				return true;
			}
			temp = temp.next;
		}
		return false;
	}

	public V get(K key) {
		int idx = HashFun(key);
		Node temp = ll.get(idx);
		while (temp != null) {
			if (temp.key.equals(key)) {

				return temp.value;
			}
			temp = temp.next;
		}
		return null;
	}

	public V remove(K key) {
		int idx = HashFun(key);
		Node curr = ll.get(idx);
		Node prev = null;
		while (curr != null) {
			if (curr.key.equals(key)) {
				break;
			}
			prev = curr;
			curr = curr.next;
		}
		if (curr == null) {
			return null;
		} else if (prev == null) {
			ll.set(idx, curr.next);
			curr.next = null;
			size--;
			return curr.value;
		} else {
			prev.next = curr.next;
			curr.next = null;
			size--;
			return curr.value;
		}
	}

	public int HashFun(K key) {
		int idx = key.hashCode() % ll.size();
		if (idx < 0) {
			idx += ll.size();
		}
		return idx;
	}
}
