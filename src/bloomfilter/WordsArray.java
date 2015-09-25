package bloomfilter;

import java.util.ArrayList;

public class WordsArray {

    private final double [] hash;

    public WordsArray(ArrayList<String> worldList) {

        hash = new double[99999999];
        configureWordsArray(worldList);
    }

    private void configureWordsArray(ArrayList<String> worldList) {
        for(String word:worldList){
            hash[getHash(word)] = 1;
        }
    }

    public boolean contains(String word) {
        return 0 != hash[getHash(word)];
    }

    public int getHash(String word) {
        int hash = 1;
        for (int index = 0; index < word.length(); index++) {
            hash = hash + word.charAt(index)*((index/2)+1);
        }
        return hash;
    }
}
