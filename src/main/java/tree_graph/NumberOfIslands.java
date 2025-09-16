package main.java.tree_graph;

public class NumberOfIslands {

    public int numIslands(char[][] grid) {
        int count =0;
        for(int r=0;  r < grid.length;r++ ){
            for(int j=0; j< grid[0].length;j++){
                if(grid[r][j] == '1'){
                    count++;
                    dfs(grid,r,j);
                }
            }
        }
        return count;
    }

    private void dfs(char[][] grid, int r, int j){
        if(r < 0 || r >= grid.length || j < 0 || j >= grid[0].length || grid[r][j] == '0') return;
        grid[r][j] = '0';
        dfs(grid,r-1,j);
        dfs(grid,r+1,j);
        dfs(grid,r,j-1);
        dfs(grid,r,j+1);
    }
}
