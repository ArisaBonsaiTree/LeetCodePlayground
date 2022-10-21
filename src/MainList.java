import java.util.ArrayList;
import java.util.List;
import java.util.*;
public class MainList {
    public static void main(String[] args) {
        List<List<Integer>> list = new ArrayList<>();
        list.add(new ArrayList<>());
        int[][] test = {
                {15, 20},
                {0,30}
        };
        Arrays.sort(test, (a,b) -> b[0] - a[0]);
//        for(int[] i:test){
//            System.out.println(i[0]);
//            System.out.println(i[1]);
//        }

        for(int i = 0; i < test.length; i++){
            System.out.println(test[i][1]);
        }

        LinkedHashSet<Integer> lhs = new LinkedHashSet<>();
        System.out.println("++++++++++++++");
        lhs.add(11);
        lhs.add(10);
        lhs.add(5);



        int leastUsedKey = 0;

        // This will get us the last index
        for(int n:lhs){
            System.out.println(n);
        }

        System.out.println("==========");
        Iterator itr = lhs.iterator();

        while (itr.hasNext()){
            System.out.println(itr.next());
        }

        System.out.println("==========");

        System.out.println(leastUsedKey);
        System.out.println("67666666666666666666666");
        System.out.println("00000000000000000000000");
        System.out.println("67666666666666666666666");

        // Lets make the LRU
        LinkedHashMap<Integer, Integer> lhm = new LinkedHashMap<>();

        lhm.put(2, 10);
        lhm.put(5, 10);
        lhm.put(7, 10);
        lhm.put(8, 10);



        for(int n: lhm.keySet()){
            System.out.println(n);
        }

        lhm.remove(2);
        lhm.put(2, 10);

        int lru = 0;
        //int lru = lhm.keySet().iterator().next();
        for(int n: lhm.keySet()){
            lru = n;
            break;
        }


        lhm.remove(lru);
        System.out.println("-------------");
        for(int n: lhm.keySet()){
            System.out.println(n);
        }
        char c = 100;
        // Letters (English) has a range of 0 - 26
        // If we offset this by 100 we will be safe from any
        System.out.println(c);
        System.out.println("BOOLEAN ZONE");
        boolean check = runFalse() | runTrue() | runFalse();
    }

    static private boolean runFalse(){
        System.out.println("FALSE");
        return false;
    }

    static private boolean runTrue(){
        System.out.println("TRUE");
        return true;
    }
}
