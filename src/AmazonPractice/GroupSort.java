package AmazonPractice;

import java.util.*;

public class GroupSort {
    public static void main(String[] args) {
        List<Integer> arr = new ArrayList<>(Arrays.asList(5,5,2,1,0,0,6,6,6));
        System.out.println(new GroupSort().groupSort(arr));
    }

    public List<List<Integer>> groupSort(List<Integer> arr){
        List<List<Integer>> result = new ArrayList<>();

        HashMap<Integer, Integer> freq = new HashMap<>();

        // Place into a HashMap
        for(int i: arr){
            freq.put(i, freq.getOrDefault(i, 0) + 1);
        }

        PriorityQueue<Integer> maxHeap = new PriorityQueue<>(
                (a,b) -> freq.get(b) - freq.get(a)
        );

        for(int key: freq.keySet()){
            maxHeap.add(key);
        }

        // Heap Method
        while(!maxHeap.isEmpty()) {
            int value = maxHeap.poll();
            List<Integer> list = new ArrayList<>(Arrays.asList(value, freq.get(value)));
            result.add(list);
        }

        return result;
    }
}
