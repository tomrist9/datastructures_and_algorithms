package main.java.tree_graph;

import java.util.ArrayList;
import java.util.List;

public class ReorderRoutes {
    public int minReorder(int n, int[][] connections) {
        List<List<int[]>> graph = new ArrayList<>();
        for(int i=0; i<n; i++){
            graph.add(new ArrayList<>());
        }
        for(int[]connected :connections){
            int a = connected[0];
            int b= connected[1];
            graph.get(a).add(new int[]{b,1});
            graph.get(b).add(new int[]{a,0});
        }
        boolean[] visited = new boolean[n];


        return dfs(0, graph, visited);

    }

    private int dfs(int city, List<List<int[]>> graph, boolean[]visited){
        visited[city]=true;
        int count = 0;
        for(int[]neighbor : graph.get(city)){
            int nextCity = neighbor[0];
            int cost =neighbor[1];

            if(!visited[nextCity]){
                count+=cost;
                count+=dfs(nextCity, graph, visited);
            }
        }

        return count;
    }
}