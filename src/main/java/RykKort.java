public class RykKort extends Chancekort{

    private int maks_distance;
    private int ønsket_ryk;

    public RykKort(String iden, int distance) {
        super(iden);
        this.maks_distance = distance;
        ønsket_ryk = 0;
    }

    public void setØnsket_ryk(int ønsket_ryk) {
        this.ønsket_ryk = ønsket_ryk;
    }

    @Override
    public void brug(Spiller s) {
        s.ryk(ønsket_ryk);
    }
}
