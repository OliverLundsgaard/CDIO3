package com;

public class Chancekortfortolker {

    private static Chancekortfortolker instans;
    private Chancekortfortolker(){
    }
    public static Chancekortfortolker getInstance() {
        if(instans == null){
            instans = new Chancekortfortolker();
        }
        return instans;
    }

    public void brugKort(Spiller s, Chancekort kort) throws Exception{

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
