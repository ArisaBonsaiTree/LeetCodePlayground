import java.util.*;

public class RecoAlgo {
    public static void main(String[] args){
        int numreviews = 5;
        List<String> repository = new ArrayList<>(Arrays.asList("mobile", "mouse", "moneypot", "monitor", "mousepad"));
        String customerQuery = "mouse";

        Collections.sort(repository);
        System.out.println(repository);
        System.out.println(new RecoAlgo().threeKeywordSuggestions(numreviews, repository, customerQuery));

    }
    private List<String> getPrefix(String word){
        ArrayList<String> prefix = new ArrayList<>();

        for(int i = 2; i <= word.length(); i++){
            prefix.add(word.substring(0, i).toLowerCase());
        }

        return prefix;
    }

    public List<List<String>> threeKeywordSuggestions(int numreviews, List<String> repoistory, String customerQuery){
        List<List<String>> result = new ArrayList<>();

        List<String> prefix = getPrefix(customerQuery);

        for(String p: prefix){
            List<String> potential = new ArrayList<>();

            for(String word: repoistory){
                if(potential.size() >= 3) break;

                if(word.startsWith(p)) potential.add(word);
            }

            result.add(potential);
        }




        return result;
    }


}
