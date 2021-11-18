package com;

public class RykTilKort extends Chancekort {

    private Felt felt;

    public RykTilKort(String iden, Felt felt) {
        super(iden);
        this.felt = felt;
    }

    @Override
    public void brug(Spiller s) {
        s.teleporterTil(felt);
    }

}
