package resourse;

import org.junit.Assert;
import org.junit.Test;
import org.resourse.Caliculater;

public class CaliculaterTest {

    @Test
    public void testadd(){
        Caliculater caliculater = new Caliculater();
        int response =caliculater.add(2,3,4);
        Assert.assertEquals(9,response);

    }
}
