package org.resourse;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class PersonTest {

    Person person;

    @Before
    public void setUp() {
        person = new Person();
    }

    @Test
    public void testFindPersonId() {
        String res = person.findPersonId("lisa");
        Assert.assertEquals("9832", res);
    }

    @Test
    public void testFindPersonId2() {
        String res = person.findPersonId("Trisha");
        Assert.assertEquals("6732", res);
    }
}
