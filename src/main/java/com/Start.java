package com;

public class Start extends Felt {


    public Start(String navn) {
        super(navn);
    }

    @Override
    public void erLandetMidlerTidigtPå(Spiller spiller) {
        spiller.setMoney(spiller.getMoney()+2);
    }

    @Override
    void ramt(Spiller spiller) {

    }
}