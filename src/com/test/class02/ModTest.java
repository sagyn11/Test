package com.test.class02;
//        public int mul(int a, int b){
//                  return a % b;
//        }

// Test Cases

//          1)   a=9,   b=5,      exp: 4
//          2)   a=5,   b=1,      exp: 0
//          3)   a=1, b=5,        exp: 1
//          4)   a=-15,  b=-3 ,   exp: 0
//          5)   a=-15,  b=4,     exp: -3
//          6)   a=15,  b=-4,     exp: 3


import com.main.Calculator;
import com.test.group.*;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.junit.experimental.categories.Category;

public class ModTest {
    Calculator c;

    @Before
    public void setUp() {
        c = new Calculator();
    }

    @Category({ChiragTest.class, SagynTest.class})
    @Test
    public void verifyWithNineAndFive() {
        int expResult = 4;
        int actResult = c.modulo(9, 5);
        Assert.assertEquals(expResult, actResult);
    }

    @Category({SmokeCategory.class, WIPTest.class})
    @Test
    public void verifyWithFiveAndOne() {
        int expResult = 0;
        int actResult = c.modulo(5, 1);
        Assert.assertEquals(expResult, actResult);
    }

    @Category({CriticalTest.class, SagynTest.class})
    @Test
    public void verifyWithOneAndFive() {
        int expResult = 1;
        int actResult = c.modulo(1, 5);
        Assert.assertEquals(expResult, actResult);
    }

    @Category({WIPTest.class, SagynTest.class})
    @Test
    public void verifyWithNegativeAndNegative() {
        int expResult = 0;
        int actResult = c.modulo(-15, -3);
        Assert.assertEquals(expResult, actResult);
    }

    @Category({SmokeCategory.class, ChiragTest.class})
    @Test
    public void verifyWithNegativeAndPositive() {
        int expResult = -3;
        int actResult = c.modulo(-15, 4);
        Assert.assertEquals(expResult, actResult);
    }

    @Category({WIPTest.class, SagynTest.class})
    @Test
    public void verifyWithPositiveAndNegative() {
        int expResult = 3;
        int actResult = c.modulo(15, -4);
        Assert.assertEquals(expResult, actResult);
    }
}
