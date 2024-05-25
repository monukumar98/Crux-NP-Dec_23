package Lec41;

import java.util.Comparator;
import java.util.HashMap;
import java.util.HashSet;
import java.util.PriorityQueue;

public class Dijsktra_Algo {
	private HashMap<Integer, HashMap<Integer, Integer>> map;

	public Dijsktra_Algo(int v) {
		// TODO Auto-generated constructor stub
		map = new HashMap<>();
		for (int i = 1; i <= v; i++) {
			map.put(i, new HashMap<>());
		}
	}

	public void AddEdge(int v1, int v2, int cost) {
		map.get(v2).put(v1, cost);
		map.get(v1).put(v2, cost);

	}

	class DijsktraPair {
		int vtx;
		String acqpath;
		int cost;

		public DijsktraPair(int vtx, String acqpath, int cost) {
			// TODO Auto-generated constructor stub
			this.vtx = vtx;
			this.acqpath = acqpath;
			this.cost = cost;
		}

		@Override
		public String toString() {
			return vtx + " " + acqpath + " @ " + cost;
		}
	}

	public void Dijsktra(int src) {
		PriorityQueue<DijsktraPair> pq = new PriorityQueue<>(new Comparator<DijsktraPair>() {

			@Override
			public int compare(DijsktraPair o1, DijsktraPair o2) {
				// TODO Auto-generated method stub
				return o1.cost - o2.cost;
			}

		});
		HashSet<Integer> visited = new HashSet<>();
		pq.add(new DijsktraPair(src, "" + src, 0));// 1,"1",0
		while (!pq.isEmpty()) {
			DijsktraPair rp = pq.poll();
			if (visited.contains(rp.vtx)) {
				continue;
			}
			visited.add(rp.vtx);
			System.out.println(rp);

			for (int nbrs : map.get(rp.vtx).keySet()) {
				if (!visited.contains(nbrs)) {
					int cost = map.get(nbrs).get(rp.vtx);// 4 se 5 ke edge ka cost
					pq.add(new DijsktraPair(nbrs, rp.acqpath + nbrs, rp.cost + cost));
				}
			}
		}

	}

	public static void main(String[] args) {
		Dijsktra_Algo g = new Dijsktra_Algo(7);
		g.AddEdge(1, 2, 4);
		g.AddEdge(2, 3, 1);
		g.AddEdge(4, 3, 2);
		g.AddEdge(4, 1, 12);
		g.AddEdge(4, 5, 7);
		g.AddEdge(6, 5, 8);
		g.AddEdge(6, 7, 5);
		g.AddEdge(7, 5, 9);
		g.Dijsktra(1);
	}
}
