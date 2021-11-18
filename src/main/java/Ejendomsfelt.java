public class Ejendomsfelt extends Felt{
    private  int pris;
    private Spiller ejer;
    Ejendomsfelt(String navn, int pris) {
        super(navn);
        ejer = null;
        this.pris=pris;
    }

    @Override
    void ramt(Spiller spiller) {
        if (ejer == null) {
            ejer.updateMoney(0);
        }


    }

    public void setEjer(Spiller ejer) {
        this.ejer = ejer;
    }

    public Spiller getEjer() {
        return ejer;
    }

    public int getPris() {
        return pris;
    }
}

