package test;

import junit.framework.TestCase;
import org.junit.Test;

import bloomfilter.BloomFilter;
import bloomfilter.DataFactory;

import static org.junit.Assert.assertTrue;

public class BloomFilterTest {

    @Test
    public void isWordInSetTest(){
        BloomFilter bloomFilter = new BloomFilter(new DataFactory("wordlist.dat"));
        assertTrue(bloomFilter.isWorldInSet("dog"));
        TestCase.assertFalse(bloomFilter.isWorldInSet("sgamatolobabedifficilechesiafalsopositivo"));
        //assertTrue(bloomFilter.isWorldInSet("Afrikaners"));
    }

}
