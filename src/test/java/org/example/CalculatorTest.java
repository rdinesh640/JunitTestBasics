package org.example;

import org.junit.Assert;
import org.junit.Test;
import org.mockito.Mockito;

import static org.mockito.Mockito.when;

public class CalculatorTest {
    Calculator cal = Mockito.mock(Calculator.class); // Mockito way to create the dummy object of the Calculator class.

    @Test
    public void testAdd() {
        Calculator cal = new Calculator();   // Always create a new object of the class
        int res = cal.add(1, 2, 3); // Call add method from Calculator class. Take object reference cal.
        // Put in a dot. Put in the method name add()
        // Then must put in int to store the actual value found in the int data type.
        // The response, res, will be stored in the data type, int. Also put in equals sign =
        Assert.assertEquals(6, res); // Assert verifies the expected result to be true or false. This displays Test Pass or Fail.
    }

    @Test
    public void testSub() {
        when(cal.sub(10, 2, 5)).thenReturn(3); // Before we wrote this mock statement, the code default actual value is 0
        // This mock statement is also known as a when condition.
        // It needs to be paired with the Mockito creation of the object on Line 10
        //int res = cal.sub(10, 2, 5); // Call add method from Calculator class. Take object reference cal.
        // Put in a dot. Put in the method name add()
        // Then must put in int to store the actual value found in the int data type.
        // The response, res, will be stored in the data type, int. Also put in equals sign =
        Assert.assertEquals(3, cal.sub(10, 2, 5)); // Assert verifies the expected result to be true or false. This displays Test Pass or Test Fail.

    }

    @Test
    public void testSub2() {
        Calculator cal = new Calculator();
        Assert.assertEquals(3, cal.sub(10, 2, 5)); // Assert verifies the expected result to be true or false. This displays Test Pass or Fail.

    }

    @Test  // This is intended to test the try block
    public void testMul() {
        Calculator cal = new Calculator();
        String res = cal.mul("Dinesh", 2, 3);
        Assert.assertEquals("Dinesh", res);
    }

    @Test  // This is intended to test the catch block. We want to throw an exception; so we used String in the code
    public void testMulException() {
        Calculator cal = new Calculator();
        String res = cal.mul(null, 0, 0);
        Assert.assertEquals(null, res);
    }

}