import org.junit.Test;

import java.util.ArrayList;

import static junit.framework.TestCase.assertFalse;
import static org.junit.Assert.assertTrue;

public class WordsArrayTest {

    @Test
    public void arraycontainsWordTest(){
        ArrayList<String> list = new ArrayList<String>();
        list.add("pollo");
        WordsArray wordsArray = new WordsArray(list);
        assertTrue(wordsArray.contains("pollo"));
        assertFalse(wordsArray.contains("asbragisti"));
    }



}