public class BetalKort extends Chancekort {

    private int beløb;

    public BetalKort(String iden, int beløb) {
        super(iden);
        this.beløb = beløb;

    }

    @Override
    public void brug(Spiller s) {
        s.updateMoney(beløb);
    }


}
