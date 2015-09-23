import org.junit.Test;

import static junit.framework.TestCase.assertFalse;
import static junit.framework.TestCase.assertNotNull;
import static org.junit.Assert.assertEquals;

public class DataFactoryTest {

    @Test
    public void testGetListOfAllWords() throws Exception {
        DataFactory dataFactory = new DataFactory("wordlist.dat");
        assertNotNull(dataFactory.all());
        assertFalse(dataFactory.all().isEmpty());
        assertEquals(338882, dataFactory.all().size());
    }


}