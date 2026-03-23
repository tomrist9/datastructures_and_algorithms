package main.java.dynamicprogramming.onedimensionaldp;

public class LongestIncreasingPathMatrix {
    int[][] dirs = {{1,0},{-1,0},{0,1},{0,-1}};
    public int longestIncreasingPath(int[][] matrix) {
        int n=matrix.length;
        int m=matrix[0].length;
        int max=0;
        int[][]dp = new int[n][m];
        for(int i=0; i<n; i++){
            for(int j=0; j<m; j++){
                max=Math.max(max, dfs(matrix, i, j, dp));
            }
        }
        return max;
    }

    private int dfs(int[][]matrix, int i, int j, int[][]dp){
        if(dp[i][j]!=0) return dp[i][j];
        int max =1;

        for(int[]d :dirs){
            int ni= i+d[0];
            int nj=j+d[1];

            if(ni>=0 && ni<matrix.length && nj>=0 && nj<matrix[0].length && matrix[ni][nj]>matrix[i][j]){
                max=Math.max(max, 1+dfs(matrix, ni, nj, dp));
            }
        }
        dp[i][j]=max;
        return max;
    }
}