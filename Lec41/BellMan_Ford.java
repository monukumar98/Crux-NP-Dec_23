package Lec41;

import java.util.*;

public class BellMan_Ford {
	private HashMap<Integer, HashMap<Integer, Integer>> map;

	public BellMan_Ford(int v) {
		// TODO Auto-generated constructor stub
		map = new HashMap<>();
		for (int i = 1; i <= v; i++) {
			map.put(i, new HashMap<>());
		}
	}

	public void AddEdge(int v1, int v2, int cost) {
		map.get(v1).put(v2, cost);

	}

	class Edge_Pair {
		int v1;
		int v2;
		int cost;

		public Edge_Pair(int v1, int v2, int cost) {
			// TODO Auto-generated constructor stub
			this.v1 = v1;
			this.v2 = v2;
			this.cost = cost;
		}
	}

	public List<Edge_Pair> getAllEdge() {
		List<Edge_Pair> ll = new ArrayList<>();
		for (int v1 : map.keySet()) {
			for (int v2 : map.get(v1).keySet()) {
				int cost = map.get(v1).get(v2);
				ll.add(new Edge_Pair(v1, v2, cost));
			}
		}
		return ll;

	}

	public void BellManFord() {
		int v = map.size();
		int[] dis = new int[v + 1];
		for (int i = 2; i < dis.length; i++) {
			dis[i] = 99999999;
		}
		List<Edge_Pair> ll = getAllEdge();
		for (int i = 1; i <= v; i++) {
			for (Edge_Pair e : ll) {
				if (i == v && dis[e.v2] > dis[e.v1] + e.cost) {
					System.out.println("-ve wt ka cycle hai");
					return;
				}
				if (dis[e.v2] > dis[e.v1] + e.cost) {
					dis[e.v2] = dis[e.v1] + e.cost;
				}
			}
		}

		for (int i = 1; i < dis.length; i++) {
			System.out.print(dis[i] + " ");
		}
	}

	public static void main(String[] args) {
		BellMan_Ford bfd = new BellMan_Ford(5);
		bfd.AddEdge(1, 2, 8);
		bfd.AddEdge(2, 5, -2);
		//bfd.AddEdge(2, 5, 2);
		bfd.AddEdge(5, 2, 1);
		bfd.AddEdge(4, 5, 4);
		bfd.AddEdge(3, 4, -3);
		bfd.AddEdge(1, 3, 4);
		bfd.AddEdge(1, 4, 5);
		bfd.BellManFord();

	}
}
