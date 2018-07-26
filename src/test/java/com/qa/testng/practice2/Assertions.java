package com.qa.testng.practice2;

import org.testng.Assert;
import org.testng.annotations.Test;

public class Assertions {
	
    @Test
    public void testOne()
    {
        Assert.assertTrue(true, "Assert passed as the actual condition is true");
    }
    @Test
    public void testTwo()
    {
        Assert.assertFalse(false, "Assert passed as the actual condition is false");
    }
     
    @Test
    public void testThree()
    {
        String s = "Naveen";
        Assert.assertNotNull(s,"Assert passed as the String is Not Null");
    }
     
    @Test
    public void testFour()
    {
        String s = null;
        Assert.assertNull(s, "Assert passed as the String is  NULL");
    }
     
    @Test
    public void testFive()
    {
        String s1 = "Naveen";
        String s2 = "Naveen";
        Assert.assertEquals(s1, s2, "Assert passed as the two string are EQUAL");
    }
     
    @Test
    public void testSix()
    {
        String s1 = "Naveen";
        String s2 = "D";
        Assert.assertNotEquals(s1, s2, "Assert passed as the two string are Not EQUAL");
    }

}
