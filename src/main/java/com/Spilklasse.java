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

    public void tag_næste_tur() throws Exception {
        int flyt = terning.rul();
        harTur.ryk(flyt);
        findVinder();
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

    private void findVinder(){
        for (Spiller spiller: spillere) {
            if(spiller.getMoney() < 0){
                Spiller spillerMedFlestPenge = spillere.get(0);
                for(int i = 0; i < spillere.size(); i++){
                    if(spillere.get(i).getMoney() > spillerMedFlestPenge.getMoney())
                        spillerMedFlestPenge = spillere.get(i);
                }
                vinder = spillerMedFlestPenge;
            }
        }
    }

    public Spiller getHarTur() {
        return harTur;
    }
    public Spiller havdeTurFør(){
        Spiller tidligereSpiller = spillere.get(0);
        for (int i = 1; i < spillere.size(); i++){
            if(harTur == spillere.get(i)){
                return tidligereSpiller;
            }else {
                tidligereSpiller = spillere.get(i);
            }
        }
        return tidligereSpiller;
    }
    public boolean harFundetEnVinder(){
        return vinder != null;
    }
}