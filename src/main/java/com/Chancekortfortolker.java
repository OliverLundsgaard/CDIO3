package com;

public class Chancekortfortolker {

    public void brugKort(Spiller s, Chancekort kort){

        if(kort.getClass() == RykKort.class){
            int ønsket_ryk = 0;
            /*spørg ejer hvor mange felter han vil rykke (gui);*/
            ((RykKort) kort).setØnsket_ryk(ønsket_ryk);
            kort.brug(s);
        }
        if(kort.getClass() == RykTilKort.class){
            kort.brug(s);
        }
        if(kort.getClass() == BetalKort.class){
            kort.brug(s);
        }
        if(kort.getClass() == GratisFelt.class){
            kort.brug(s);
        }
        if (kort.getClass() == FængselKort.class){
            kort.brug(s);
        }
    }
}
