package com;

public class GratisFelt extends Chancekort {

    private Felt felt;

    public GratisFelt(String iden, Felt felt) {
        super(iden);
        this.felt=felt;
    }

    @Override
    public void brug(Spiller s) {
        while(!s.getPosition().equals(felt)) {
            s.ryk(1);
        }
        Ejendomsfelt nuværendeFelt = ((Ejendomsfelt) s.getPosition());
        if (nuværendeFelt.getEjer() != null){
            s.updateMoney(-nuværendeFelt.getPris());
            nuværendeFelt.getEjer().updateMoney(nuværendeFelt.getPris());
        }else{
            nuværendeFelt.setEjer(s);
        }
/*

        - GRATIS FELT: Ryk frem til et rødt felt. Hvis ingen ejer den får du den gratis ellers
        skal du betale leje til ejeren.
        - GRATIS FELT: Ryk frem til et lyseblåt felt. Hvis ingen ejer den får du den gratis ellers
        skal du betale leje til ejeren.
        - GRATIS FELT: Ryk frem til et orange felt. Hvis ingen ejer den får du den gratis ellers
        skal du betale leje til ejeren.
        */
    }
}
