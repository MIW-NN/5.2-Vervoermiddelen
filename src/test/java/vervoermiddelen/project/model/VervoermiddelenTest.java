package vervoermiddelen.project.model;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;
import static org.junit.jupiter.api.Assertions.*;

class VervoermiddelenTest {

    // --- Koets ---

    @Test
    void koets_eenPaard_geeftEenPaard() {
        Koets koets = new Koets("Merk", "Type", 200, 1);
        assertEquals("1 paard", koets.geefAandrijfkracht());
    }

    @Test
    void koets_meerdePaarden_geeftPaardenMeervoud() {
        Koets koets = new Koets("Merk", "Type", 300, 2);
        assertEquals("2 paarden", koets.geefAandrijfkracht());
    }

    // --- Auto (@ParameterizedTest: één testmethode voor drie brandstoftypen) ---

    @ParameterizedTest
    @CsvSource({
        "benzine, benzinemotor",
        "diesel,  dieselmotor",
        "elektrisch, elektrische motor"
    })
    void auto_brandstoftype_geeftJuisteAandrijfkracht(String brandstof, String verwacht) {
        Auto auto = new Auto("Merk", "Type", 1000, brandstof);
        assertEquals(verwacht, auto.geefAandrijfkracht());
    }

    // --- Fiets ---

    @Test
    void fiets_geeftMenskracht() {
        Fiets fiets = new Fiets("Merk", "Type", 10);
        assertEquals("menskracht", fiets.geefAandrijfkracht());
    }

    // --- Zeilboot ---

    @Test
    void zeilboot_geeftWindkracht() {
        Zeilboot zeilboot = new Zeilboot("Merk", "Type", 10.0);
        assertEquals("windkracht", zeilboot.geefAandrijfkracht());
    }

    // --- Via abstracte Vervoermiddel-referentie (polymorfisme) ---

    @Test
    void vervoermiddel_viaAbstracteReferentie_geeftJuisteAandrijfkracht() {
        Vervoermiddel vervoermiddel = new Fiets("Merk", "Type", 10);
        assertEquals("menskracht", vervoermiddel.geefAandrijfkracht());
    }

    @Test
    void vervoermiddel_autoViaSuperReferentie_geeftBenzinemotor() {
        Vervoermiddel vervoermiddel = new Auto("Merk", "Type", 1000, "benzine");
        assertEquals("benzinemotor", vervoermiddel.geefAandrijfkracht());
    }
}
