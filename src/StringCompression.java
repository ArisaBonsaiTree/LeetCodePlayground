public class StringCompression {
    public static void main(String[] args) {
        System.out.println(new StringCompression().encode("aabcca"));
    }

    // Time: O(n) Traverse the string once
    // Space: O(1) We didn't create anything new
    public String encode(String s){
        String result = "";
        if(s == null || s.length() == 0) return result;

        int pointer = 0;
        int candidate = 0;

        while(candidate < s.length()){
            String answer = "";
            int counter = 0;

            while(pointer < s.length() && s.charAt(pointer) == s.charAt(candidate)){
                counter++;
                pointer++;
            }


            result += "" + counter + s.charAt(candidate);
            candidate = pointer;
        }



        return result;
    }
}
