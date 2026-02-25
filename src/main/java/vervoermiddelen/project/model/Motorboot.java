package vervoermiddelen.project.model;

public class Motorboot extends Vaartuig {
    private String soortBrandstof;

    public Motorboot(String merk, String type, double lengteInMeter, String soortBrandstof) {
        super(merk, type, lengteInMeter);
        this.soortBrandstof = soortBrandstof;
    }

    @Override
    public String geefAandrijfKracht() {
        return (this.soortBrandstof + "motor");
    }
}
