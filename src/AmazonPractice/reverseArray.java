package AmazonPractice;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class reverseArray {
    public static void main(String[] args) {
        List<Integer> arr = new ArrayList<Integer>(Arrays.asList(0,1,2,3,4));
        List<List<Integer>> operations = new ArrayList<>(
                Arrays.asList(
                        new ArrayList<>(Arrays.asList(0,4)),
                        new ArrayList<>(Arrays.asList(0,2))
                )
        );


        System.out.println("Before operations: " + arr);
        System.out.println("Operations: " + operations);
        System.out.println("After operation: " + new reverseArray().runMe(arr, operations));
    }


    public List<Integer> runMe(List<Integer> arr, List<List<Integer>> operations){
        for(List<Integer> operation: operations){
            Integer i = operation.get(0);
            Integer j = operation.get(1);
            System.out.println(j);

            List<Integer> subList = arr.subList(i,j+1);
            Collections.reverse(subList);
        }


        return arr;
    }
}
