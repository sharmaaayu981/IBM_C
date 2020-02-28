package com.demo;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;

@RunWith(Suite.class)
@SuiteClasses({T01_TestGreetings.class, T02_AssertionsDemo.class, T03_HamcrestMatchersDemo.class})
public class T04_TestSuiteAnnotations {

}
