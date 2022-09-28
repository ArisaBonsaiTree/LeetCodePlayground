package SinglePassDiff;

import java.util.*;

public class SinglePass {
    public static void main(String[] args) {

        int[] arr = {7, 4, 3, 1, 6, 2, 0, 6, 9, 12};
        //int[] arr = {7, 4, 3, 1};

        Arrays.sort(arr);
        for(int a: arr){
            System.out.println(a);
        }
        System.out.println("=============");

        PriorityQueue<Integer> heap = new PriorityQueue<>(
                (a,b) -> (b - a)
        );

        int k = 2;

        for(int i = 0; i < arr.length - 1; i++) {
            for (int j = i + 1; j < arr.length - 1; j++) {

                int value = arr[j] - arr[i];

                if (heap.size() == k && heap.peek() > value) {
                    heap.poll();
                    heap.add(value);
                } else if (heap.size() < k) {
                    heap.add(value);
                }

            }
        }

        while(k > 0){
            k--;
            System.out.println(heap.poll());
        }

    }
}
