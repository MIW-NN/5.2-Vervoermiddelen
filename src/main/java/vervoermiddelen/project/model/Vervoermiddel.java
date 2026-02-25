package vervoermiddelen.project.model;

public abstract class Vervoermiddel {
    private int id;
    private static int aantalVervoermiddelen = 0;
    private String merk;
    private String type;

    protected Vervoermiddel(String merk, String type) {
        this.aantalVervoermiddelen++;
        this.id = this.aantalVervoermiddelen;
        this.merk = merk;
        this.type = type;
    }

    /**
     * Specificeer dat elke concrete subclass van Vervoermiddel
     * een concrete geefAandrijfkracht method moet hebben.
     * @return benzinemotor, 2 paarden, windkracht, menskracht, enz.
     */
    public abstract String geefAandrijfKracht();

    /**
     * Deze toString gebruikt de abstract method geefAandrijfkracht,
     * maar de echte code staat dus in Auto, Koets, Zeilboot, Fiets, enz.
     */
    @Override
    public String toString() {
        return String.format("Vervoermiddel #%d %s %s aangedreven door %s",
                id, merk, type, geefAandrijfKracht());
    }
}
