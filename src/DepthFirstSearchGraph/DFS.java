package DepthFirstSearchGraph;

import java.util.List;
import java.util.Stack;

public class DFS {

	public void dfs(List<Vertex> vList) {
		for (Vertex v : vList) {
			if (!v.isVisited()) {
				v.setVisited(true);
				dfsWithStack(v);
			}
		}
	}

	public static void dfsWithStack(Vertex root) {

		Stack<Vertex> stack = new Stack<>();
		stack.push(root);
		root.setVisited(true);

		while (!stack.isEmpty()) {
			Vertex visitedVertex = stack.pop();
			System.out.println("vertex: " + visitedVertex);

			for (Vertex v : visitedVertex.getNeighbourList()) {
				if (!v.isVisited()) {
					stack.push(v);
					v.setVisited(true);
				}
			}
		}
	}
}
