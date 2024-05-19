package Lec40;

import java.util.*;
import java.util.List;

public class Graph_Valid_Tree {
	class Solution {
		public boolean validTree(int n, int[][] edges) {
			HashMap<Integer, List<Integer>> map = new HashMap<>();
			for (int i = 0; i < n; i++) {
				map.put(i, new ArrayList<>());
			}
			for (int i = 0; i < edges.length; i++) {
				int a1 = edges[i][0];
				int b1 = edges[i][1];
				map.get(a1).add(b1);
				map.get(b1).add(a1);
			}
			return DFT(map);

		}

		public boolean DFT(HashMap<Integer, List<Integer>> map) {
			Stack<Integer> st = new Stack<>();
			HashSet<Integer> visited = new HashSet<>();
			int c = 0;
			for (int src : map.keySet()) {
				if (visited.contains(src)) {
					continue;
				}
				c++;
				st.push(src);
				while (!st.isEmpty()) {
					// 1. remove
					int rv = st.pop();
					// 2. Ignore if Already visited
					if (visited.contains(rv)) {
						return false;
					}

					// 3. visited;
					visited.add(rv);

					// 5. add unvisited nbsr
					for (int nbrs : map.get(rv)) {
						if (!visited.contains(nbrs)) {
							st.push(nbrs);
						}
					}

				}
			}
			return c==1;
		}
	}
}
