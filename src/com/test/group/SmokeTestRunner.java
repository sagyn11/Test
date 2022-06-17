package com.test.group;


import com.test.class02.DivTest;
import com.test.class02.ModTest;
import com.test.class02.MulTest;
import org.junit.experimental.categories.Categories;
import org.junit.runner.RunWith;
import org.junit.runners.Suite;

@RunWith(Categories.class)
@Categories.IncludeCategory(SagynTest.class)
@Suite.SuiteClasses({DivTest.class, ModTest.class, MulTest.class})
public class SmokeTestRunner {
}
