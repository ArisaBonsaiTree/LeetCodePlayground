import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class BacktrackingProject {
    public static void main(String[] args) {
        new BacktrackingProject().runMe();
    }

    //public List<List<Integer>> combinationSum(int[] candidates, int target) {
    public void runMe() {
        int[] candidates = {3, 4};

        List<List<Integer>> list = new ArrayList<>();
        LinkedList<Integer> comb = new LinkedList<>();

        int target = 10;
        System.out.println("Printing values as we go");
        backtrack(list, comb, 0, candidates, target, 0);
        System.out.println("Print the entire list");
        System.out.println(list);
    }

    public void backtrack(List<List<Integer>> list, LinkedList<Integer> comb, int start, int[] candidates, int target, int sum){
        System.out.println(comb);

        if(sum >= target){

            list.add(new ArrayList<>(comb));
            return;
        }

        for(int i = start; i < candidates.length; i++){
            comb.add(candidates[i]);
            backtrack(list, comb, i, candidates, target, sum += candidates[i]);
            comb.removeLast();
        }

    }
}
