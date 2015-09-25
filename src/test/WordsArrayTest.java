package test;

import junit.framework.TestCase;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import bloomfilter.WordsArray;
import java.util.ArrayList;

import static junit.framework.TestCase.assertFalse;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class WordsArrayTest {

    private WordsArray wordsArray;

    @Before
    public void setUp(){
        ArrayList<String> list = new ArrayList<String>();
        list.add("pollo");
        wordsArray = new WordsArray(list);
    }

    @Test
    public void arraycontainsWordTest(){

        assertTrue(wordsArray.contains("pollo"));
        TestCase.assertFalse(wordsArray.contains("asbragisti"));
    }

    @Test
    public void getHashFromLitteralString(){
        Assert.assertEquals(989, wordsArray.getHash("pollo"));
    }
}