package org.example;

import org.junit.Assert;
import org.junit.Test;

public class JunitTest {

    @Test
    public void testAddTwoNumbers(){
        Junit junit = new Junit();
        int c = junit.add(2,3);
        Assert.assertEquals(5,c);
    }
    @Test
    public void testSubTwoNumber(){
        Junit junit = new Junit();
        int c = junit.sub(4,5);
        Assert.assertEquals(-1,c);
    }
    @Test
    public void testAddTwoNumberIfCondition(){
        Junit junit = new Junit();
        Boolean c = junit.addIfElse(2,3);
        Assert.assertTrue(c);
    }
    @Test
    public void testAddTwoNumberElseCondition(){
        Junit junit = new Junit();
        Boolean c = junit.addIfElse(1,3);
        Assert.assertFalse(c);
    }

    @Test
    public void testSubTwoNumbersIfCondition(){
        Junit junit = new Junit();
        int c = junit.subIfElse(2,4);
        Assert.assertEquals(-2,c);
    }

    @Test
    public void testSubTwoNumbersElseCondition(){
        Junit junit = new Junit();
        int c = junit.subIfElse(0,5);
        Assert.assertEquals(-5,c);
    }

    @Test
    public void testInstededIfcondition(){
        Junit junit = new Junit();
        Boolean c = junit.nestedIfCondition(1,2,3);
        Assert.assertFalse(false);
    }
    @Test
    public void testInstededIfconditionTrue(){
        Junit junit = new Junit();
        Boolean c = junit.nestedIfCondition(3,1,2);
        Assert.assertTrue(c);
    }
    @Test
    public void testInstededElsecondition(){
        Junit junit = new Junit();
        Boolean c = junit.nestedIfCondition(2,1,3);
        Assert.assertFalse(false);
    }

    @Test
    public void testMultiplication() {
        Junit junit = new Junit();
        int c = junit.mul(2, 5);
        Assert.assertEquals(10, c);
    }

}
