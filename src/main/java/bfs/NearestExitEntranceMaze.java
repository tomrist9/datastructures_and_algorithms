package main.java.bfs;

import java.util.LinkedList;
import java.util.Queue;

public class NearestExitEntranceMaze {
    public int nearestExit(char[][] maze, int[] entrance) {
        int steps=0;
        int rows = maze.length;
        int cols=maze[0].length;

        Queue<int[]> queue = new LinkedList<>();
        int row= entrance[0];
        int col= entrance[1];
        maze[row][col]='+';
        queue.offer(new int[]{row, col});
        int[][] dirs = {
                {1,0},
                {-1, 0},
                {0, 1},
                {0,-1}
        };
        while(!queue.isEmpty()){
            int size = queue.size();
            for(int i=0; i<size; i++){
                int[]current = queue.poll();
                int r= current[0];
                int c = current[1];

                for(int[] dir :dirs){
                    int newRow = r+dir[0];
                    int newCol = c + dir[1];


                    if(newRow<0 || newRow>=rows ||
                            newCol<0 || newCol>=cols ||
                            maze[newRow][newCol]=='+'){
                        continue;
                    }
                    if(newRow==0 || newRow==rows-1||
                            newCol==0 || newCol == cols-1){
                        return steps+1;
                    }

                    maze[newRow][newCol]='+';
                    queue.offer(new int[]{newRow, newCol});
                }

            }
            steps++;
        }
        return -1;
    }
}