import com.Spiller;

public abstract class Felt {
    protected String navn;
    protected Felt næstefelt;
    Felt(String navn){
        this.navn = navn;
    }

    abstract void ramt(Spiller spiller) throws Exception;

    public Felt getNæstefelt() {
        return næstefelt;
    }

    public void erLandetMidlerTidigtPå(Spiller spiller){

    }

    public String getNavn() {
        return navn;
    }

    public void setNæstefelt(Felt næstefelt) {
        this.næstefelt = næstefelt;
    }
}