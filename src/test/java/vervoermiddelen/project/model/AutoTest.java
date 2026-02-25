package vervoermiddelen.project.model;

import org.junit.Assert;
import org.junit.Test;

public class AutoTest {

    public static final String BRAND = "Audi";
    public static final String TYPE = "A1";
    public static final int WEIGHT = 1075;
    public static final String SOORT_BRANDSTOF = "Benzine";

    @Test
    public void expectCarToContainValuesGivenAsString(){
        var auto = new Auto(BRAND, TYPE, WEIGHT, SOORT_BRANDSTOF);
        var autoString = auto.toString();

        Assert.assertTrue(autoString.contains(BRAND));
        Assert.assertTrue(autoString.contains(TYPE));
        Assert.assertTrue(autoString.contains(SOORT_BRANDSTOF));
    }
}
