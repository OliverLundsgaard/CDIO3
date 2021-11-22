package com;
import java.util.ArrayList;

public class Spilklasse {
    private ArrayList<Spiller> spillere;
    private Spiller harTur;
    private Spiller vinder;
    private Terning terning;
    private Bræt bræt;
    public Spilklasse(int antal_spillere){
        bræt = new Bræt();
        this.spillere = new ArrayList<>();
        for (int i = 0; i < antal_spillere; i++) {
            spillere.add(new Spiller(bræt.getStartFelt()));
        }
        harTur = this.spillere.get(0);
        vinder = null;
        terning = new Terning();
    }
    public Spilklasse(){
        bræt = new Bræt();
        spillere = new ArrayList<>();
        for (int i = 0; i < 2; i++) {
            spillere.add(new Spiller(bræt.getStartFelt()));
        }
        harTur = this.spillere.get(0);
        vinder = null;
        terning = new Terning();
    }

    public void setAntalSpillere(int antal){
        spillere = new ArrayList<>();
        for (int i = 0; i < antal; i++) {
            spillere.add(new Spiller(bræt.getStartFelt()));
        }
        harTur = spillere.get(0);
    }

    public void tag_næste_tur(){
        int flyt = terning.rul();
        harTur.ryk(flyt);
        System.out.println(harTur);
        skift_til_næste_spiller();
    }

    private void skift_til_næste_spiller(){
        for (int i = 0; i < spillere.size()-1; i++) {
            if(spillere.get(i) == harTur){
                harTur = spillere.get(i+1);
                return;
            }
        }
        harTur= spillere.get(0);
    }

    public Bræt getBræt() {
        return bræt;
    }

    public ArrayList<Spiller> getSpillere() {
        return spillere;
    }


    public boolean harFundetEnVinder(){
        return vinder != null;
    }
}
