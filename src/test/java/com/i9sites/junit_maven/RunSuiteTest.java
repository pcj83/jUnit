package com.i9sites.junit_maven;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;

@RunWith(Suite.class)
@SuiteClasses({
	AnnonTest.class,
	AssertsTest.class,
	StringUtilsTest.class
	
})
public class RunSuiteTest {

}
