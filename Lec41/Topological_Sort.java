package Lec41;

import java.util.*;

public class Topological_Sort {
	private HashMap<Integer, HashMap<Integer, Integer>> map;

	public Topological_Sort(int v) {
		// TODO Auto-generated constructor stub
		map = new HashMap<>();
		for (int i = 0; i <= v; i++) {
			map.put(i, new HashMap<>());
		}
	}

	public void addedge(int v1, int v2) {
		map.get(v1).put(v2, 0);

	}

	public int[] Indgree() {
		int v = map.size();
		int[] arr = new int[v];
		for (int v1 : map.keySet()) {
			for (int v2 : map.get(v1).keySet()) {
				arr[v2]++;
			}
		}
		return arr;
	}

	public void Topological() {
		int[] in = Indgree();
		Queue<Integer> q = new LinkedList<>();
		for (int i = 0; i < in.length; i++) {
			if (in[i] == 0) {
				q.add(i);
			}
		}
		while (!q.isEmpty()) {
			int v = q.poll();
			System.out.print(v + " ");

			for (int nbrs : map.get(v).keySet()) {
				in[nbrs]--;
				if (in[nbrs] == 0) {
					q.add(nbrs);
				}
			}
		}

	}
	public boolean isCycle() {
		int[] in = Indgree();
		Queue<Integer> q = new LinkedList<>();
		for (int i = 0; i < in.length; i++) {
			if (in[i] == 0) {
				q.add(i);
			}
		}
		int c=0;
		while (!q.isEmpty()) {
			int v = q.poll();
			c++;

			for (int nbrs : map.get(v).keySet()) {
				in[nbrs]--;
				if (in[nbrs] == 0) {
					q.add(nbrs);
				}
			}
		}
		return c!=map.size();

	}
	public static void main(String[] args) {
		Topological_Sort ts = new Topological_Sort(7);
		ts.addedge(1, 2);
		ts.addedge(1, 0);
		ts.addedge(1, 4);
		ts.addedge(4, 3);
		ts.addedge(3, 2);
		ts.addedge(4, 5);
		ts.addedge(5, 7);
		ts.addedge(6, 3);
		ts.addedge(6, 7);
		ts.Topological();
	}
}
