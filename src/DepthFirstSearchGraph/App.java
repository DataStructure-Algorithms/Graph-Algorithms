package DepthFirstSearchGraph;

import java.util.ArrayList;
import java.util.List;

public class App {

	public static void main(String[] args) {

		Vertex vertex1 = new Vertex(1);
		Vertex vertex2 = new Vertex(2);
		Vertex vertex3 = new Vertex(3);
		Vertex vertex4 = new Vertex(4);
		Vertex vertex5 = new Vertex(5);
		Vertex vertex6 = new Vertex(6);

		List<Vertex> vList = new ArrayList<>();

		vertex1.addNeighbour(vertex2);
		vertex2.addNeighbour(vertex3);
		vertex3.addNeighbour(vertex4);
		vertex2.addNeighbour(vertex4);
		vertex4.addNeighbour(vertex5);

		vList.add(vertex1);
		vList.add(vertex2);
		vList.add(vertex3);
		vList.add(vertex4);
		vList.add(vertex5);
		vList.add(vertex6);

//		DFS dfs = new DFS();
		DFS_Recursive dfs = new DFS_Recursive();
		dfs.dfs(vList);
	}

}
