package com.test.class03;


import com.test.class02.DivTest;
import com.test.class02.ModTest;
import com.test.class02.MulTest;
import org.junit.runner.RunWith;
import org.junit.runners.Suite;

@RunWith(Suite.class)
@Suite.SuiteClasses({MulTest.class, DivTest.class, ModTest.class})
public class RegressionTestRunner {
}
