package Backtracking;

import java.util.*;

public class BacktrackingProject {
    public static void main(String[] args) {
        new BacktrackingProject().runMe();
    }

    //public List<List<Integer>> combinationSum(int[] candidates, int target) {
    public void runMe() {
        int[] candidates = {3, 4, 3};

        List<List<Integer>> list = new ArrayList<>();
        LinkedList<Integer> comb = new LinkedList<>();

        Set<Integer> seen = new HashSet<>();

        int target = 10;
        System.out.println("Printing values as we go");
        backtrack(list, comb, 0, candidates, target, 0, seen);
//        System.out.println("Print the entire list");
//        System.out.println(list);

    }

    public void backtrack(List<List<Integer>> list, LinkedList<Integer> comb, int start, int[] candidates, int target, int sum, Set<Integer> seen){
        System.out.println(comb);



        if(sum >= target){

            list.add(new ArrayList<>(comb));
            return;
        }

        for(int i = start; i < candidates.length; i++){
            comb.add(candidates[i]);
            seen.add(candidates[i]);

            backtrack(list, comb, i, candidates, target, sum += candidates[i], seen);

            comb.removeLast();
            seen.clear();
        }

    }
}
