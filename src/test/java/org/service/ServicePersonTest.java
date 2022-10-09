package org.service;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class ServicePersonTest {

    ServicePerson servicePerson;

    @Before
    public void setUp() {
        servicePerson = new ServicePerson();
    }

    @Test
    public void testPersonId() {
        String res = servicePerson.personId();
        Assert.assertEquals("9832", res);
    }

    @Test
    public void testAddNumbers() {
        int res = servicePerson.addNumbers(2, 3);
        Assert.assertEquals(5, res);
    }
}
