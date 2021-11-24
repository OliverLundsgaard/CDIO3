package com;

public class Fængselsfelt extends Felt{

    Besøgsfelt besøgsfelt;
    Fængselsfelt(String navn, Besøgsfelt besøgsfelt) {
        super(navn);
        this.besøgsfelt = besøgsfelt;
    }

    @Override
    void ramt(Spiller spiller) throws Exception {
        spiller.setInPrison(true);
        spiller.teleporterTil(besøgsfelt);
    }
}
