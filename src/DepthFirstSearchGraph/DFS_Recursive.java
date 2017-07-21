package DepthFirstSearchGraph;

import java.util.List;

public class DFS_Recursive {

	public void dfs(List<Vertex> vList) {

		for (Vertex v : vList) {
			if (!v.isVisited()) {
				v.setVisited(true);
				dfsRecursive(v);
			}
		}
	}

	private void dfsRecursive(Vertex v) {
		System.out.println(v + " ");

		if (!v.isVisited()) {
			v.setVisited(true);
			dfsRecursive(v);
		}
	}

}
