package vervoermiddelen.project.model;

public class Fiets extends Voertuig {
    private static final int AANTAL_WIELEN = 2;

    public Fiets(String merk, String type, int gewicht) {
        super(merk, type, AANTAL_WIELEN, gewicht);
    }

    @Override
    public String geefAandrijfKracht() {
        return ("menskracht");
    }
}
