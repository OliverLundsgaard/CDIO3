package com;

public class GratisFelt extends Chancekort {

    private String felt;

    public GratisFelt(String iden, String felt) {
        super(iden);
        this.felt=felt;
    }

    @Override
    public void brug(Spiller s) throws Exception {
        while(!s.getPosition().navn.equals(felt)) {
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
