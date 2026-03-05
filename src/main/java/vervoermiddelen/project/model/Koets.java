package vervoermiddelen.project.model;

public class Koets extends Voertuig {
    private int aantalPaarden;
    private static final int AANTAL_WIELEN = 4;

    public Koets(String merk, String type, int gewicht, int aantalPaarden) {
        super(merk, type, AANTAL_WIELEN, gewicht);
        this.aantalPaarden = aantalPaarden;
    }

    @Override
    public String geefAandrijfkracht() {
        if (aantalPaarden == 1) {
            return "1 paard";
        }
        return aantalPaarden + " paarden";
    }
}
