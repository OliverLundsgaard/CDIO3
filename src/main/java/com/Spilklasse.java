package com;

public class Spilklasse {
    private Spiller[] spillere;
    private Spiller harTur;
    private Spiller vinder;
    private Terning terning;
    private Bræt bræt;
    public Spilklasse(int antal_spillere){
        bræt = new Bræt();
        this.spillere = new Spiller[antal_spillere];
        for (int i = 0; i < antal_spillere; i++) {
            spillere[i] = new Spiller(bræt.getStartFelt());
        }
        harTur = this.spillere[0];
        vinder = null;
        terning = new Terning();
    }
    public Spilklasse(){
        bræt = new Bræt();
        this.spillere = new Spiller[2];
        for (int i = 0; i < 2; i++) {
            spillere[i] = new Spiller(bræt.getStartFelt());
        }
        harTur = this.spillere[0];
        vinder = null;
        terning = new Terning();
    }

    public void setAntalSpillere(int antal){
        spillere = new Spiller[antal];
        for (int i = 0; i < antal; i++) {
            spillere[i] = new Spiller(bræt.getStartFelt());
        }
    }

    public void tag_næste_tur(){
        int flyt = terning.rul();
        harTur.ryk(flyt);
        skift_til_næste_spiller();
    }

    void skift_til_næste_spiller(){
        for(int i = 0; i < spillere.length-1; i++){
            if(spillere[i] == harTur){
                harTur = spillere[i+1];
                return;
            }
            harTur = spillere[0];
        }
    }

    public Bræt getBræt() {
        return bræt;
    }

    public Spiller[] getSpillere() {
        return spillere;
    }

    public boolean harFundetEnVinder(){
        return vinder != null;
    }
}
