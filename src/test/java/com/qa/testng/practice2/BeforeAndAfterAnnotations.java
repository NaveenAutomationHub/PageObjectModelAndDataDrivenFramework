package com.qa.testng.practice2;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterGroups;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeGroups;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
 
 
public class BeforeAndAfterAnnotations
{
    /**
     * This is the first method will be executed in this program.
     * As Before Suite will be executed first
    */
    @BeforeSuite
    public void beforeSuite()
    {
        System.out.println("In Before Suite Method");
    }
     
    /**
     * This is the last method will be executed in this program.
     * As After Suite will be executed last
     * And the order is not important that this is the second method in the Program.
     * Though it will execute at last
    */
    @AfterSuite
    public void afterSuite()
    {
        System.out.println("In After Suite Method");
    }
     
    /**
     * Before Test method will be executed before the first
     * test-method mentioned in each test inside the 'test'
     * tag in testng.xml file.
    */
    @BeforeTest
    public void beforeTest()
    {
        System.out.println("In Before Test Method");
    }
     
    /**
     * After Test method will be executed after the last
     * test-method mentioned in each test inside the 'test'
     * tag in testng.xml file.
    */
    @AfterTest
    public void afterTest()
    {
        System.out.println("In After Test Method");
    }
     
    /**
     * Before Class method will be executed before
     * any of the test-methods inside a class.
    */
    @BeforeClass
    public void beforeClass()
    {
        System.out.println("In Before Class Method");
    }
     
    /**
     * After Class method will be executed After
     * any of the test-methods inside a class.
    */
    @AfterClass
    public void afterClass()
    {
        System.out.println("In AfterClass Method");
    }
     
    /**
     * Before group method will be executed before executing any of
     * the tests belonging to the group as mentioned in the 'groups'
     * attribute.
     * The following method gets executed before execution of the
     * test-method belonging to group "firstGroup".
    */
    @BeforeGroups(groups={"firstGroup"})
    public void beforeFirstGroup()
    {
        System.out.println("In Before First Group Method");
    }
     
    /**
     * After group method will be executed after executing any of
     * the tests belonging to the group as mentioned in the 'groups'
     * attribute.
     * The following method gets executed after execution of the
     * test-method belonging to group "firstGroup".
    */
    @AfterGroups(groups={"firstGroup"})
    public void afterFirstGroup()
    {
        System.out.println("In After First Group Method");
    }
     
    /**
     * Before group method will be executed before executing any of
     * the tests belonging to the group as mentioned in the 'groups'
     * attribute.
     * The following method gets executed before execution of the
     * test-method belonging to group "secondGroup".
    */
    @BeforeGroups(groups={"secondGroup"})
    public void beforeSecondGroup()
    {
        System.out.println("In Before Second Group Method");
    }
     
    /**
     * After group method will be executed after executing any of
     * the tests belonging to the group as mentioned in the 'groups'
     * attribute.
     * The following method gets executed after execution of the
     * test-method belonging to group "secondGroup".
    */
    @AfterGroups(groups={"secondGroup"})
    public void afterSecondGroup()
    {
        System.out.println("In After Second Group Method");
    }
     
    /**
    * Before method will be executed before each test-method.
    */
    @BeforeMethod
    public void beforeMethod()
    {
        System.out.println("In BeforeMethod Method");
    }
     
    /**
    * After method will be executed after each test-method.
    */
    @AfterMethod
    public void afterMethod()
    {
        System.out.println("In AfterMethod Method");
    }
     
    /**
    * Test-method which belongs to group "firstGroup".
    */
    @Test(groups={"firstGroup"})
    public void firstGroupMethodOne()
    {
        System.out.println("In Test method one of FirstGroup");
    }
     
    /**
    * Test-method which belongs to group "firstGroup".
    */
    @Test(groups={"firstGroup"})
    public void firstGroupMethodTwo()
    {
        System.out.println("In Test method two of FirstGroup");
    }
     
    /**
    * Test-method which belongs to group "secondGroup".
    */
    @Test(groups={"secondGroup"})
    public void secondGroupMethodOne()
    {
        System.out.println("In Test method one of SecondGroup");
    }
     
    /**
    * Test-method which belongs to group "secondGroup".
    */
    @Test(groups={"secondGroup"})
    public void secondGroupMethodTwo()
    {
        System.out.println("In Test method two of SecondGroup");
    }
}