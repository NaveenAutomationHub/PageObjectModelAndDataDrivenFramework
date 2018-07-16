package com.qa.reports.practice.multipleclasses;


import org.testng.Assert;
import org.testng.annotations.Test;

public class Functionality1 extends BaseTest
{
    @Test
    public void functionality1Test1()
    
    {
    	
    	
        test = extent.createTest("functionality1Test1");
        Assert.assertTrue(1 > 0);
    }
     
    @Test
    public void functionality1Test2()
    {
        test = extent.createTest("functionality1Test2");
        Assert.assertEquals("Naveen", "Dommata");
    }
     
    @Test
    public void functionality1Test3()
    {
        test = extent.createTest("functionality1Test3");
        Assert.assertNotEquals("Naveen", "Dommata");
    }
}