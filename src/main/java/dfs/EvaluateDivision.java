package main.java.dfs;

import java.util.*;

public class EvaluateDivision {
    class Edge{
        String node;
        double weight;
        Edge(String node, double weight) {
            this.node = node;
            this.weight = weight;
        }
    }
    public double[] calcEquation(List<List<String>> equations, double[] values, List<List<String>> queries) {
        Map<String, List<Edge>> graph = new HashMap<>();
        for(int i=0; i<equations.size(); i++){
            String from = equations.get(i).get(0);
            String to = equations.get(i).get(1);
            double weight= values[i];
            graph.putIfAbsent(from, new ArrayList<>());
            graph.putIfAbsent(to, new ArrayList<>());

            graph.get(from).add(new Edge(to, weight));
            graph.get(to).add(new Edge(from, 1.0/weight));
        }


        double[] res= new double[queries.size()];
        for(int i=0; i<queries.size(); i++){
            String source = queries.get(i).get(0);
            String target = queries.get(i).get(1);
            if(!graph.containsKey(source)|| !graph.containsKey(target)){
                res[i]=-1.0;
            }else if(source.equals(target)){
                res[i]=1.0;
            }else{
                Set<String> visited= new HashSet<>();
                res[i]= dfs(source, target, graph, visited, 1.0);
            }
        }
        return res;
    }

    private double dfs(String current, String target,
                       Map<String, List<Edge>> graph, Set<String> visited,
                       double product){
        if(current.equals(target)){
            return product;
        }

        visited.add(current);
        for(Edge edge : graph.get(current)){
            if(!visited.contains(edge.node)){

                double result = dfs(edge.node, target, graph, visited, product * edge.weight);
                if(result!=-1){
                    return result;
                }

            }

        }
        return -1;
    }
}