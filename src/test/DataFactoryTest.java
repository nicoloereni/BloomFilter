package test;

import junit.framework.TestCase;
import org.junit.Assert;
import org.junit.Test;

import bloomfilter.DataFactory;

public class DataFactoryTest {

    @Test
    public void testGetListOfAllWords() throws Exception {
        DataFactory dataFactory = new DataFactory("wordlist.dat");
        TestCase.assertNotNull(dataFactory.all());
        TestCase.assertFalse(dataFactory.all().isEmpty());
        Assert.assertEquals(338882, dataFactory.all().size());
    }


}