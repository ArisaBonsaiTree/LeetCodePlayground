import java.util.*;

public class isDigitTest {
    public static void main(String[] args) {
        char c = '-';
        System.out.println(Character.isDigit(c));

        Map<Integer, Character> map = new HashMap<>();
        map.put(1000, 'V');
        map.put(10, 'V');

        int x = 2010;
        System.out.println(x);
        for(int i : map.keySet()){
            System.out.println(i);
            while(i <= x && x > 0){
                x = x - i;
                System.out.println("MINUS ");
            }

        }
        System.out.println(x);
    }
}
