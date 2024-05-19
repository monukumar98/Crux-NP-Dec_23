package Lec40;

import java.util.*;

public class Is_Graph_Bipartite {

	class Solution {
		public boolean isBipartite(int[][] graph) {
			Queue<BipartitePair> q = new LinkedList<>();
			HashMap<Integer, Integer> visited = new HashMap<>();
			for (int src = 0; src < graph.length; src++) {
				if (visited.containsKey(src)) {
					continue;
				}
				q.add(new BipartitePair(src, 0));
				while (!q.isEmpty()) {
					// 1. remove
					BipartitePair rv = q.poll();
					// 2. Ignore if Already visited
					if (visited.containsKey(rv.vtx)) {
						if (visited.get(rv.vtx) != rv.dis) {
							return false;
						} else {
							continue;
						}
					}

					// 3. visited;
					visited.put(rv.vtx, rv.dis);
					// 5. add unvisited nbsr
					for (int nbrs : graph[rv.vtx]) {
						if (!visited.containsKey(nbrs)) {
							q.add(new BipartitePair(nbrs, rv.dis + 1));
						}
					}

				}
			}
			return true;

		}
	}

	class BipartitePair {
		int vtx;
		int dis;

		public BipartitePair(int vtx, int dis) {
			// TODO Auto-generated constructor stub
			this.vtx = vtx;
			this.dis = dis;
		}
	}

}
