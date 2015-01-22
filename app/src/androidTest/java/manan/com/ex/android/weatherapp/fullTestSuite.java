package manan.com.ex.android.weatherapp;

import android.app.Application;
import android.test.ApplicationTestCase;
import android.test.suitebuilder.TestSuiteBuilder;

import junit.framework.Test;
import junit.framework.TestSuite;

/**
 * <a href="http://d.android.com/tools/testing/testing_android.html">Testing Fundamentals</a>
 */
public class fullTestSuite extends TestSuite{
    public static Test suite() {
        return new TestSuiteBuilder(fullTestSuite.class)
                .includeAllPackagesUnderHere().build();
    }

    public fullTestSuite() {
        super();
    }
}