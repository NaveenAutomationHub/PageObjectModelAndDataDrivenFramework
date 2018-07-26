package com.qa.testng.practice2;
import org.testng.annotations.Test;

public class ExceptionTest
{
    @Test(expectedExceptions={ArithmeticException.class})
    public void exceptionTestOne()
    {
        int i = 1/0;
        System.out.println("Value of i :" + i);
    }
}