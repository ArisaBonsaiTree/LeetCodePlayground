import java.util.*;

public class RecoAlgo {
    public static void main(String[] args){
        int numreviews = 5;
        List<String> repository = new ArrayList<>(Arrays.asList("mobile", "mouse", "moneypot", "monitor", "mousepad"));
        String customerQuery = "mouse";
        Collections.sort(repository);
        System.out.println(new RecoAlgo().threeKeywordSuggestions(numreviews, repository, customerQuery));
    }


    public List<List<String>> threeKeywordSuggestions(int numreviews, List<String> repoistory, String customerQuery){
        List<List<String>> result = new ArrayList<>();

        // This will get us the user input
        for(int i = 2; i <= customerQuery.length(); i++){
            String sub = customerQuery.substring(0, i).toLowerCase();
            System.out.println(sub);
            List<String> potential = new ArrayList<>();
            // Now we need to iterate over the repository
            for(String word: repoistory){
                if(potential.size() >= 3) break;

                String gather = word.substring(0, i).toLowerCase();

                if(gather.equals(sub)) potential.add(word);
            }
            result.add(potential);
        }


        return result;
    }


}
