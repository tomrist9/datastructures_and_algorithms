package main.java.dfs;

public class NumberOfProvince {
    public int findCircleNum(int[][] isConnected) {
        int provinceCount=0;
        int n = isConnected.length;
        boolean[] visited = new boolean[n];
        for(int city=0; city<n; city++){
            if(!visited[city]){
                provinceCount++;
                dfs(city, isConnected, visited);
            }
        }
        return provinceCount;

    }
    private void dfs(int city, int[][] isConnected, boolean[] visited){
        visited[city]=true;
        for(int i=0; i<isConnected.length; i++){

            if(isConnected[city][i]==1&& !visited[i]){
                dfs(i, isConnected, visited);
            }
        }

    }
}