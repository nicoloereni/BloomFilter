import java.util.ArrayList;

public class DataFactory implements DataFactoryInterface {
    private final ArrayList<String> words;

    public DataFactory(String fileName) {
        words = createListOfWords(fileName);
    }

    private ArrayList<String> createListOfWords(String fileName) {
        return null;
    }

    public ArrayList<String> all() {
        return words;
    }
}
