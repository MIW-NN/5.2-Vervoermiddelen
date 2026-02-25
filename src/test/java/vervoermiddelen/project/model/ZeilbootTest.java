package vervoermiddelen.project.model;

import org.junit.Assert;
import org.junit.Test;

public class ZeilbootTest {

    public static final String BRAND = "beneteau";
    public static final String TYPE = "Kielboot";
    public static final double LENGTH = 9.99;

    @Test
    public void expectSailboatToContainValuesGivenAsString(){
        var zeilboot = new Zeilboot(BRAND, TYPE, LENGTH);
        var zeilbootString = zeilboot.toString();

        Assert.assertTrue(zeilbootString.contains(BRAND));
        Assert.assertTrue(zeilbootString.contains(TYPE));
//        Assert.assertTrue(zeilbootString.contains("windkracht"));
    }
}
