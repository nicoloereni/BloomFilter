import java.util.ArrayList;

public class WordsArray {

    private final int [] hash;

    public WordsArray(ArrayList<String> worldList) {

        hash = new int[999999];
        configureWordsArray(worldList);
    }

    private void configureWordsArray(ArrayList<String> worldList) {
        for(String word:worldList){
            hash[getHash(word)] = 1;
        }
    }

    public boolean contains(String word) {
        return 0 < hash[getHash(word)];
    }

    public int getHash(String word) {
        return -1;
    }
}
