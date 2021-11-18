package com;

public class FængselKort extends Chancekort {

    private Felt felt;

    public FængselKort(String iden) {
        super(iden);
    }

    @Override
    public void brug(Spiller s) {
        if(s.getPosition().equals(null)){
        }
    }
}
