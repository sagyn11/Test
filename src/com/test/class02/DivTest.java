package com.test.class02;
//        public int div (int a, int b){
//                  return a / b;
//        }

// Test Cases

//          1)   a=5,   b=5,      exp: 1
//          2)   a=5,   b=1,      exp: 5
//          3)   a=1, b=5,        exp: 0
//          4)   a=-15,  b=-3 ,   exp: 5
//          5)   a=-15,  b=3,     exp: -5
//          6)   a=0,  b=0,       exp: Exception
//          7)   a=1000, b=250,   exp: 4
//          8) a = -20, b = 40    exp: 0


import com.main.Calculator;
import com.test.group.*;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.junit.experimental.categories.Category;

public class DivTest {
    Calculator c;

    @Before
    public void setUp() {
        c = new Calculator();
    }

    @Category({SmokeCategory.class, SagynTest.class})
    @Test
    public void verifyWithBiggerPositiveDivisor() {
        int expResult = 0;
        int actResult = c.div(5, 6);
        Assert.assertEquals(expResult, actResult);
    }

    @Category({WIPTest.class, CriticalTest.class})
    @Test
    public void verifyWithZeroAndZero() {

        int actResult = c.div(0, 0);
        Assert.fail("No expectation thrown");
    }

    @Category({ChiragTest.class, WIPTest.class})
    @Test
    public void verifyWithSmallerPositiveDivisor() {
        int expResult = 5;
        int actResult = c.div(10, 2);
        Assert.assertEquals(expResult, actResult);
    }


    @Category({SagynTest.class, ChiragTest.class})
    @Test
    public void verifyWithSameNegatives() {
        int expResult = 1;
        int actResult = c.div(-5, -5);
        Assert.assertEquals(expResult, actResult);
    }

    @Category({SmokeCategory.class, ChiragTest.class})
    @Test
    public void verifyWithSamePositive() {
        int expResult = 1;
        int actResult = c.div(6, 6);
        Assert.assertEquals(expResult, actResult);
    }

    @Category({WIPTest.class, SagynTest.class})
    @Test
    public void verifyWithBigNumAndOtherBigNum() {
        int expResult = 4;
        int actResult = c.div(1000, 250);
        Assert.assertEquals(expResult, actResult);
    }
}
