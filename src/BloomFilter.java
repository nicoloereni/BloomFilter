
public class BloomFilter {

    private final WordsArray wordsArray;

    public BloomFilter(DataFactoryInterface dataFactory) {
        this.wordsArray = new WordsArray(dataFactory.all());
    }


    public boolean isWorldInSet(String word) {
        return wordsArray.contains(word);
    }
}
