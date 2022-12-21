//Representation of a graph using adjacency list

import java.util.*;

//This code is for undirected graph 
public class AdjacencyListGraph {

    static void addEdge(ArrayList<ArrayList<Integer> > adj,
						int u, int v)
	{
		adj.get(u).add(v);
		adj.get(v).add(u);
	}

    static void printGraph(ArrayList<ArrayList<Integer>> adj) {
        for(int i=0;i<adj.size();i++) {
            System.out.println("Adjacency list for vertice " + i);
            for(int j=0; j <adj.get(i).size();j++) {
                System.out.println("Connected components -> "+adj.get(i).get(j));
            }
        }
    }

    public static void main(String[] args) {
        //let the number of vertices be 5
        int V = 5;
        ArrayList<ArrayList<Integer> > adj = new ArrayList<ArrayList<Integer> >(V);
        for(int i=0;i<V;i++) 
            adj.add(new ArrayList<Integer>());

            
            addEdge(adj, 0, 1);
            addEdge(adj, 0, 4);
            addEdge(adj, 1, 2);
            addEdge(adj, 1, 3);
            addEdge(adj, 1, 4);
            addEdge(adj, 2, 3);
            addEdge(adj, 3, 4);

            printGraph(adj);
              
    }
}