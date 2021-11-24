package com;

public class Spiller {
    private int money = 20;
    private Felt felt;
    String property;
    private boolean isInPrison = false;
    private boolean harLigeTrukketChancekort = false;
    public Spiller(Felt startFelt){
        felt = startFelt;
    }

    public void ryk(int antal_felter) throws Exception {
        if(isInPrison){
            throw new Exception("I fængsel");
        }
        if(antal_felter == 0){
            felt.ramt(this);
        }else{
            felt = felt.getNæstefelt();
            felt.erLandetMidlerTidigtPå(this);
            ryk(antal_felter-1);
        }
    }
    public void ryk(String feltNavn) throws Exception {
        if(isInPrison){
            throw new Exception("I fængsel");
        }
        if(feltNavn.equals(felt.navn)){
            felt.ramt(this);
        }else{
            felt = felt.getNæstefelt();
            felt.erLandetMidlerTidigtPå(this);
            ryk(feltNavn);
        }
    }
    public void setInPrison(boolean inPrison) {
        isInPrison = inPrison;
    }

    public void setMoney(int money) {
        this.money = money;
    }

    public void setPosition(Felt felt) {
        this.felt = felt;
    }

    public void setProperty(String property) {
        this.property = property;
    }

    public int getMoney(){
        return  money;
    }

    public Felt getPosition(){
        return felt;
    }

    public String getProperty(){
        return property;
    }

    public void updateMoney(int beløb){
        money += beløb;
    }


    public void teleporterTil(Felt felt) throws Exception {
        if(isInPrison){
            throw new Exception("I fængsel");
        }
        if(this.felt == felt){
            felt.ramt(this);
        }else{
            this.felt = this.felt.getNæstefelt();
            teleporterTil(felt);
        }
    }

    public void setHarLigeTrukketChancekort(boolean harLigeTrukketChancekort) {
        this.harLigeTrukketChancekort = harLigeTrukketChancekort;
    }

    public boolean isHarLigeTrukketChancekort() {
        return harLigeTrukketChancekort;
    }

}