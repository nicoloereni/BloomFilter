import org.junit.Test;

import static junit.framework.TestCase.assertFalse;
import static org.junit.Assert.assertTrue;

public class BloomFilterTest {

    @Test
    public void isWordInSetTest(){
        BloomFilter bloomFilter = new BloomFilter(new DataFactory("worldlist.txt"));

        assertTrue(bloomFilter.isWorldInSet("dog"));
        assertFalse(bloomFilter.isWorldInSet("asbragisti"));

    }

}
