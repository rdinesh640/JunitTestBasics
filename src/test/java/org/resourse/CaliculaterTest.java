package org.resourse;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.resourse.Caliculater;

public class CaliculaterTest {

    Caliculater caliculater;

    @Before
    public void setUp() {
        caliculater = new Caliculater();
    }


    @Test
    public void testAdd(){
        int response =caliculater.add(2,3,4);
        Assert.assertEquals(9,response);

    }

    @Test
    public void testSub() {
        int response = caliculater.sub(6, 3,2);
        Assert.assertEquals(1, response);
    }

    @Test
    public void testMul() {
        int response = caliculater.mul(1, 2, 3);
        Assert.assertEquals(6, response);
    }
}
