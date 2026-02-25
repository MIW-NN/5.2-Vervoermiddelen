package vervoermiddelen.project.model;

import org.junit.Assert;
import org.junit.Test;

public class MotorbootTest {

    public static final String BRAND = "Oud Huijzer";
    public static final String TYPE = "616 Tender";
    public static final double LENGTH = 6.16;
    public static final String SOORT_BRANDSTOF = "Benzine";

    @Test
    public void expectMotorboatToContainValuesGivenAsString(){
        var motorboot = new Motorboot(BRAND, TYPE, LENGTH, SOORT_BRANDSTOF);
        var motorbootString = motorboot.toString();

        Assert.assertTrue(motorbootString.contains(BRAND));
        Assert.assertTrue(motorbootString.contains(TYPE));
        Assert.assertTrue(motorbootString.contains(SOORT_BRANDSTOF));
    }
}
