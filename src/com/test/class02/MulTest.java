package com.test.class02;
//        public int mul(int a, int b){
//                  return a * b;
//        }

// Test Cases

//          1)   a=0,   b=5,      exp: 0
//          2)   a=0,   b=0,      exp: 0
//          3)   a=-10, b=3,      exp: -30
//          4)   a=-5,  b=-3 ,    exp: 15
//          5)   a=-5,  b=0,      exp: 0
//          6)   a=30,  b=10,     exp: 300
//          7)   a=560, b=1000,   exp: 560000


import com.main.Calculator;
import com.test.group.*;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.junit.experimental.categories.Category;

public class MulTest {
    Calculator c;

    @Before
    public void setUp() {
        c = new Calculator();
    }

    @Category({SmokeCategory.class, SagynTest.class})
    @Test
    public void verifyWithOneZeroAndOnePositive() {
        int expResult = 0;
        int actResult = c.mul(0, 5);
        Assert.assertEquals(expResult, actResult);
    }

    @Category({WIPTest.class, CriticalTest.class})
    @Test
    public void verifyWithZeroAndZero() {
        int expResult = 0;
        int actResult = c.mul(0, 0);
        Assert.assertEquals(expResult, actResult);
    }

    @Category({CriticalTest.class, ChiragTest.class})
    @Test
    public void verifyWithNegativeAndPositive() {
        int expResult = -30;
        int actResult = c.mul(-10, 3);
        Assert.assertEquals(expResult, actResult);
    }

    @Category({WIPTest.class, SagynTest.class})
    @Test
    public void verifyWithNegativeAndNegative() {
        int expResult = 15;
        int actResult = c.mul(-5, -3);
        Assert.assertEquals(expResult, actResult);
    }

    @Category({SmokeCategory.class, SagynTest.class})
    @Test
    public void verifyWithNegativeAndZero() {
        int expResult = 0;
        int actResult = c.mul(-5, 0);
        Assert.assertEquals(expResult, actResult);
    }

    @Category({WIPTest.class, ChiragTest.class})
    @Test
    public void verifyWithPositiveAndPositive() {
        int expResult = 300;
        int actResult = c.mul(30, 10);
        Assert.assertEquals(expResult, actResult);
    }

    @Category({SmokeCategory.class, SagynTest.class})
    @Test
    public void verifyWithBigNumAndOtherBigNum() {
        int expResult = 560000;
        int actResult = c.mul(560, 1000);
        Assert.assertEquals(expResult, actResult);
    }
}
