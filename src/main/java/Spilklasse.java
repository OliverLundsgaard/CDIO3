public class Spilklasse {
    private Spiller[] spillere;
    private Spiller harTur;
    private Terning terning;
    private Bræt bræt;
    public Spilklasse(int antal_spillere){
        this.spillere = new Spiller[antal_spillere];
        harTur = this.spillere[0];
        bræt = new Bræt();
    }
    public Spilklasse(){
        this.spillere = new Spiller[2];
        harTur = this.spillere[0];
        bræt = new Bræt();
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
}
