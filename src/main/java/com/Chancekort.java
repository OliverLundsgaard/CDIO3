package com;

public abstract class Chancekort {

    private String iden;

    public Chancekort(String iden) {

        this.iden = iden;
    }

    public abstract void brug(Spiller s) throws Exception;

    public String getIden() {
        return iden;
    }
}

/*
    - 4 kort her: Giv dette kort til BILEN/KATTEN/SKIBET/HUNDEN, og tag et chancekort mere. BIL/KAT/SKIB/HUND:
    Din næste tur skal du rykke frem til hvilket som helst ledigt felt og købe det. Hvis der ingen ledig er
    skal du købe et fra en spiller.

    - Ryk frem til START. Modtag M2.
    - Ryk op til 5 felter frem.
    - Ryk et felt frem eller tag et chancekort mere.
    - Du har spist for meget slik. betal M2 til banken.
    - Du løslades uden omkostninger. Behold dette kort indtil du for brug for det.
    - Ryk frem til Strandpromenaden.
    - Det er din fødselsdag. Alle giver dig M1 tillykke.
    - Du har lavet alle dine lektier. Modtag M2 fra banken.
    - GRATIS FELT: Ryk fram til Skaterparken for at lave det perfekte grind. Hvis ingen ejer den får du den gratis
    ellers skal du betale leje til ejeren.
    - GRATIS FELT: Ryk frem til et pink eller mørkeblåt felt. Hvis ingen ejer den får du den gratis ellers
    skal du betale leje til ejeren.
    - GRATIS FELT: Ryk frem til et rødt felt. Hvis ingen ejer den får du den gratis ellers
    skal du betale leje til ejeren.
    - GRATIS FELT: Ryk frem til et orange eller grønt felt. Hvis ingen ejer den får du den gratis ellers
    skal du betale leje til ejeren.
    - GRATIS FELT: Ryk frem til et lyseblåt felt. Hvis ingen ejer den får du den gratis ellers
    skal du betale leje til ejeren.
    - GRATIS FELT: Ryk frem til et orange felt. Hvis ingen ejer den får du den gratis ellers
    skal du betale leje til ejeren.
    - GRATIS FELT: Ryk frem til et lyseblåt eller rødt felt. Hvis ingen ejer den får du den gratis ellers
    skal du betale leje til ejeren.
    - GRATIS FELT: Ryk frem til et brunt eller gult felt. Hvis ingen ejer den får du den gratis ellers
    skal du betale leje til ejeren.


 */