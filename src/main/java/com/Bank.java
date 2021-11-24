package com;

import com.Chancekort;

class Bank {

    private int startingMoney;
    private int lapMoney;
    private String currencySymbol;
    private int wallet;
    public Bank() {
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