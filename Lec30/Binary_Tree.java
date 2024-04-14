package Lec30;

import java.util.*;
import java.util.Queue;
import java.util.Scanner;

public class Binary_Tree {
	class Node {
		int val;
		Node left;
		Node right;
	}

	private Node root;

	public Binary_Tree() {
		// TODO Auto-generated constructor stub
		root = CreateTree();
	}

	Scanner sc = new Scanner(System.in);

	private Node CreateTree() {
		// TODO Auto-generated method stub
		int item = sc.nextInt();
		Node nn = new Node();
		nn.val = item;
		boolean hlc = sc.nextBoolean();
		if (hlc) {
			nn.left = CreateTree();
		}
		boolean hrc = sc.nextBoolean();
		if (hrc) {
			nn.right = CreateTree();
		}
		return nn;

	}

	public void Display() {
		// TODO Auto-generated method stub
		Display(root);
	}

	private void Display(Node node) {
		if (node == null) {
			return;
		}
		String s = "";
		s = "<--" + node.val + "-->";
		if (node.left != null) {
			s = node.left.val + s;
		} else {
			s = "." + s;
		}
		if (node.right != null) {
			s = s + node.right.val;
		} else {
			s = s + ".";
		}
		System.out.println(s);
		Display(node.left);
		Display(node.right);

	}

	public int max() {
		return max(root);
	}

	private int max(Node nn) {
		if (nn == null) {
			return Integer.MIN_VALUE;
		}

		int l = max(nn.left);
		int r = max(nn.right);
		return Math.max(nn.val, Math.max(l, r));

	}

	public boolean find(int item) {

		return find(root, item);
	}

	private boolean find(Node nn, int item) {
		if (nn == null) {
			return false;
		}
		if (nn.val == item) {
			return true;
		}
		boolean l = find(nn.left, item);
		boolean r = find(nn.right, item);
		return l || r;

	}

	public int ht() {
		return ht(this.root);
	}

	private int ht(Node node) {
		if (node == null) {
			return -1;
		}

		int l = ht(node.left);
		int r = ht(node.right);
		return Math.max(l, r) + 1;

	}

	public void PreOrder() {
		PreOrder(this.root);
		System.out.println();
	}

	private void PreOrder(Node node) {
		if (node == null) {
			return;
		}
		System.out.print(node.val + " ");
		PreOrder(node.left);
		PreOrder(node.right);
	}

	public void POStOrder() {
		POStOrder(this.root);
		System.out.println();
	}

	private void POStOrder(Node node) {
		if (node == null) {
			return;
		}

		POStOrder(node.left);
		POStOrder(node.right);
		System.out.print(node.val + " ");
	}

	public void INOrder() {
		INOrder(this.root);
		System.out.println();
	}

	private void INOrder(Node node) {
		if (node == null) {
			return;
		}

		INOrder(node.left);
		System.out.print(node.val + " ");
		INOrder(node.right);

	}

	public void levelOrder() {
		Queue<Node> q  =new LinkedList<>();
		q.add(root);// add last
		while(!q.isEmpty()) {
			Node n =q.poll();// remove first
			System.out.print(n.val+" ");
			if(n.left!=null) {
				q.add(n.left);
			}
			if(n.right!=null) {
				q.add(n.right);
			}
		}
		System.out.println();

	}
}



























