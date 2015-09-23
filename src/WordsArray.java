import java.util.ArrayList;

public class WordsArray {

    private final ArrayList<Integer> hash;

    public WordsArray(ArrayList<String> worldList) {

        hash = new ArrayList<Integer>();
        configureWordsArray(worldList);
    }

    private void configureWordsArray(ArrayList<String> worldList) {
        for(String word:worldList){
            hash.add(getHash(word), new Integer(1));
        }
    }

    public boolean contains(String word) {
        return 0 != hash.get(getHash(word));
    }

    public int getHash(String word) {
        return word.hashCode()/10;
    }
}
