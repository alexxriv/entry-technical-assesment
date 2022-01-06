package com.ks;

import static org.junit.Assert.*;

public class ApplicationSampleTest
{

    @org.junit.Test
    public void yearsToCenturies()
    {
        assertEquals(21, ApplicationSample.yearsToCenturies(2020));
    }

    @org.junit.Test
    public void scramble()
    {
        assertTrue(ApplicationSample.scramble("hdsasdellsdasooawwadwdwawrl", "helloworld"));
    }

    @org.junit.Test
    public void getMiddle()
    {
        assertEquals("ai", ApplicationSample.getMiddle("pair"));
    }

    @org.junit.Test
    public void duplicateCount()
    {
        assertEquals(4, ApplicationSample.duplicateCount("AcCoMmOdatIOn"));
    }

    @org.junit.Test
    public void countVocals()
    {
        assertEquals(12, ApplicationSample.countVocals("vowel counting is not an everyday thing"));
    }

    @org.junit.Test
    public void recursiveMultiply()
    {
        assertEquals(8, ApplicationSample.recursiveMultiply(236));
    }

    @org.junit.Test
    public void recursiveSum()
    {
        assertEquals(2, ApplicationSample.recursiveSum(236));
    }

    @org.junit.Test
    public void coupleArray()
    {
        assertArrayEquals(new String[]{"Gi", "ve", " m", "e ", "so", "me", " p", "ai", "rs", " p", "le", "as", "e_"},
              ApplicationSample.coupleArray("Give me some pairs please"));
    }

    @org.junit.Test
    public void longToIP()
    {
        assertEquals("128.15.26.23", ApplicationSample.longToIP(2148473367L));
    }
}