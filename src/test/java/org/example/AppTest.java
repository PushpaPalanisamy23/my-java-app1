package org.example;

import junit.framework.TestCase;
import junit.framework.TestSuite;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Unit test for simple App.
 */
public class AppTest{
    @Test

    public void testAddition(){
       int a= 2+3;
       assertEquals(5,a);


    }
}