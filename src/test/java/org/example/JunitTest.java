package org.example;

import org.junit.Assert;
import org.junit.Test;
import org.springframework.test.util.ReflectionTestUtils;

import static org.junit.Assert.assertTrue;

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
        assertTrue(c);
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
        assertTrue(c);
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

    @Test
    public void testfindIdOfPerson_dinesh(){
        Junit junit = new Junit(); // to call the method in the class Junit, just to make the connection form JunitTest class to junit class.
        String id = junit.nameOfPerson("Dinesh", "1");// calls the method with parameters.
        Assert.assertEquals("1",id);// checking the return value from the method same as expected
    }
    @Test
    public void testfindIdOfPerson_lisa(){
        Junit junit = new Junit(); // to call the method in the class Junit, just to make the connection form JunitTest class to junit class.
        String id = junit.nameOfPerson("Lisa", "2");// calls the method with parameters.
        Assert.assertEquals("2",id);// checking the return value from the method same as expected
    }
    @Test
    public void testfindIdOfPerson_peter(){
        Junit junit = new Junit(); // to call the method in the class Junit, just to make the connection form JunitTest class to junit class.
        String id = junit.nameOfPerson("Peter", "3");// calls the method with parameters.
        Assert.assertEquals("3",id);// checking the return value from the method same as expected
    }
    @Test
    public void testfindIdOfPerson_NoNameMatched() {
        Junit junit = new Junit(); //  This line is to create new object for Junit.
        String id = junit.nameOfPerson("Kim","4"); // junit is the reference of Junit object.//nameOfPerson() is the method in Junit class.
        Assert.assertEquals("no name matched", id);
    }

    @Test
    public void testFindUser() throws Exception {
        Junit junit = new Junit();
        junit.findUser("Dinesh");
    }

    @Test(expected = NullPointerException.class)
    public void testFinduser_NullPointerException() throws Exception {
        Junit junit = new Junit();
        junit.findUser(null);
    }

    @Test
    public void testCheckException() throws Exception {
        Junit junit = new Junit();
        junit.checkException("Dinesh");
    }
    @Test(expected = NullPointerException.class)
    public void testCheckException_NullPointerException() throws Exception {
        Junit junit = new Junit();
        junit.checkException(null);
    }
}
