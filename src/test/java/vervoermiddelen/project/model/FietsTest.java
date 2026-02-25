package vervoermiddelen.project.model;

import org.junit.Assert;
import org.junit.Test;


public class FietsTest {

    public static final String BRAND = "gazelle";
    public static final String TYPE = "Chamonix";
    public static final int WEIGHT = 100;

    @Test
    public void expectBikeToContainValuesGivenAsString(){
        var fiets = new Fiets(BRAND, TYPE, WEIGHT);
        var fietsString = fiets.toString();

        Assert.assertTrue(fietsString.contains(BRAND));
        Assert.assertTrue(fietsString.contains(TYPE));
//        Assert.assertTrue(fietsString.contains("menskracht"));
    }
}
