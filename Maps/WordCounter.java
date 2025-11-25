package Maps;

import java.util.HashMap;
import java.util.TreeMap;

public class WordCounter {
    public WordCounter() {
    }

    public static void main(String[] args) {
        String input = "apple banana apple orange banana apple";
        String[] words = input.split(" ");
        TreeMap<String,Integer> check = new TreeMap<>();

        for (String word: words) {

            // "If key exists, add 1 to old value. If not, put 1."
            // check.merge(word, 1, Integer::sum);

            if (check.containsKey(word)){
                check.put(word, check.get(word)+1);
            }
            else{
                check.put(word, 1);
            }
        }

        for (String key: check.keySet()) {
            System.out.println(key +": "+ check.get(key));

        }
    }
}
