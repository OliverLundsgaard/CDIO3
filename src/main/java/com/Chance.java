package com;

public class Chance extends Felt {

    static Chancekort[] chancekorts = new Chancekort[]{
            new BetalKort("Du skal betale 1$", -1),
            new RykTilKort("Ryk til START", "Start"),
            new RykKort("Ryk 5 felter", 5),
            new BetalKort("Du har spist for meget slik. betal M2 til banken", -2),
            new BetalKort("Du har lavet alle dine lektier. Modtag M2 fra banken.", 2),
            new GratisFelt("Ryk frem til Strandpromenaden. Hvis ingen ejer den får du den gratis\n" +
                    "ellers skal du betale leje til ejeren", "Strandpromenaden"),
            new GratisFelt("GRATIS FELT: Ryk frem til Spillehallen. Hvis ingen ejer den får du den gratis ellers\n" +
                    "skal du betale leje til ejeren", "Spillehallen"),
            new com.GratisFelt("GRATIS FELT: Ryk frem til Iskiosken. Hvis ingen ejer den får du den gratis ellers\n" +
                    "skal du betale leje til ejeren", "Iskiosken"),
            new com.GratisFelt("GRATIS FELT: Ryk frem til Swimmingpoolen. Hvis ingen ejer den får du den gratis ellers\n" +
                    "skal du betale leje til ejeren","Swimmingpoolen")
    };

    Chance(String navn) {
        super(navn);
    }

    @Override
    void ramt(Spiller spiller) throws Exception {
        Chancekort trukketKort = chancekorts[(int) (Math.random()*chancekorts.length)];
        trukketKort.brug(spiller);
        spiller.setHarLigeTrukketChancekort(true);
        spiller.setProperty(trukketKort.getIden());
    }
}
