import org.junit.Test;

import static junit.framework.TestCase.assertNotNull;

public class DataFactoryTest {

    @Test
    public void testGetListOfAllWords() throws Exception {
        DataFactory dataFactory = new DataFactory("wordlist.txt");
        assertNotNull(dataFactory.all());
    }
}