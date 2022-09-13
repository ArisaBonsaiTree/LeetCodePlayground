import jdk.swing.interop.SwingInterOpUtils;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
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
        islandProblem();
    }

    private static void islandProblem(){
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

    private static void dfs(int[][] island, int row, int col){
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
