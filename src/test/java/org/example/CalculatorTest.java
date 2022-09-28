package org.example;

import org.junit.Assert;
import org.junit.Test;
import org.mockito.Mockito;

import static org.mockito.Mockito.when;

public class CalculatorTest {
    Calculator cal = Mockito.mock(Calculator.class); // Mockito way to create object

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
        //int res = cal.sub(10, 2, 5); // Call add method from Calculator class. Take object reference cal.
        // Put in a dot. Put in the method name add()
        // Then must put in int to store the actual value found in the int data type.
        // The response, res, will be stored in the data type, int. Also put in equals sign =
        Assert.assertEquals(3, cal.sub(10, 2, 5)); // Assert verifies the expected result to be true or false. This displays Test Pass or Fail.

    }

    @Test
    public void testMul() {
        Calculator cal = new Calculator();
        int res = cal.mul(1, 2, 3);
        Assert.assertEquals(6, res);
    }

    /*@Test
    public void testMulException() {
        Calculator cal = new Calculator();
        int res = cal.mul(0, 0, 0);
        Assert.assertEquals(null, res);
    }*/

}