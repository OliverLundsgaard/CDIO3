package com;

public class RykTilKort extends Chancekort {

    private String feltIdentifier;

    public RykTilKort(String iden, String felt) {
        super(iden);
        this.feltIdentifier = felt;
    }

    @Override
    public void brug(Spiller s) throws Exception {
        s.ryk(feltIdentifier);
    }

}
