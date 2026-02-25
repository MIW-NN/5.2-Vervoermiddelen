package vervoermiddelen.project.model;

import org.junit.Assert;
import org.junit.Test;

public class KoetsTest {

    public static final String BRAND = "UGears";
    public static final String TYPE = "URG-70032";
    public static final int WEIGHT = 1;
    public static final int AANTAL_PAARDEN = 2;

    @Test
    public void expectCoachToContainValuesGivenAsString(){
        var koets = new Koets(BRAND, TYPE, WEIGHT, AANTAL_PAARDEN);
        var koetsString = koets.toString();

        Assert.assertTrue(koetsString.contains(BRAND));
        Assert.assertTrue(koetsString.contains(TYPE));
        Assert.assertTrue(koetsString.contains(String.valueOf(AANTAL_PAARDEN)));
    }
}
