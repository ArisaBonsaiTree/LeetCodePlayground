package Graphs;

import java.util.LinkedList;
import java.util.Queue;

public class NumberOfIslands {
    public static void main(String[] args) {
        new NumberOfIslands().runMe();
    }

    private void runMe(){
        // Iterate over a graph [2-D array]
        iterateGraph();

        // DFS version
        System.out.printf("DFS got us:\t");
        islandProblemDFS();
        System.out.println();

        // BFS version
        System.out.printf("BFS got us:\t");
        islandProblemBFS();
    }

    private void iterateGraph(){
        String[][] graph = {
                {"a","b","c","d","e"},
                {"a1","b1","c1","d1","e1"},
                {"a2","b2","c2","d2","e2"}

        };

        for(int row = 0; row < graph.length; row++){

            for(int col = 0; col < graph[0].length; col++){
                System.out.printf("%s\t", graph[row][col]);
            }
            System.out.println();
        }
        System.out.println("==================");
    }

    private void islandProblemBFS(){
        // 4 islands
        int[][] islands = {
                {0,1,1,1,1,0},
                {1,0,0,1,0,1},
                {0,0,0,0,0,0},
                {0,0,0,0,0,0},
                {0,0,0,0,0,1},
        };

        int numberOfRows = islands.length;
        int numberOfCols = islands[0].length;
        int numOfIslands = 0;

        for(int row = 0; row < islands.length; row++){
            for(int col = 0; col < islands[0].length; col++){
                if(islands[row][col] == 1){
                    bfs(islands, row, col, numberOfCols, numberOfRows);
                    numOfIslands++;
                }

            }
        }


        System.out.println(numOfIslands);
    }
    private void bfs(int[][] island, int row, int col, int numberOfCols, int numberOfRows){
        Queue<Integer> q = new LinkedList<>();
        int converted = (row * numberOfCols) + col;
        q.add(converted);

        while(!q.isEmpty()){
            // 0
            int number = q.poll();

            // Converted 0 into {0,0}
            int r = number/numberOfCols;
            int c = number % numberOfCols;

            if(r + 1 < numberOfRows && island[r+1][c] == 1){
                q.add(((r+1) * numberOfCols) + c);

                island[r+1][c] = 0;
            }

            if(c + 1 < numberOfCols && island[r][c + 1] == 1){
                q.add(((r) * numberOfCols) + c + 1);
                island[r][c + 1] = 0;
            }

            if(r - 1 >= 0 && island[r - 1][c] == 1){
                q.add(((r - 1) * numberOfCols) + c);
                island[r - 1][c] = 0;
            }

            if(c - 1 >= 0 && island[r][c - 1] == 1){
                q.add(((r) * numberOfCols) + c - 1);
                island[r][c - 1] = 0;
            }
        }
    }


    private void islandProblemDFS(){
        // 4 islands
        int[][] islands = {
                {0,1,1,1,1,0},
                {1,0,0,1,0,1},
                {0,0,0,0,0,0},
                {0,0,0,0,0,0},
                {0,0,0,0,0,1},
        };

        int numberOfIslands = 0;

        for(int row = 0; row < islands.length; row++){
            for(int col = 0; col < islands[0].length; col++){
                if(islands[row][col] == 1){
                    dfs(islands, row, col);
                    numberOfIslands++;
                }
            }
        }

        System.out.println(numberOfIslands);
    }

    private void dfs(int[][] island, int row, int col){
        // Base Case for recursion
        if(
                row < 0 ||
                        col < 0 ||
                        row >= island.length ||
                        col >= island[0].length ||
                        island[row][col] == 0
        ){
            return;
        }


        island[row][col] = 0;

        dfs(island, row + 1, col);
        dfs(island, row, col  + 1);

        dfs(island, row - 1, col);
        dfs(island, row, col  - 1);
    }

}

