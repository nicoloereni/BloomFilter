import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

public class DataFactory implements DataFactoryInterface {
    private final ArrayList<String> words;

    public DataFactory(String fileName) {
        words = createListOfWords(fileName);
    }

    private ArrayList<String> createListOfWords(String fileName) {
        ArrayList<String> result = new ArrayList<String>();
        try {
            BufferedReader bufferedReader = new BufferedReader(new FileReader(new File(fileName)));
            while (true) {
                String readLine = bufferedReader.readLine();

                if(readLine == null){
                    break;
                }

                if(readLine.length() == 0){
                    continue;
                }

                result.add(readLine.trim());
            }

        } catch (IOException e) {
            e.printStackTrace();
        }

        return result;

    }

    public ArrayList<String> all() {
        return words;
    }
}
