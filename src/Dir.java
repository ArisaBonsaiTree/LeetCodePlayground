public class Dir {
    public static void main(String[] args) {
        int[][] dir = {
                {0,1},
                {0,-1},
                {1,0},
                {-1,0}
        };

        for(int[] d: dir){
            System.out.printf("d[0]: %d\td[1]: %d\n",d[0], d[1]);
        }
    }
}
