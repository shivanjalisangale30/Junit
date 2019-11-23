package com.junitassertion;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import java.util.Arrays;
import java.util.Collection;

import static org.junit.Assert.assertEquals;

@RunWith(Parameterized.class)
public class ArithmaticTest
{
    private int firstNumber;
    private int secondNumber;
    private int expectedResult;
    private Arithmatic arithmatic;


    public ArithmaticTest(int firstNumber, int secondNumber, int expectedResult)
    {
        super();
        this.firstNumber = firstNumber;
        this.secondNumber = secondNumber;
        this.expectedResult = expectedResult;
    }

    @Before
    public void initialize()
    {
        arithmatic = new Arithmatic();
    }

    @Parameterized.Parameters
    public static Collection input()
    {
        return Arrays.asList(new Object[][] { { 1, 2, 3 }, { 11, 22, 33 }, { 111, 222, 333 }, { 10, 9, 19 }, { 100 , 9, 109 } });
    }

    @Test
    public void testArithmaticTest()
    {
        System.out.println("Sum of Numbers = :" + expectedResult);
        assertEquals(expectedResult, arithmatic.sum(firstNumber, secondNumber));
    }
}
