package WordieProject;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Scanner;

public class Wordie {
    ArrayList<String> combo = new ArrayList<>();

    public static void main(String[] args) throws FileNotFoundException {
        new Wordie().runMe();
    }

    public void runMe() throws FileNotFoundException {

        String[][] graph = {
                {"a,t"},
                {"c,d"}
        };
        iterateGraph(graph);



    }

    private void dfs(String[][] graph, int row, int col){



    }

    private void iterateGraph(String[][] graph) throws FileNotFoundException {
        File file = new File("C:\\Users\\arisa\\IdeaProjects\\LeetCodePlayground\\src\\WordieProject\\words");
        //File file = new File("C:\\Users\\arisa\\IdeaProjects\\LeetCodePlayground\\src\\WordieProject\\test");
        Scanner scanner = new Scanner(file);

        HashSet<String> set = new HashSet<>();
        while(scanner.hasNext()){
            set.add(scanner.next());
            //System.out.println(scanner.next());
        }
        System.out.println(set.size());

        for(int row = 0; row < graph.length; row++){

            for(int col = 0; col < graph[0].length; col++){
                System.out.printf("%s\t", graph[row][col]);
                combo.add(graph[row][col]);

                String[][] copy = graph;

                dfs(copy, row, col);
            }
            System.out.println();
        }
        System.out.println("==================");

        if(set.contains("test")){
            System.out.println("FOUND TEST");
        }
    }


}
