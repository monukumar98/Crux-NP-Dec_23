package Lec39;

import java.util.HashSet;

public class Graph_Client {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Graph g = new Graph(7);
		g.AddEdge(1, 2, 4);
		g.AddEdge(2, 3, 1);
		g.AddEdge(4, 3, 2);
		g.AddEdge(4, 1, 12);
		g.AddEdge(4, 5, 7);
		g.AddEdge(6, 5, 8);
		g.AddEdge(6, 7, 5);
		g.AddEdge(7, 5, 9);
		g.display();
		System.out.println(g.haspath(1, 6, new HashSet<>()));
		g.printAllpath(1, 6, new HashSet<>(), "");
		g.BFT();

	}

}
