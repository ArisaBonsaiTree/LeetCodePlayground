import java.util.HashMap;
import java.util.PriorityQueue;

public class PrQ {
    public static void main(String[] args) {

        HashMap<String, Integer> map = new HashMap<>();

        map.put("Ganyu", 5);
        map.put("Goku", 2);

        // Min-Heap
        PriorityQueue<String> pq = new PriorityQueue<>(
                (a,b) -> map.get(b) - map.get(a)
        );

        for(String s:map.keySet()){
            pq.add(s);
        }

        System.out.println(pq.poll());
        System.out.println(pq.poll());



    }
}
