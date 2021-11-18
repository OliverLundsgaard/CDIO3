package com;

import com.Chancekort;

class Bank {

    private int startingMoney;
    private int lapMoney;
    private String currencySymbol;
    private int wallet;
    private Chancekort[] chancekort;

    public Bank() {
        //chancekort = new com.Chancekort[16]{
           /*new com.RykTilKort("Ryk til START",Strandpromenaden),
           new com.RykKort("Ryk 5 felter", 5),
           new com.BetalKort("Du har spist for meget slik. betal M2 til banken", -2);
           new com.BetalKort("Du har lavet alle dine lektier. Modtag M2 fra banken.", 2);
           new com.GratisFelt("Ryk frem til Skaterparken for at lave det perfekte grind. Hvis ingen ejer den får du den gratis\n" +
                   "ellers skal du betale leje til ejeren",Skaterparken);
           new com.GratisFelt("GRATIS FELT: Ryk frem til et rødt felt. Hvis ingen ejer den får du den gratis ellers\n" +
                   "skal du betale leje til ejeren",rødtfelt (spillehallen));
           new com.GratisFelt("GRATIS FELT: Ryk frem til et lyseblåt felt. Hvis ingen ejer den får du den gratis ellers\n" +
                   "skal du betale leje til ejeren",/*lyseblåtfelt (iskiosken));
           new com.GratisFelt("GRATIS FELT: Ryk frem til et orange felt. Hvis ingen ejer den får du den gratis ellers\n" +
                   "skal du betale leje til ejeren",/*orangefelt (svømmingpoolen));
           */
        //};
        startingMoney = 0;
        lapMoney = 0;
        currencySymbol = new String();
        wallet = 0;
    }

    public Bank(String cS, int lM, int sM) {

        startingMoney = sM;
        lapMoney = lM;
        currencySymbol = cS;

    }

    public String getCurrencySymbol() {
        return currencySymbol;
    }

    public void setCurrencySymbol(String cS) {
        currencySymbol = cS;
    }

    public int getStartingMoney() {
        return startingMoney;
    }

    public void setStartingMoney(int sM) {
        startingMoney = sM;
    }

    public int getLapMoney() {
        return lapMoney;
    }

    public void setLapMoney(int lM) {
        lapMoney = lM;
    }

    public int getWallet() {
        return wallet;
    }

    public void withdrawFromWallet(int withdrawAmount) {
        if (withdrawAmount > wallet) {
        } else {
            wallet -= withdrawAmount;
        }
    }
    public void depositToWallet (int depositAmount){
        wallet += depositAmount;
    }
}