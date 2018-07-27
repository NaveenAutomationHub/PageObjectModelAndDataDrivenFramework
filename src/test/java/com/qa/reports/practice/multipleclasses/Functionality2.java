package com.qa.reports.practice.multipleclasses;
import org.testng.Assert;
import org.testng.annotations.Test;
public class Functionality2 extends BaseTest
{
    @Test
    public void functionality2Test1()
    {
    	
        test = extent.createTest("functionality2Test1");
        Assert.assertTrue(1 > 0);
    }
     
    @Test
    public void functionality2Test2()
    {
        test = extent.createTest("functionality2Test2");
        Assert.assertEquals("Naveen", "Dommata");
    }
     
    @Test
    public void functionality2Test3()
    {
        test = extent.createTest("functionality2Test3");
        Assert.assertNotEquals("Naveen", "Dommata");
    }
}