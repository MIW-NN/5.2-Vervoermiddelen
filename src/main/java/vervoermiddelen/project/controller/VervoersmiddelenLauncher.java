package vervoermiddelen.project.controller;

import vervoermiddelen.project.model.*;

public class VervoersmiddelenLauncher {

    public static void main(String[] args) {
        Vervoermiddel[] vervoermiddelen = new Vervoermiddel[5];
        vervoermiddelen[0] = new Koets("Glinkowski", "marathonwagen", 320, 2);
        vervoermiddelen[1] = new Auto("Dacia", "Logan", 1150, "benzine");
        vervoermiddelen[2] = new Fiets("Koga Mijata", "Colmaro Race Ultegra", 9);
        vervoermiddelen[3] = new Zeilboot("Dufour", "36 Classic", 11.5);
        vervoermiddelen[4] = new Motorboot("Broesder", "Kotter", 13.75, "diesel");

        for (int index = 0; index < vervoermiddelen.length; index++) {
            System.out.println(vervoermiddelen[index]);
        }
    }
}
