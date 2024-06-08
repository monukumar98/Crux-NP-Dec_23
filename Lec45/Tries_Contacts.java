package Lec45;

import java.util.HashMap;

public class Tries_Contacts {

	class Node {
		char ch;
		HashMap<Character, Node> chlid = new HashMap<>();
		boolean isterminal;
		int count = 1;
	}

	private Node root;

	public Tries_Contacts() {
		// TODO Auto-generated constructor stub
		Node nn = new Node();
		nn.ch = '*';
		root = nn;
	}

	public void insert(String word) {
		Node curr = root;
		for (int i = 0; i < word.length(); i++) {
			char ch = word.charAt(i);
			if (curr.chlid.containsKey(ch)) {
				curr = curr.chlid.get(ch);
				curr.count++;
			} else {
				Node nn = new Node();
				nn.ch = ch;
				curr.chlid.put(ch, nn);
				curr = nn;
			}
		}
		curr.isterminal = true;
	}

	public boolean search(String word) {
		Node curr = root;
		for (int i = 0; i < word.length(); i++) {
			char ch = word.charAt(i);
			if (curr.chlid.containsKey(ch)) {
				curr = curr.chlid.get(ch);
			} else {
				return false;
			}
		}
		return curr.isterminal;
	}
public int startsWith(String prefix) {
		Node curr = root;
		for (int i = 0; i < prefix.length(); i++) {
			char ch = prefix.charAt(i);
			if (curr.chlid.containsKey(ch)) {
				curr = curr.chlid.get(ch);
			} else {
				return 0;
			}
		}
		return curr.count;
	}

	public static void main(String[] args) {
		Tries_Contacts t = new Tries_Contacts();
		t.insert("hack");
		t.insert("hackerrank");
		System.out.println(t.startsWith("hac"));
	}
}
