package org.controller;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.mockito.Mockito;
import org.service.ServicePerson;

import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

public class PersonTest {

    Person person;  // This is declaration of variable person; but we are not creating an object here; that comes later within @Before method
    ServicePerson servicePerson = Mockito.mock(ServicePerson.class);  // We are using Mockito to create an object of class ServicePerson; and
                                                                      // servicePerson is the reference of ServicePerson class
    @Before
    public void setUp() {

        person = new Person(servicePerson);
    }
    // In the @Before method, we are initializing the Person object. That is the same as creating a new object of Person class
    // This Before method will be run before each @Test is run
    // to avoid creating new object of class Employee within each @Test
    // But by using @Before, we are still creating for each @Test

    @Test  // This is intended to test for the if statement
    public void testFindPersonId() {
        String res = person.findPersonId("lisa");
        Assert.assertEquals("9832", res);
    }

    @Test  // This is intended to test for the else statement
    public void testFindPersonId2() {
        String res = person.findPersonId("Trisha");
        Assert.assertEquals("6732", res);
    }

    @Test  // This is intended to test the try block; test for the if statement
    public void testFindPersonIds() {
        String res = person.findPersonIds("lisa");
        Assert.assertEquals("9832", res);
    }
    @Test  // This is intended to test the try block; test for the else statement
    public void testFindPersonIds2() {
        String res = person.findPersonIds("Trisha");
        Assert.assertEquals("6732", res);
    }

    @Test(expected = NullPointerException.class)  // This is intended to test the catch block
    public void testFindPersonIds3() {
        person.findPersonIds(null);
    }

    @Test  // This is intended to test the try block; test for the try block
    public void testFindPersonFromServiceClass() {
        when(servicePerson.personId()).thenReturn("6732");
        // This when statement is used with Mockito
        // servicePerson.personId() came from Person.java.
        // By using servicePerson.personId(), we are telling the computer when it sees servicePerson.personId(), then return the value we assigned, 6732
        // In other words, when(servicePerson.personId()).thenReturn("6732");
        String res = person.findPersonFromServiceClass("lisa");
        Assert.assertEquals("6732", res);
    }

    @Test(expected = NullPointerException.class)  // This is intended to test the catch block
    public void testFindPersonFromServiceClass_NullPointerException() {
        person.findPersonFromServiceClass(null);
    }

    @Test  // This is intended to test the try block; test for the else statement
    public void testFindPersonFromServiceClass_Else() {
        String res = person.findPersonFromServiceClass("Trisha");
        Assert.assertEquals("6732", res);
    }

    @Test
    public void testAddTwoNumbers() {
        when(servicePerson.addNumbers(1, 2)).thenReturn(3);
        int res = person.addTwoNumbers(1, 2);
        Assert.assertEquals(3, res);

    }



}
