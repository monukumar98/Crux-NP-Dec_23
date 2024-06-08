package Lec45;

import java.util.HashMap;
import java.util.List;



public class Replace_Words {

	class Trie {

		class Node {
			char ch;
			HashMap<Character, Node> chlid = new HashMap<>();
			boolean isterminal;
		}

		private Node root;

		public Trie() {
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
				} else {
					Node nn = new Node();
					nn.ch = ch;
					curr.chlid.put(ch, nn);
					curr = nn;
				}
			}
			curr.isterminal = true;
		}

		public String isreplace(String word) {
			// TODO Auto-generated method stub
			String replace = "";
			Node curr = root;
			for (int i = 0; i < word.length(); i++) {
				if (curr.isterminal) {
					return replace;
				}
				char ch = word.charAt(i);
				if (curr.chlid.containsKey(ch)) {
					replace += ch;
					curr = curr.chlid.get(ch);
				} else {
					return word;
				}

			}
			return replace;
		}
	}

	public String replaceWords(List<String> dictionary, String sentence) {
		Trie t = new Trie();
		for (String s : dictionary) {
			t.insert(s);
		}
		String[] arr = sentence.split(" ");
		String new_sentence = "";
		for (int i = 0; i < arr.length; i++) {
			new_sentence = new_sentence + t.isreplace(arr[i]) + " ";
		}
		return new_sentence;
	}
}









