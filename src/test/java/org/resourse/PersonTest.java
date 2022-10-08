package org.resourse;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.mockito.Mockito;
import org.service.ServicePerson;

import static org.mockito.Mockito.mock;

public class PersonTest {

    Person person;  // This is declaration of variable person; but we are not creating an object here; that comes later within @Before method
    ServicePerson ServicePerson = Mockito.mock(ServicePerson.class);
    @Before
    public void setUp() {

        person = new Person(ServicePerson);
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

}
