package Lec33;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Create_Tree_Level_Order {
	class Node {
		int val;
		Node left;
		Node right;
	}

	private Node root;

	public Create_Tree_Level_Order() {
		// TODO Auto-generated constructor stub
		CearteTree();
	}

	Scanner sc = new Scanner(System.in);

	private void CearteTree() {
		// TODO Auto-generated method stub
		Queue<Node> q = new LinkedList<>();
		int item = sc.nextInt();
		Node nn = new Node();
		nn.val=item;
		root=nn;
		q.add(nn);
		while(!q.isEmpty()) {
			Node r=q.poll();
			int c1=sc.nextInt();
			int c2=sc.nextInt();
			if(c1!=-1) {
				Node node = new Node();
				node.val=c1;
				r.left=node;
				q.add(node);
			}
			if(c2!=-1) {
				Node node = new Node();
				node.val=c2;
				r.right=node;
				q.add(node);
			}
		}

	}

}
