import java.util.HashMap;
import java.util.PriorityQueue;

public class Heap {
    private static int size = 3;
    public static void main(String[] args) {
        HashMap<String, Integer> map = new HashMap<>();

        PriorityQueue<String> min = new PriorityQueue<>(
                (a,b) -> map.get(a) - map.get(b)
        );

        map.put("John", 5);
        map.put("Steve", 7);
        map.put("Ganyu", 10);
        map.put("Luke", 2);
        map.put("Keqing", 3);
        map.put("Mark", 0);


        for(String key: map.keySet()){

            min.add(key);
            if(min.size() > size){
                min.poll();
            }
        }

        System.out.println(min.poll());
        System.out.println(min.iterator().next());
        

    }
}
